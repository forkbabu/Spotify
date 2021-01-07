package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.video.s;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ s.a a;
    public final /* synthetic */ Surface b;

    public /* synthetic */ e(s.a aVar, Surface surface) {
        this.a = aVar;
        this.b = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this.b);
    }
}
