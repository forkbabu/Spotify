package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.m;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ m.a a;
    public final /* synthetic */ ej b;

    public /* synthetic */ f(m.a aVar, ej ejVar) {
        this.a = aVar;
        this.b = ejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
