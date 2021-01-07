package com.spotify.music.podcastinteractivity.qna.datasource;

import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class g<T> implements io.reactivex.functions.g<ztc> {
    final /* synthetic */ c a;

    g(c cVar) {
        this.a = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.subjects.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.g
    public void accept(ztc ztc) {
        ztc ztc2 = ztc;
        h.e(ztc2, "model");
        this.a.b.onNext(ztc2);
    }
}
