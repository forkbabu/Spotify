package com.spotify.music.superbird.setup;

import androidx.fragment.app.o;

public final class c implements fjf<SetupNavigator> {
    private final wlf<o> a;

    public c(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SetupNavigator(this.a.get());
    }
}
