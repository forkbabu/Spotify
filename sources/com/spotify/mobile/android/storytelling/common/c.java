package com.spotify.mobile.android.storytelling.common;

public final class c implements fjf<b> {
    private final wlf<cmf<fx1>> a;

    public c(wlf<cmf<fx1>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
