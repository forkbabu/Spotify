package com.spotify.mobile.android.hubframework.defaults.playback;

import androidx.lifecycle.n;
import com.spotify.music.explicitcontent.ExplicitContentFacade;

public final class h implements fjf<ExplicitPlaybackCommandHelper> {
    private final wlf<ExplicitContentFacade> a;
    private final wlf<n> b;

    public h(wlf<ExplicitContentFacade> wlf, wlf<n> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ExplicitPlaybackCommandHelper(this.a.get(), this.b.get());
    }
}
