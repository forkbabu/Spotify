package com.spotify.music.lyrics.core.experience.presenter.controller;

import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

final class b<T1, T2, R> implements c<rdb, Integer, Integer> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public Integer a(rdb rdb, Integer num) {
        rdb rdb2 = rdb;
        int intValue = num.intValue();
        h.e(rdb2, "lyricsProgressTransformer");
        return Integer.valueOf(rdb2.b() ? rdb2.c(intValue) : 0);
    }
}
