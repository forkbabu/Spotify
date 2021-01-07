package com.spotify.music.libs.restrictedcontent.transformer;

import androidx.lifecycle.n;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;

public final class e implements fjf<ContentRestrictedHelperImpl> {
    private final wlf<AgeRestrictedContentFacade> a;
    private final wlf<n> b;

    public e(wlf<AgeRestrictedContentFacade> wlf, wlf<n> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ContentRestrictedHelperImpl(this.a.get(), this.b.get());
    }
}
