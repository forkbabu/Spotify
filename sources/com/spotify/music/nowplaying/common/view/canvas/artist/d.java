package com.spotify.music.nowplaying.common.view.canvas.artist;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ CanvasArtistWidgetView a;

    public /* synthetic */ d(CanvasArtistWidgetView canvasArtistWidgetView) {
        this.a = canvasArtistWidgetView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setVisibility(0);
    }
}
