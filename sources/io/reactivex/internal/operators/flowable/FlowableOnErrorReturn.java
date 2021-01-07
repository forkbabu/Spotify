package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.j;

public final class FlowableOnErrorReturn<T> extends a<T, T> {
    final l<? super Throwable, ? extends T> f;

    static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final l<? super Throwable, ? extends T> valueSupplier;

        OnErrorReturnSubscriber(upf<? super T> upf, l<? super Throwable, ? extends T> lVar) {
            super(upf);
            this.valueSupplier = lVar;
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            try {
                Object apply = this.valueSupplier.apply(th);
                a.c(apply, "The valueSupplier returned a null value");
                a(apply);
            } catch (Throwable th2) {
                yif.V(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }
    }

    public FlowableOnErrorReturn(g<T> gVar, l<? super Throwable, ? extends T> lVar) {
        super(gVar);
        this.f = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.c.subscribe((j) new OnErrorReturnSubscriber(upf, this.f));
    }
}
