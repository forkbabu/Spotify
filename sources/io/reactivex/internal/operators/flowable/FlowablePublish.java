package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowablePublish<T> extends io.reactivex.flowables.a<T> implements Object<T> {
    final g<T> c;
    final AtomicReference<PublishSubscriber<T>> f;
    final int n;
    final tpf<T> o;

    /* access modifiers changed from: package-private */
    public static final class InnerSubscriber<T> extends AtomicLong implements vpf {
        private static final long serialVersionUID = -4453897557930727610L;
        final upf<? super T> child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        InnerSubscriber(upf<? super T> upf) {
            this.child = upf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            PublishSubscriber<T> publishSubscriber;
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE && (publishSubscriber = this.parent) != null) {
                publishSubscriber.c(this);
                publishSubscriber.b();
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j)) {
                yif.b(this, j);
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.b();
                }
            }
        }
    }

    static final class PublishSubscriber<T> extends AtomicInteger implements j<T>, b {
        static final InnerSubscriber[] a = new InnerSubscriber[0];
        static final InnerSubscriber[] b = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile io.reactivex.internal.fuseable.j<T> queue;
        final AtomicBoolean shouldConnect;
        int sourceMode;
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference<>(a);
        volatile Object terminalEvent;
        final AtomicReference<vpf> upstream = new AtomicReference<>();

        PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.current = atomicReference;
            this.shouldConnect = new AtomicBoolean();
            this.bufferSize = i;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Object obj, boolean z) {
            InnerSubscriber<T>[] innerSubscriberArr = b;
            int i = 0;
            if (obj != null) {
                if (!NotificationLite.m(obj)) {
                    Throwable l = NotificationLite.l(obj);
                    this.current.compareAndSet(this, null);
                    InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(innerSubscriberArr);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].child.onError(l);
                            i++;
                        }
                    } else {
                        io.reactivex.plugins.a.g(l);
                    }
                    return true;
                } else if (z) {
                    this.current.compareAndSet(this, null);
                    InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(innerSubscriberArr);
                    int length2 = andSet2.length;
                    while (i < length2) {
                        andSet2[i].child.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
            if (r11 == 0) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0120, code lost:
            if (r25.sourceMode == 1) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0122, code lost:
            r25.upstream.get().n((long) r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x012e, code lost:
            r4 = r0;
            r3 = 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
            // Method dump skipped, instructions count: 353
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.b():void");
        }

        /* access modifiers changed from: package-private */
        public void c(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            InnerSubscriber<T>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerSubscriberArr[i].equals(innerSubscriber)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriberArr2 = a;
                        } else {
                            InnerSubscriber<T>[] innerSubscriberArr3 = new InnerSubscriber[(length - 1)];
                            System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                            System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                            innerSubscriberArr2 = innerSubscriberArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.subscribers.get() == b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = b;
            if (innerSubscriberArr != innerSubscriberArr2 && this.subscribers.getAndSet(innerSubscriberArr2) != innerSubscriberArr2) {
                this.current.compareAndSet(this, null);
                SubscriptionHelper.d(this.upstream);
            }
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.COMPLETE;
                b();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.k(th);
                b();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (this.sourceMode != 0 || this.queue.offer(t)) {
                b();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this.upstream, vpf)) {
                if (vpf instanceof io.reactivex.internal.fuseable.g) {
                    io.reactivex.internal.fuseable.g gVar = (io.reactivex.internal.fuseable.g) vpf;
                    int g = gVar.g(7);
                    if (g == 1) {
                        this.sourceMode = g;
                        this.queue = gVar;
                        this.terminalEvent = NotificationLite.COMPLETE;
                        b();
                        return;
                    } else if (g == 2) {
                        this.sourceMode = g;
                        this.queue = gVar;
                        vpf.n((long) this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                vpf.n((long) this.bufferSize);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements tpf<T> {
        private final AtomicReference<PublishSubscriber<T>> a;
        private final int b;

        a(AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
            this.a = atomicReference;
            this.b = i;
        }

        @Override // defpackage.tpf
        public void subscribe(upf<? super T> upf) {
            PublishSubscriber<T> publishSubscriber;
            boolean z;
            InnerSubscriber<T> innerSubscriber = new InnerSubscriber<>(upf);
            upf.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = this.a.get();
                if (publishSubscriber == null || publishSubscriber.d()) {
                    PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.a, this.b);
                    if (!this.a.compareAndSet(publishSubscriber, publishSubscriber2)) {
                        continue;
                    } else {
                        publishSubscriber = publishSubscriber2;
                    }
                }
                while (true) {
                    InnerSubscriber<T>[] innerSubscriberArr = publishSubscriber.subscribers.get();
                    z = false;
                    if (innerSubscriberArr != PublishSubscriber.b) {
                        int length = innerSubscriberArr.length;
                        InnerSubscriber<T>[] innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                        System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                        innerSubscriberArr2[length] = innerSubscriber;
                        if (publishSubscriber.subscribers.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.c(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.b();
        }
    }

    private FlowablePublish(tpf<T> tpf, g<T> gVar, AtomicReference<PublishSubscriber<T>> atomicReference, int i) {
        this.o = tpf;
        this.c = gVar;
        this.f = atomicReference;
        this.n = i;
    }

    public static <T> io.reactivex.flowables.a<T> s0(g<T> gVar, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return new FlowablePublish(new a(atomicReference, i), gVar, atomicReference, i);
    }

    public tpf<T> a() {
        return this.c;
    }

    public int c() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.o.subscribe(upf);
    }

    @Override // io.reactivex.flowables.a
    public void q0(io.reactivex.functions.g<? super b> gVar) {
        PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.f.get();
            if (publishSubscriber != null && !publishSubscriber.d()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.f, this.n);
            if (this.f.compareAndSet(publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z = true;
        if (publishSubscriber.shouldConnect.get() || !publishSubscriber.shouldConnect.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ((FlowableRefCount.RefConnection) gVar).accept(publishSubscriber);
            if (z) {
                this.c.subscribe((j) publishSubscriber);
            }
        } catch (Throwable th) {
            yif.V(th);
            throw ExceptionHelper.e(th);
        }
    }
}
