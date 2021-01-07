package com.spotify.music.sleeptimer;

import com.spotify.player.controls.d;

public final class r implements fjf<q> {
    private final wlf<n> a;
    private final wlf<d> b;

    public r(wlf<n> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get());
    }
}
