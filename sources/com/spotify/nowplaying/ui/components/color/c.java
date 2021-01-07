package com.spotify.nowplaying.ui.components.color;

import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<Integer, Integer> {
    final /* synthetic */ f a;

    c(f fVar) {
        this.a = fVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Integer apply(Integer num) {
        Integer num2 = num;
        h.e(num2, "it");
        return Integer.valueOf(num2.intValue() == -1 ? this.a.b() : num2.intValue());
    }
}
