package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements SortedMultiset<E> {
    transient ImmutableSortedMultiset<E> descendingMultiset;

    public static class Builder<E> extends ImmutableMultiset.Builder<E> {
        private final Comparator<? super E> comparator;
        private int[] counts = new int[4];
        E[] elements = ((E[]) new Object[4]);
        private boolean forceCopyElements;
        private int length;

        public Builder(Comparator<? super E> comparator2) {
            super(true);
            comparator2.getClass();
            this.comparator = comparator2;
        }

        private void dedupAndCoalesce(boolean z) {
            int i = this.length;
            if (i != 0) {
                E[] eArr = (E[]) Arrays.copyOf(this.elements, i);
                Arrays.sort(eArr, this.comparator);
                int i2 = 1;
                for (int i3 = 1; i3 < eArr.length; i3++) {
                    if (this.comparator.compare(eArr[i2 - 1], eArr[i3]) < 0) {
                        eArr[i2] = eArr[i3];
                        i2++;
                    }
                }
                Arrays.fill(eArr, i2, this.length, (Object) null);
                if (z) {
                    int i4 = i2 * 4;
                    int i5 = this.length;
                    if (i4 > i5 * 3) {
                        eArr = (E[]) Arrays.copyOf(eArr, Ints.saturatedCast(((long) i5) + ((long) ((i5 / 2) + 1))));
                    }
                }
                int[] iArr = new int[eArr.length];
                for (int i6 = 0; i6 < this.length; i6++) {
                    int binarySearch = Arrays.binarySearch(eArr, 0, i2, this.elements[i6], this.comparator);
                    int[] iArr2 = this.counts;
                    if (iArr2[i6] >= 0) {
                        iArr[binarySearch] = iArr[binarySearch] + iArr2[i6];
                    } else {
                        iArr[binarySearch] = iArr2[i6] ^ -1;
                    }
                }
                this.elements = eArr;
                this.counts = iArr;
                this.length = i2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        /* renamed from: add */
        public ImmutableCollection.Builder mo53add(Object obj) {
            addCopies((Builder<E>) obj, 1);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        /* renamed from: add  reason: collision with other method in class */
        public ImmutableMultiset.Builder mo58add(Object obj) {
            addCopies((Builder<E>) obj, 1);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public Builder<E> addCopies(E e, int i) {
            e.getClass();
            Collections2.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return this;
            }
            int i2 = this.length;
            E[] eArr = this.elements;
            if (i2 == eArr.length) {
                dedupAndCoalesce(true);
            } else if (this.forceCopyElements) {
                this.elements = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.forceCopyElements = false;
            E[] eArr2 = this.elements;
            int i3 = this.length;
            eArr2[i3] = e;
            this.counts[i3] = i;
            this.length = i3 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSortedMultiset<E> build() {
            int i;
            dedupAndCoalesce(false);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = this.length;
                if (i2 >= i) {
                    break;
                }
                int[] iArr = this.counts;
                if (iArr[i2] > 0) {
                    E[] eArr = this.elements;
                    eArr[i3] = eArr[i2];
                    iArr[i3] = iArr[i2];
                    i3++;
                }
                i2++;
            }
            Arrays.fill(this.elements, i3, i, (Object) null);
            Arrays.fill(this.counts, i3, this.length, 0);
            this.length = i3;
            if (i3 == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.comparator);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.construct(this.comparator, i3, this.elements);
            long[] jArr = new long[(this.length + 1)];
            int i4 = 0;
            while (i4 < this.length) {
                int i5 = i4 + 1;
                jArr[i5] = jArr[i4] + ((long) this.counts[i4]);
                i4 = i5;
            }
            this.forceCopyElements = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.length);
        }
    }

    private static final class SerializedForm<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        SerializedForm(SortedMultiset<E> sortedMultiset) {
            this.comparator = sortedMultiset.comparator();
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) sortedMultiset;
            int size = immutableMultiset.entrySet().size();
            this.elements = (E[]) new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (Multiset.Entry<E> entry : immutableMultiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            int length = this.elements.length;
            Builder builder = new Builder(this.comparator);
            for (int i = 0; i < length; i++) {
                builder.addCopies((Builder) this.elements[i], this.counts[i]);
            }
            return builder.build();
        }
    }

    ImmutableSortedMultiset() {
    }

    static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        return NaturalOrdering.INSTANCE.equals(comparator) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET : new RegularImmutableSortedMultiset(comparator);
    }

    public static <E extends Comparable<?>> Builder<E> naturalOrder() {
        return new Builder<>(NaturalOrdering.INSTANCE);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator<? super E> comparator() {
        return mo69elementSet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: elementSet */
    public abstract ImmutableSortedSet<E> mo69elementSet();

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: headMultiset */
    public abstract ImmutableSortedMultiset<E> mo37headMultiset(E e, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset
    @Deprecated
    public final Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @Deprecated
    public final Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        MoreObjects.checkArgument(comparator().compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return mo38tailMultiset((ImmutableSortedMultiset<E>) obj, boundType).mo37headMultiset((ImmutableSortedMultiset<E>) obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: tailMultiset */
    public abstract ImmutableSortedMultiset<E> mo38tailMultiset(E e, BoundType boundType);

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: descendingMultiset */
    public ImmutableSortedMultiset<E> mo36descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.descendingMultiset;
        if (immutableSortedMultiset == null) {
            immutableSortedMultiset = isEmpty() ? emptyMultiset(Ordering.from(comparator()).reverse()) : new DescendingImmutableSortedMultiset<>(this);
            this.descendingMultiset = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }
}
