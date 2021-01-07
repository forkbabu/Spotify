package com.spotify.nowplaying.core.di;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class j<T, R> implements l<Optional<ContextTrack>, ContextTrack> {
    public static final j a = new j();

    j() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ContextTrack apply(Optional<ContextTrack> optional) {
        Optional<ContextTrack> optional2 = optional;
        h.e(optional2, "it");
        return optional2.get();
    }
}
