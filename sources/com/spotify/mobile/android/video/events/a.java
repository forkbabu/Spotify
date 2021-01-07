package com.spotify.mobile.android.video.events;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ long b;

    public /* synthetic */ a(e0 e0Var, long j) {
        this.a = e0Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
