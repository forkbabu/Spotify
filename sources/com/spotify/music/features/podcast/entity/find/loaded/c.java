package com.spotify.music.features.podcast.entity.find.loaded;

public final class c implements fjf<DefaultFindInShowInjector> {
    private final wlf<t37> a;

    public c(wlf<t37> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultFindInShowInjector(this.a.get());
    }
}
