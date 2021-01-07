package com.facebook;

import android.os.Handler;
import com.facebook.m;

/* access modifiers changed from: package-private */
public class x {
    private final m a;
    private final Handler b;
    private final long c = k.r();
    private long d;
    private long e;
    private long f;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ m.e a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;

        a(x xVar, m.e eVar, long j, long j2) {
            this.a = eVar;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    this.a.a(this.b, this.c);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    x(Handler handler, m mVar) {
        this.a = mVar;
        this.b = handler;
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        long j2 = this.d + j;
        this.d = j2;
        if (j2 >= this.e + this.c || j2 >= this.f) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        this.f += j;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.d > this.e) {
            m.c l = this.a.l();
            long j = this.f;
            if (j > 0 && (l instanceof m.e)) {
                long j2 = this.d;
                m.e eVar = (m.e) l;
                Handler handler = this.b;
                if (handler == null) {
                    eVar.a(j2, j);
                } else {
                    handler.post(new a(this, eVar, j2, j));
                }
                this.e = this.d;
            }
        }
    }
}
