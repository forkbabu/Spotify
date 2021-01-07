package com.spotify.encore.consumer.elements.coverart;

import com.spotify.encore.consumer.elements.coverart.CoverArt;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ CoverArtView a;
    public final /* synthetic */ CoverArt.Model b;

    public /* synthetic */ a(CoverArtView coverArtView, CoverArt.Model model) {
        this.a = coverArtView;
        this.b = model;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
