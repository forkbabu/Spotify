package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

final class i<ResultT> implements k<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final b<? super ResultT> c;

    public i(Executor executor, b<? super ResultT> bVar) {
        this.a = executor;
        this.c = bVar;
    }

    @Override // com.google.android.play.core.tasks.k
    public final void a(c<ResultT> cVar) {
        if (cVar.f()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new h(this, cVar));
                }
            }
        }
    }
}
