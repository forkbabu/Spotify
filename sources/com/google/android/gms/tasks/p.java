package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class p<TResult> implements z<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private b c;

    public p(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    @Override // com.google.android.gms.tasks.z
    public final void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.z
    public final void c(g<TResult> gVar) {
        if (gVar.p()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new o(this));
                }
            }
        }
    }
}
