package com.spotify.music.homecomponents.commands;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.home.common.contentapi.b;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class HomeHeartClickCommandHandler implements a71, e {
    private final q a = new q();
    private final b b;
    private final b c;

    static final class a<T> implements g<Throwable> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            StringBuilder V0 = je.V0("Failed to heart/save uri : ");
            V0.append(this.a);
            Assertion.w(V0.toString(), th);
        }
    }

    public HomeHeartClickCommandHandler(n nVar, b bVar, b bVar2) {
        h.e(nVar, "lifecycleOwner");
        h.e(bVar, "savedAlbums");
        h.e(bVar2, "savedPlaylists");
        this.b = bVar;
        this.c = bVar2;
        nVar.A().a(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        d.d(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        d.c(this, nVar);
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        io.reactivex.a aVar;
        h.e(o81, "command");
        h.e(n61, "event");
        String string = o81.data().string("uri", "");
        l0 z = l0.z(string);
        Object obj = n61.a().get("hearted");
        if (obj != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            h.d(z, "link");
            LinkType q = z.q();
            if (q != null) {
                int ordinal = q.ordinal();
                if (ordinal == 6 || ordinal == 54) {
                    b bVar = this.b;
                    if (booleanValue) {
                        aVar = bVar.b(string);
                    } else {
                        aVar = bVar.a(string);
                    }
                    this.a.a(aVar.B().q(new a(string)).subscribe());
                    return;
                } else if (ordinal == 185) {
                    b bVar2 = this.c;
                    if (booleanValue) {
                        aVar = bVar2.b(string);
                    } else {
                        aVar = bVar2.a(string);
                    }
                    this.a.a(aVar.B().q(new a(string)).subscribe());
                    return;
                }
            }
            aVar = io.reactivex.internal.operators.completable.b.a;
            h.d(aVar, "Completable.complete()");
            this.a.a(aVar.B().q(new a(string)).subscribe());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        h.e(nVar, "owner");
        this.a.c();
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        h.e(nVar, "owner");
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void o0(n nVar) {
        d.e(this, nVar);
    }
}
