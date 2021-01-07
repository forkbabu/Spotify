package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.j;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableReplay<T> extends io.reactivex.flowables.a<T> implements Object<T> {
    static final Callable p = new a();
    final g<T> c;
    final AtomicReference<ReplaySubscriber<T>> f;
    final Callable<? extends b<T>> n;
    final tpf<T> o;

    static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements b<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        Node tail;

        BoundedReplayBuffer() {
            Node node = new Node(null, 0);
            this.tail = node;
            set(node);
        }

        /* access modifiers changed from: package-private */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Node node = (Node) get();
            if (node.value != null) {
                Node node2 = new Node(null, 0);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public final void c() {
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            long j = this.index + 1;
            this.index = j;
            Node node = new Node(notificationLite, j);
            this.tail.set(node);
            this.tail = node;
            this.size++;
            b();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public final void d(Throwable th) {
            Object k = NotificationLite.k(th);
            long j = this.index + 1;
            this.index = j;
            Node node = new Node(k, j);
            this.tail.set(node);
            this.tail = node;
            this.size++;
            b();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public final void e(T t) {
            long j = this.index + 1;
            this.index = j;
            Node node = new Node(t, j);
            this.tail.set(node);
            this.tail = node;
            this.size++;
            a();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public final void f(InnerSubscription<T> innerSubscription) {
            Node node;
            synchronized (innerSubscription) {
                if (innerSubscription.emitting) {
                    innerSubscription.missed = true;
                    return;
                }
                innerSubscription.emitting = true;
            }
            while (!innerSubscription.d()) {
                long j = innerSubscription.get();
                boolean z = j == Long.MAX_VALUE;
                Node node2 = (Node) innerSubscription.index;
                if (node2 == null) {
                    node2 = (Node) get();
                    innerSubscription.index = node2;
                    yif.a(innerSubscription.totalRequested, node2.index);
                }
                long j2 = 0;
                while (j != 0 && (node = (Node) node2.get()) != null) {
                    Object obj = node.value;
                    try {
                        if (NotificationLite.g(obj, innerSubscription.child)) {
                            innerSubscription.index = null;
                            return;
                        }
                        j2++;
                        j--;
                        if (innerSubscription.d()) {
                            innerSubscription.index = null;
                            return;
                        }
                        node2 = node;
                    } catch (Throwable th) {
                        yif.V(th);
                        innerSubscription.index = null;
                        innerSubscription.dispose();
                        if (!NotificationLite.n(obj) && !NotificationLite.m(obj)) {
                            innerSubscription.child.onError(th);
                            return;
                        }
                        return;
                    }
                }
                if (j2 != 0) {
                    innerSubscription.index = node2;
                    if (!z) {
                        yif.H(innerSubscription, j2);
                    }
                }
                synchronized (innerSubscription) {
                    if (!innerSubscription.missed) {
                        innerSubscription.emitting = false;
                        return;
                    }
                    innerSubscription.missed = false;
                }
            }
            innerSubscription.index = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class InnerSubscription<T> extends AtomicLong implements vpf, io.reactivex.disposables.b {
        private static final long serialVersionUID = -4453897557930727610L;
        final upf<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final ReplaySubscriber<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        InnerSubscription(ReplaySubscriber<T> replaySubscriber, upf<? super T> upf) {
            this.parent = replaySubscriber;
            this.child = upf;
        }

        @Override // defpackage.vpf
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == Long.MIN_VALUE;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.b(this);
                this.parent.a();
                this.index = null;
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            if (SubscriptionHelper.l(j) && yif.b(this, j) != Long.MIN_VALUE) {
                yif.a(this.totalRequested, j);
                this.parent.a();
                this.parent.buffer.f(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ReplaySubscriber<T> extends AtomicReference<vpf> implements j<T>, io.reactivex.disposables.b {
        static final InnerSubscription[] a = new InnerSubscription[0];
        static final InnerSubscription[] b = new InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final b<T> buffer;
        boolean done;
        final AtomicInteger management = new AtomicInteger();
        long maxChildRequested;
        long maxUpstreamRequested;
        final AtomicBoolean shouldConnect = new AtomicBoolean();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(a);

        ReplaySubscriber(b<T> bVar) {
            this.buffer = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.management.getAndIncrement() == 0) {
                int i = 1;
                while (!d()) {
                    InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                    long j = this.maxChildRequested;
                    long j2 = j;
                    for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                        j2 = Math.max(j2, innerSubscription.totalRequested.get());
                    }
                    long j3 = this.maxUpstreamRequested;
                    vpf vpf = (vpf) get();
                    long j4 = j2 - j;
                    if (j4 != 0) {
                        this.maxChildRequested = j2;
                        if (vpf == null) {
                            long j5 = j3 + j4;
                            if (j5 < 0) {
                                j5 = Long.MAX_VALUE;
                            }
                            this.maxUpstreamRequested = j5;
                        } else if (j3 != 0) {
                            this.maxUpstreamRequested = 0;
                            vpf.n(j3 + j4);
                        } else {
                            vpf.n(j4);
                        }
                    } else if (!(j3 == 0 || vpf == null)) {
                        this.maxUpstreamRequested = 0;
                        vpf.n(j3);
                    }
                    i = this.management.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription<T>[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerSubscriptionArr[i].equals(innerSubscription)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerSubscriptionArr2 = a;
                        } else {
                            InnerSubscription<T>[] innerSubscriptionArr3 = new InnerSubscription[(length - 1)];
                            System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                            System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                            innerSubscriptionArr2 = innerSubscriptionArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.subscribers.get() == b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.subscribers.set(b);
            SubscriptionHelper.d(this);
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.c();
                for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(b)) {
                    this.buffer.f(innerSubscription);
                }
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.d(th);
                for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(b)) {
                    this.buffer.f(innerSubscription);
                }
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.done) {
                this.buffer.e(t);
                for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                    this.buffer.f(innerSubscription);
                }
            }
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.k(this, vpf)) {
                a();
                for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                    this.buffer.f(innerSubscription);
                }
            }
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        /* access modifiers changed from: package-private */
        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public void a() {
            if (this.size > this.limit) {
                Node node = (Node) ((Node) get()).get();
                if (node != null) {
                    this.size--;
                    set(node);
                    return;
                }
                throw new IllegalStateException("Empty list!");
            }
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements b<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public void c() {
            add(NotificationLite.COMPLETE);
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public void d(Throwable th) {
            add(NotificationLite.k(th));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public void e(T t) {
            add(t);
            this.size++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.b
        public void f(InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                if (innerSubscription.emitting) {
                    innerSubscription.missed = true;
                    return;
                }
                innerSubscription.emitting = true;
            }
            upf<? super T> upf = innerSubscription.child;
            while (!innerSubscription.d()) {
                int i = this.size;
                Integer num = (Integer) innerSubscription.index;
                int intValue = num != null ? num.intValue() : 0;
                long j = innerSubscription.get();
                long j2 = j;
                long j3 = 0;
                while (j2 != 0 && intValue < i) {
                    Object obj = get(intValue);
                    try {
                        if (!NotificationLite.g(obj, upf) && !innerSubscription.d()) {
                            intValue++;
                            j2--;
                            j3++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        yif.V(th);
                        innerSubscription.dispose();
                        if (!NotificationLite.n(obj) && !NotificationLite.m(obj)) {
                            upf.onError(th);
                            return;
                        }
                        return;
                    }
                }
                if (j3 != 0) {
                    innerSubscription.index = Integer.valueOf(intValue);
                    if (j != Long.MAX_VALUE) {
                        yif.H(innerSubscription, j3);
                    }
                }
                synchronized (innerSubscription) {
                    if (!innerSubscription.missed) {
                        innerSubscription.emitting = false;
                        return;
                    }
                    innerSubscription.missed = false;
                }
            }
        }
    }

    static final class a implements Callable<Object> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    interface b<T> {
        void c();

        void d(Throwable th);

        void e(T t);

        void f(InnerSubscription<T> innerSubscription);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements Callable<b<T>> {
        private final int a;

        c(int i) {
            this.a = i;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new SizeBoundReplayBuffer(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements tpf<T> {
        private final AtomicReference<ReplaySubscriber<T>> a;
        private final Callable<? extends b<T>> b;

        d(AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends b<T>> callable) {
            this.a = atomicReference;
            this.b = callable;
        }

        @Override // defpackage.tpf
        public void subscribe(upf<? super T> upf) {
            ReplaySubscriber<T> replaySubscriber;
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription<T>[] innerSubscriptionArr2;
            while (true) {
                replaySubscriber = this.a.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>((b) this.b.call());
                    if (this.a.compareAndSet(null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (Throwable th) {
                    yif.V(th);
                    upf.onSubscribe(EmptySubscription.INSTANCE);
                    upf.onError(th);
                    return;
                }
            }
            InnerSubscription<T> innerSubscription = new InnerSubscription<>(replaySubscriber, upf);
            upf.onSubscribe(innerSubscription);
            do {
                innerSubscriptionArr = replaySubscriber.subscribers.get();
                if (innerSubscriptionArr == ReplaySubscriber.b) {
                    break;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[(length + 1)];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!replaySubscriber.subscribers.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
            if (innerSubscription.d()) {
                replaySubscriber.b(innerSubscription);
                return;
            }
            replaySubscriber.a();
            replaySubscriber.buffer.f(innerSubscription);
        }
    }

    private FlowableReplay(tpf<T> tpf, g<T> gVar, AtomicReference<ReplaySubscriber<T>> atomicReference, Callable<? extends b<T>> callable) {
        this.o = tpf;
        this.c = gVar;
        this.f = atomicReference;
        this.n = callable;
    }

    public static <T> io.reactivex.flowables.a<T> s0(g<T> gVar, int i) {
        if (i == Integer.MAX_VALUE) {
            Callable callable = p;
            AtomicReference atomicReference = new AtomicReference();
            return new FlowableReplay(new d(atomicReference, callable), gVar, atomicReference, callable);
        }
        c cVar = new c(i);
        AtomicReference atomicReference2 = new AtomicReference();
        return new FlowableReplay(new d(atomicReference2, cVar), gVar, atomicReference2, cVar);
    }

    public static <T> io.reactivex.flowables.a<T> t0(g<? extends T> gVar) {
        Callable callable = p;
        AtomicReference atomicReference = new AtomicReference();
        return new FlowableReplay(new d(atomicReference, callable), gVar, atomicReference, callable);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        this.o.subscribe(upf);
    }

    public void f(io.reactivex.disposables.b bVar) {
        this.f.compareAndSet((ReplaySubscriber) bVar, null);
    }

    @Override // io.reactivex.flowables.a
    public void q0(io.reactivex.functions.g<? super io.reactivex.disposables.b> gVar) {
        ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.f.get();
            if (replaySubscriber != null && !replaySubscriber.d()) {
                break;
            }
            try {
                ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>((b) this.n.call());
                if (this.f.compareAndSet(replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            } catch (Throwable th) {
                yif.V(th);
                throw ExceptionHelper.e(th);
            }
        }
        boolean z = !replaySubscriber.shouldConnect.get() && replaySubscriber.shouldConnect.compareAndSet(false, true);
        try {
            ((FlowableRefCount.RefConnection) gVar).accept(replaySubscriber);
            if (z) {
                this.c.subscribe((j) replaySubscriber);
            }
        } catch (Throwable th2) {
            if (z) {
                replaySubscriber.shouldConnect.compareAndSet(true, false);
            }
            yif.V(th2);
            throw ExceptionHelper.e(th2);
        }
    }
}
