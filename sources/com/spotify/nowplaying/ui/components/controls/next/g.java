package com.spotify.nowplaying.ui.components.controls.next;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;

public final class g implements fjf<f> {
    private final wlf<d> a;
    private final wlf<io.reactivex.g<PlayerState>> b;
    private final wlf<j> c;
    private final wlf<h> d;
    private final wlf<e> e;

    public g(wlf<d> wlf, wlf<io.reactivex.g<PlayerState>> wlf2, wlf<j> wlf3, wlf<h> wlf4, wlf<e> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static g a(wlf<d> wlf, wlf<io.reactivex.g<PlayerState>> wlf2, wlf<j> wlf3, wlf<h> wlf4, wlf<e> wlf5) {
        return new g(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
