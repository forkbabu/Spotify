package com.spotify.mobile.android.util;

import com.spotify.music.storage.j;

public final class s implements fjf<r> {
    private final wlf<e6> a;
    private final wlf<j> b;

    public s(wlf<e6> wlf, wlf<j> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get(), this.b.get());
    }
}
