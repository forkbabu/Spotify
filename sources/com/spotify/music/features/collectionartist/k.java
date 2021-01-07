package com.spotify.music.features.collectionartist;

import com.spotify.music.features.collectionartist.CollectionArtistFragment;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ CollectionArtistFragment a;

    public /* synthetic */ k(CollectionArtistFragment collectionArtistFragment) {
        this.a = collectionArtistFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        CollectionArtistFragment.e5(this.a, (CollectionArtistFragment.h) obj);
    }
}
