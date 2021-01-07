package com.spotify.music.sushi.badge;

import com.spotify.music.sushi.d;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.fb;
import io.reactivex.g;

public final class e implements fjf<SushiBadgePresenter> {
    private final wlf<g<PlayerState>> a;
    private final wlf<txc> b;
    private final wlf<d> c;
    private final wlf<fb> d;
    private final wlf<Boolean> e;

    public e(wlf<g<PlayerState>> wlf, wlf<txc> wlf2, wlf<d> wlf3, wlf<fb> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SushiBadgePresenter(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue());
    }
}
