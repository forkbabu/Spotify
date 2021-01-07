package com.spotify.music.features.spoton.service;

import com.spotify.music.features.spoton.SpotOnPlaybackManager;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ SpotOnService a;
    public final /* synthetic */ SpotOnPlaybackManager b;

    public /* synthetic */ a(SpotOnService spotOnService, SpotOnPlaybackManager spotOnPlaybackManager) {
        this.a = spotOnService;
        this.b = spotOnPlaybackManager;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        SpotOnService spotOnService = this.a;
        SpotOnPlaybackManager spotOnPlaybackManager = this.b;
        spotOnService.getClass();
        spotOnPlaybackManager.a();
        spotOnService.stopSelf();
    }
}
