package com.spotify.music.spotlets.radio.service;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import org.apache.commons.lang3.tuple.ImmutablePair;

public final /* synthetic */ class h implements l {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        int i = d0.p;
        return new ImmutablePair(playerState.track().get().metadata().getOrDefault(ContextTrack.Metadata.KEY_INTERACTION_ID, ""), playerState.track().get().metadata().getOrDefault(ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID, ""));
    }
}
