package com.spotify.music.features.profile.entity;

import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;

/* access modifiers changed from: package-private */
public final class s {
    private final wlf<nr7> a;
    private final wlf<qr7> b;
    private final wlf<e0> c;
    private final wlf<jzc> d;
    private final wlf<t> e;
    private final wlf<c.a> f;

    s(wlf<nr7> wlf, wlf<qr7> wlf2, wlf<e0> wlf3, wlf<jzc> wlf4, wlf<t> wlf5, wlf<c.a> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public r b(io.reactivex.s<np7> sVar) {
        a(sVar, 1);
        io.reactivex.s<np7> sVar2 = sVar;
        nr7 nr7 = this.a.get();
        a(nr7, 2);
        nr7 nr72 = nr7;
        qr7 qr7 = this.b.get();
        a(qr7, 3);
        qr7 qr72 = qr7;
        e0 e0Var = this.c.get();
        a(e0Var, 4);
        e0 e0Var2 = e0Var;
        jzc jzc = this.d.get();
        a(jzc, 5);
        jzc jzc2 = jzc;
        t tVar = this.e.get();
        a(tVar, 6);
        t tVar2 = tVar;
        c.a aVar = this.f.get();
        a(aVar, 7);
        return new r(sVar2, nr72, qr72, e0Var2, jzc2, tVar2, aVar);
    }
}
