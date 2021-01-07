package com.spotify.mobile.android.core.internal;

import android.media.AudioRouting;

public final /* synthetic */ class a implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ AudioRouteChangeDispatcher a;

    public /* synthetic */ a(AudioRouteChangeDispatcher audioRouteChangeDispatcher) {
        this.a = audioRouteChangeDispatcher;
    }

    @Override // android.media.AudioRouting.OnRoutingChangedListener
    public final void onRoutingChanged(AudioRouting audioRouting) {
        this.a.b(audioRouting);
    }
}
