package com.spotify.music.libs.mediabrowserservice;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class m1 implements fjf<l1> {
    private final wlf<g<PlayerState>> a;

    public m1(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l1(this.a.get());
    }
}
