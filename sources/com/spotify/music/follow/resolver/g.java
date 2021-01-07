package com.spotify.music.follow.resolver;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.follow.j;
import io.reactivex.s;

public class g implements f {
    private final CollectionStateProvider a;
    private final RxFollowersCountResolver b;

    public g(CollectionStateProvider collectionStateProvider, RxFollowersCountResolver rxFollowersCountResolver) {
        this.a = collectionStateProvider;
        rxFollowersCountResolver.getClass();
        this.b = rxFollowersCountResolver;
    }

    @Override // com.spotify.music.follow.resolver.f
    public s<j> a(String str) {
        str.getClass();
        ImmutableList of = ImmutableList.of(str);
        of.getClass();
        MoreObjects.checkArgument(!of.isEmpty());
        return s.n(this.b.b(of), this.a.b("spotify:follow", "<no context>", (String[]) of.toArray(new String[0])).E(), new b(of)).W(a.a, false, Integer.MAX_VALUE);
    }
}
