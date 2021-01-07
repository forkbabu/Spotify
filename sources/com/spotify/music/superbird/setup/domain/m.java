package com.spotify.music.superbird.setup.domain;

import com.spotify.music.superbird.setup.domain.f;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class m<T, R> implements l<Boolean, f> {
    public static final m a = new m();

    m() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public f apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "it");
        return new f.x(bool2.booleanValue());
    }
}
