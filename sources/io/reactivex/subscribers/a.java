package io.reactivex.subscribers;

import io.reactivex.disposables.b;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;

public abstract class a<T> implements j<T>, b {
    final AtomicReference<vpf> a = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public final void a() {
        SubscriptionHelper.d(this.a);
    }

    @Override // io.reactivex.disposables.b
    public final boolean d() {
        return this.a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        SubscriptionHelper.d(this.a);
    }

    @Override // io.reactivex.j, defpackage.upf
    public final void onSubscribe(vpf vpf) {
        boolean z;
        AtomicReference<vpf> atomicReference = this.a;
        Class<?> cls = getClass();
        if (vpf != null) {
            if (!atomicReference.compareAndSet(null, vpf)) {
                vpf.cancel();
                if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
                    yif.I(cls);
                }
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.a.get().n(Long.MAX_VALUE);
                return;
            }
            return;
        }
        throw new NullPointerException("next is null");
    }
}
