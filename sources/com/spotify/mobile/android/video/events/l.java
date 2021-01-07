package com.spotify.mobile.android.video.events;

public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ l(e0 e0Var, long j, long j2, long j3) {
        this.a = e0Var;
        this.b = j;
        this.c = j2;
        this.f = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c, this.f);
    }
}
