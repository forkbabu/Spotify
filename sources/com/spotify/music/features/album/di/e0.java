package com.spotify.music.features.album.di;

public final class e0 implements fjf<String> {
    private final wlf<ifd> a;

    public e0(wlf<ifd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String ifd = this.a.get().toString();
        yif.g(ifd, "Cannot return null from a non-@Nullable @Provides method");
        return ifd;
    }
}
