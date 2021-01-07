package com.spotify.music.utterancesuggestions;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;
import kotlin.text.e;

final class a<T> implements n<f> {
    public static final a a = new a();

    a() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(f fVar) {
        f fVar2 = fVar;
        h.e(fVar2, "it");
        return !e.n(fVar2.a());
    }
}
