package com.spotify.music.features.podcast.notifications;

import androidx.fragment.app.o;

public final class e implements fjf<d> {
    private final wlf<o> a;

    public e(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
