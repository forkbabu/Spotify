package com.spotify.music.features.spoton;

import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {
    public final /* synthetic */ SpotOnPlaybackManager a;

    public /* synthetic */ k(SpotOnPlaybackManager spotOnPlaybackManager) {
        this.a = spotOnPlaybackManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d();
    }
}
