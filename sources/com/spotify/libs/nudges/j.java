package com.spotify.libs.nudges;

import android.content.Context;

public final class j implements fjf<i> {
    private final wlf<Context> a;

    public j(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a.get());
    }
}
