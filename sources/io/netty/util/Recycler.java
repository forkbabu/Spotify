package io.netty.util;

import io.netty.util.concurrent.p;
import io.netty.util.internal.i;
import io.netty.util.internal.s;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Recycler<T> {
    private static final io.netty.util.internal.logging.b f;
    private static final e g = new a();
    private static final AtomicInteger h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m = Math.max(0, s.c("io.netty.recycler.maxDelayedQueuesPerThread", Runtime.getRuntime().availableProcessors() * 2));
    private static final int n;
    private static final int o;
    private static final p<Map<f<?>, WeakOrderQueue>> p = new c();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final p<f<T>> e = new b();

    /* access modifiers changed from: private */
    public static final class WeakOrderQueue {
        static final WeakOrderQueue g = new WeakOrderQueue();
        private Link a;
        private Link b;
        private WeakOrderQueue c;
        private final WeakReference<Thread> d;
        private final int e;
        private final AtomicInteger f;

        private WeakOrderQueue() {
            this.e = Recycler.h.getAndIncrement();
            this.d = null;
            this.f = null;
        }

        static WeakOrderQueue e(f<?> fVar, Thread thread) {
            if (g(fVar.b, Recycler.n)) {
                return new WeakOrderQueue(fVar, thread);
            }
            return null;
        }

        private static boolean g(AtomicInteger atomicInteger, int i) {
            int i2;
            do {
                i2 = atomicInteger.get();
                if (i2 < i) {
                    return false;
                }
            } while (!atomicInteger.compareAndSet(i2, i2 - i));
            return true;
        }

        /* access modifiers changed from: package-private */
        public void d(d<?> dVar) {
            ((d) dVar).a = this.e;
            Link link = this.b;
            int i = link.get();
            if (i == Recycler.n) {
                if (g(this.f, Recycler.n)) {
                    Link link2 = new Link(null);
                    link.next = link2;
                    this.b = link2;
                    i = link2.get();
                    link = link2;
                } else {
                    return;
                }
            }
            link.elements[i] = dVar;
            ((d) dVar).d = null;
            link.lazySet(i + 1);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.b.readIndex != this.b.get();
        }

        /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
            java.lang.StackOverflowError
            	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
            	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
            */
        protected void finalize() {
            /*
                r4 = this;
                super.finalize()     // Catch:{ all -> 0x0016 }
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = r4.a
            L_0x0005:
                if (r0 == 0) goto L_0x0015
                int r1 = io.netty.util.Recycler.h()
                java.util.concurrent.atomic.AtomicInteger r2 = r4.f
                r2.addAndGet(r1)
                io.netty.util.Recycler$WeakOrderQueue$Link r0 = io.netty.util.Recycler.WeakOrderQueue.Link.a(r0)
                goto L_0x0005
            L_0x0015:
                return
            L_0x0016:
                r0 = move-exception
                io.netty.util.Recycler$WeakOrderQueue$Link r1 = r4.a
            L_0x0019:
                if (r1 == 0) goto L_0x0029
                int r2 = io.netty.util.Recycler.h()
                java.util.concurrent.atomic.AtomicInteger r3 = r4.f
                r3.addAndGet(r2)
                io.netty.util.Recycler$WeakOrderQueue$Link r1 = io.netty.util.Recycler.WeakOrderQueue.Link.a(r1)
                goto L_0x0019
            L_0x0029:
                goto L_0x002b
            L_0x002a:
                throw r0
            L_0x002b:
                goto L_0x002a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.Recycler.WeakOrderQueue.finalize():void");
        }

        /* access modifiers changed from: package-private */
        public boolean h(f<?> fVar) {
            Link link = this.a;
            if (link == null) {
                return false;
            }
            if (link.readIndex == Recycler.n) {
                if (link.next == null) {
                    return false;
                }
                link = link.next;
                this.a = link;
            }
            int i = link.readIndex;
            int i2 = link.get();
            int i3 = i2 - i;
            if (i3 == 0) {
                return false;
            }
            int i4 = ((f) fVar).g;
            int i5 = i3 + i4;
            if (i5 > ((f) fVar).f.length) {
                i2 = Math.min((fVar.g(i5) + i) - i4, i2);
            }
            if (i == i2) {
                return false;
            }
            d<?>[] dVarArr = link.elements;
            d[] dVarArr2 = ((f) fVar).f;
            while (i < i2) {
                d<?> dVar = dVarArr[i];
                if (((d) dVar).b == 0) {
                    ((d) dVar).b = ((d) dVar).a;
                } else if (((d) dVar).b != ((d) dVar).a) {
                    throw new IllegalStateException("recycled already");
                }
                dVarArr[i] = null;
                if (!fVar.f(dVar)) {
                    ((d) dVar).d = fVar;
                    dVarArr2[i4] = dVar;
                    i4++;
                }
                i++;
            }
            if (i2 == Recycler.n && link.next != null) {
                this.f.addAndGet(Recycler.n);
                this.a = link.next;
            }
            link.readIndex = i2;
            if (((f) fVar).g == i4) {
                return false;
            }
            ((f) fVar).g = i4;
            return true;
        }

        /* access modifiers changed from: private */
        public static final class Link extends AtomicInteger {
            private final d<?>[] elements;
            private Link next;
            private int readIndex;

            private Link() {
                this.elements = new d[Recycler.n];
            }

            Link(a aVar) {
                this.elements = new d[Recycler.n];
            }
        }

        private WeakOrderQueue(f<?> fVar, Thread thread) {
            this.e = Recycler.h.getAndIncrement();
            Link link = new Link(null);
            this.b = link;
            this.a = link;
            this.d = new WeakReference<>(thread);
            synchronized (fVar) {
                this.c = ((f) fVar).k;
                ((f) fVar).k = this;
            }
            this.f = fVar.b;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements e {
        a() {
        }

        @Override // io.netty.util.Recycler.e
        public void a(Object obj) {
        }
    }

    class b extends p<f<T>> {
        b() {
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.p
        public Object d() {
            return new f(Recycler.this, Thread.currentThread(), Recycler.this.a, Recycler.this.b, Recycler.this.c, Recycler.this.d);
        }
    }

    static class c extends p<Map<f<?>, WeakOrderQueue>> {
        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.concurrent.p
        public Map<f<?>, WeakOrderQueue> d() {
            return new WeakHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements e<T> {
        private int a;
        private int b;
        boolean c;
        private f<?> d;
        private Object e;

        d(f<?> fVar) {
            this.d = fVar;
        }

        @Override // io.netty.util.Recycler.e
        public void a(Object obj) {
            if (obj == this.e) {
                this.d.i(this);
                return;
            }
            throw new IllegalArgumentException("object does not belong to handle");
        }
    }

    public interface e<T> {
        void a(T t);
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> {
        final Thread a;
        final AtomicInteger b;
        final int c;
        private final int d;
        private final int e;
        private d<?>[] f;
        private int g;
        private int h = -1;
        private WeakOrderQueue i;
        private WeakOrderQueue j;
        private volatile WeakOrderQueue k;

        f(Recycler<T> recycler, Thread thread, int i2, int i3, int i4, int i5) {
            this.a = thread;
            this.d = i2;
            this.b = new AtomicInteger(Math.max(i2 / i3, Recycler.n));
            this.f = new d[Math.min(Recycler.k, i2)];
            this.e = i4;
            this.c = i5;
        }

        /* access modifiers changed from: package-private */
        public boolean f(d<?> dVar) {
            if (dVar.c) {
                return false;
            }
            int i2 = this.h + 1;
            this.h = i2;
            if ((i2 & this.e) != 0) {
                return true;
            }
            dVar.c = true;
            return false;
        }

        /* access modifiers changed from: package-private */
        public int g(int i2) {
            int length = this.f.length;
            int i3 = this.d;
            do {
                length <<= 1;
                if (length >= i2) {
                    break;
                }
            } while (length < i3);
            int min = Math.min(length, i3);
            d<?>[] dVarArr = this.f;
            if (min != dVarArr.length) {
                this.f = (d[]) Arrays.copyOf(dVarArr, min);
            }
            return min;
        }

        /* access modifiers changed from: package-private */
        public d<T> h() {
            boolean z;
            WeakOrderQueue weakOrderQueue;
            int i2 = this.g;
            if (i2 == 0) {
                WeakOrderQueue weakOrderQueue2 = this.i;
                boolean z2 = true;
                if (weakOrderQueue2 == null && (weakOrderQueue2 = this.k) == null) {
                    z = false;
                } else {
                    WeakOrderQueue weakOrderQueue3 = this.j;
                    z = false;
                    while (true) {
                        if (weakOrderQueue2.h(this)) {
                            z = true;
                            break;
                        }
                        weakOrderQueue = weakOrderQueue2.c;
                        if (weakOrderQueue2.d.get() == null) {
                            if (weakOrderQueue2.f()) {
                                while (weakOrderQueue2.h(this)) {
                                    z = true;
                                }
                            }
                            if (weakOrderQueue3 != null) {
                                weakOrderQueue3.c = weakOrderQueue;
                            }
                        } else {
                            weakOrderQueue3 = weakOrderQueue2;
                        }
                        if (weakOrderQueue == null || z) {
                            break;
                        }
                        weakOrderQueue2 = weakOrderQueue;
                    }
                    weakOrderQueue2 = weakOrderQueue;
                    this.j = weakOrderQueue3;
                    this.i = weakOrderQueue2;
                }
                if (!z) {
                    this.j = null;
                    this.i = this.k;
                    z2 = false;
                }
                if (!z2) {
                    return null;
                }
                i2 = this.g;
            }
            int i3 = i2 - 1;
            d<?>[] dVarArr = this.f;
            d<T> dVar = (d<T>) dVarArr[i3];
            dVarArr[i3] = null;
            if (((d) dVar).a == ((d) dVar).b) {
                ((d) dVar).b = 0;
                ((d) dVar).a = 0;
                this.g = i3;
                return dVar;
            }
            throw new IllegalStateException("recycled multiple times");
        }

        /* access modifiers changed from: package-private */
        public void i(d<?> dVar) {
            Thread currentThread = Thread.currentThread();
            if (this.a != currentThread) {
                Map map = (Map) Recycler.p.b();
                WeakOrderQueue weakOrderQueue = (WeakOrderQueue) map.get(this);
                if (weakOrderQueue == null) {
                    if (map.size() >= this.c) {
                        map.put(this, WeakOrderQueue.g);
                        return;
                    }
                    weakOrderQueue = WeakOrderQueue.e(this, currentThread);
                    if (weakOrderQueue != null) {
                        map.put(this, weakOrderQueue);
                    } else {
                        return;
                    }
                } else if (weakOrderQueue == WeakOrderQueue.g) {
                    return;
                }
                weakOrderQueue.d(dVar);
            } else if ((((d) dVar).b | ((d) dVar).a) == 0) {
                int i2 = Recycler.i;
                ((d) dVar).a = i2;
                ((d) dVar).b = i2;
                int i3 = this.g;
                if (i3 < this.d && !f(dVar)) {
                    d<?>[] dVarArr = this.f;
                    if (i3 == dVarArr.length) {
                        this.f = (d[]) Arrays.copyOf(dVarArr, Math.min(i3 << 1, this.d));
                    }
                    this.f[i3] = dVar;
                    this.g = i3 + 1;
                }
            } else {
                throw new IllegalStateException("recycled already");
            }
        }
    }

    static {
        int i2 = io.netty.util.internal.logging.c.b;
        io.netty.util.internal.logging.b b2 = io.netty.util.internal.logging.c.b(Recycler.class.getName());
        f = b2;
        AtomicInteger atomicInteger = new AtomicInteger(Integer.MIN_VALUE);
        h = atomicInteger;
        i = atomicInteger.getAndIncrement();
        int i3 = 32768;
        int c2 = s.c("io.netty.recycler.maxCapacityPerThread", s.c("io.netty.recycler.maxCapacity", 32768));
        if (c2 >= 0) {
            i3 = c2;
        }
        j = i3;
        int max = Math.max(2, s.c("io.netty.recycler.maxSharedCapacityFactor", 2));
        l = max;
        int b3 = i.b(Math.max(s.c("io.netty.recycler.linkCapacity", 16), 16));
        n = b3;
        int b4 = i.b(s.c("io.netty.recycler.ratio", 8));
        o = b4;
        if (b2.c()) {
            if (i3 == 0) {
                b2.p("-Dio.netty.recycler.maxCapacityPerThread: disabled");
                b2.p("-Dio.netty.recycler.maxSharedCapacityFactor: disabled");
                b2.p("-Dio.netty.recycler.linkCapacity: disabled");
                b2.p("-Dio.netty.recycler.ratio: disabled");
            } else {
                b2.r("-Dio.netty.recycler.maxCapacityPerThread: {}", Integer.valueOf(i3));
                b2.r("-Dio.netty.recycler.maxSharedCapacityFactor: {}", Integer.valueOf(max));
                b2.r("-Dio.netty.recycler.linkCapacity: {}", Integer.valueOf(b3));
                b2.r("-Dio.netty.recycler.ratio: {}", Integer.valueOf(b4));
            }
        }
        k = Math.min(i3, 256);
    }

    protected Recycler() {
        int i2 = j;
        int i3 = l;
        int i4 = o;
        int i5 = m;
        this.c = i.b(i4) - 1;
        if (i2 <= 0) {
            this.a = 0;
            this.b = 1;
            this.d = 0;
            return;
        }
        this.a = i2;
        this.b = Math.max(1, i3);
        this.d = Math.max(0, i5);
    }

    public final T j() {
        if (this.a == 0) {
            return k(g);
        }
        f<T> b2 = this.e.b();
        d<T> h2 = b2.h();
        if (h2 == null) {
            h2 = new d<>(b2);
            ((d) h2).e = k(h2);
        }
        return (T) ((d) h2).e;
    }

    /* access modifiers changed from: protected */
    public abstract T k(e<T> eVar);
}
