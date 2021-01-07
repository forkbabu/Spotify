package com.google.android.gms.measurement.internal;

/* access modifiers changed from: package-private */
public final class i implements Runnable {
    private final /* synthetic */ a6 a;
    private final /* synthetic */ j b;

    i(j jVar, a6 a6Var) {
        this.b = jVar;
        this.a = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q();
        if (pa.a()) {
            this.a.k().y(this);
            return;
        }
        boolean d = this.b.d();
        this.b.c = 0;
        if (d) {
            this.b.b();
        }
    }
}
