package com.spotify.player.extras.transformers;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<PlayerState, Optional<Long>> {
    final /* synthetic */ cqe a;

    c(cqe cqe) {
        this.a = cqe;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<Long> apply(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "it");
        return playerState2.position(this.a.d());
    }
}
