package com.spotify.music.features.eventshub.eventshub;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ EventsHubFragment a;

    public /* synthetic */ a(EventsHubFragment eventsHubFragment) {
        this.a = eventsHubFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h0.e(((Boolean) obj).booleanValue());
    }
}
