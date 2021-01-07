package com.spotify.mobile.android.video.events;

import java.util.List;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;

    public /* synthetic */ i(e0 e0Var, List list, long j) {
        this.a = e0Var;
        this.b = list;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this.b, this.c);
    }
}
