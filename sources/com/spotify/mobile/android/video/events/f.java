package com.spotify.mobile.android.video.events;

import com.google.common.base.Optional;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ Optional b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ f(e0 e0Var, Optional optional, long j, long j2) {
        this.a = e0Var;
        this.b = optional;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.t(this.b, this.c, this.f);
    }
}
