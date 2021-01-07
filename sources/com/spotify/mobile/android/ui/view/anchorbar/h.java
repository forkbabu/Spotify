package com.spotify.mobile.android.ui.view.anchorbar;

import com.spotify.remoteconfig.w4;

public final class h implements fjf<Boolean> {
    private final wlf<l0e> a;

    public h(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(((w4) this.a.get().a(a.a)).a());
    }
}
