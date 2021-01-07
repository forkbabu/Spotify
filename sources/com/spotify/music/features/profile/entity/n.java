package com.spotify.music.features.profile.entity;

import com.spotify.music.features.profile.entity.l;
import kotlin.jvm.internal.h;

public final class n implements fjf<gk7> {
    private final wlf<hk7> a;

    public n(wlf<hk7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        hk7 hk7 = this.a.get();
        l.a aVar = l.a;
        h.e(hk7, "profileListItemAccessoryViews");
        return hk7;
    }
}
