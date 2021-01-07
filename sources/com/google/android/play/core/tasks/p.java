package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class p<ResultT> extends c<ResultT> {
    private final Object a = new Object();
    private final l<ResultT> b = new l<>();
    private boolean c;
    private ResultT d;
    private Exception e;

    p() {
    }

    private final void k() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    @Override // com.google.android.play.core.tasks.c
    public final c<ResultT> a(Executor executor, a aVar) {
        this.b.b(new g(executor, aVar));
        k();
        return this;
    }

    @Override // com.google.android.play.core.tasks.c
    public final c<ResultT> b(Executor executor, b<? super ResultT> bVar) {
        this.b.b(new i(executor, bVar));
        k();
        return this;
    }

    @Override // com.google.android.play.core.tasks.c
    public final Exception c() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // com.google.android.play.core.tasks.c
    public final ResultT d() {
        ResultT resultt;
        synchronized (this.a) {
            if (this.c) {
                Exception exc = this.e;
                if (exc == null) {
                    resultt = this.d;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    @Override // com.google.android.play.core.tasks.c
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.play.core.tasks.c
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void g(Exception exc) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.e = exc;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.b.a(this);
    }

    public final void h(ResultT resultt) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.d = resultt;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.b.a(this);
    }

    public final boolean i(Exception exc) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean j(ResultT resultt) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = resultt;
            this.b.a(this);
            return true;
        }
    }
}
