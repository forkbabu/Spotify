package com.spotify.music.features.spoton;

import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ SpotOnPlaybackManager a;

    public /* synthetic */ j(SpotOnPlaybackManager spotOnPlaybackManager) {
        this.a = spotOnPlaybackManager;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i((Throwable) obj);
    }
}
