package com.google.common.collect;

import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* access modifiers changed from: package-private */
public class Lists$TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final List<F> fromList;
    final Function<? super F, ? extends T> function;

    Lists$TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function2) {
        list.getClass();
        this.fromList = list;
        function2.getClass();
        this.function = function2;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public void clear() {
        this.fromList.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.List, java.util.AbstractList
    public ListIterator<T> listIterator(int i) {
        return new TransformedListIterator<F, T>(this.fromList.listIterator(i)) {
            /* class com.google.common.collect.Lists$TransformingSequentialList.AnonymousClass1 */

            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            public T transform(F f) {
                return (T) Lists$TransformingSequentialList.this.function.apply(f);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return this.fromList.size();
    }
}
