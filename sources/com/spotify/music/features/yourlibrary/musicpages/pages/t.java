package com.spotify.music.features.yourlibrary.musicpages.pages;

import android.content.Context;

public final class t implements fjf<s> {
    private final wlf<Context> a;

    public t(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get());
    }
}
