package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.a;
import io.reactivex.s;
import io.reactivex.x;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSwitchMapSingle<T, R> extends s<R> {
    final s<T> a;
    final l<? super T, ? extends d0<? extends R>> b;
    final boolean c;

    static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements x<T>, b {
        static final SwitchMapSingleObserver<Object> a = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final x<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final l<? super T, ? extends d0<? extends R>> mapper;
        b upstream;

        /* access modifiers changed from: package-private */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<b> implements b0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleMainObserver<?, R> parent;

            SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.parent = switchMapSingleMainObserver;
            }

            @Override // io.reactivex.b0
            public void onError(Throwable th) {
                SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver = this.parent;
                if (!switchMapSingleMainObserver.inner.compareAndSet(this, null) || !ExceptionHelper.a(switchMapSingleMainObserver.errors, th)) {
                    a.g(th);
                    return;
                }
                if (!switchMapSingleMainObserver.delayErrors) {
                    switchMapSingleMainObserver.upstream.dispose();
                    switchMapSingleMainObserver.a();
                }
                switchMapSingleMainObserver.b();
            }

            @Override // io.reactivex.b0
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }

            @Override // io.reactivex.b0
            public void onSuccess(R r) {
                this.item = r;
                this.parent.b();
            }
        }

        SwitchMapSingleMainObserver(x<? super R> xVar, l<? super T, ? extends d0<? extends R>> lVar, boolean z) {
            this.downstream = xVar;
            this.mapper = lVar;
            this.delayErrors = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public void a() {
            SwitchMapSingleObserver<Object> switchMapSingleObserver = a;
            SwitchMapSingleObserver<Object> switchMapSingleObserver2 = (SwitchMapSingleObserver) this.inner.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 != null && switchMapSingleObserver2 != switchMapSingleObserver) {
                DisposableHelper.g(switchMapSingleObserver2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                x<? super R> xVar = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                int i = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() == null || this.delayErrors) {
                        boolean z = this.done;
                        SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                        boolean z2 = switchMapSingleObserver == null;
                        if (z && z2) {
                            Throwable b = ExceptionHelper.b(atomicThrowable);
                            if (b != null) {
                                xVar.onError(b);
                                return;
                            } else {
                                xVar.onComplete();
                                return;
                            }
                        } else if (z2 || switchMapSingleObserver.item == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(switchMapSingleObserver, null);
                            xVar.onNext(switchMapSingleObserver.item);
                        }
                    } else {
                        xVar.onError(ExceptionHelper.b(atomicThrowable));
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            a();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.done = true;
            b();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (ExceptionHelper.a(this.errors, th)) {
                if (!this.delayErrors) {
                    a();
                }
                this.done = true;
                b();
                return;
            }
            a.g(th);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver<R>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.x
        public void onNext(T t) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
            if (switchMapSingleObserver2 != null) {
                DisposableHelper.g(switchMapSingleObserver2);
            }
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null SingleSource");
                d0 d0Var = (d0) apply;
                SwitchMapSingleObserver<R> switchMapSingleObserver3 = new SwitchMapSingleObserver<>(this);
                do {
                    switchMapSingleObserver = this.inner.get();
                    if (switchMapSingleObserver == a) {
                        return;
                    }
                } while (!this.inner.compareAndSet(switchMapSingleObserver, switchMapSingleObserver3));
                d0Var.subscribe(switchMapSingleObserver3);
            } catch (Throwable th) {
                yif.V(th);
                this.upstream.dispose();
                this.inner.getAndSet(a);
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

    public ObservableSwitchMapSingle(s<T> sVar, l<? super T, ? extends d0<? extends R>> lVar, boolean z) {
        this.a = sVar;
        this.b = lVar;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        boolean z;
        s<T> sVar = this.a;
        l<? super T, ? extends d0<? extends R>> lVar = this.b;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (sVar instanceof Callable) {
            d0 d0Var = null;
            z = true;
            try {
                Object obj = (Object) ((Callable) sVar).call();
                if (obj != 0) {
                    Object apply = lVar.apply(obj);
                    io.reactivex.internal.functions.a.c(apply, "The mapper returned a null SingleSource");
                    d0Var = (d0) apply;
                }
                if (d0Var == null) {
                    xVar.onSubscribe(emptyDisposable);
                    xVar.onComplete();
                } else {
                    d0Var.subscribe(SingleToObservable.g1(xVar));
                }
            } catch (Throwable th) {
                yif.V(th);
                xVar.onSubscribe(emptyDisposable);
                xVar.onError(th);
            }
        } else {
            z = false;
        }
        if (!z) {
            this.a.subscribe(new SwitchMapSingleMainObserver(xVar, this.b, this.c));
        }
    }
}
