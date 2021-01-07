package com.spotify.music.features.collectionartist;

import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ CollectionArtistFragment a;

    public /* synthetic */ d(CollectionArtistFragment collectionArtistFragment) {
        this.a = collectionArtistFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        CollectionArtistFragment.d5(this.a, ((Boolean) obj).booleanValue());
    }
}
