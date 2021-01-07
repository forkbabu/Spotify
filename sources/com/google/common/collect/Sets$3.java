package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class Sets$3 extends Sets$SetView<E> {
    final /* synthetic */ Set val$set1;
    final /* synthetic */ Set val$set2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Sets$3(Set set, Set set2) {
        super(null);
        this.val$set1 = set;
        this.val$set2 = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.val$set1.contains(obj) && !this.val$set2.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.val$set2.containsAll(this.val$set1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator iterator() {
        return new AbstractIterator<E>() {
            /* class com.google.common.collect.Sets$3.AnonymousClass1 */
            final Iterator<E> itr;

            {
                this.itr = Sets$3.this.val$set1.iterator();
            }

            /* access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
                while (this.itr.hasNext()) {
                    E next = this.itr.next();
                    if (!Sets$3.this.val$set2.contains(next)) {
                        return next;
                    }
                }
                endOfData();
                return null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        int i = 0;
        for (Object obj : this.val$set1) {
            if (!this.val$set2.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
