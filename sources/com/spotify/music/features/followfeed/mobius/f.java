package com.spotify.music.features.followfeed.mobius;

import defpackage.o25;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class f<T, R> implements l<c35, o25> {
    public static final f a = new f();

    f() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o25 apply(c35 c35) {
        c35 c352 = c35;
        h.e(c352, "trackPlayerState");
        return new o25.s(c352);
    }
}
