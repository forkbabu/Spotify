package com.spotify.nowplaying.core.di;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

final class a<T> implements n<PlayerState> {
    public static final a a = new a();

    a() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "it");
        return !playerState2.isPlaying();
    }
}
