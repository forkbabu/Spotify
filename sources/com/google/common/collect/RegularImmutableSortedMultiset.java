package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    static final ImmutableSortedMultiset<Comparable> NATURAL_EMPTY_MULTISET = new RegularImmutableSortedMultiset(NaturalOrdering.INSTANCE);
    private static final long[] ZERO_CUMULATIVE_COUNTS = {0};
    private final transient long[] cumulativeCounts;
    final transient RegularImmutableSortedSet<E> elementSet;
    private final transient int length;
    private final transient int offset;

    RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.elementSet = ImmutableSortedSet.emptySet(comparator);
        this.cumulativeCounts = ZERO_CUMULATIVE_COUNTS;
        this.offset = 0;
        this.length = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r7 >= 0) goto L_0x0014;
     */
    @Override // com.google.common.collect.Multiset
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int count(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r6.elementSet
            r0.getClass()
            if (r7 != 0) goto L_0x0008
            goto L_0x0013
        L_0x0008:
            com.google.common.collect.ImmutableList<E> r1 = r0.elements     // Catch:{ ClassCastException -> 0x0013 }
            java.util.Comparator<? super E> r0 = r0.comparator     // Catch:{ ClassCastException -> 0x0013 }
            int r7 = java.util.Collections.binarySearch(r1, r7, r0)     // Catch:{ ClassCastException -> 0x0013 }
            if (r7 < 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r7 = -1
        L_0x0014:
            if (r7 < 0) goto L_0x0024
            long[] r0 = r6.cumulativeCounts
            int r1 = r6.offset
            int r1 = r1 + r7
            int r7 = r1 + 1
            r2 = r0[r7]
            r4 = r0[r1]
            long r2 = r2 - r4
            int r7 = (int) r2
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedMultiset.count(java.lang.Object):int");
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: elementSet */
    public ImmutableSet mo69elementSet() {
        return this.elementSet;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        E e = this.elementSet.elements.get(i);
        long[] jArr = this.cumulativeCounts;
        int i2 = this.offset + i;
        return new Multisets$ImmutableEntry(e, (int) (jArr[i2 + 1] - jArr[i2]));
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedMultiset<E> getSubMultiset(int i, int i2) {
        MoreObjects.checkPositionIndexes(i, i2, this.length);
        if (i == i2) {
            return ImmutableSortedMultiset.emptyMultiset(comparator());
        }
        if (i == 0 && i2 == this.length) {
            return this;
        }
        return new RegularImmutableSortedMultiset(this.elementSet.getSubSet(i, i2), this.cumulativeCounts, this.offset + i, i2 - i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.offset > 0 || this.length < this.cumulativeCounts.length - 1;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.cumulativeCounts;
        int i = this.offset;
        return Ints.saturatedCast(jArr[this.length + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: elementSet  reason: collision with other method in class */
    public ImmutableSortedSet<E> mo69elementSet() {
        return this.elementSet;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: headMultiset */
    public ImmutableSortedMultiset<E> mo37headMultiset(E e, BoundType boundType) {
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.elementSet;
        boundType.getClass();
        return getSubMultiset(0, regularImmutableSortedSet.headIndex(e, boundType == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: tailMultiset */
    public ImmutableSortedMultiset<E> mo38tailMultiset(E e, BoundType boundType) {
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.elementSet;
        boundType.getClass();
        return getSubMultiset(regularImmutableSortedSet.tailIndex(e, boundType == BoundType.CLOSED), this.length);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: elementSet */
    public NavigableSet mo69elementSet() {
        return this.elementSet;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: elementSet  reason: collision with other method in class */
    public Set mo70elementSet() {
        return this.elementSet;
    }

    RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.elementSet = regularImmutableSortedSet;
        this.cumulativeCounts = jArr;
        this.offset = i;
        this.length = i2;
    }
}
