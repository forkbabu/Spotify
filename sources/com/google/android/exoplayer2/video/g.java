package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.s;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ s.a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int f;
    public final /* synthetic */ float n;

    public /* synthetic */ g(s.a aVar, int i, int i2, int i3, float f2) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.n = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l(this.b, this.c, this.f, this.n);
    }
}
