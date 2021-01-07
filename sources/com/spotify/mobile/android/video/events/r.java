package com.spotify.mobile.android.video.events;

public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ r(e0 e0Var, i0 i0Var, long j) {
        this.a = e0Var;
        this.b = i0Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h(this.b, this.c);
    }
}
