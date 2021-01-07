package com.spotify.music.features.followfeed.views;

import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

final class g<T1, T2, R> implements c<jnf, jnf, jnf> {
    final /* synthetic */ FollowRecsView a;

    g(FollowRecsView followRecsView) {
        this.a = followRecsView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public jnf a(jnf jnf, jnf jnf2) {
        jnf jnf3 = jnf;
        jnf jnf4 = jnf2;
        h.e(jnf3, "previous");
        h.e(jnf4, "current");
        this.a.q = com.spotify.music.features.followfeed.c.b(jnf3, jnf4);
        return jnf4;
    }
}
