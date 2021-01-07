package com.spotify.music.samsungpersonalization.customization;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import defpackage.pyc;
import io.reactivex.d0;
import io.reactivex.f;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final List<f<Boolean>> a = new ArrayList();
    private boolean b;
    private final c c;
    private final SpSharedPreferences<Object> d;
    private final pyc e;

    static final class a<T> implements u<Boolean> {
        final /* synthetic */ e a;

        /* renamed from: com.spotify.music.samsungpersonalization.customization.e$a$a  reason: collision with other inner class name */
        static final class C0339a implements io.reactivex.functions.f {
            final /* synthetic */ a a;
            final /* synthetic */ t b;

            C0339a(a aVar, t tVar) {
                this.a = aVar;
                this.b = tVar;
            }

            @Override // io.reactivex.functions.f
            public final void cancel() {
                this.a.a.a.remove(this.b);
            }
        }

        a(e eVar) {
            this.a = eVar;
        }

        @Override // io.reactivex.u
        public final void subscribe(t<Boolean> tVar) {
            h.e(tVar, "emitter");
            tVar.e(new C0339a(this, tVar));
            this.a.a.add(tVar);
        }
    }

    static final class b<T, R> implements l<pyc.a, d0<? extends Boolean>> {
        final /* synthetic */ e a;

        b(e eVar) {
            this.a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends Boolean> apply(pyc.a aVar) {
            pyc.a aVar2 = aVar;
            h.e(aVar2, "response");
            if (aVar2 instanceof pyc.a.b) {
                return this.a.c.b(((pyc.a.b) aVar2).a());
            }
            return z.z(Boolean.FALSE);
        }
    }

    static final class c<T> implements g<Boolean> {
        final /* synthetic */ e a;

        c(e eVar) {
            this.a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Boolean bool2 = bool;
            e eVar = this.a;
            h.d(bool2, "it");
            e.f(eVar, bool2.booleanValue());
        }
    }

    public e(c cVar, SpSharedPreferences<Object> spSharedPreferences, pyc pyc) {
        h.e(cVar, "samsungCustomizationClient");
        h.e(spSharedPreferences, "userPreferences");
        h.e(pyc, "samsungPartnerUserIdRetrofitClient");
        this.c = cVar;
        this.d = spSharedPreferences;
        this.e = pyc;
        this.b = spSharedPreferences.d(g.a(), false);
    }

    public static final void f(e eVar, boolean z) {
        SpSharedPreferences.a<Object> b2 = eVar.d.b();
        b2.a(g.a(), z);
        b2.i();
        eVar.b = z;
        Iterator<T> it = eVar.a.iterator();
        while (it.hasNext()) {
            it.next().onNext(Boolean.valueOf(z));
        }
    }

    @Override // com.spotify.music.samsungpersonalization.customization.d
    public boolean a() {
        return this.b;
    }

    @Override // com.spotify.music.samsungpersonalization.customization.d
    public s<Boolean> b() {
        s<Boolean> y = s.y(new a(this));
        h.d(y, "Observable.create { emit…rs.add(emitter)\n        }");
        return y;
    }

    @Override // com.spotify.music.samsungpersonalization.customization.d
    public io.reactivex.a c() {
        if (!this.c.d()) {
            io.reactivex.a t = io.reactivex.a.t(new IllegalStateException("Failed to initialize"));
            h.d(t, "Completable.error(Illega…(\"Failed to initialize\"))");
            return t;
        }
        i iVar = new i(this.e.a().s(new b(this)).p(new c(this)));
        h.d(iVar, "samsungPartnerUserIdRetr…         .ignoreElement()");
        return iVar;
    }

    @Override // com.spotify.music.samsungpersonalization.customization.d
    public void destroy() {
        for (f fVar : d.Q(this.a)) {
            fVar.onComplete();
        }
    }
}
