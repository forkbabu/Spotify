package com.spotify.music.features.queue.v2;

import com.google.common.base.Optional;
import com.spotify.music.features.queue.v2.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class e<T, R> implements l<PlayerState, d> {
    final /* synthetic */ wlf a;

    e(wlf wlf) {
        this.a = wlf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d apply(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "it");
        Object obj = this.a.get();
        h.d(obj, "currentTimeMs.get()");
        Long or = playerState2.position(((Number) obj).longValue()).or((Optional<Long>) 0L);
        h.d(or, "it.position(currentTimeMs.get()).or(0L)");
        long longValue = or.longValue();
        Long or2 = playerState2.duration().or((Optional<Long>) 0L);
        h.d(or2, "it.duration().or(0L)");
        return new d.a(new a(longValue, or2.longValue(), (float) playerState2.playbackSpeed().or((Optional<Double>) Double.valueOf((double) 0)).doubleValue()));
    }
}
