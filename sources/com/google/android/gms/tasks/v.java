package com.google.android.gms.tasks;

final class v implements Runnable {
    private final /* synthetic */ g a;
    private final /* synthetic */ u b;

    v(u uVar, g gVar) {
        this.b = uVar;
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.a.n());
            }
        }
    }
}
