package com.spotify.mobile.android.video.events;

public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ u(e0 e0Var, boolean z, long j, long j2) {
        this.a = e0Var;
        this.b = z;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c, this.f);
    }
}
