package com.spotify.encore.consumer.elements.artwork;

import com.spotify.encore.consumer.elements.artwork.Artwork;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ ArtworkView a;
    public final /* synthetic */ Artwork.Model b;

    public /* synthetic */ a(ArtworkView artworkView, Artwork.Model model) {
        this.a = artworkView;
        this.b = model;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
