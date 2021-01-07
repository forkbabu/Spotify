package com.google.common.collect;

import java.util.Queue;

public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    protected ForwardingQueue() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract Queue<E> mo25delegate();

    @Override // java.util.Queue
    public E element() {
        return mo25delegate().element();
    }

    @Override // java.util.Queue
    public E peek() {
        return mo25delegate().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return mo25delegate().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return mo25delegate().remove();
    }
}
