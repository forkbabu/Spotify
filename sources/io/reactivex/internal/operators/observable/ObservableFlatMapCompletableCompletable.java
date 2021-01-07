package io.reactivex.internal.operators.observable;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.d;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMapCompletableCompletable<T> extends a implements d<T> {
    final v<T> a;
    final l<? super T, ? extends e> b;
    final boolean c;

    static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements b, x<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final c downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final l<? super T, ? extends e> mapper;
        final io.reactivex.disposables.a set = new io.reactivex.disposables.a();
        b upstream;

        final class InnerObserver extends AtomicReference<b> implements c, b {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            @Override // io.reactivex.disposables.b
            public boolean d() {
                return DisposableHelper.h((b) get());
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                DisposableHelper.g(this);
            }

            @Override // io.reactivex.c
            public void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.c(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // io.reactivex.c
            public void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.c(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }
        }

        FlatMapCompletableMainObserver(c cVar, l<? super T, ? extends e> lVar, boolean z) {
            this.downstream = cVar;
            this.mapper = lVar;
            this.delayErrors = z;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable b = ExceptionHelper.b(this.errors);
                if (b != null) {
                    this.downstream.onError(b);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (!ExceptionHelper.a(this.errors, th)) {
                io.reactivex.plugins.a.g(th);
            } else if (!this.delayErrors) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(ExceptionHelper.b(this.errors));
                }
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(ExceptionHelper.b(this.errors));
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null CompletableSource");
                e eVar = (e) apply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.disposed && this.set.b(innerObserver)) {
                    eVar.subscribe(innerObserver);
                }
            } catch (Throwable th) {
                yif.V(th);
                this.upstream.dispose();
                onError(th);
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

    public ObservableFlatMapCompletableCompletable(v<T> vVar, l<? super T, ? extends e> lVar, boolean z) {
        this.a = vVar;
        this.b = lVar;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        this.a.subscribe(new FlatMapCompletableMainObserver(cVar, this.b, this.c));
    }

    @Override // io.reactivex.internal.fuseable.d
    public s<T> a() {
        return new ObservableFlatMapCompletable(this.a, this.b, this.c);
    }
}
