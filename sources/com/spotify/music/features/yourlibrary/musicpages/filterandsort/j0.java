package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ MusicPagesFiltering a;

    public /* synthetic */ j0(MusicPagesFiltering musicPagesFiltering) {
        this.a = musicPagesFiltering;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MusicPagesFiltering.b(this.a);
    }
}
