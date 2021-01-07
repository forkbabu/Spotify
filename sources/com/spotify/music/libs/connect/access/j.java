package com.spotify.music.libs.connect.access;

import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ ConnectAccessViewModel a;

    public /* synthetic */ j(ConnectAccessViewModel connectAccessViewModel) {
        this.a = connectAccessViewModel;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ConnectAccessViewModel connectAccessViewModel = this.a;
        gba gba = (gba) obj;
        connectAccessViewModel.getClass();
        connectAccessViewModel.l(gba.f(), gba.e());
    }
}
