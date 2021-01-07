package com.spotify.mobile.android.ui.view;

import android.widget.CompoundButton;

public final /* synthetic */ class f implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ DownloadHeaderView a;

    public /* synthetic */ f(DownloadHeaderView downloadHeaderView) {
        this.a = downloadHeaderView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.d(compoundButton, z);
    }
}
