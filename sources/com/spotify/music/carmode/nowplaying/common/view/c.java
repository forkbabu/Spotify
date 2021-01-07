package com.spotify.music.carmode.nowplaying.common.view;

import android.view.View;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ HeartButton a;

    public /* synthetic */ c(HeartButton heartButton) {
        this.a = heartButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(view);
    }
}
