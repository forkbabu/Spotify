package com.spotify.music.features.collectionartist;

/* access modifiers changed from: package-private */
public class y implements Runnable {
    final /* synthetic */ CollectionArtistFragment a;

    y(CollectionArtistFragment collectionArtistFragment) {
        this.a = collectionArtistFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!z42.C(CollectionArtistFragment.M4(this.a))) {
            CollectionArtistFragment.N4(this.a).m(false);
        } else {
            CollectionArtistFragment.N4(this.a).l(false);
        }
    }
}
