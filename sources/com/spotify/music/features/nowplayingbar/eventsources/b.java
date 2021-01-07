package com.spotify.music.features.nowplayingbar.eventsources;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class b<T, R> implements l<PlayerState, ContextTrack> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ContextTrack apply(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "it");
        return playerState2.track().get();
    }
}
