package com.spotify.music.follow.resolver;

import com.spotify.music.follow.o;

public final class j implements fjf<i> {
    private final wlf<o> a;

    public j(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
