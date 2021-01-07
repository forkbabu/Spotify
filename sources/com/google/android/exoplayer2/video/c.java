package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.s;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ s.a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ c(s.a aVar, int i, long j) {
        this.a = aVar;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h(this.b, this.c);
    }
}
