package com.spotify.music.storage;

import com.spotify.mobile.android.util.t;
import com.spotify.music.storage.j;

public final class l implements fjf<j.b> {
    private final wlf<t> a;

    public l(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j.b(this.a.get());
    }
}
