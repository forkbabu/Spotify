package com.spotify.music.features.video;

import androidx.lifecycle.Lifecycle;

public final class f implements fjf<ApplicationStateObservableImpl> {
    private final wlf<Lifecycle> a;

    public f(wlf<Lifecycle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ApplicationStateObservableImpl(this.a.get());
    }
}
