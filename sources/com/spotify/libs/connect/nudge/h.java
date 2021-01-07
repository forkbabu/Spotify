package com.spotify.libs.connect.nudge;

import io.reactivex.functions.c;
import kotlin.Pair;

final class h<T1, T2, R> implements c<Pair<? extends Boolean, ? extends Boolean>, Pair<? extends Boolean, ? extends Boolean>, Pair<? extends Boolean, ? extends Boolean>> {
    public static final h a = new h();

    h() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public Pair<? extends Boolean, ? extends Boolean> a(Pair<? extends Boolean, ? extends Boolean> pair, Pair<? extends Boolean, ? extends Boolean> pair2) {
        Pair<? extends Boolean, ? extends Boolean> pair3 = pair;
        Pair<? extends Boolean, ? extends Boolean> pair4 = pair2;
        kotlin.jvm.internal.h.e(pair3, "first");
        kotlin.jvm.internal.h.e(pair4, "second");
        return new Pair<>(pair3.c(), pair4.c());
    }
}
