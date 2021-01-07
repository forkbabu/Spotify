package com.spotify.music.features.queue.playcontrols;

import com.spotify.music.features.queue.logging.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.y;

public final class g implements fjf<f> {
    private final wlf<io.reactivex.g<PlayerState>> a;
    private final wlf<y> b;
    private final wlf<d> c;
    private final wlf<cqe> d;
    private final wlf<c> e;

    public g(wlf<io.reactivex.g<PlayerState>> wlf, wlf<y> wlf2, wlf<d> wlf3, wlf<cqe> wlf4, wlf<c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a, this.b, this.c, this.d, this.e);
    }
}
