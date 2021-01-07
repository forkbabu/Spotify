package com.spotify.music.deeplinktracker;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ PlaybackFromDeeplinkTrackerImpl a;

    public /* synthetic */ a(PlaybackFromDeeplinkTrackerImpl playbackFromDeeplinkTrackerImpl) {
        this.a = playbackFromDeeplinkTrackerImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((PlayerState) obj);
    }
}
