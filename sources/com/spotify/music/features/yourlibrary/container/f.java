package com.spotify.music.features.yourlibrary.container;

public final class f implements fjf<e> {
    private final wlf<npd> a;

    public f(wlf<npd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get());
    }
}
