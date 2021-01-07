package com.spotify.music.features.nowplayingbar.eventsources;

import com.spotify.music.features.nowplayingbar.domain.ContentType;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c<T, R> implements l<ContextTrack, ContentType> {
    public static final c a = new c();

    c() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ContentType apply(ContextTrack contextTrack) {
        ContextTrack contextTrack2 = contextTrack;
        h.e(contextTrack2, "it");
        return kxd.l(contextTrack2) ? ContentType.VIDEO : ContentType.COVER;
    }
}
