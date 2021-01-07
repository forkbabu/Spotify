package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.video.s;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ s.a a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ a(s.a aVar, d0 d0Var) {
        this.a = aVar;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
