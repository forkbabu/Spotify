package com.spotify.saveaccountinfo;

import android.content.Context;

public final class f implements fjf<e> {
    private final wlf<Context> a;

    public f(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get());
    }
}
