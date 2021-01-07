package com.spotify.share.cleanup;

import android.content.Context;

public final class c implements fjf<b> {
    private final wlf<Context> a;

    public c(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get());
    }
}
