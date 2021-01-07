package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.core.internal.AudioEffectsListener;

public final class x implements fjf<v> {
    private final wlf<AudioEffectsListener> a;

    public x(wlf<AudioEffectsListener> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get());
    }
}
