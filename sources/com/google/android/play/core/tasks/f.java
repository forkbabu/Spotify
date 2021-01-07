package com.google.android.play.core.tasks;

final class f implements Runnable {
    final /* synthetic */ c a;
    final /* synthetic */ g b;

    f(g gVar, c cVar) {
        this.b = gVar;
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.b(this.a.c());
            }
        }
    }
}
