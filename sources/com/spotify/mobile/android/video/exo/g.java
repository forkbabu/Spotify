package com.spotify.mobile.android.video.exo;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.video.s;

public class g implements s {
    private final s a;
    private final Handler b;
    private boolean c = false;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ Surface a;

        a(Surface surface) {
            this.a = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.a.p(this.a);
        }
    }

    public g(s sVar, Handler handler) {
        this.a = sVar;
        this.b = handler;
    }

    @Override // com.google.android.exoplayer2.video.s
    public void H(ej ejVar) {
    }

    @Override // com.google.android.exoplayer2.video.s
    public void Q(int i, long j) {
        this.a.Q(i, j);
    }

    @Override // com.google.android.exoplayer2.video.s
    public void V(ej ejVar) {
    }

    public void b(Surface surface) {
        if (!this.c) {
            this.c = true;
            this.b.post(new a(surface));
        }
    }

    public void c() {
        this.c = false;
    }

    @Override // com.google.android.exoplayer2.video.s
    public void h(int i, int i2, int i3, float f) {
        this.a.h(i, i2, i3, f);
    }

    @Override // com.google.android.exoplayer2.video.s
    public void m(String str, long j, long j2) {
        this.a.m(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.video.s
    public void p(Surface surface) {
    }

    @Override // com.google.android.exoplayer2.video.s
    public void z(d0 d0Var) {
    }
}
