package com.spotify.music.libs.freetiertrackpreview.transformer;

import com.spotify.music.preview.v;

public final class f implements fjf<e> {
    private final wlf<v> a;

    public f(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get());
    }
}
