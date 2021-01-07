package com.google.android.play.core.tasks;

final class h implements Runnable {
    final /* synthetic */ c a;
    final /* synthetic */ i b;

    h(i iVar, c cVar) {
        this.b = iVar;
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.a.d());
            }
        }
    }
}
