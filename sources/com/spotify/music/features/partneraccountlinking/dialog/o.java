package com.spotify.music.features.partneraccountlinking.dialog;

import com.spotify.mobile.android.util.connectivity.c0;
import com.spotify.remoteconfig.xj;
import io.reactivex.z;

public class o {
    private final rv5 a;
    private final c0 b;
    private final r c;
    private final xj d;
    private final p e;

    public o(p pVar, rv5 rv5, c0 c0Var, r rVar, xj xjVar) {
        this.e = pVar;
        this.a = rv5;
        this.b = c0Var;
        this.c = rVar;
        this.d = xjVar;
    }

    public z<Boolean> a() {
        if (!(this.e.c() && this.d.b() && this.a.e() && this.b.a() && this.c.b())) {
            return z.z(Boolean.FALSE);
        }
        z<R> A = this.a.a().A(a.a);
        p pVar = this.e;
        pVar.getClass();
        return A.p(new m(pVar));
    }
}
