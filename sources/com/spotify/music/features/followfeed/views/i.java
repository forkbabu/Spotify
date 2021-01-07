package com.spotify.music.features.followfeed.views;

import io.reactivex.functions.g;
import java.util.Set;
import kotlin.jvm.internal.h;

final class i<T> implements g<Set<? extends Integer>> {
    final /* synthetic */ FollowRecsView a;

    i(FollowRecsView followRecsView) {
        this.a = followRecsView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Set<? extends Integer> set) {
        Set<? extends Integer> set2 = set;
        nmf nmf = this.a.o;
        h.d(set2, "it");
        nmf.invoke(set2);
    }
}
