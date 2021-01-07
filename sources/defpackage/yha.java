package defpackage;

import com.spotify.mobile.android.service.media.w2;
import com.spotify.music.playback.api.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: yha  reason: default package */
public class yha {
    private final wlf<pc1> a;
    private final wlf<w2> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<e> d;
    private final wlf<pea> e;

    public yha(wlf<pc1> wlf, wlf<w2> wlf2, wlf<g<PlayerState>> wlf3, wlf<e> wlf4, wlf<pea> wlf5) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public xha b(yda yda) {
        pc1 pc1 = this.a.get();
        a(pc1, 1);
        pc1 pc12 = pc1;
        w2 w2Var = this.b.get();
        a(w2Var, 2);
        w2 w2Var2 = w2Var;
        a(yda, 3);
        g<PlayerState> gVar = this.c.get();
        a(gVar, 4);
        g<PlayerState> gVar2 = gVar;
        e eVar = this.d.get();
        a(eVar, 5);
        e eVar2 = eVar;
        pea pea = this.e.get();
        a(pea, 6);
        return new xha(pc12, w2Var2, yda, gVar2, eVar2, pea);
    }
}
