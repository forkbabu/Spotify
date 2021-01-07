package com.spotify.music.features.spoton;

import io.reactivex.functions.a;

public final /* synthetic */ class c implements a {
    public final /* synthetic */ SpotOnPlaybackManager a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ c(SpotOnPlaybackManager spotOnPlaybackManager, boolean z) {
        this.a = spotOnPlaybackManager;
        this.b = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.h(this.b);
    }
}
