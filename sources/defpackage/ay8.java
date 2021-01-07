package defpackage;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ay8  reason: default package */
public class ay8 {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;
    private final wlf<pea> c;

    public ay8(wlf<g<PlayerState>> wlf, wlf<y> wlf2, wlf<pea> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public zx8 b(v1 v1Var) {
        g<PlayerState> gVar = this.a.get();
        a(gVar, 1);
        y yVar = this.b.get();
        a(yVar, 2);
        pea pea = this.c.get();
        a(pea, 3);
        a(v1Var, 4);
        return new zx8(gVar, yVar, pea, v1Var);
    }
}
