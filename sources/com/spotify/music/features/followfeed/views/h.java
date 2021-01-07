package com.spotify.music.features.followfeed.views;

import io.reactivex.functions.l;
import java.util.Set;

final class h<T, R> implements l<jnf, Set<? extends Integer>> {
    final /* synthetic */ FollowRecsView a;

    h(FollowRecsView followRecsView) {
        this.a = followRecsView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Set<? extends Integer> apply(jnf jnf) {
        kotlin.jvm.internal.h.e(jnf, "it");
        return this.a.q;
    }
}
