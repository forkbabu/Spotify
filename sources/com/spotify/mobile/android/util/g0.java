package com.spotify.mobile.android.util;

import android.os.SystemClock;
import android.view.Choreographer;
import android.widget.ProgressBar;
import com.google.common.base.Optional;
import defpackage.l52;

public class g0<V extends ProgressBar> {
    private final V a;
    private final Optional<b> b;
    private final l52 c = l52.a();
    private l52.b d;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ float b;
        final /* synthetic */ long c;
        final /* synthetic */ long f;

        a(long j, float f2, long j2, long j3) {
            this.a = j;
            this.b = f2;
            this.c = j2;
            this.f = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            int elapsedRealtime = (int) ((((float) (SystemClock.elapsedRealtime() - this.a)) * this.b) + ((float) this.c));
            g0.this.a.setProgress(elapsedRealtime);
            if (g0.this.b.isPresent()) {
                ((b) g0.this.b.get()).a(elapsedRealtime);
            }
            if (((long) elapsedRealtime) < this.f) {
                l52 l52 = g0.this.c;
                l52.b bVar = g0.this.d;
                l52.getClass();
                Choreographer.getInstance().postFrameCallbackDelayed((Choreographer.FrameCallback) bVar, 16);
            }
        }
    }

    public interface b {
        void a(int i);
    }

    public g0(V v, Optional<b> optional) {
        this.a = v;
        this.b = optional;
    }

    public void e() {
        l52.b bVar = this.d;
        if (bVar != null) {
            this.c.getClass();
            Choreographer.getInstance().removeFrameCallback((Choreographer.FrameCallback) bVar);
            this.d = null;
        }
    }

    public void f(long j, long j2, float f) {
        long j3 = f == 0.0f ? j : j2;
        this.a.setMax((int) j2);
        g(j, j3, f);
    }

    public void g(long j, long j2, float f) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        e();
        l52.b b2 = this.c.b(new a(elapsedRealtime, f, j, j2));
        this.d = b2;
        this.c.getClass();
        Choreographer.getInstance().postFrameCallback((Choreographer.FrameCallback) b2);
    }
}
