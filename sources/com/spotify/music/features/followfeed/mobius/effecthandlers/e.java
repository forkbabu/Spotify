package com.spotify.music.features.followfeed.mobius.effecthandlers;

import defpackage.o25;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

final class e<T, R> implements l<List<? extends p25>, o25> {
    public static final e a = new e();

    e() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o25 apply(List<? extends p25> list) {
        List<? extends p25> list2 = list;
        h.e(list2, "feedItems");
        return new o25.l(list2);
    }
}
