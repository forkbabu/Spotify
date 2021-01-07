package com.spotify.music.spotlets.radio.service;

import com.google.common.base.Function;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class i implements Function {
    public final /* synthetic */ ContextTrack.Builder a;

    public /* synthetic */ i(ContextTrack.Builder builder) {
        this.a = builder;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        return this.a.uri(playerTrack.uri()).metadata(playerTrack.metadata()).uid(playerTrack.uid()).build();
    }
}
