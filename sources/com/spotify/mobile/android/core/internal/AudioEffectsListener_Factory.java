package com.spotify.mobile.android.core.internal;

import android.content.Context;

public final class AudioEffectsListener_Factory implements fjf<AudioEffectsListener> {
    private final wlf<Context> arg0Provider;

    public AudioEffectsListener_Factory(wlf<Context> wlf) {
        this.arg0Provider = wlf;
    }

    public static AudioEffectsListener_Factory create(wlf<Context> wlf) {
        return new AudioEffectsListener_Factory(wlf);
    }

    public static AudioEffectsListener newInstance(Context context) {
        return new AudioEffectsListener(context);
    }

    @Override // defpackage.wlf
    public AudioEffectsListener get() {
        return newInstance(this.arg0Provider.get());
    }
}
