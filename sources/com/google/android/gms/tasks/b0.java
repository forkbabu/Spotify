package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class b0<TResult> extends g<TResult> {
    private final Object a = new Object();
    private final y<TResult> b = new y<>();
    private boolean c;
    private volatile boolean d;
    private TResult e;
    private Exception f;

    private static class a extends LifecycleCallback {
        private final List<WeakReference<z<?>>> b = new ArrayList();

        private a(j jVar) {
            super(jVar);
            this.a.F("TaskOnStopCallback", this);
        }

        public static a j(Activity activity) {
            j c = LifecycleCallback.c(activity);
            a aVar = (a) c.a0("TaskOnStopCallback", a.class);
            return aVar == null ? new a(c) : aVar;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void i() {
            synchronized (this.b) {
                for (WeakReference<z<?>> weakReference : this.b) {
                    z<?> zVar = weakReference.get();
                    if (zVar != null) {
                        zVar.a();
                    }
                }
                this.b.clear();
            }
        }

        public final <T> void k(z<T> zVar) {
            synchronized (this.b) {
                this.b.add(new WeakReference<>(zVar));
            }
        }
    }

    b0() {
    }

    private final void z() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> a(Executor executor, b bVar) {
        y<TResult> yVar = this.b;
        int i = c0.b;
        yVar.b(new p(executor, bVar));
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> b(c<TResult> cVar) {
        c(i.a, cVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> c(Executor executor, c<TResult> cVar) {
        y<TResult> yVar = this.b;
        int i = c0.b;
        yVar.b(new q(executor, cVar));
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> d(Activity activity, d dVar) {
        Executor executor = i.a;
        int i = c0.b;
        t tVar = new t(executor, dVar);
        this.b.b(tVar);
        a.j(activity).k(tVar);
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> e(d dVar) {
        f(i.a, dVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> f(Executor executor, d dVar) {
        y<TResult> yVar = this.b;
        int i = c0.b;
        yVar.b(new t(executor, dVar));
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> g(Activity activity, e<? super TResult> eVar) {
        Executor executor = i.a;
        int i = c0.b;
        u uVar = new u(executor, eVar);
        this.b.b(uVar);
        a.j(activity).k(uVar);
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> h(e<? super TResult> eVar) {
        i(i.a, eVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final g<TResult> i(Executor executor, e<? super TResult> eVar) {
        y<TResult> yVar = this.b;
        int i = c0.b;
        yVar.b(new u(executor, eVar));
        z();
        return this;
    }

    @Override // com.google.android.gms.tasks.g
    public final <TContinuationResult> g<TContinuationResult> j(a<TResult, TContinuationResult> aVar) {
        return k(i.a, aVar);
    }

    @Override // com.google.android.gms.tasks.g
    public final <TContinuationResult> g<TContinuationResult> k(Executor executor, a<TResult, TContinuationResult> aVar) {
        b0 b0Var = new b0();
        y<TResult> yVar = this.b;
        int i = c0.b;
        yVar.b(new k(executor, aVar, b0Var));
        z();
        return b0Var;
    }

    @Override // com.google.android.gms.tasks.g
    public final <TContinuationResult> g<TContinuationResult> l(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        b0 b0Var = new b0();
        y<TResult> yVar = this.b;
        int i = c0.b;
        yVar.b(new l(executor, aVar, b0Var));
        z();
        return b0Var;
    }

    @Override // com.google.android.gms.tasks.g
    public final Exception m() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.g
    public final TResult n() {
        TResult tresult;
        synchronized (this.a) {
            g.p(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (this.f == null) {
                tresult = this.e;
            } else {
                throw new RuntimeExecutionException(this.f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.g
    public final <X extends Throwable> TResult o(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            g.p(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (cls.isInstance(this.f)) {
                throw cls.cast(this.f);
            } else if (this.f == null) {
                tresult = this.e;
            } else {
                throw new RuntimeExecutionException(this.f);
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.g
    public final boolean p() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.g
    public final boolean q() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.g
    public final boolean r() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.g
    public final <TContinuationResult> g<TContinuationResult> s(f<TResult, TContinuationResult> fVar) {
        return t(i.a, fVar);
    }

    @Override // com.google.android.gms.tasks.g
    public final <TContinuationResult> g<TContinuationResult> t(Executor executor, f<TResult, TContinuationResult> fVar) {
        b0 b0Var = new b0();
        y<TResult> yVar = this.b;
        int i = c0.b;
        yVar.b(new x(executor, fVar, b0Var));
        z();
        return b0Var;
    }

    public final void u(Exception exc) {
        g.k(exc, "Exception must not be null");
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.f = exc;
            } else {
                throw DuplicateTaskCompletionException.a(this);
            }
        }
        this.b.a(this);
    }

    public final void v(TResult tresult) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.e = tresult;
            } else {
                throw DuplicateTaskCompletionException.a(this);
            }
        }
        this.b.a(this);
    }

    public final boolean w() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a(this);
            return true;
        }
    }

    public final boolean x(Exception exc) {
        g.k(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean y(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a(this);
            return true;
        }
    }
}
