package defpackage;

import com.spotify.mobile.android.service.media.b3;
import com.spotify.music.genie.p;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediabrowserservice.v1;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;

/* renamed from: ox8  reason: default package */
public class ox8 {
    private final wlf<cqe> a;
    private final wlf<d> b;
    private final wlf<pea> c;
    private final wlf<e0> d;
    private final wlf<p> e;
    private final wlf<b3> f;
    private final wlf<v1> g;

    public ox8(wlf<cqe> wlf, wlf<d> wlf2, wlf<pea> wlf3, wlf<e0> wlf4, wlf<p> wlf5, wlf<b3> wlf6, wlf<v1> wlf7) {
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

    public nx8 b(com.spotify.mobile.android.service.media.v1 v1Var, PlayOrigin playOrigin, zx8 zx8, iy8 iy8) {
        a(v1Var, 1);
        a(playOrigin, 2);
        a(zx8, 3);
        a(iy8, 4);
        cqe cqe = this.a.get();
        a(cqe, 5);
        cqe cqe2 = cqe;
        d dVar = this.b.get();
        a(dVar, 6);
        d dVar2 = dVar;
        pea pea = this.c.get();
        a(pea, 7);
        pea pea2 = pea;
        e0 e0Var = this.d.get();
        a(e0Var, 8);
        e0 e0Var2 = e0Var;
        p pVar = this.e.get();
        a(pVar, 9);
        p pVar2 = pVar;
        b3 b3Var = this.f.get();
        a(b3Var, 10);
        b3 b3Var2 = b3Var;
        v1 v1Var2 = this.g.get();
        a(v1Var2, 11);
        return new nx8(v1Var, playOrigin, zx8, iy8, cqe2, dVar2, pea2, e0Var2, pVar2, b3Var2, v1Var2);
    }
}
