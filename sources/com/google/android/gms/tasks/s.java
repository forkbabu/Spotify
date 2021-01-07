package com.google.android.gms.tasks;

import com.google.android.exoplayer2.util.g;

final class s implements Runnable {
    private final /* synthetic */ g a;
    private final /* synthetic */ t b;

    s(t tVar, g gVar) {
        this.b = tVar;
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                d dVar = this.b.c;
                Exception m = this.a.m();
                g.l(m);
                dVar.b(m);
            }
        }
    }
}
