package com.spotify.music.features.collectionartist;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ CollectionArtistFragment a;

    public /* synthetic */ e(CollectionArtistFragment collectionArtistFragment) {
        this.a = collectionArtistFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.n5((PlayerState) obj);
    }
}
