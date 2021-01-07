package com.google.android.gms.common.api.internal;

final class m1 implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ n1 c;

    m1(n1 n1Var, LifecycleCallback lifecycleCallback, String str) {
        this.c = n1Var;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.b > 0) {
            this.a.e(this.c.c != null ? this.c.c.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.h();
        }
        if (this.c.b >= 3) {
            this.a.f();
        }
        if (this.c.b >= 4) {
            this.a.i();
        }
        if (this.c.b >= 5) {
            this.a.getClass();
        }
    }
}
