package com.spotify.mobile.android.core.internal;

import android.os.Handler;

public final class AudioRouteChangeDispatcher_Factory implements fjf<AudioRouteChangeDispatcher> {
    private final wlf<Handler> arg0Provider;

    public AudioRouteChangeDispatcher_Factory(wlf<Handler> wlf) {
        this.arg0Provider = wlf;
    }

    public static AudioRouteChangeDispatcher_Factory create(wlf<Handler> wlf) {
        return new AudioRouteChangeDispatcher_Factory(wlf);
    }

    public static AudioRouteChangeDispatcher newInstance(Handler handler) {
        return new AudioRouteChangeDispatcher(handler);
    }

    @Override // defpackage.wlf
    public AudioRouteChangeDispatcher get() {
        return newInstance(this.arg0Provider.get());
    }
}
