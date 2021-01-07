package com.spotify.music.podcastinteractivity.di;

public final class c implements fjf<String> {
    private final wlf<a> a;

    public c(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
