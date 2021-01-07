package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.d;

/* access modifiers changed from: package-private */
public final class f9 {
    private i9 a;
    final /* synthetic */ e9 b;

    f9(e9 e9Var) {
        this.b = e9Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b.b();
        if (this.b.j().r(t.l0) && this.a != null) {
            this.b.c.removeCallbacks(this.a);
        }
        if (this.b.j().r(t.x0)) {
            this.b.h().w.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        if (this.b.j().r(t.l0)) {
            ((d) this.b.d()).getClass();
            this.a = new i9(this, System.currentTimeMillis(), j);
            this.b.c.postDelayed(this.a, 2000);
        }
    }
}
