package com.spotify.music.moderation;

import android.app.Activity;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public final class h implements fjf<g> {
    private final wlf<Activity> a;
    private final wlf<PlayerStateCompat> b;

    public h(wlf<Activity> wlf, wlf<PlayerStateCompat> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get(), this.b.get());
    }
}
