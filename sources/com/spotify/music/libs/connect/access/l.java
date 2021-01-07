package com.spotify.music.libs.connect.access;

import com.spotify.music.libs.connect.access.view.ConnectAccessButton;

public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ ConnectAccessViewModel a;
    public final /* synthetic */ ConnectAccessButton b;

    public /* synthetic */ l(ConnectAccessViewModel connectAccessViewModel, ConnectAccessButton connectAccessButton) {
        this.a = connectAccessViewModel;
        this.b = connectAccessButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
