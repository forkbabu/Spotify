package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.v;
import io.reactivex.x;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ObservableBuffer<T, U extends Collection<? super T>> extends a<T, U> {
    final int b;
    final int c;
    final Callable<U> f;

    static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements x<T>, b {
        private static final long serialVersionUID = -8223395059921494546L;
        final Callable<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final x<? super U> downstream;
        long index;
        final int skip;
        b upstream;

        BufferSkipObserver(x<? super U> xVar, int i, int i2, Callable<U> callable) {
            this.downstream = xVar;
            this.count = i;
            this.skip = i2;
            this.bufferSupplier = callable;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            long j = this.index;
            this.index = 1 + j;
            if (j % ((long) this.skip) == 0) {
                try {
                    U call = this.bufferSupplier.call();
                    io.reactivex.internal.functions.a.c(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.buffers.offer(call);
                } catch (Throwable th) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    static final class a<T, U extends Collection<? super T>> implements x<T>, b {
        final x<? super U> a;
        final int b;
        final Callable<U> c;
        U f;
        int n;
        b o;

        a(x<? super U> xVar, int i, Callable<U> callable) {
            this.a = xVar;
            this.b = i;
            this.c = callable;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            try {
                U call = this.c.call();
                io.reactivex.internal.functions.a.c(call, "Empty buffer supplied");
                this.f = call;
                return true;
            } catch (Throwable th) {
                yif.V(th);
                this.f = null;
                b bVar = this.o;
                if (bVar == null) {
                    EmptyDisposable.k(th, this.a);
                    return false;
                }
                bVar.dispose();
                this.a.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.o.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.o.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            U u = this.f;
            if (u != null) {
                this.f = null;
                if (!u.isEmpty()) {
                    this.a.onNext(u);
                }
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.f = null;
            this.a.onError(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            U u = this.f;
            if (u != null) {
                u.add(t);
                int i = this.n + 1;
                this.n = i;
                if (i >= this.b) {
                    this.a.onNext(u);
                    this.n = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.o, bVar)) {
                this.o = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(v<T> vVar, int i, int i2, Callable<U> callable) {
        super(vVar);
        this.b = i;
        this.c = i2;
        this.f = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super U> xVar) {
        int i = this.c;
        int i2 = this.b;
        if (i == i2) {
            a aVar = new a(xVar, i2, this.f);
            if (aVar.a()) {
                this.a.subscribe(aVar);
                return;
            }
            return;
        }
        this.a.subscribe(new BufferSkipObserver(xVar, this.b, this.c, this.f));
    }
}
