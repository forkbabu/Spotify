package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.g;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class b<T, U extends Collection<? super T>> extends a<T, U> {
    final long b;
    final long c;
    final TimeUnit f;
    final y n;
    final Callable<U> o;
    final int p;
    final boolean q;

    static final class a<T, U extends Collection<? super T>> extends g<T, U, U> implements Runnable, io.reactivex.disposables.b {
        final Callable<U> o;
        final long p;
        final TimeUnit q;
        final int r;
        final boolean s;
        final y.c t;
        U u;
        io.reactivex.disposables.b v;
        io.reactivex.disposables.b w;
        long x;
        long y;

        a(x<? super U> xVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, y.c cVar) {
            super(xVar, new MpscLinkedQueue());
            this.o = callable;
            this.p = j;
            this.q = timeUnit;
            this.r = i;
            this.s = z;
            this.t = cVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.x */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.g
        public void a(x xVar, Object obj) {
            xVar.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.f) {
                this.f = true;
                this.w.dispose();
                this.t.dispose();
                synchronized (this) {
                    this.u = null;
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            U u2;
            this.t.dispose();
            synchronized (this) {
                u2 = this.u;
                this.u = null;
            }
            if (u2 != null) {
                this.c.offer(u2);
                this.n = true;
                if (e()) {
                    io.reactivex.internal.util.c.c(this.c, this.b, false, this, this);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            synchronized (this) {
                this.u = null;
            }
            this.b.onError(th);
            this.t.dispose();
        }

        @Override // io.reactivex.x
        public void onNext(T t2) {
            U u2;
            synchronized (this) {
                u2 = this.u;
                if (u2 != null) {
                    u2.add(t2);
                    if (u2.size() >= this.r) {
                        this.u = null;
                        this.x++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (this.s) {
                this.v.dispose();
            }
            g(u2, false, this);
            try {
                U call = this.o.call();
                io.reactivex.internal.functions.a.c(call, "The buffer supplied is null");
                U u3 = call;
                synchronized (this) {
                    this.u = u3;
                    this.y++;
                }
                if (this.s) {
                    y.c cVar = this.t;
                    long j = this.p;
                    this.v = cVar.e(this, j, j, this.q);
                }
            } catch (Throwable th) {
                yif.V(th);
                this.b.onError(th);
                dispose();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.w, bVar)) {
                this.w = bVar;
                try {
                    U call = this.o.call();
                    io.reactivex.internal.functions.a.c(call, "The buffer supplied is null");
                    this.u = call;
                    this.b.onSubscribe(this);
                    y.c cVar = this.t;
                    long j = this.p;
                    this.v = cVar.e(this, j, j, this.q);
                } catch (Throwable th) {
                    yif.V(th);
                    bVar.dispose();
                    EmptyDisposable.k(th, this.b);
                    this.t.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U call = this.o.call();
                io.reactivex.internal.functions.a.c(call, "The bufferSupplier returned a null buffer");
                U u2 = call;
                synchronized (this) {
                    U u3 = this.u;
                    if (u3 != null) {
                        if (this.x == this.y) {
                            this.u = u2;
                            g(u3, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                yif.V(th);
                dispose();
                this.b.onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.b$b  reason: collision with other inner class name */
    static final class RunnableC0614b<T, U extends Collection<? super T>> extends g<T, U, U> implements Runnable, io.reactivex.disposables.b {
        final Callable<U> o;
        final long p;
        final TimeUnit q;
        final y r;
        io.reactivex.disposables.b s;
        U t;
        final AtomicReference<io.reactivex.disposables.b> u = new AtomicReference<>();

        RunnableC0614b(x<? super U> xVar, Callable<U> callable, long j, TimeUnit timeUnit, y yVar) {
            super(xVar, new MpscLinkedQueue());
            this.o = callable;
            this.p = j;
            this.q = timeUnit;
            this.r = yVar;
        }

        @Override // io.reactivex.internal.observers.g
        public void a(x xVar, Object obj) {
            this.b.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.u.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this.u);
            this.s.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            U u2;
            synchronized (this) {
                u2 = this.t;
                this.t = null;
            }
            if (u2 != null) {
                this.c.offer(u2);
                this.n = true;
                if (e()) {
                    io.reactivex.internal.util.c.c(this.c, this.b, false, null, this);
                }
            }
            DisposableHelper.g(this.u);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            synchronized (this) {
                this.t = null;
            }
            this.b.onError(th);
            DisposableHelper.g(this.u);
        }

        @Override // io.reactivex.x
        public void onNext(T t2) {
            synchronized (this) {
                U u2 = this.t;
                if (u2 != null) {
                    u2.add(t2);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.s, bVar)) {
                this.s = bVar;
                try {
                    U call = this.o.call();
                    io.reactivex.internal.functions.a.c(call, "The buffer supplied is null");
                    this.t = call;
                    this.b.onSubscribe(this);
                    if (!this.f) {
                        y yVar = this.r;
                        long j = this.p;
                        io.reactivex.disposables.b d = yVar.d(this, j, j, this.q);
                        if (!this.u.compareAndSet(null, d)) {
                            d.dispose();
                        }
                    }
                } catch (Throwable th) {
                    yif.V(th);
                    dispose();
                    EmptyDisposable.k(th, this.b);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u2;
            try {
                U call = this.o.call();
                io.reactivex.internal.functions.a.c(call, "The bufferSupplier returned a null buffer");
                U u3 = call;
                synchronized (this) {
                    u2 = this.t;
                    if (u2 != null) {
                        this.t = u3;
                    }
                }
                if (u2 == null) {
                    DisposableHelper.g(this.u);
                } else {
                    f(u2, false, this);
                }
            } catch (Throwable th) {
                yif.V(th);
                this.b.onError(th);
                dispose();
            }
        }
    }

    static final class c<T, U extends Collection<? super T>> extends g<T, U, U> implements Runnable, io.reactivex.disposables.b {
        final Callable<U> o;
        final long p;
        final long q;
        final TimeUnit r;
        final y.c s;
        final List<U> t = new LinkedList();
        io.reactivex.disposables.b u;

        /* JADX WARN: Field signature parse error: a */
        final class a implements Runnable {
            private final Collection a;

            /* JADX WARN: Failed to parse method signature: (TU)V */
            a(Collection collection) {
                this.a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.t.remove(this.a);
                }
                c cVar = c.this;
                cVar.g(this.a, false, cVar.s);
            }
        }

        /* JADX WARN: Field signature parse error: a */
        /* renamed from: io.reactivex.internal.operators.observable.b$c$b  reason: collision with other inner class name */
        final class RunnableC0615b implements Runnable {
            private final Collection a;

            /* JADX WARN: Failed to parse method signature: (TU)V */
            RunnableC0615b(Collection collection) {
                this.a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.t.remove(this.a);
                }
                c cVar = c.this;
                cVar.g(this.a, false, cVar.s);
            }
        }

        c(x<? super U> xVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, y.c cVar) {
            super(xVar, new MpscLinkedQueue());
            this.o = callable;
            this.p = j;
            this.q = j2;
            this.r = timeUnit;
            this.s = cVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.reactivex.x */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.g
        public void a(x xVar, Object obj) {
            xVar.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.f) {
                this.f = true;
                synchronized (this) {
                    this.t.clear();
                }
                this.u.dispose();
                this.s.dispose();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.t);
                this.t.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.offer((Collection) it.next());
            }
            this.n = true;
            if (e()) {
                io.reactivex.internal.util.c.c(this.c, this.b, false, this.s, this);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.n = true;
            synchronized (this) {
                this.t.clear();
            }
            this.b.onError(th);
            this.s.dispose();
        }

        @Override // io.reactivex.x
        public void onNext(T t2) {
            synchronized (this) {
                for (U u2 : this.t) {
                    u2.add(t2);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.u, bVar)) {
                this.u = bVar;
                try {
                    U call = this.o.call();
                    io.reactivex.internal.functions.a.c(call, "The buffer supplied is null");
                    U u2 = call;
                    this.t.add(u2);
                    this.b.onSubscribe(this);
                    y.c cVar = this.s;
                    long j = this.q;
                    cVar.e(this, j, j, this.r);
                    this.s.c(new RunnableC0615b(u2), this.p, this.r);
                } catch (Throwable th) {
                    yif.V(th);
                    bVar.dispose();
                    EmptyDisposable.k(th, this.b);
                    this.s.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f) {
                try {
                    U call = this.o.call();
                    io.reactivex.internal.functions.a.c(call, "The bufferSupplier returned a null buffer");
                    U u2 = call;
                    synchronized (this) {
                        if (!this.f) {
                            this.t.add(u2);
                            this.s.c(new a(u2), this.p, this.r);
                        }
                    }
                } catch (Throwable th) {
                    yif.V(th);
                    this.b.onError(th);
                    dispose();
                }
            }
        }
    }

    public b(v<T> vVar, long j, long j2, TimeUnit timeUnit, y yVar, Callable<U> callable, int i, boolean z) {
        super(vVar);
        this.b = j;
        this.c = j2;
        this.f = timeUnit;
        this.n = yVar;
        this.o = callable;
        this.p = i;
        this.q = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super U> xVar) {
        long j = this.b;
        if (j == this.c && this.p == Integer.MAX_VALUE) {
            this.a.subscribe(new RunnableC0614b(new io.reactivex.observers.c(xVar), this.o, j, this.f, this.n));
            return;
        }
        y.c a2 = this.n.a();
        long j2 = this.b;
        long j3 = this.c;
        if (j2 == j3) {
            this.a.subscribe(new a(new io.reactivex.observers.c(xVar), this.o, j2, this.f, this.p, this.q, a2));
        } else {
            this.a.subscribe(new c(new io.reactivex.observers.c(xVar), this.o, j2, j3, this.f, a2));
        }
    }
}
