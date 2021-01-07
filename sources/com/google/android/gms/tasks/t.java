package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class t<TResult> implements z<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private d c;

    public t(Executor executor, d dVar) {
        this.a = executor;
        this.c = dVar;
    }

    @Override // com.google.android.gms.tasks.z
    public final void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    @Override // com.google.android.gms.tasks.z
    public final void c(g<TResult> gVar) {
        if (!gVar.r() && !gVar.p()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new s(this, gVar));
                }
            }
        }
    }
}
