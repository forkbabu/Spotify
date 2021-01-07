package com.spotify.music.libs.connect.access;

import android.content.Context;

public final class s implements fjf<r> {
    private final wlf<Context> a;

    public s(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get());
    }
}
