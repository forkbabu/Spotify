package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.s;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ s.a a;
    public final /* synthetic */ ej b;

    public /* synthetic */ b(s.a aVar, ej ejVar) {
        this.a = aVar;
        this.b = ejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i(this.b);
    }
}
