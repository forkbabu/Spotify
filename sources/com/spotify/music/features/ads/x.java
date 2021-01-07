package com.spotify.music.features.ads;

import io.reactivex.functions.g;

public final /* synthetic */ class x implements g {
    public final /* synthetic */ AdsPlaybackPlugin a;

    public /* synthetic */ x(AdsPlaybackPlugin adsPlaybackPlugin) {
        this.a = adsPlaybackPlugin;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        AdsPlaybackPlugin.b(this.a, (double) ((Float) obj).floatValue());
    }
}
