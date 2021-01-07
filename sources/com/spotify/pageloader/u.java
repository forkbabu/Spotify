package com.spotify.pageloader;

public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ PageLoaderView a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ u(PageLoaderView pageLoaderView, Runnable runnable) {
        this.a = pageLoaderView;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d0(this.b);
    }
}
