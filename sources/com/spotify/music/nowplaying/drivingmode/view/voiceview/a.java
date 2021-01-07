package com.spotify.music.nowplaying.drivingmode.view.voiceview;

import android.view.View;
import android.widget.ViewSwitcher;

public final /* synthetic */ class a implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ DrivingVoiceView a;

    public /* synthetic */ a(DrivingVoiceView drivingVoiceView) {
        this.a = drivingVoiceView;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        return this.a.P();
    }
}
