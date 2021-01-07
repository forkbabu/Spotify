package com.spotify.music.nowplaying.drivingmode.view.voiceview;

import android.view.View;
import android.widget.ViewSwitcher;

public final /* synthetic */ class b implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ DrivingVoiceView a;

    public /* synthetic */ b(DrivingVoiceView drivingVoiceView) {
        this.a = drivingVoiceView;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        return this.a.K();
    }
}
