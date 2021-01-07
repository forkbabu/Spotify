package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSwitchMapSingle<T, R> extends g<R> {
    final g<T> c;
    final l<? super T, ? extends d0<? extends R>> f;
    final boolean n;

    static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements j<T>, vpf {
        static final SwitchMapSingleObserver<Object> a = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final upf<? super R> downstream;
        long emitted;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final l<? super T, ? extends d0<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        vpf upstream;

        /* access modifiers changed from: package-private */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<b> implements b0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleSubscriber<?, R> parent;

            SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.b0
            public void onError(Throwable th) {
                SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber = this.parent;
                if (!switchMapSingleSubscriber.inner.compareAndSet(this, null) || !ExceptionHelper.a(switchMapSingleSubscriber.errors, th)) {
                    a.g(th);
                    return;
                }
                if (!switchMapSingleSubscriber.delayErrors) {
                    switchMapSingleSubscriber.upstream.cancel();
                    switchMapSingleSubscriber.a();
                }
                switchMapSingleSubscriber.b();
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

        SwitchMapSingleSubscriber(upf<? super R> upf, l<? super T, ? extends d0<? extends R>> lVar, boolean z) {
            this.downstream = upf;
            this.mapper = lVar;
            this.delayErrors = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> */
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
                upf<? super R> upf = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                AtomicLong atomicLong = this.requested;
                long j = this.emitted;
                int i = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() == null || this.delayErrors) {
                        boolean z = this.done;
                        SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                        boolean z2 = switchMapSingleObserver == null;
                        if (z && z2) {
                            Throwable b = ExceptionHelper.b(atomicThrowable);
                            if (b != null) {
                                upf.onError(b);
                                return;
                            } else {
                                upf.onComplete();
                                return;
                            }
                        } else if (z2 || switchMapSingleObserver.item == null || j == atomicLong.get()) {
                            this.emitted = j;
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(switchMapSingleObserver, null);
                            upf.onNext(switchMapSingleObserver.item);
                            j++;
                        }
                    } else {
                        upf.onError(ExceptionHelper.b(atomicThrowable));
                        return;
                    }
                }
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            a();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            yif.a(this.requested, j);
            b();
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.done = true;
            b();
        }

        @Override // defpackage.upf
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

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.upf
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
                this.upstream.cancel();
                this.inner.getAndSet(a);
                onError(th);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
                vpf.n(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapSingle(g<T> gVar, l<? super T, ? extends d0<? extends R>> lVar, boolean z) {
        this.c = gVar;
        this.f = lVar;
        this.n = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        this.c.subscribe((j) new SwitchMapSingleSubscriber(upf, this.f, this.n));
    }
}
