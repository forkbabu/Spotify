package com.spotify.music.carmodehome.shelf;

import com.spotify.music.navigation.t;
import com.spotify.player.model.PlayerState;
import io.reactivex.y;
import java.util.List;

public final class g {
    private final wlf<t> a;
    private final wlf<io.reactivex.g<PlayerState>> b;
    private final wlf<y> c;
    private final wlf<dr2> d;

    public g(wlf<t> wlf, wlf<io.reactivex.g<PlayerState>> wlf2, wlf<y> wlf3, wlf<dr2> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public HomeShelfPresenter b(List<? extends c> list) {
        t tVar = this.a.get();
        a(tVar, 1);
        t tVar2 = tVar;
        io.reactivex.g<PlayerState> gVar = this.b.get();
        a(gVar, 2);
        io.reactivex.g<PlayerState> gVar2 = gVar;
        y yVar = this.c.get();
        a(yVar, 3);
        y yVar2 = yVar;
        a(list, 4);
        dr2 dr2 = this.d.get();
        a(dr2, 5);
        return new HomeShelfPresenter(tVar2, gVar2, yVar2, list, dr2);
    }
}
