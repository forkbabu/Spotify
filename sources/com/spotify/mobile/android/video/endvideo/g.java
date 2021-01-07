package com.spotify.mobile.android.video.endvideo;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ l a;
    public final /* synthetic */ PendingEndVideoEvent b;

    public /* synthetic */ g(l lVar, PendingEndVideoEvent pendingEndVideoEvent) {
        this.a = lVar;
        this.b = pendingEndVideoEvent;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.Z(this.b, (Throwable) obj);
    }
}
