package io.reactivex.internal.subscribers;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.a;
import io.reactivex.functions.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;

public final class LambdaSubscriber<T> extends AtomicReference<vpf> implements j<T>, vpf, b, io.reactivex.observers.b {
    private static final long serialVersionUID = -7251123623727029452L;
    final a onComplete;
    final g<? super Throwable> onError;
    final g<? super T> onNext;
    final g<? super vpf> onSubscribe;

    public LambdaSubscriber(g<? super T> gVar, g<? super Throwable> gVar2, a aVar, g<? super vpf> gVar3) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
    }

    @Override // defpackage.vpf
    public void cancel() {
        SubscriptionHelper.d(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.d(this);
    }

    @Override // io.reactivex.observers.b
    public boolean hasCustomOnError() {
        return this.onError != Functions.e;
    }

    @Override // defpackage.vpf
    public void n(long j) {
        ((vpf) get()).n(j);
    }

    @Override // defpackage.upf
    public void onComplete() {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
            }
        }
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        Object obj = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (obj != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                yif.V(th2);
                io.reactivex.plugins.a.g(new CompositeException(th, th2));
            }
        } else {
            io.reactivex.plugins.a.g(th);
        }
    }

    @Override // defpackage.upf
    public void onNext(T t) {
        if (!d()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                yif.V(th);
                ((vpf) get()).cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (SubscriptionHelper.k(this, vpf)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                yif.V(th);
                vpf.cancel();
                onError(th);
            }
        }
    }
}
