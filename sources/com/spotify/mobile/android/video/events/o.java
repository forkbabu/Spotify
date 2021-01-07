package com.spotify.mobile.android.video.events;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    public /* synthetic */ o(e0 e0Var, boolean z, long j) {
        this.a = e0Var;
        this.b = z;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.m(this.b, this.c);
    }
}
