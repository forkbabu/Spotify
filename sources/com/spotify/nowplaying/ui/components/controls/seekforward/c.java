package com.spotify.nowplaying.ui.components.controls.seekforward;

import android.view.View;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ SeekForwardButton a;

    public /* synthetic */ c(SeekForwardButton seekForwardButton) {
        this.a = seekForwardButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(view);
    }
}
