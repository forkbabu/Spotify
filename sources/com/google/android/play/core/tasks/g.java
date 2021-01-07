package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

final class g<ResultT> implements k<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final a c;

    public g(Executor executor, a aVar) {
        this.a = executor;
        this.c = aVar;
    }

    @Override // com.google.android.play.core.tasks.k
    public final void a(c<ResultT> cVar) {
        if (!cVar.f()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new f(this, cVar));
                }
            }
        }
    }
}
