package com.spotify.music.podcast.speedcontrol;

import com.google.common.collect.ImmutableList;

public final class b implements fjf<SpeedControlInteractor> {
    private final wlf<fwc> a;
    private final wlf<ImmutableList<Integer>> b;

    public b(wlf<fwc> wlf, wlf<ImmutableList<Integer>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SpeedControlInteractor(this.a.get(), this.b.get());
    }
}
