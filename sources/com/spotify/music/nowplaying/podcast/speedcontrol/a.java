package com.spotify.music.nowplaying.podcast.speedcontrol;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ SpeedControlButton a;

    public /* synthetic */ a(SpeedControlButton speedControlButton) {
        this.a = speedControlButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b(view);
    }
}
