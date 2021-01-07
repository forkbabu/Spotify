package com.spotify.mobile.android.video.events;

import com.spotify.mobile.android.video.StreamingType;

public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ StreamingType b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ m(e0 e0Var, StreamingType streamingType, long j, long j2) {
        this.a = e0Var;
        this.b = streamingType;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q(this.b, this.c, this.f);
    }
}
