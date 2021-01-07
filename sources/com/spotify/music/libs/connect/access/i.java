package com.spotify.music.libs.connect.access;

import android.view.View;

public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ ConnectAccessViewModel a;

    public /* synthetic */ i(ConnectAccessViewModel connectAccessViewModel) {
        this.a = connectAccessViewModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(view);
    }
}
