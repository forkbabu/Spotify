package com.spotify.music.lyrics.core.experience.presenter.controller;

import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

final class a<T1, T2, R> implements c<qdb, Integer, Integer> {
    public static final a a = new a();

    a() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public Integer a(qdb qdb, Integer num) {
        qdb qdb2 = qdb;
        int intValue = num.intValue();
        h.e(qdb2, "lineTransformer");
        return Integer.valueOf(qdb2.a(intValue));
    }
}
