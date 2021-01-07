package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.m;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ m.a a;
    public final /* synthetic */ int b;

    public /* synthetic */ c(m.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b);
    }
}
