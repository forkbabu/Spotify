package com.spotify.music.libs.search.trending;

public final class f implements fjf<e> {
    private final wlf<g> a;

    public f(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get());
    }
}
