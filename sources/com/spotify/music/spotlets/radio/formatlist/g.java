package com.spotify.music.spotlets.radio.formatlist;

public final class g implements fjf<i> {
    private final wlf<sfd> a;

    public g(wlf<sfd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
