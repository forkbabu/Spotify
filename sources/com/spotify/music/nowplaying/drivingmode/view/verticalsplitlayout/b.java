package com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout;

import android.view.View;

public final /* synthetic */ class b implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ VerticalSplitLayout a;

    public /* synthetic */ b(VerticalSplitLayout verticalSplitLayout) {
        this.a = verticalSplitLayout;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.a.s(i);
    }
}
