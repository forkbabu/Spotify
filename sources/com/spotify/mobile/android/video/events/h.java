package com.spotify.mobile.android.video.events;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ h(e0 e0Var, int i, long j) {
        this.a = e0Var;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.y(this.b, this.c);
    }
}
