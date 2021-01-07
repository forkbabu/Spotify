package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class u<TResult> implements z<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private e<? super TResult> c;

    public u(Executor executor, e<? super TResult> eVar) {
        this.a = executor;
        this.c = eVar;
    }

    @Override // com.google.android.gms.tasks.z
    public final void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.z
    public final void c(g<TResult> gVar) {
        if (gVar.r()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new v(this, gVar));
                }
            }
        }
    }
}
