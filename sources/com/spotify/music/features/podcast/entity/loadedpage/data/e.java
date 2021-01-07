package com.spotify.music.features.podcast.entity.loadedpage.data;

import com.spotify.pageloader.l0;
import com.spotify.pageloader.m0;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e<T, R> implements l<Throwable, l0<a>> {
    public static final e a = new e();

    e() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public l0<a> apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "it");
        return m0.b(th2);
    }
}
