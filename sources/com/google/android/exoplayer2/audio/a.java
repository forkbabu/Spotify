package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.m;
import com.google.android.exoplayer2.d0;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ m.a a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ a(m.a aVar, d0 d0Var) {
        this.a = aVar;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l(this.b);
    }
}
