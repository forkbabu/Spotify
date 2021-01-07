package com.google.android.gms.common.api.internal;

final class o1 implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ zzc c;

    o1(zzc zzc, LifecycleCallback lifecycleCallback, String str) {
        this.c = zzc;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.h0 > 0) {
            this.a.e(this.c.i0 != null ? this.c.i0.getBundle(this.b) : null);
        }
        if (this.c.h0 >= 2) {
            this.a.h();
        }
        if (this.c.h0 >= 3) {
            this.a.f();
        }
        if (this.c.h0 >= 4) {
            this.a.i();
        }
        if (this.c.h0 >= 5) {
            this.a.getClass();
        }
    }
}
