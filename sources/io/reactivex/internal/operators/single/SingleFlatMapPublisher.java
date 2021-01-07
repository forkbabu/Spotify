package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMapPublisher<T, R> extends g<R> {
    final d0<T> c;
    final l<? super T, ? extends tpf<? extends R>> f;

    public SingleFlatMapPublisher(d0<T> d0Var, l<? super T, ? extends tpf<? extends R>> lVar) {
        this.c = d0Var;
        this.f = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super R> upf) {
        this.c.subscribe(new SingleFlatMapPublisherObserver(upf, this.f));
    }

    static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements b0<S>, j<T>, vpf {
        private static final long serialVersionUID = 7759721921468635667L;
        b disposable;
        final upf<? super T> downstream;
        final l<? super S, ? extends tpf<? extends T>> mapper;
        final AtomicReference<vpf> parent = new AtomicReference<>();

        SingleFlatMapPublisherObserver(upf<? super T> upf, l<? super S, ? extends tpf<? extends T>> lVar) {
            this.downstream = upf;
            this.mapper = lVar;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.d(this.parent);
        }

        @Override // defpackage.vpf
        public void n(long j) {
            SubscriptionHelper.g(this.parent, this, j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            this.disposable = bVar;
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.b0
        public void onSuccess(S s) {
            try {
                Object apply = this.mapper.apply(s);
                a.c(apply, "the mapper returned a null Publisher");
                ((tpf) apply).subscribe(this);
            } catch (Throwable th) {
                yif.V(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            SubscriptionHelper.h(this.parent, this, vpf);
        }
    }
}
