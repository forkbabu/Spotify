package com.spotify.superbird.pitstop.audioconnectivity;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class a<T> implements n<na1> {
    public static final a a = new a();

    a() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(na1 na1) {
        na1 na12 = na1;
        h.e(na12, "event");
        return na12.c();
    }
}
