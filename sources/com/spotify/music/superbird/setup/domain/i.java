package com.spotify.music.superbird.setup.domain;

import com.spotify.music.superbird.setup.domain.f;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class i<T, R> implements l<Boolean, f> {
    public static final i a = new i();

    i() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public f apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "it");
        return new f.i(bool2.booleanValue());
    }
}
