package com.spotify.music.features.spoton;

import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ SpotOnPlaybackManager a;

    public /* synthetic */ i(SpotOnPlaybackManager spotOnPlaybackManager) {
        this.a = spotOnPlaybackManager;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f((Boolean) obj);
    }
}
