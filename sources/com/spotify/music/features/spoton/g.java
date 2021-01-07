package com.spotify.music.features.spoton;

import io.reactivex.b;
import io.reactivex.d;

public final /* synthetic */ class g implements d {
    public final /* synthetic */ SpotOnPlaybackManager a;

    public /* synthetic */ g(SpotOnPlaybackManager spotOnPlaybackManager) {
        this.a = spotOnPlaybackManager;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        this.a.e(bVar);
    }
}
