package com.spotify.music.features.connectui.picker.legacy.util;

import com.spotify.libs.connect.r;

public final class c implements fjf<b> {
    private final wlf<r> a;

    public c(wlf<r> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
