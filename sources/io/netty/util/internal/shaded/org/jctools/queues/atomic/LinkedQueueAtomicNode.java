package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReference;

public final class LinkedQueueAtomicNode<E> extends AtomicReference<LinkedQueueAtomicNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    private E value;

    LinkedQueueAtomicNode() {
    }

    public E a() {
        E e = this.value;
        this.value = null;
        return e;
    }

    public E b() {
        return this.value;
    }

    public LinkedQueueAtomicNode<E> c() {
        return (LinkedQueueAtomicNode) get();
    }

    LinkedQueueAtomicNode(E e) {
        this.value = e;
    }
}
