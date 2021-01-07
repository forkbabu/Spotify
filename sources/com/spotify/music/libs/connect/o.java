package com.spotify.music.libs.connect;

import com.spotify.libs.connect.h;
import com.spotify.libs.connect.l;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public class o {
    private final wlf<l> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<h> c;
    private final wlf<k4d> d;
    private final wlf<y> e;

    public o(wlf<l> wlf, wlf<g<PlayerState>> wlf2, wlf<h> wlf3, wlf<k4d> wlf4, wlf<y> wlf5) {
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

    public n b(i iVar) {
        a(iVar, 1);
        l lVar = this.a.get();
        a(lVar, 2);
        l lVar2 = lVar;
        g<PlayerState> gVar = this.b.get();
        a(gVar, 3);
        g<PlayerState> gVar2 = gVar;
        h hVar = this.c.get();
        a(hVar, 4);
        h hVar2 = hVar;
        k4d k4d = this.d.get();
        a(k4d, 5);
        k4d k4d2 = k4d;
        y yVar = this.e.get();
        a(yVar, 6);
        return new n(iVar, lVar2, gVar2, hVar2, k4d2, yVar);
    }
}
