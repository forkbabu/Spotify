package com.spotify.mobile.android.storytelling.common;

public final class e implements fjf<d> {
    private final wlf<nmf<Integer, g>> a;

    public e(wlf<nmf<Integer, g>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
