package com.spotify.music.feedback;

import com.spotify.playlist.formatlisttype.a;

public final class c implements fjf<b> {
    private final wlf<a> a;

    public c(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
