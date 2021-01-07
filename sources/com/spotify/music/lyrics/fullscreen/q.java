package com.spotify.music.lyrics.fullscreen;

import com.spotify.player.controls.d;

public final class q implements fjf<d> {
    private final wlf<com.spotify.player.stateful.q> a;

    public q(wlf<com.spotify.player.stateful.q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
