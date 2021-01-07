package defpackage;

import com.spotify.mobile.android.service.media.b3;
import com.spotify.music.genie.p;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediabrowserservice.v1;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;

/* renamed from: dq5  reason: default package */
public class dq5 {
    private final wlf<cqe> a;
    private final wlf<d> b;
    private final wlf<pea> c;
    private final wlf<e0> d;
    private final wlf<p> e;
    private final wlf<b3> f;
    private final wlf<v1> g;

    public dq5(wlf<cqe> wlf, wlf<d> wlf2, wlf<pea> wlf3, wlf<e0> wlf4, wlf<p> wlf5, wlf<b3> wlf6, wlf<v1> wlf7) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public cq5 b(com.spotify.mobile.android.service.media.v1 v1Var, PlayOrigin playOrigin) {
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
        v1 v1Var2 = this.g.get();
        a(v1Var2, 9);
        return new cq5(v1Var, playOrigin, cqe2, dVar2, pea2, e0Var2, pVar2, b3Var2, v1Var2);
    }
}
