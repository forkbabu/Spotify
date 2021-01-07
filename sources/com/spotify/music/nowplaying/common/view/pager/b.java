package com.spotify.music.nowplaying.common.view.pager;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ TrackCarouselView a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ b(TrackCarouselView trackCarouselView, boolean z) {
        this.a = trackCarouselView;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.W0(this.b);
    }
}
