package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.m;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ m.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long f;

    public /* synthetic */ d(m.a aVar, String str, long j, long j2) {
        this.a = aVar;
        this.b = str;
        this.c = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i(this.b, this.c, this.f);
    }
}
