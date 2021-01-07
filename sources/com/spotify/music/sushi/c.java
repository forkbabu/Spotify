package com.spotify.music.sushi;

import androidx.fragment.app.o;

public final class c implements fjf<b> {
    private final wlf<o> a;

    public c(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
