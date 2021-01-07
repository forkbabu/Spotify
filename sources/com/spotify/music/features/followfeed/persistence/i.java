package com.spotify.music.features.followfeed.persistence;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class i<T, R> implements l<Boolean, v<? extends Boolean>> {
    final /* synthetic */ k a;

    i(k kVar) {
        this.a = kVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends Boolean> apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "hasNewItems");
        return this.a.a.d(bool2.booleanValue()).g(s.i0(bool2));
    }
}
