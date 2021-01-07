package com.spotify.player.extras.transformers;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

final class b<T1, T2, R> implements c<PlayerState, Long, PlayerState> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public PlayerState a(PlayerState playerState, Long l) {
        PlayerState playerState2 = playerState;
        l.longValue();
        h.e(playerState2, "ps");
        return playerState2;
    }
}
