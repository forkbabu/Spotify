package com.spotify.music.libs.bluetooth;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.a;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Set;

public class j {
    static final SpSharedPreferences.b<Object, Set<String>> e = SpSharedPreferences.b.c("bluetooth_category_car");
    static final SpSharedPreferences.b<Object, Set<String>> f = SpSharedPreferences.b.c("bluetooth_device_with_interapp");
    public static final l<CategorizerResponse, String> g = d.a;
    private final k a;
    private final a b = new a();
    private final y c;
    private final SpSharedPreferences<Object> d;

    public j(Context context, k kVar, i iVar, y yVar) {
        this.a = kVar;
        this.d = iVar.a(context);
        this.c = yVar;
    }

    private Set<String> b(SpSharedPreferences.b<Object, Set<String>> bVar) {
        Set<String> o = this.d.o(bVar, new HashSet(0));
        return o == null ? new HashSet(0) : o;
    }

    public g<CategorizerResponse> a(String str) {
        if (MoreObjects.isNullOrEmpty(str)) {
            return g.B(new IllegalArgumentException("Can't categorize. Name in ExternalAccessoryDescription not set."));
        }
        return g.p(new c(this, str), BackpressureStrategy.BUFFER);
    }

    public void c(String str, h hVar) {
        Set<String> b2 = b(e);
        boolean contains = b(f).contains(str);
        io.reactivex.l<CategorizerResponse> n = this.a.a(str).O().n(f.a);
        y yVar = this.c;
        if (yVar != null) {
            MaybeObserveOn maybeObserveOn = new MaybeObserveOn(n, yVar);
            CategorizerResponse categorizerResponse = null;
            if (b2.contains(str) || contains) {
                categorizerResponse = CategorizerResponse.create(b2.contains(str) ? "car" : "unknown", contains);
            }
            if (categorizerResponse != null) {
                hVar.onNext(categorizerResponse);
                hVar.onComplete();
                this.b.b(maybeObserveOn.subscribe(new b(this, str), e.a));
                return;
            }
            io.reactivex.l f2 = maybeObserveOn.f(new b(this, str));
            hVar.getClass();
            hVar.a(f2.subscribe(new g(hVar), new a(hVar)));
            return;
        }
        throw new NullPointerException("scheduler is null");
    }

    public /* synthetic */ void d(String str, CategorizerResponse categorizerResponse) {
        SpSharedPreferences.b<Object, Set<String>> bVar = e;
        Set<String> b2 = b(bVar);
        SpSharedPreferences.b<Object, Set<String>> bVar2 = f;
        Set<String> b3 = b(bVar2);
        if (categorizerResponse.isInterapp()) {
            if (!b3.contains(str)) {
                HashSet hashSet = new HashSet(b3);
                hashSet.add(str);
                SpSharedPreferences.a<Object> b4 = this.d.b();
                b4.g(bVar2, hashSet);
                b4.i();
            }
        } else if (b3.contains(str)) {
            HashSet hashSet2 = new HashSet(b3);
            hashSet2.remove(str);
            SpSharedPreferences.a<Object> b5 = this.d.b();
            b5.g(bVar2, hashSet2);
            b5.i();
        }
        if ("car".equals(categorizerResponse.category())) {
            if (!b2.contains(str)) {
                HashSet hashSet3 = new HashSet(b2);
                hashSet3.add(str);
                SpSharedPreferences.a<Object> b6 = this.d.b();
                b6.g(bVar, hashSet3);
                b6.i();
            }
        } else if (b2.contains(str)) {
            HashSet hashSet4 = new HashSet(b2);
            hashSet4.remove(str);
            SpSharedPreferences.a<Object> b7 = this.d.b();
            b7.g(bVar, hashSet4);
            b7.i();
        }
    }

    public void e() {
        this.b.f();
    }
}
