package com.spotify.music.features.yourlibrary.container.utils;

import android.content.Context;

public final class m implements fjf<l> {
    private final wlf<Context> a;

    public m(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
