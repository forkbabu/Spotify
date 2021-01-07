package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.u8;

/* access modifiers changed from: package-private */
public final class k9 {
    private long a;
    private long b;
    private final j c;
    private final /* synthetic */ e9 d;

    public k9(e9 e9Var) {
        this.d = e9Var;
        this.c = new j9(this, e9Var.a);
        ((d) e9Var.d()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }

    static void c(k9 k9Var) {
        k9Var.d.b();
        ((d) k9Var.d.d()).getClass();
        k9Var.d(false, false, SystemClock.elapsedRealtime());
        a n = k9Var.d.n();
        ((d) k9Var.d.d()).getClass();
        n.v(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c.e();
        this.a = 0;
        this.b = 0;
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        this.d.b();
        this.c.e();
        this.a = j;
        this.b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.b();
        this.d.w();
        if (!t8.b() || !this.d.j().r(t.s0) || this.d.a.n()) {
            r4 r4Var = this.d.h().u;
            ((d) this.d.d()).getClass();
            r4Var.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (z || j2 >= 1000) {
            if (this.d.j().r(t.U) && !z2) {
                if (!u8.b() || !this.d.j().r(t.W)) {
                    j2 = e();
                } else {
                    j2 = j - this.b;
                    this.b = j;
                }
            }
            this.d.l().M().b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            o7.M(this.d.s().C(!this.d.j().E().booleanValue()), bundle, true);
            if (this.d.j().r(t.U) && !this.d.j().r(t.V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.d.j().r(t.V) || !z2) {
                this.d.o().W("auto", "_e", bundle);
            }
            this.a = j;
            this.c.e();
            this.c.c(3600000);
            return true;
        }
        this.d.l().M().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long e() {
        ((d) this.d.d()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.b;
        this.b = elapsedRealtime;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.c.e();
    }

    /* access modifiers changed from: package-private */
    public final long g(long j) {
        long j2 = j - this.b;
        this.b = j;
        return j2;
    }
}
