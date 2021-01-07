package com.spotify.music.features.collectionartist;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = CollectionArtistFragment.z1;
        Logger.e((Throwable) obj, "Failed to subscribe to PlayerState", new Object[0]);
    }
}
