package com.google.android.gms.tasks;

final class o implements Runnable {
    private final /* synthetic */ p a;

    o(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.b) {
            if (this.a.c != null) {
                this.a.c.d();
            }
        }
    }
}
