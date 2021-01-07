package com.spotify.music.features.collectionartist;

import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = CollectionArtistFragment.z1;
        Assertion.i("Connection state error", (Throwable) obj);
    }
}
