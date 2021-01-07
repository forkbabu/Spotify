package com.spotify.mobile.android.share.menu.preview.api;

import androidx.fragment.app.o;

public final class g implements fjf<e> {
    private final wlf<o> a;

    public g(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get());
    }
}
