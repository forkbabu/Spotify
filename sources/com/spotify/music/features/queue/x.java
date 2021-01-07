package com.spotify.music.features.queue;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class x implements fjf<w> {
    private final wlf<g<PlayerQueue>> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<v> c;
    private final wlf<QueueManager> d;
    private final wlf<rx7> e;
    private final wlf<y> f;

    public x(wlf<g<PlayerQueue>> wlf, wlf<g<PlayerState>> wlf2, wlf<v> wlf3, wlf<QueueManager> wlf4, wlf<rx7> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
