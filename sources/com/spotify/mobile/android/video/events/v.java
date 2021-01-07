package com.spotify.mobile.android.video.events;

public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;
    public final /* synthetic */ long n;

    public /* synthetic */ v(e0 e0Var, long j, long j2, long j3, long j4) {
        this.a = e0Var;
        this.b = j;
        this.c = j2;
        this.f = j3;
        this.n = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b, this.c, this.f, this.n);
    }
}
