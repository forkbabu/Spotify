package com.spotify.music.features.followfeed.mobius;

import defpackage.o25;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e<T, R> implements l<Boolean, o25> {
    public static final e a = new e();

    e() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o25 apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "disabled");
        return new o25.i(bool2.booleanValue());
    }
}
