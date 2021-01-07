package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.cast.o0;
import java.util.Locale;

public final class r {
    private static final b f = new b("RequestTracker");
    private static final Object g = new Object();
    private long a;
    private final Handler b = new o0(Looper.getMainLooper());
    private long c = -1;
    private s d;
    private Runnable e;

    public r(long j) {
        this.a = j;
    }

    private final void b(int i, Object obj, String str) {
        f.a(str, new Object[0]);
        Object obj2 = g;
        synchronized (obj2) {
            s sVar = this.d;
            if (sVar != null) {
                sVar.b(this.c, i, obj);
            }
            this.c = -1;
            this.d = null;
            synchronized (obj2) {
                Runnable runnable = this.e;
                if (runnable != null) {
                    this.b.removeCallbacks(runnable);
                    this.e = null;
                }
            }
        }
    }

    private final boolean d(int i) {
        synchronized (g) {
            long j = this.c;
            if (j == -1) {
                return false;
            }
            b(i, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j)));
            return true;
        }
    }

    public final boolean a(long j) {
        boolean z;
        synchronized (g) {
            long j2 = this.c;
            z = j2 != -1 && j2 == j;
        }
        return z;
    }

    public final void c(long j, s sVar) {
        s sVar2;
        long j2;
        Object obj = g;
        synchronized (obj) {
            sVar2 = this.d;
            j2 = this.c;
            this.c = j;
            this.d = sVar;
        }
        if (sVar2 != null) {
            sVar2.a(j2);
        }
        synchronized (obj) {
            Runnable runnable = this.e;
            if (runnable != null) {
                this.b.removeCallbacks(runnable);
            }
            t tVar = new t(this);
            this.e = tVar;
            this.b.postDelayed(tVar, this.a);
        }
    }

    public final boolean e() {
        return d(2002);
    }

    public final boolean f(long j, int i, Object obj) {
        synchronized (g) {
            long j2 = this.c;
            if (j2 == -1 || j2 != j) {
                return false;
            }
            b(i, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j)));
            return true;
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (g) {
            z = this.c != -1;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        synchronized (g) {
            if (this.c != -1) {
                d(15);
            }
        }
    }
}
