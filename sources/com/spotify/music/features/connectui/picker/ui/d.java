package com.spotify.music.features.connectui.picker.ui;

import android.content.Context;

public final class d implements fjf<c> {
    private final wlf<Context> a;

    public d(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get());
    }
}