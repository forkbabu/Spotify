package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX WARN: Incorrect class signature, class is equals to this class: <E:Ljava/lang/Object;>Lio/netty/util/internal/shaded/org/jctools/queues/atomic/a<TE;>;Ljava/lang/Object; */
public final class a<E> extends AbstractQueue {
    protected final AtomicReferenceArray<E> a;
    protected final int b;
    private final AtomicLong c = new AtomicLong();
    private final AtomicLong f = new AtomicLong();
    private volatile long n;

    public a(int i) {
        int L = yif.L(i);
        this.b = L - 1;
        this.a = new AtomicReferenceArray<>(L);
    }

    private long c() {
        return this.c.get();
    }

    private long d() {
        return this.f.get();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return c() == d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        long d;
        e.getClass();
        int i = this.b;
        long j = (long) (i + 1);
        long j2 = this.n;
        do {
            d = d();
            long j3 = d - j;
            if (j2 <= j3) {
                j2 = c();
                if (j2 <= j3) {
                    return false;
                }
                this.n = j2;
            }
        } while (!this.f.compareAndSet(d, 1 + d));
        this.a.lazySet(i & ((int) d), e);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        AtomicReferenceArray<E> atomicReferenceArray = this.a;
        long c2 = c();
        int i = ((int) c2) & this.b;
        E e = atomicReferenceArray.get(i);
        if (e == null) {
            if (c2 == d()) {
                return null;
            }
            do {
                e = atomicReferenceArray.get(i);
            } while (e == null);
        }
        return e;
    }

    @Override // java.util.Queue
    public E poll() {
        long c2 = c();
        int i = ((int) c2) & this.b;
        AtomicReferenceArray<E> atomicReferenceArray = this.a;
        E e = atomicReferenceArray.get(i);
        if (e == null) {
            if (c2 == d()) {
                return null;
            }
            do {
                e = atomicReferenceArray.get(i);
            } while (e == null);
        }
        atomicReferenceArray.lazySet(i, null);
        this.c.lazySet(c2 + 1);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long c2 = c();
        while (true) {
            long d = d();
            long c3 = c();
            if (c2 == c3) {
                return (int) (d - c3);
            }
            c2 = c3;
        }
    }
}
