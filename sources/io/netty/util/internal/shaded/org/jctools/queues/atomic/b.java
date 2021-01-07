package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Incorrect class signature, class is equals to this class: <E:Ljava/lang/Object;>Lio/netty/util/internal/shaded/org/jctools/queues/atomic/b<TE;>; */
public final class b<E> extends AbstractQueue {
    private final AtomicReference<LinkedQueueAtomicNode<E>> a;
    private final AtomicReference<LinkedQueueAtomicNode<E>> b;

    public b() {
        AtomicReference<LinkedQueueAtomicNode<E>> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        AtomicReference<LinkedQueueAtomicNode<E>> atomicReference2 = new AtomicReference<>();
        this.b = atomicReference2;
        LinkedQueueAtomicNode<E> linkedQueueAtomicNode = new LinkedQueueAtomicNode<>();
        atomicReference2.lazySet(linkedQueueAtomicNode);
        atomicReference.getAndSet(linkedQueueAtomicNode);
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueAtomicNode c() {
        return this.b.get();
    }

    /* access modifiers changed from: protected */
    public final LinkedQueueAtomicNode d() {
        return this.a.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return c() == d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        e.getClass();
        LinkedQueueAtomicNode<E> linkedQueueAtomicNode = new LinkedQueueAtomicNode<>(e);
        this.a.getAndSet(linkedQueueAtomicNode).lazySet(linkedQueueAtomicNode);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        LinkedQueueAtomicNode<E> c;
        LinkedQueueAtomicNode<E> linkedQueueAtomicNode = this.b.get();
        LinkedQueueAtomicNode<E> c2 = linkedQueueAtomicNode.c();
        if (c2 != null) {
            return c2.b();
        }
        if (linkedQueueAtomicNode == d()) {
            return null;
        }
        do {
            c = linkedQueueAtomicNode.c();
        } while (c == null);
        return c.b();
    }

    @Override // java.util.Queue
    public final E poll() {
        LinkedQueueAtomicNode<E> c;
        LinkedQueueAtomicNode<E> linkedQueueAtomicNode = this.b.get();
        LinkedQueueAtomicNode<E> c2 = linkedQueueAtomicNode.c();
        if (c2 != null) {
            E a2 = c2.a();
            linkedQueueAtomicNode.lazySet(linkedQueueAtomicNode);
            this.b.lazySet(c2);
            return a2;
        } else if (linkedQueueAtomicNode == d()) {
            return null;
        } else {
            do {
                c = linkedQueueAtomicNode.c();
            } while (c == null);
            E a3 = c.a();
            linkedQueueAtomicNode.lazySet(linkedQueueAtomicNode);
            this.b.lazySet(c);
            return a3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueAtomicNode c = c();
        LinkedQueueAtomicNode d = d();
        int i = 0;
        while (c != d && c != null && i < Integer.MAX_VALUE) {
            LinkedQueueAtomicNode<E> c2 = c.c();
            c = c2 == c ? c() : c2;
            i++;
        }
        return i;
    }
}
