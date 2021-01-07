package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.m;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ m.a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ b(m.a aVar, int i, long j, long j2) {
        this.a = aVar;
        this.b = i;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h(this.b, this.c, this.f);
    }
}
