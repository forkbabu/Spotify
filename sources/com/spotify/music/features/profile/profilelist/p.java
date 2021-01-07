package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.profilelist.n;
import kotlin.jvm.internal.h;

public final class p implements fjf<dt7> {
    private final wlf<u> a;

    public p(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        u uVar = this.a.get();
        n.a aVar = n.a;
        h.e(uVar, "profileListPageParameters");
        return new m(uVar);
    }
}
