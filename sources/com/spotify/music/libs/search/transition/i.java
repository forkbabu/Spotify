package com.spotify.music.libs.search.transition;

public final class i implements fjf<h> {
    private final wlf<Boolean> a;

    public i(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get().booleanValue());
    }
}
