package com.spotify.music.sushi.badge;

import com.google.common.base.Optional;
import com.spotify.player.model.PlaybackQuality;
import io.reactivex.functions.c;
import kotlin.Pair;
import kotlin.jvm.internal.h;

final class b<T1, T2, R> implements c<Optional<PlaybackQuality>, String, Pair<? extends Optional<PlaybackQuality>, ? extends String>> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public Pair<? extends Optional<PlaybackQuality>, ? extends String> a(Optional<PlaybackQuality> optional, String str) {
        Optional<PlaybackQuality> optional2 = optional;
        String str2 = str;
        h.e(optional2, "p");
        h.e(str2, "e");
        return new Pair<>(optional2, str2);
    }
}
