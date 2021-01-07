package com.spotify.music.libs.connect.applicationstate;

import io.reactivex.s;

public final class b implements fjf<DefaultApplicationStateProvider> {
    private final wlf<s<Boolean>> a;

    public b(wlf<s<Boolean>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultApplicationStateProvider(this.a.get());
    }
}
