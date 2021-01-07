package io.reactivex.subjects;

import io.reactivex.disposables.b;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ReplaySubject<T> extends c<T> {
    static final ReplayDisposable[] f = new ReplayDisposable[0];
    static final ReplayDisposable[] n = new ReplayDisposable[0];
    private static final Object[] o = new Object[0];
    final a<T> a;
    final AtomicReference<ReplayDisposable<T>[]> b = new AtomicReference<>(f);
    boolean c;

    static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ReplayDisposable<T> extends AtomicInteger implements b {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final x<? super T> downstream;
        Object index;
        final ReplaySubject<T> state;

        ReplayDisposable(x<? super T> xVar, ReplaySubject<T> replaySubject) {
            this.downstream = xVar;
            this.state = replaySubject;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.j1(this);
            }
        }
    }

    static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile Node<Object> head;
        final int maxSize;
        int size;
        Node<Object> tail;

        SizeBoundReplayBuffer(int i) {
            io.reactivex.internal.functions.a.d(i, "maxSize");
            this.maxSize = i;
            Node<Object> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.lazySet(node);
            Node<Object> node3 = this.head;
            if (node3.value != null) {
                Node<Object> node4 = new Node<>(null);
                node4.lazySet(node3.get());
                this.head = node4;
            }
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t) {
            Node<Object> node = new Node<>(t);
            Node<Object> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = (Node) this.head.get();
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                x<? super T> xVar = replayDisposable.downstream;
                Node<Object> node = (Node) replayDisposable.index;
                if (node == null) {
                    node = this.head;
                }
                int i = 1;
                while (!replayDisposable.cancelled) {
                    Node<Object> node2 = (Node) node.get();
                    if (node2 != null) {
                        T t = node2.value;
                        if (!this.done || node2.get() != null) {
                            xVar.onNext(t);
                            node = node2;
                        } else {
                            if (NotificationLite.m(t)) {
                                xVar.onComplete();
                            } else {
                                xVar.onError(NotificationLite.l(t));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                    } else if (node.get() != null) {
                        continue;
                    } else {
                        replayDisposable.index = node;
                        i = replayDisposable.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }
    }

    static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer;
        volatile boolean done;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            io.reactivex.internal.functions.a.d(i, "capacityHint");
            this.buffer = new ArrayList(i);
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            this.buffer.add(obj);
            this.size++;
            this.done = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            int i;
            if (replayDisposable.getAndIncrement() == 0) {
                List<Object> list = this.buffer;
                x<? super T> xVar = replayDisposable.downstream;
                Integer num = (Integer) replayDisposable.index;
                int i2 = 0;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    replayDisposable.index = 0;
                }
                int i3 = 1;
                while (!replayDisposable.cancelled) {
                    int i4 = this.size;
                    while (i4 != i2) {
                        if (replayDisposable.cancelled) {
                            replayDisposable.index = null;
                            return;
                        }
                        Object obj = list.get(i2);
                        if (this.done && (i = i2 + 1) == i4 && i == (i4 = this.size)) {
                            if (NotificationLite.m(obj)) {
                                xVar.onComplete();
                            } else {
                                xVar.onError(NotificationLite.l(obj));
                            }
                            replayDisposable.index = null;
                            replayDisposable.cancelled = true;
                            return;
                        }
                        xVar.onNext(obj);
                        i2++;
                    }
                    if (i2 == this.size) {
                        replayDisposable.index = Integer.valueOf(i2);
                        i3 = replayDisposable.addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.index = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface a<T> {
        void a(Object obj);

        void add(T t);

        void b(ReplayDisposable<T> replayDisposable);

        boolean compareAndSet(Object obj, Object obj2);
    }

    ReplaySubject(a<T> aVar) {
        this.a = aVar;
    }

    public static <T> ReplaySubject<T> h1(int i) {
        return new ReplaySubject<>(new UnboundedReplayBuffer(i));
    }

    public static <T> ReplaySubject<T> i1(int i) {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(i));
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        boolean z;
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(xVar, this);
        xVar.onSubscribe(replayDisposable);
        if (!replayDisposable.cancelled) {
            while (true) {
                ReplayDisposable<T>[] replayDisposableArr = this.b.get();
                z = false;
                if (replayDisposableArr != n) {
                    int length = replayDisposableArr.length;
                    ReplayDisposable<T>[] replayDisposableArr2 = new ReplayDisposable[(length + 1)];
                    System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
                    replayDisposableArr2[length] = replayDisposable;
                    if (this.b.compareAndSet(replayDisposableArr, replayDisposableArr2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z || !replayDisposable.cancelled) {
                this.a.b(replayDisposable);
            } else {
                j1(replayDisposable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j1(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable<T>[] replayDisposableArr2;
        ReplayDisposable<T>[] replayDisposableArr3 = f;
        do {
            replayDisposableArr = this.b.get();
            if (replayDisposableArr != n && replayDisposableArr != replayDisposableArr3) {
                int length = replayDisposableArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (replayDisposableArr[i] == replayDisposable) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        replayDisposableArr2 = replayDisposableArr3;
                    } else {
                        replayDisposableArr2 = new ReplayDisposable[(length - 1)];
                        System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, i);
                        System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.b.compareAndSet(replayDisposableArr, replayDisposableArr2));
    }

    /* access modifiers changed from: package-private */
    public ReplayDisposable<T>[] k1(Object obj) {
        ReplayDisposable<T>[] replayDisposableArr = n;
        return this.a.compareAndSet(null, obj) ? this.b.getAndSet(replayDisposableArr) : replayDisposableArr;
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        if (!this.c) {
            this.c = true;
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            a<T> aVar = this.a;
            aVar.a(notificationLite);
            for (ReplayDisposable<T> replayDisposable : k1(notificationLite)) {
                aVar.b(replayDisposable);
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.c) {
            io.reactivex.plugins.a.g(th);
        } else {
            this.c = true;
            Object k = NotificationLite.k(th);
            a<T> aVar = this.a;
            aVar.a(k);
            for (ReplayDisposable<T> replayDisposable : k1(k)) {
                aVar.b(replayDisposable);
            }
        }
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!this.c) {
            a<T> aVar = this.a;
            aVar.add(t);
            for (ReplayDisposable<T> replayDisposable : this.b.get()) {
                aVar.b(replayDisposable);
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (this.c) {
            bVar.dispose();
        }
    }
}
