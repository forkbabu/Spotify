package com.spotify.music.libs.mediabrowserservice;

import com.spotify.mobile.android.service.media.b3;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.genie.p;
import com.spotify.music.libs.audio.focus.o;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;

public class j1 {
    private final wlf<cqe> a;
    private final wlf<d> b;
    private final wlf<pea> c;
    private final wlf<e0> d;
    private final wlf<p> e;
    private final wlf<b3> f;
    private final wlf<l1> g;
    private final wlf<o> h;
    private final wlf<v1> i;

    public j1(wlf<cqe> wlf, wlf<d> wlf2, wlf<pea> wlf3, wlf<e0> wlf4, wlf<p> wlf5, wlf<b3> wlf6, wlf<l1> wlf7, wlf<o> wlf8, wlf<v1> wlf9) {
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
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public i1 b(v1 v1Var, PlayOrigin playOrigin) {
        a(v1Var, 1);
        a(playOrigin, 2);
        cqe cqe = this.a.get();
        a(cqe, 3);
        cqe cqe2 = cqe;
        d dVar = this.b.get();
        a(dVar, 4);
        d dVar2 = dVar;
        pea pea = this.c.get();
        a(pea, 5);
        pea pea2 = pea;
        e0 e0Var = this.d.get();
        a(e0Var, 6);
        e0 e0Var2 = e0Var;
        p pVar = this.e.get();
        a(pVar, 7);
        p pVar2 = pVar;
        b3 b3Var = this.f.get();
        a(b3Var, 8);
        b3 b3Var2 = b3Var;
        l1 l1Var = this.g.get();
        a(l1Var, 9);
        l1 l1Var2 = l1Var;
        o oVar = this.h.get();
        a(oVar, 10);
        o oVar2 = oVar;
        v1 v1Var2 = this.i.get();
        a(v1Var2, 11);
        return new i1(v1Var, playOrigin, cqe2, dVar2, pea2, e0Var2, pVar2, b3Var2, l1Var2, oVar2, v1Var2);
    }
}
