package com.spotify.pageloader;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ PageLoaderView a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ o(PageLoaderView pageLoaderView, t0 t0Var) {
        this.a = pageLoaderView;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h0(this.b);
    }
}
