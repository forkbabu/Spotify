package com.spotify.music.podcast.player.trailer.impl;

import io.reactivex.d0;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class f<T, R> implements l<Boolean, d0<? extends zwd>> {
    final /* synthetic */ PlayerApiTrailerPlayerActionPerformer a;
    final /* synthetic */ String b;

    f(PlayerApiTrailerPlayerActionPerformer playerApiTrailerPlayerActionPerformer, String str) {
        this.a = playerApiTrailerPlayerActionPerformer;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends zwd> apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "isResumed");
        if (bool2.booleanValue()) {
            return PlayerApiTrailerPlayerActionPerformer.d(this.a, this.b);
        }
        return PlayerApiTrailerPlayerActionPerformer.c(this.a, this.b);
    }
}
