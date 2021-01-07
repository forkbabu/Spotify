package com.spotify.music.superbird.setup.domain;

import defpackage.ooe;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class k<T> implements n<ooe> {
    public static final k a = new k();

    k() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(ooe ooe) {
        ooe ooe2 = ooe;
        h.e(ooe2, "it");
        return (ooe2 instanceof ooe.d) || (ooe2 instanceof ooe.a) || (ooe2 instanceof ooe.b);
    }
}
