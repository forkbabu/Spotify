package com.spotify.music.features.connectui.picker.contextmenu;

import com.spotify.libs.connect.instrumentation.e;

public final class j implements fjf<i> {
    private final wlf<oba> a;
    private final wlf<e> b;

    public j(wlf<oba> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get(), this.b.get());
    }
}
