package com.spotify.music.features.assistedcuration.search.utils;

import androidx.lifecycle.n;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import io.reactivex.y;

public final class c implements fjf<RestrictedPlaybackCommandHelper> {
    private final wlf<AgeRestrictedContentFacade> a;
    private final wlf<n> b;
    private final wlf<y> c;

    public c(wlf<AgeRestrictedContentFacade> wlf, wlf<n> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new RestrictedPlaybackCommandHelper(this.a.get(), this.b.get(), this.c.get());
    }
}
