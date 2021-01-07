package com.spotify.music.features.queue.service;

import com.google.common.base.Function;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class e implements Function {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        int i = QueueService.b;
        return ContextTrack.builder(playerTrack.uri()).uid(playerTrack.uid()).metadata(playerTrack.metadata()).build();
    }
}
