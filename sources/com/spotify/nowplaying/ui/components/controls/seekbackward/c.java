package com.spotify.nowplaying.ui.components.controls.seekbackward;

import android.view.View;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ SeekBackwardButton a;

    public /* synthetic */ c(SeekBackwardButton seekBackwardButton) {
        this.a = seekBackwardButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(view);
    }
}
