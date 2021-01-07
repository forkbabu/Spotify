package com.spotify.music.libs.connect.access;

import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ ConnectAccessViewModel a;

    public /* synthetic */ h(ConnectAccessViewModel connectAccessViewModel) {
        this.a = connectAccessViewModel;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j((Boolean) obj);
    }
}
