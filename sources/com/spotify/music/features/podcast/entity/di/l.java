package com.spotify.music.features.podcast.entity.di;

public final class l implements fjf<Boolean> {
    private final wlf<ifd> a;

    public l(wlf<ifd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get() == kfd.I1);
    }
}
