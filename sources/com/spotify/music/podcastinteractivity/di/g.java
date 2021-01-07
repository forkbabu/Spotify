package com.spotify.music.podcastinteractivity.di;

import com.spotify.http.u;

public final class g implements fjf<stc> {
    private final wlf<u> a;

    public g(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        stc stc = (stc) this.a.get().c(stc.class);
        yif.g(stc, "Cannot return null from a non-@Nullable @Provides method");
        return stc;
    }
}
