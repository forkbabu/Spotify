package com.spotify.music.nowplaying.common.view.pager;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ TrackCarouselView a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ c(TrackCarouselView trackCarouselView, boolean z) {
        this.a = trackCarouselView;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.X0(this.b);
    }
}
