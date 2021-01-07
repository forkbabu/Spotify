package com.spotify.music.homecomponents.card.artistcardfollow;

import com.spotify.music.follow.j;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

final class d<T> implements n<j> {
    public static final d a = new d();

    d() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(j jVar) {
        j jVar2 = jVar;
        h.e(jVar2, "it");
        String e = jVar2.e();
        h.d(e, "it.uri");
        return e.length() > 0;
    }
}
