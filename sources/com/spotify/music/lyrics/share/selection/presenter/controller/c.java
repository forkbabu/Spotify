package com.spotify.music.lyrics.share.selection.presenter.controller;

import kotlin.Pair;
import kotlin.jvm.internal.h;

final class c<T1, T2, R> implements io.reactivex.functions.c<Pair<? extends Integer, ? extends Integer>, Integer, Integer> {
    public static final c a = new c();

    c() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public Integer a(Pair<? extends Integer, ? extends Integer> pair, Integer num) {
        int intValue = num.intValue();
        h.e(pair, "<anonymous parameter 0>");
        return Integer.valueOf(intValue);
    }
}
