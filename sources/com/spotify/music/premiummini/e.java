package com.spotify.music.premiummini;

import com.spotify.offline.data.a;
import com.spotify.offline.data.b;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e<T, R> implements l<b, Iterable<? extends a>> {
    public static final e a = new e();

    e() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Iterable<? extends a> apply(b bVar) {
        b bVar2 = bVar;
        h.e(bVar2, "it");
        return bVar2.a();
    }
}
