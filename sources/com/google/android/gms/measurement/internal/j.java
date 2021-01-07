package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.gb;

/* access modifiers changed from: package-private */
public abstract class j {
    private static volatile Handler d;
    private final a6 a;
    private final Runnable b;
    private volatile long c;

    j(a6 a6Var) {
        if (a6Var != null) {
            this.a = a6Var;
            this.b = new i(this, a6Var);
            return;
        }
        throw new NullPointerException("null reference");
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (j.class) {
            if (d == null) {
                d = new gb(this.a.i().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j) {
        e();
        if (j >= 0) {
            ((d) this.a.d()).getClass();
            this.c = System.currentTimeMillis();
            if (!f().postDelayed(this.b, j)) {
                this.a.l().E().b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean d() {
        return this.c != 0;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.c = 0;
        f().removeCallbacks(this.b);
    }
}
