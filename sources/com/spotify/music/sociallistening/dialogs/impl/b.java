package com.spotify.music.sociallistening.dialogs.impl;

import android.content.Context;

public final class b implements fjf<a> {
    private final wlf<Context> a;

    public b(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get());
    }
}
