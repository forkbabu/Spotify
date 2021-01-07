package com.spotify.music.libs.connect.access;

import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ ConnectAccessViewModel a;
    public final /* synthetic */ String b;

    public /* synthetic */ m(ConnectAccessViewModel connectAccessViewModel, String str) {
        this.a = connectAccessViewModel;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, (u3) obj);
    }
}
