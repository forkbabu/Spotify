package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    protected ForwardingCollection() {
    }

    @Override // java.util.Collection, java.util.Queue
    public boolean add(E e) {
        return mo25delegate().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return mo25delegate().addAll(collection);
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        mo25delegate().clear();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return mo25delegate().contains(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return mo25delegate().containsAll(collection);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract Collection<E> mo25delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo25delegate().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return mo25delegate().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return mo25delegate().remove(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return mo25delegate().removeAll(collection);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        return mo25delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return mo25delegate().size();
    }

    /* access modifiers changed from: protected */
    public boolean standardRetainAll(Collection<?> collection) {
        Iterator<E> it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        return mo25delegate().toArray();
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) mo25delegate().toArray(tArr);
    }
}
