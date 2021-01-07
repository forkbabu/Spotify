package com.spotify.music.playlist.permissions;

import androidx.fragment.app.o;

public final class b0 implements fjf<a0> {
    private final wlf<o> a;

    public b0(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a0(this.a.get());
    }
}
