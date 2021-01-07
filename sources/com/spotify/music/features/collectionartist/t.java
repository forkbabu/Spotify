package com.spotify.music.features.collectionartist;

import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import io.reactivex.functions.g;

public final /* synthetic */ class t implements g {
    public final /* synthetic */ CollectionArtistFragment a;

    public /* synthetic */ t(CollectionArtistFragment collectionArtistFragment) {
        this.a = collectionArtistFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h5((RxFollowersCountResolver.Count) obj);
    }
}
