package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.m;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ m.a a;
    public final /* synthetic */ ej b;

    public /* synthetic */ e(m.a aVar, ej ejVar) {
        this.a = aVar;
        this.b = ejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this.b);
    }
}
