package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class BehaviorProcessor<T> extends a<T> {
    static final Object[] s = new Object[0];
    static final BehaviorSubscription[] t = new BehaviorSubscription[0];
    static final BehaviorSubscription[] u = new BehaviorSubscription[0];
    final AtomicReference<BehaviorSubscription<T>[]> c;
    final ReadWriteLock f;
    final Lock n;
    final Lock o;
    final AtomicReference<Object> p = new AtomicReference<>();
    final AtomicReference<Throwable> q;
    long r;

    /* access modifiers changed from: package-private */
    public static final class BehaviorSubscription<T> extends AtomicLong implements vpf, a.AbstractC0621a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final upf<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        a<Object> queue;
        final BehaviorProcessor<T> state;

        BehaviorSubscription(upf<? super T> upf, BehaviorProcessor<T> behaviorProcessor) {
            this.downstream = upf;
            this.state = behaviorProcessor;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj, long j) {
            if (!this.cancelled) {
                if (!this.fastPath) {
                    synchronized (this) {
                        if (!this.cancelled) {
                            if (this.index != j) {
                                if (this.emitting) {
                                    a<Object> aVar = this.queue;
                                    if (aVar == null) {
                                        aVar = new a<>(4);
                                        this.queue = aVar;
                                    }
                                    aVar.c(obj);
                                    return;
                                }
                                this.next = true;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    this.fastPath = true;
                }
                test(obj);
            }
        }

        @Override // defpackage.vpf
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.s0(this);
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.a(this, j);
            }
        }

        @Override // io.reactivex.internal.util.a.AbstractC0621a, io.reactivex.functions.n
        public boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (NotificationLite.m(obj)) {
                this.downstream.onComplete();
                return true;
            } else if (NotificationLite.n(obj)) {
                this.downstream.onError(NotificationLite.l(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.downstream.onNext(obj);
                    if (j == Long.MAX_VALUE) {
                        return false;
                    }
                    decrementAndGet();
                    return false;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }
    }

    BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f = reentrantReadWriteLock;
        this.n = reentrantReadWriteLock.readLock();
        this.o = reentrantReadWriteLock.writeLock();
        this.c = new AtomicReference<>(t);
        this.q = new AtomicReference<>();
    }

    public static <T> BehaviorProcessor<T> r0() {
        return new BehaviorProcessor<>();
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        boolean z;
        Object obj;
        a<Object> aVar;
        BehaviorSubscription<T> behaviorSubscription = new BehaviorSubscription<>(upf, this);
        upf.onSubscribe(behaviorSubscription);
        while (true) {
            BehaviorSubscription<T>[] behaviorSubscriptionArr = this.c.get();
            if (behaviorSubscriptionArr != u) {
                int length = behaviorSubscriptionArr.length;
                BehaviorSubscription<T>[] behaviorSubscriptionArr2 = new BehaviorSubscription[(length + 1)];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
                behaviorSubscriptionArr2[length] = behaviorSubscription;
                if (this.c.compareAndSet(behaviorSubscriptionArr, behaviorSubscriptionArr2)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Throwable th = this.q.get();
            if (th == ExceptionHelper.a) {
                upf.onComplete();
            } else {
                upf.onError(th);
            }
        } else if (behaviorSubscription.cancelled) {
            s0(behaviorSubscription);
        } else if (!behaviorSubscription.cancelled) {
            synchronized (behaviorSubscription) {
                if (!behaviorSubscription.cancelled) {
                    if (!behaviorSubscription.next) {
                        BehaviorProcessor<T> behaviorProcessor = behaviorSubscription.state;
                        Lock lock = behaviorProcessor.n;
                        lock.lock();
                        behaviorSubscription.index = behaviorProcessor.r;
                        obj = behaviorProcessor.p.get();
                        lock.unlock();
                        behaviorSubscription.emitting = obj != null;
                        behaviorSubscription.next = true;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (obj != null && !behaviorSubscription.test(obj)) {
                while (!behaviorSubscription.cancelled) {
                    synchronized (behaviorSubscription) {
                        aVar = behaviorSubscription.queue;
                        if (aVar == null) {
                            behaviorSubscription.emitting = false;
                            return;
                        }
                        behaviorSubscription.queue = null;
                    }
                    aVar.d(behaviorSubscription);
                }
            }
        }
    }

    @Override // defpackage.upf
    public void onComplete() {
        if (this.q.compareAndSet(null, ExceptionHelper.a)) {
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            for (BehaviorSubscription<T> behaviorSubscription : t0(notificationLite)) {
                behaviorSubscription.a(notificationLite, this.r);
            }
        }
    }

    @Override // defpackage.upf
    public void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!this.q.compareAndSet(null, th)) {
            io.reactivex.plugins.a.g(th);
        } else {
            Object k = NotificationLite.k(th);
            for (BehaviorSubscription<T> behaviorSubscription : t0(k)) {
                behaviorSubscription.a(k, this.r);
            }
        }
    }

    @Override // defpackage.upf
    public void onNext(T t2) {
        if (t2 == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.q.get() == null) {
            Lock lock = this.o;
            lock.lock();
            this.r++;
            this.p.lazySet(t2);
            lock.unlock();
            for (BehaviorSubscription<T> behaviorSubscription : this.c.get()) {
                behaviorSubscription.a(t2, this.r);
            }
        }
    }

    @Override // io.reactivex.j, defpackage.upf
    public void onSubscribe(vpf vpf) {
        if (this.q.get() != null) {
            vpf.cancel();
        } else {
            vpf.n(Long.MAX_VALUE);
        }
    }

    /* access modifiers changed from: package-private */
    public void s0(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription<T>[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.c.get();
            int length = behaviorSubscriptionArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (behaviorSubscriptionArr[i] == behaviorSubscription) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        behaviorSubscriptionArr2 = t;
                    } else {
                        BehaviorSubscription<T>[] behaviorSubscriptionArr3 = new BehaviorSubscription[(length - 1)];
                        System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i);
                        System.arraycopy(behaviorSubscriptionArr, i + 1, behaviorSubscriptionArr3, i, (length - i) - 1);
                        behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.c.compareAndSet(behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    /* access modifiers changed from: package-private */
    public BehaviorSubscription<T>[] t0(Object obj) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr = this.c.get();
        BehaviorSubscription<T>[] behaviorSubscriptionArr2 = u;
        if (!(behaviorSubscriptionArr == behaviorSubscriptionArr2 || (behaviorSubscriptionArr = this.c.getAndSet(behaviorSubscriptionArr2)) == behaviorSubscriptionArr2)) {
            Lock lock = this.o;
            lock.lock();
            this.r++;
            this.p.lazySet(obj);
            lock.unlock();
        }
        return behaviorSubscriptionArr;
    }
}
