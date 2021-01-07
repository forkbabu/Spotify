package io.reactivex.internal.operators.observable;

import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.v;
import io.reactivex.x;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableReplay<T> extends io.reactivex.observables.a<T> implements Object<T> {
    static final a n = new e();
    final v<T> a;
    final AtomicReference<ReplayObserver<T>> b;
    final a<T> c;
    final v<T> f;

    static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements b<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        Node tail;

        BoundedReplayBuffer() {
            Node node = new Node(null);
            this.tail = node;
            set(node);
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public void b() {
            Node node = (Node) get();
            if (node.value != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public final void c() {
            Node node = new Node(NotificationLite.COMPLETE);
            this.tail.set(node);
            this.tail = node;
            this.size++;
            b();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public final void d(Throwable th) {
            Node node = new Node(NotificationLite.k(th));
            this.tail.set(node);
            this.tail = node;
            this.size++;
            b();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public final void e(T t) {
            Node node = new Node(t);
            this.tail.set(node);
            this.tail = node;
            this.size++;
            a();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public final void f(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                int i = 1;
                do {
                    Node node = (Node) innerDisposable.index;
                    if (node == null) {
                        node = (Node) get();
                        innerDisposable.index = node;
                    }
                    while (!innerDisposable.cancelled) {
                        Node node2 = (Node) node.get();
                        if (node2 == null) {
                            innerDisposable.index = node;
                            i = innerDisposable.addAndGet(-i);
                        } else if (NotificationLite.d(node2.value, innerDisposable.child)) {
                            innerDisposable.index = null;
                            return;
                        } else {
                            node = node2;
                        }
                    }
                    innerDisposable.index = null;
                    return;
                } while (i != 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class InnerDisposable<T> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final x<? super T> child;
        Object index;
        final ReplayObserver<T> parent;

        InnerDisposable(ReplayObserver<T> replayObserver, x<? super T> xVar) {
            this.parent = replayObserver;
            this.child = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.parent.a(this);
                this.index = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        Node(Object obj) {
            this.value = obj;
        }
    }

    static final class ReplayObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements x<T>, io.reactivex.disposables.b {
        static final InnerDisposable[] a = new InnerDisposable[0];
        static final InnerDisposable[] b = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        final b<T> buffer;
        boolean done;
        final AtomicReference<InnerDisposable[]> observers = new AtomicReference<>(a);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        ReplayObserver(b<T> bVar) {
            this.buffer = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerDisposableArr[i].equals(innerDisposable)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerDisposableArr2 = a;
                        } else {
                            InnerDisposable[] innerDisposableArr3 = new InnerDisposable[(length - 1)];
                            System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                            System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                            innerDisposableArr2 = innerDisposableArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        /* access modifiers changed from: package-private */
        public void b() {
            for (InnerDisposable<T> innerDisposable : this.observers.get()) {
                this.buffer.f(innerDisposable);
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            for (InnerDisposable<T> innerDisposable : this.observers.getAndSet(b)) {
                this.buffer.f(innerDisposable);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.observers.get() == b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.observers.set(b);
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.c();
                c();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.d(th);
                c();
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.done) {
                this.buffer.e(t);
                b();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                b();
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
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void a() {
            if (this.size > this.limit) {
                this.size--;
                set((Node) ((Node) get()).get());
            }
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements b<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public void c() {
            add(NotificationLite.COMPLETE);
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public void d(Throwable th) {
            add(NotificationLite.k(th));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public void e(T t) {
            add(t);
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public void f(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                x<? super T> xVar = innerDisposable.child;
                int i = 1;
                while (!innerDisposable.cancelled) {
                    int i2 = this.size;
                    Integer num = (Integer) innerDisposable.index;
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!NotificationLite.d(get(intValue), xVar) && !innerDisposable.cancelled) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    innerDisposable.index = Integer.valueOf(intValue);
                    i = innerDisposable.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface a<T> {
        b<T> call();
    }

    /* access modifiers changed from: package-private */
    public interface b<T> {
        void c();

        void d(Throwable th);

        void e(T t);

        void f(InnerDisposable<T> innerDisposable);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements a<T> {
        private final int a;

        c(int i) {
            this.a = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public b<T> call() {
            return new SizeBoundReplayBuffer(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements v<T> {
        private final AtomicReference<ReplayObserver<T>> a;
        private final a<T> b;

        d(AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
            this.a = atomicReference;
            this.b = aVar;
        }

        @Override // io.reactivex.v
        public void subscribe(x<? super T> xVar) {
            ReplayObserver<T> replayObserver;
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            while (true) {
                replayObserver = this.a.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.b.call());
                if (this.a.compareAndSet(null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, xVar);
            xVar.onSubscribe(innerDisposable);
            do {
                innerDisposableArr = replayObserver.observers.get();
                if (innerDisposableArr == ReplayObserver.b) {
                    break;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[(length + 1)];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!replayObserver.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
            if (innerDisposable.cancelled) {
                replayObserver.a(innerDisposable);
            } else {
                replayObserver.buffer.f(innerDisposable);
            }
        }
    }

    static final class e implements a<Object> {
        e() {
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public b<Object> call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    private ObservableReplay(v<T> vVar, v<T> vVar2, AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
        this.f = vVar;
        this.a = vVar2;
        this.b = atomicReference;
        this.c = aVar;
    }

    public static <T> io.reactivex.observables.a<T> i1(v<T> vVar, int i) {
        if (i == Integer.MAX_VALUE) {
            a aVar = n;
            AtomicReference atomicReference = new AtomicReference();
            return new ObservableReplay(new d(atomicReference, aVar), vVar, atomicReference, aVar);
        }
        c cVar = new c(i);
        AtomicReference atomicReference2 = new AtomicReference();
        return new ObservableReplay(new d(atomicReference2, cVar), vVar, atomicReference2, cVar);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.f.subscribe(xVar);
    }

    public void f(io.reactivex.disposables.b bVar) {
        this.b.compareAndSet((ReplayObserver) bVar, null);
    }

    @Override // io.reactivex.observables.a
    public void g1(g<? super io.reactivex.disposables.b> gVar) {
        ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.b.get();
            if (replayObserver != null && !replayObserver.d()) {
                break;
            }
            ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.c.call());
            if (this.b.compareAndSet(replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z = !replayObserver.shouldConnect.get() && replayObserver.shouldConnect.compareAndSet(false, true);
        try {
            ((ObservableRefCount.RefConnection) gVar).accept(replayObserver);
            if (z) {
                this.a.subscribe(replayObserver);
            }
        } catch (Throwable th) {
            if (z) {
                replayObserver.shouldConnect.compareAndSet(true, false);
            }
            yif.V(th);
            throw ExceptionHelper.e(th);
        }
    }
}
