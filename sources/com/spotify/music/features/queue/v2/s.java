package com.spotify.music.features.queue.v2;

import com.spotify.nowplaying.ui.components.controls.next.f;
import com.spotify.nowplaying.ui.components.controls.previous.e;
import com.spotify.nowplaying.ui.components.repeat.d;
import com.squareup.picasso.Picasso;

public final class s implements fjf<QueueViews> {
    private final wlf<Picasso> a;
    private final wlf<e> b;
    private final wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> c;
    private final wlf<f> d;
    private final wlf<d> e;
    private final wlf<com.spotify.nowplaying.ui.components.shuffle.d> f;

    public s(wlf<Picasso> wlf, wlf<e> wlf2, wlf<com.spotify.nowplaying.ui.components.controls.playpause.e> wlf3, wlf<f> wlf4, wlf<d> wlf5, wlf<com.spotify.nowplaying.ui.components.shuffle.d> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new QueueViews(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
