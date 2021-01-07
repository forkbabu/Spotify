package com.spotify.mobile.android.video.events;

import com.spotify.mobile.android.video.d0;

public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ w(e0 e0Var, d0 d0Var, long j) {
        this.a = e0Var;
        this.b = d0Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.n(this.b, this.c);
    }
}
