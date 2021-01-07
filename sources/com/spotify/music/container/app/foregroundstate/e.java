package com.spotify.music.container.app.foregroundstate;

import androidx.lifecycle.Lifecycle;

public final class e implements fjf<AppUiForegroundState> {
    private final wlf<Lifecycle> a;

    public e(wlf<Lifecycle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new AppUiForegroundState(this.a.get());
    }
}
