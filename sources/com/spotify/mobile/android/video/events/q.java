package com.spotify.mobile.android.video.events;

import com.spotify.mobile.android.video.exception.BetamaxException;

public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ BetamaxException b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ q(e0 e0Var, BetamaxException betamaxException, long j, long j2) {
        this.a = e0Var;
        this.b = betamaxException;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l(this.b, this.c, this.f);
    }
}
