package com.spotify.mobile.android.video.events;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ j0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ e(e0 e0Var, j0 j0Var, long j, long j2) {
        this.a = e0Var;
        this.b = j0Var;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b, this.c, this.f);
    }
}
