package com.spotify.music.lyrics.fullscreen;

import android.view.View;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ LyricsFullscreenFragment a;

    public /* synthetic */ d(LyricsFullscreenFragment lyricsFullscreenFragment) {
        this.a = lyricsFullscreenFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.close();
    }
}
