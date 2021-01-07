package com.spotify.music.follow.resolver;

import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = this.a;
        RxFollowersCountResolver.Counts counts = (RxFollowersCountResolver.Counts) obj;
        RxFollowersCountResolver.Count[] countArr = counts.counts;
        if (countArr == null || countArr.length != i) {
            return s.P(new Exception(je.p0("Unexpected count data, expected ", i)));
        }
        return s.i0(counts);
    }
}
