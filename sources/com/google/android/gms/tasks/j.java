package com.google.android.gms.tasks;

import com.google.android.exoplayer2.util.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class j {

    interface a<T> extends b, d, e<T> {
    }

    private static final class b implements a {
        private final CountDownLatch a = new CountDownLatch(1);

        b(f0 f0Var) {
        }

        public final void a() {
            this.a.await();
        }

        @Override // com.google.android.gms.tasks.d
        public final void b(Exception exc) {
            this.a.countDown();
        }

        public final boolean c(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }

        @Override // com.google.android.gms.tasks.b
        public final void d() {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.e
        public final void onSuccess(Object obj) {
            this.a.countDown();
        }
    }

    private static final class c implements a {
        private final Object a = new Object();
        private final int b;
        private final b0<Void> c;
        private int d;
        private int e;
        private int f;
        private Exception g;
        private boolean h;

        public c(int i, b0<Void> b0Var) {
            this.b = i;
            this.c = b0Var;
        }

        private final void a() {
            if (this.d + this.e + this.f != this.b) {
                return;
            }
            if (this.g != null) {
                b0<Void> b0Var = this.c;
                int i = this.e;
                int i2 = this.b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i);
                sb.append(" out of ");
                sb.append(i2);
                sb.append(" underlying tasks failed");
                b0Var.u(new ExecutionException(sb.toString(), this.g));
            } else if (this.h) {
                this.c.w();
            } else {
                this.c.v(null);
            }
        }

        @Override // com.google.android.gms.tasks.d
        public final void b(Exception exc) {
            synchronized (this.a) {
                this.e++;
                this.g = exc;
                a();
            }
        }

        @Override // com.google.android.gms.tasks.b
        public final void d() {
            synchronized (this.a) {
                this.f++;
                this.h = true;
                a();
            }
        }

        @Override // com.google.android.gms.tasks.e
        public final void onSuccess(Object obj) {
            synchronized (this.a) {
                this.d++;
                a();
            }
        }
    }

    public static <TResult> TResult a(g<TResult> gVar) {
        g.j("Must not be called on the main application thread");
        g.k(gVar, "Task must not be null");
        if (gVar.q()) {
            return (TResult) g(gVar);
        }
        b bVar = new b(null);
        h(gVar, bVar);
        bVar.a();
        return (TResult) g(gVar);
    }

    public static <TResult> TResult b(g<TResult> gVar, long j, TimeUnit timeUnit) {
        g.j("Must not be called on the main application thread");
        g.k(gVar, "Task must not be null");
        g.k(timeUnit, "TimeUnit must not be null");
        if (gVar.q()) {
            return (TResult) g(gVar);
        }
        b bVar = new b(null);
        h(gVar, bVar);
        if (bVar.c(j, timeUnit)) {
            return (TResult) g(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> g<TResult> c(Executor executor, Callable<TResult> callable) {
        g.k(executor, "Executor must not be null");
        g.k(callable, "Callback must not be null");
        b0 b0Var = new b0();
        executor.execute(new f0(b0Var, callable));
        return b0Var;
    }

    public static <TResult> g<TResult> d(Exception exc) {
        b0 b0Var = new b0();
        b0Var.u(exc);
        return b0Var;
    }

    public static <TResult> g<TResult> e(TResult tresult) {
        b0 b0Var = new b0();
        b0Var.v(tresult);
        return b0Var;
    }

    public static g<Void> f(Collection<? extends g<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator<? extends g<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (((g) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        b0 b0Var = new b0();
        c cVar = new c(collection.size(), b0Var);
        Iterator<? extends g<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            h((g) it2.next(), cVar);
        }
        return b0Var;
    }

    private static <TResult> TResult g(g<TResult> gVar) {
        if (gVar.r()) {
            return gVar.n();
        }
        if (gVar.p()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.m());
    }

    private static <T> void h(g<T> gVar, a<? super T> aVar) {
        Executor executor = i.b;
        gVar.i(executor, aVar);
        gVar.f(executor, aVar);
        gVar.a(executor, aVar);
    }
}
