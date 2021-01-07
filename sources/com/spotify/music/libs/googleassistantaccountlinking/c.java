package com.spotify.music.libs.googleassistantaccountlinking;

public final class c implements fjf<b> {
    private final wlf<sga> a;

    public c(wlf<sga> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
