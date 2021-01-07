package com.spotify.mobile.android.video.events;

public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ p(e0 e0Var, float f2, long j, long j2) {
        this.a = e0Var;
        this.b = f2;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.s(this.b, this.c, this.f);
    }
}
