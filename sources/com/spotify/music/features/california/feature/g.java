package com.spotify.music.features.california.feature;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;

public final class g {
    private final wlf<f> a;
    private final wlf<io.reactivex.g<PlayerState>> b;
    private final wlf<ere> c;
    private final wlf<d> d;

    public g(wlf<f> wlf, wlf<io.reactivex.g<PlayerState>> wlf2, wlf<ere> wlf3, wlf<d> wlf4) {
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

    public CaliforniaPresenter b(i iVar, String str) {
        f fVar = this.a.get();
        a(fVar, 1);
        f fVar2 = fVar;
        io.reactivex.g<PlayerState> gVar = this.b.get();
        a(gVar, 2);
        io.reactivex.g<PlayerState> gVar2 = gVar;
        ere ere = this.c.get();
        a(ere, 3);
        ere ere2 = ere;
        d dVar = this.d.get();
        a(dVar, 4);
        a(iVar, 5);
        a(str, 6);
        return new CaliforniaPresenter(fVar2, gVar2, ere2, dVar, iVar, str);
    }
}
