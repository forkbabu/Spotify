package com.spotify.mobile.android.video.events;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ d(e0 e0Var, long j, long j2) {
        this.a = e0Var;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b, this.c);
    }
}
