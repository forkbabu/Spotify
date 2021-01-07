package com.spotify.music.nowplaying.common.view.canvas.artist;

import android.view.View;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ CanvasArtistWidgetView a;

    public /* synthetic */ e(CanvasArtistWidgetView canvasArtistWidgetView) {
        this.a = canvasArtistWidgetView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(view);
    }
}
