package com.spotify.pageloader;

public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ PageLoaderView a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ j(PageLoaderView pageLoaderView, Runnable runnable) {
        this.a = pageLoaderView;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b0(this.b);
    }
}
