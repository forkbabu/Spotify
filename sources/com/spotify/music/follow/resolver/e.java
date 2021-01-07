package com.spotify.music.follow.resolver;

import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((RxFollowersCountResolver.Counts) obj).counts[0];
    }
}
