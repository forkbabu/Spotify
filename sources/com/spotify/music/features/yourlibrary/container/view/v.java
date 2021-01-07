package com.spotify.music.features.yourlibrary.container.view;

import androidx.fragment.app.o;

public final class v implements fjf<u> {
    private final wlf<o> a;

    public v(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get());
    }
}
