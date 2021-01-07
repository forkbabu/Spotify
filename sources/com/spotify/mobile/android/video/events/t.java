package com.spotify.mobile.android.video.events;

public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ y b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ t(e0 e0Var, y yVar, long j, long j2) {
        this.a = e0Var;
        this.b = yVar;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.v(this.b, this.c, this.f);
    }
}
