package com.google.common.collect;

import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public class Lists$TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final List<F> fromList;
    final Function<? super F, ? extends T> function;

    Lists$TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function2) {
        list.getClass();
        this.fromList = list;
        function2.getClass();
        this.function = function2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public void clear() {
        this.fromList.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return (T) this.function.apply(this.fromList.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i) {
        return new TransformedListIterator<F, T>(this.fromList.listIterator(i)) {
            /* class com.google.common.collect.Lists$TransformingRandomAccessList.AnonymousClass1 */

            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public T transform(F f) {
                return (T) Lists$TransformingRandomAccessList.this.function.apply(f);
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public T remove(int i) {
        return (T) this.function.apply(this.fromList.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.fromList.size();
    }
}
