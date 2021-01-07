package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class q<TResult> implements z<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private c<TResult> c;

    public q(Executor executor, c<TResult> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    @Override // com.google.android.gms.tasks.z
    public final void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.z
    public final void c(g<TResult> gVar) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new r(this, gVar));
            }
        }
    }
}
