package com.spotify.mobile.android.service.media.browser;

public final class n implements fjf<m> {
    private final wlf<com.spotify.music.connection.n> a;

    public n(wlf<com.spotify.music.connection.n> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get());
    }
}
