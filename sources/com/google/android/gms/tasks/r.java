package com.google.android.gms.tasks;

final class r implements Runnable {
    private final /* synthetic */ g a;
    private final /* synthetic */ q b;

    r(q qVar, g gVar) {
        this.b = qVar;
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.a(this.a);
            }
        }
    }
}
