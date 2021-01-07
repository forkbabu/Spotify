package com.spotify.music.libs.connect.access;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ ConnectAccessViewModel a;
    public final /* synthetic */ androidx.appcompat.app.g b;

    public /* synthetic */ g(ConnectAccessViewModel connectAccessViewModel, androidx.appcompat.app.g gVar) {
        this.a = connectAccessViewModel;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b);
    }
}
