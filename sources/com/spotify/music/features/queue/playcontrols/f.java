package com.spotify.music.features.queue.playcontrols;

import com.spotify.music.features.queue.logging.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public class f {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;
    private final wlf<d> c;
    private final wlf<cqe> d;
    private final wlf<c> e;

    public f(wlf<g<PlayerState>> wlf, wlf<y> wlf2, wlf<d> wlf3, wlf<cqe> wlf4, wlf<c> wlf5) {
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

    public e b(h hVar) {
        g<PlayerState> gVar = this.a.get();
        a(gVar, 1);
        g<PlayerState> gVar2 = gVar;
        y yVar = this.b.get();
        a(yVar, 2);
        y yVar2 = yVar;
        d dVar = this.c.get();
        a(dVar, 3);
        d dVar2 = dVar;
        cqe cqe = this.d.get();
        a(cqe, 4);
        cqe cqe2 = cqe;
        c cVar = this.e.get();
        a(cVar, 5);
        a(hVar, 6);
        return new e(gVar2, yVar2, dVar2, cqe2, cVar, hVar);
    }
}
