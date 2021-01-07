package com.spotify.music.features.spoton.service;

import com.spotify.music.features.spoton.SpotOnAction;
import com.spotify.music.features.spoton.SpotOnPlaybackManager;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ SpotOnPlaybackManager a;
    public final /* synthetic */ SpotOnAction b;

    public /* synthetic */ c(SpotOnPlaybackManager spotOnPlaybackManager, SpotOnAction spotOnAction) {
        this.a = spotOnPlaybackManager;
        this.b = spotOnAction;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SpotOnPlaybackManager spotOnPlaybackManager = this.a;
        SpotOnAction spotOnAction = this.b;
        int i = SpotOnService.w;
        return spotOnPlaybackManager.b(spotOnAction);
    }
}
