package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.i;
import java.util.concurrent.atomic.AtomicReference;

public final class MpscLinkedQueue<T> implements i<T> {
    private final AtomicReference<LinkedQueueNode<T>> a;
    private final AtomicReference<LinkedQueueNode<T>> b;

    /* access modifiers changed from: package-private */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        LinkedQueueNode() {
        }

        public E a() {
            E e = this.value;
            this.value = null;
            return e;
        }

        LinkedQueueNode(E e) {
            this.value = e;
        }
    }

    public MpscLinkedQueue() {
        AtomicReference<LinkedQueueNode<T>> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        AtomicReference<LinkedQueueNode<T>> atomicReference2 = new AtomicReference<>();
        this.b = atomicReference2;
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        atomicReference2.lazySet(linkedQueueNode);
        atomicReference.getAndSet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.j
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean isEmpty() {
        return this.b.get() == this.a.get();
    }

    @Override // io.reactivex.internal.fuseable.j
    public boolean offer(T t) {
        if (t != null) {
            LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(t);
            this.a.getAndSet(linkedQueueNode).lazySet(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.i, io.reactivex.internal.fuseable.j
    public T poll() {
        LinkedQueueNode<T> linkedQueueNode;
        LinkedQueueNode<T> linkedQueueNode2 = this.b.get();
        LinkedQueueNode<T> linkedQueueNode3 = (LinkedQueueNode) linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            T a2 = linkedQueueNode3.a();
            this.b.lazySet(linkedQueueNode3);
            return a2;
        } else if (linkedQueueNode2 == this.a.get()) {
            return null;
        } else {
            do {
                linkedQueueNode = (LinkedQueueNode) linkedQueueNode2.get();
            } while (linkedQueueNode == null);
            T a3 = linkedQueueNode.a();
            this.b.lazySet(linkedQueueNode);
            return a3;
        }
    }
}
