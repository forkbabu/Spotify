package com.google.android.gms.measurement.internal;

final class s8 implements Runnable {
    private final /* synthetic */ s3 a;
    private final /* synthetic */ r8 b;

    s8(r8 r8Var, s3 s3Var) {
        this.b = r8Var;
        this.a = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.U()) {
                this.b.c.l().L().a("Connected to remote service");
                this.b.c.J(this.a);
            }
        }
    }
}
