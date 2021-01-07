package com.spotify.mobile.android.core.internal;

import android.media.AudioTrack;

public final /* synthetic */ class b implements AudioTrack.OnRoutingChangedListener {
    public final /* synthetic */ AudioRouteChangeDispatcher a;

    public /* synthetic */ b(AudioRouteChangeDispatcher audioRouteChangeDispatcher) {
        this.a = audioRouteChangeDispatcher;
    }

    @Override // android.media.AudioTrack.OnRoutingChangedListener
    public final void onRoutingChanged(AudioTrack audioTrack) {
        this.a.a(audioTrack);
    }
}
