package com.spotify.music.features.freetierartist;

import com.spotify.music.inappmessaging.b;

public final class s implements fjf<r> {
    private final wlf<b> a;

    public s(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r(this.a.get());
    }
}
