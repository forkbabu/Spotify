package com.spotify.music.features.collectionartist;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = CollectionArtistFragment.z1;
        Logger.e((Throwable) obj, "Failed to subscribe to ArtistDataLoader for list of tracks", new Object[0]);
    }
}
