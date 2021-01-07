package com.spotify.music.features.ads;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

public final /* synthetic */ class a0 implements g {
    public final /* synthetic */ AdsPlaybackPlugin a;

    public /* synthetic */ a0(AdsPlaybackPlugin adsPlaybackPlugin) {
        this.a = adsPlaybackPlugin;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AdsPlaybackPlugin.c(this.a, (ContextTrack) obj);
    }
}
