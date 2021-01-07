package com.google.common.collect;

public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {
    protected ForwardingMultiset() {
    }

    @Override // com.google.common.collect.Multiset
    public int add(E e, int i) {
        return mo25delegate().add(e, i);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return ((TreeMultiset) mo25delegate()).count(obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public abstract Multiset<E> mo25delegate();

    @Override // java.util.Collection, java.lang.Object, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
        return obj == this || mo25delegate().equals(obj);
    }

    @Override // java.util.Collection, java.lang.Object, com.google.common.collect.Multiset
    public int hashCode() {
        return mo25delegate().hashCode();
    }

    @Override // com.google.common.collect.Multiset
    public int remove(Object obj, int i) {
        return mo25delegate().remove(obj, i);
    }

    @Override // com.google.common.collect.Multiset
    public int setCount(E e, int i) {
        return mo25delegate().setCount(e, i);
    }

    @Override // com.google.common.collect.Multiset
    public boolean setCount(E e, int i, int i2) {
        return mo25delegate().setCount(e, i, i2);
    }
}
