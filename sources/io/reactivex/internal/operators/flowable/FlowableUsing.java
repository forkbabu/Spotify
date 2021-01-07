package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FlowableUsing<T, D> extends g<T> {
    final Callable<? extends D> c;
    final l<? super D, ? extends tpf<? extends T>> f;
    final io.reactivex.functions.g<? super D> n;
    final boolean o;

    static final class UsingSubscriber<T, D> extends AtomicBoolean implements j<T>, vpf {
        private static final long serialVersionUID = 5904473792286235046L;
        final io.reactivex.functions.g<? super D> disposer;
        final upf<? super T> downstream;
        final boolean eager;
        final D resource;
        vpf upstream;

        UsingSubscriber(upf<? super T> upf, D d, io.reactivex.functions.g<? super D> gVar, boolean z) {
            this.downstream = upf;
            this.resource = d;
            this.disposer = gVar;
            this.eager = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    yif.V(th);
                    a.g(th);
                }
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            a();
            this.upstream.cancel();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.upstream.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th) {
                        yif.V(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.cancel();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.cancel();
            a();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.eager) {
                Throwable th2 = null;
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th3) {
                        th2 = th3;
                        yif.V(th2);
                    }
                }
                this.upstream.cancel();
                if (th2 != null) {
                    this.downstream.onError(new CompositeException(th, th2));
                } else {
                    this.downstream.onError(th);
                }
            } else {
                this.downstream.onError(th);
                this.upstream.cancel();
                a();
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public FlowableUsing(Callable<? extends D> callable, l<? super D, ? extends tpf<? extends T>> lVar, io.reactivex.functions.g<? super D> gVar, boolean z) {
        this.c = callable;
        this.f = lVar;
        this.n = gVar;
        this.o = z;
    }

    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        try {
            Object call = this.c.call();
            try {
                Object apply = this.f.apply(call);
                io.reactivex.internal.functions.a.c(apply, "The sourceSupplier returned a null Publisher");
                ((tpf) apply).subscribe(new UsingSubscriber(upf, call, this.n, this.o));
            } catch (Throwable th) {
                yif.V(th);
                CompositeException compositeException = new CompositeException(th, th);
                upf.onSubscribe(emptySubscription);
                upf.onError(compositeException);
            }
        } catch (Throwable th2) {
            yif.V(th2);
            upf.onSubscribe(emptySubscription);
            upf.onError(th2);
        }
    }
}
