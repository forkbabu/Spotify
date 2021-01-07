package com.spotify.music.libs.audio.focus;

import android.content.Context;

public final class c0 implements fjf<MediaFocusManager> {
    private final wlf<Context> a;

    public c0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new MediaFocusManager(this.a.get());
    }
}
