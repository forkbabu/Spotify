package com.spotify.music.storage;

import com.spotify.mobile.android.util.o0;
import com.spotify.music.storage.j;

public final class i implements fjf<j.a> {
    private final wlf<o0> a;

    public i(wlf<o0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
