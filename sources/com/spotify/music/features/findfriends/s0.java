package com.spotify.music.features.findfriends;

import android.content.Context;

public final class s0 implements fjf<r0> {
    private final wlf<Context> a;

    public s0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r0(this.a.get());
    }
}
