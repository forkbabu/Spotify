package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.c;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableDebounceTimed<T> extends a<T, T> {
    final long b;
    final TimeUnit c;
    final y f;

    static final class DebounceEmitter<T> extends AtomicReference<b> implements Runnable, b {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final a<T> parent;
        final T value;

        DebounceEmitter(T t, long j, a<T> aVar) {
            this.value = t;
            this.idx = j;
            this.parent = aVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                a<T> aVar = this.parent;
                long j = this.idx;
                T t = this.value;
                if (j == aVar.p) {
                    aVar.a.onNext(t);
                    DisposableHelper.g(this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements x<T>, b {
        final x<? super T> a;
        final long b;
        final TimeUnit c;
        final y.c f;
        b n;
        b o;
        volatile long p;
        boolean q;

        a(x<? super T> xVar, long j, TimeUnit timeUnit, y.c cVar) {
            this.a = xVar;
            this.b = j;
            this.c = timeUnit;
            this.f = cVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.n.dispose();
            this.f.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.q) {
                this.q = true;
                b bVar = this.o;
                if (bVar != null) {
                    bVar.dispose();
                }
                DebounceEmitter debounceEmitter = (DebounceEmitter) bVar;
                if (debounceEmitter != null) {
                    debounceEmitter.run();
                }
                this.a.onComplete();
                this.f.dispose();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.q) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            b bVar = this.o;
            if (bVar != null) {
                bVar.dispose();
            }
            this.q = true;
            this.a.onError(th);
            this.f.dispose();
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.q) {
                long j = this.p + 1;
                this.p = j;
                b bVar = this.o;
                if (bVar != null) {
                    bVar.dispose();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                this.o = debounceEmitter;
                DisposableHelper.i(debounceEmitter, this.f.c(debounceEmitter, this.b, this.c));
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.n, bVar)) {
                this.n = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(v<T> vVar, long j, TimeUnit timeUnit, y yVar) {
        super(vVar);
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.a.subscribe(new a(new c(xVar), this.b, this.c, this.f.a()));
    }
}
