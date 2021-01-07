package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishProcessor<T> extends a<T> {
    static final PublishSubscription[] n = new PublishSubscription[0];
    static final PublishSubscription[] o = new PublishSubscription[0];
    final AtomicReference<PublishSubscription<T>[]> c = new AtomicReference<>(o);
    Throwable f;

    /* access modifiers changed from: package-private */
    public static final class PublishSubscription<T> extends AtomicLong implements vpf {
        private static final long serialVersionUID = 3562861878281475070L;
        final upf<? super T> downstream;
        final PublishProcessor<T> parent;

        PublishSubscription(upf<? super T> upf, PublishProcessor<T> publishProcessor) {
            this.downstream = upf;
            this.parent = publishProcessor;
        }

        public void a(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.downstream.onNext(t);
                    yif.H(this, 1);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.t0(this);
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.b(this, j);
            }
        }
    }

    PublishProcessor() {
    }

    public static <T> PublishProcessor<T> r0() {
        return new PublishProcessor<>();
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        boolean z;
        boolean z2;
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(upf, this);
        upf.onSubscribe(publishSubscription);
        while (true) {
            PublishSubscription<T>[] publishSubscriptionArr = this.c.get();
            z = false;
            if (publishSubscriptionArr != n) {
                int length = publishSubscriptionArr.length;
                PublishSubscription<T>[] publishSubscriptionArr2 = new PublishSubscription[(length + 1)];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
                publishSubscriptionArr2[length] = publishSubscription;
                if (this.c.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2)) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            if (publishSubscription.get() == Long.MIN_VALUE) {
                z = true;
            }
            if (z) {
                t0(publishSubscription);
                return;
            }
            return;
        }
        Throwable th = this.f;
        if (th != null) {
            upf.onError(th);
        } else {
            upf.onComplete();
        }
    }

    @Override // defpackage.upf
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.c.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = n;
        if (publishSubscriptionArr != publishSubscriptionArr2) {
            PublishSubscription<T>[] andSet = this.c.getAndSet(publishSubscriptionArr2);
            for (PublishSubscription<T> publishSubscription : andSet) {
                if (publishSubscription.get() != Long.MIN_VALUE) {
                    publishSubscription.downstream.onComplete();
                }
            }
        }
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        if (th != null) {
            PublishSubscription<T>[] publishSubscriptionArr = this.c.get();
            PublishSubscription<T>[] publishSubscriptionArr2 = n;
            if (publishSubscriptionArr == publishSubscriptionArr2) {
                a.g(th);
                return;
            }
            this.f = th;
            PublishSubscription<T>[] andSet = this.c.getAndSet(publishSubscriptionArr2);
            for (PublishSubscription<T> publishSubscription : andSet) {
                if (publishSubscription.get() != Long.MIN_VALUE) {
                    publishSubscription.downstream.onError(th);
                } else {
                    a.g(th);
                }
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // defpackage.upf
    public void onNext(T t) {
        if (t != null) {
            for (PublishSubscription<T> publishSubscription : this.c.get()) {
                publishSubscription.a(t);
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (this.c.get() == n) {
            vpf.cancel();
        } else {
            vpf.n(Long.MAX_VALUE);
        }
    }

    public boolean s0(T t) {
        PublishSubscription<T>[] publishSubscriptionArr = this.c.get();
        int length = publishSubscriptionArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                if (publishSubscriptionArr[i].get() != 0) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                i++;
            } else {
                for (PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
                    publishSubscription.a(t);
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t0(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription<T>[] publishSubscriptionArr2;
        PublishSubscription<T>[] publishSubscriptionArr3 = o;
        do {
            publishSubscriptionArr = this.c.get();
            if (publishSubscriptionArr != n && publishSubscriptionArr != publishSubscriptionArr3) {
                int length = publishSubscriptionArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (publishSubscriptionArr[i] == publishSubscription) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishSubscriptionArr2 = publishSubscriptionArr3;
                    } else {
                        publishSubscriptionArr2 = new PublishSubscription[(length - 1)];
                        System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, i);
                        System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.c.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
    }
}
