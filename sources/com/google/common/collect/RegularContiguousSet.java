package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.DiscreteDomain;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 0;
    private final Range<C> range;

    private static final class SerializedForm<C extends Comparable> implements Serializable {
        final DiscreteDomain<C> domain;
        final Range<C> range;

        SerializedForm(Range range2, DiscreteDomain discreteDomain, AnonymousClass1 r3) {
            this.range = range2;
            this.domain = discreteDomain;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.range, this.domain);
        }
    }

    RegularContiguousSet(Range<C> range2, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.range = range2;
    }

    private ContiguousSet<C> intersectionInCurrentDomain(Range<C> range2) {
        Range<C> range3 = this.range;
        return range3.lowerBound.compareTo(range2.upperBound) <= 0 && range2.lowerBound.compareTo(range3.upperBound) <= 0 ? ContiguousSet.create(this.range.intersection(range2), this.domain) : new EmptyContiguousSet(this.domain);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.common.collect.Range<C extends java.lang.Comparable> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.range.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return Collections2.containsAllImpl(this, collection);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<C> createAsList() {
        if (this.domain.supportsFastOffset) {
            return new ImmutableAsList<C>() {
                /* class com.google.common.collect.RegularContiguousSet.AnonymousClass3 */

                /* access modifiers changed from: package-private */
                @Override // com.google.common.collect.ImmutableAsList
                public ImmutableCollection delegateCollection() {
                    return RegularContiguousSet.this;
                }

                @Override // java.util.List
                public Object get(int i) {
                    MoreObjects.checkElementIndex(i, size(), "index");
                    RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                    DiscreteDomain<C> discreteDomain = regularContiguousSet.domain;
                    Comparable first = regularContiguousSet.first();
                    long j = (long) i;
                    ((DiscreteDomain.IntegerDomain) discreteDomain).getClass();
                    Integer num = (Integer) first;
                    if (j >= 0) {
                        return Integer.valueOf(Ints.checkedCast(num.longValue() + j));
                    }
                    throw new IllegalArgumentException("distance cannot be negative but was: " + j);
                }
            };
        }
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* renamed from: descendingIterator */
    public UnmodifiableIterator<C> mo40descendingIterator() {
        return new AbstractSequentialIterator<C>(last()) {
            /* class com.google.common.collect.RegularContiguousSet.AnonymousClass2 */
            final C first;

            {
                this.first = (C) RegularContiguousSet.this.first();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
            @Override // com.google.common.collect.AbstractSequentialIterator
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object computeNext(java.lang.Object r3) {
                /*
                    r2 = this;
                    java.lang.Comparable r3 = (java.lang.Comparable) r3
                    C r0 = r2.first
                    int r1 = com.google.common.collect.RegularContiguousSet.b
                    if (r0 == 0) goto L_0x0012
                    int r1 = com.google.common.collect.Range.a
                    int r0 = r3.compareTo(r0)
                    if (r0 != 0) goto L_0x0012
                    r0 = 1
                    goto L_0x0013
                L_0x0012:
                    r0 = 0
                L_0x0013:
                    if (r0 == 0) goto L_0x0017
                    r3 = 0
                    goto L_0x001f
                L_0x0017:
                    com.google.common.collect.RegularContiguousSet r0 = com.google.common.collect.RegularContiguousSet.this
                    com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r0.domain
                    java.lang.Comparable r3 = r0.previous(r3)
                L_0x001f:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularContiguousSet.AnonymousClass2.computeNext(java.lang.Object):java.lang.Object");
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.lang.Object, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.domain.equals(regularContiguousSet.domain)) {
                if (!first().equals(regularContiguousSet.first()) || !last().equals(regularContiguousSet.last())) {
                    return false;
                }
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.lang.Object, java.util.Set
    public int hashCode() {
        return Collections2.hashCodeImpl(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.common.collect.RegularContiguousSet<C extends java.lang.Comparable> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet headSetImpl(Object obj, boolean z) {
        return headSetImpl((RegularContiguousSet<C>) ((Comparable) obj), z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSetFauxverideShim, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: iterator */
    public UnmodifiableIterator<C> mo41iterator() {
        return new AbstractSequentialIterator<C>(first()) {
            /* class com.google.common.collect.RegularContiguousSet.AnonymousClass1 */
            final C last;

            {
                this.last = (C) RegularContiguousSet.this.last();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: protected */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
            @Override // com.google.common.collect.AbstractSequentialIterator
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object computeNext(java.lang.Object r3) {
                /*
                    r2 = this;
                    java.lang.Comparable r3 = (java.lang.Comparable) r3
                    C r0 = r2.last
                    int r1 = com.google.common.collect.RegularContiguousSet.b
                    if (r0 == 0) goto L_0x0012
                    int r1 = com.google.common.collect.Range.a
                    int r0 = r3.compareTo(r0)
                    if (r0 != 0) goto L_0x0012
                    r0 = 1
                    goto L_0x0013
                L_0x0012:
                    r0 = 0
                L_0x0013:
                    if (r0 == 0) goto L_0x0017
                    r3 = 0
                    goto L_0x001f
                L_0x0017:
                    com.google.common.collect.RegularContiguousSet r0 = com.google.common.collect.RegularContiguousSet.this
                    com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r0.domain
                    java.lang.Comparable r3 = r0.next(r3)
                L_0x001f:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularContiguousSet.AnonymousClass1.computeNext(java.lang.Object):java.lang.Object");
            }
        };
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return Range.create(this.range.lowerBound.withLowerBoundType(boundType, this.domain), this.range.upperBound.withUpperBoundType(boundType, this.domain));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        DiscreteDomain<C> discreteDomain = this.domain;
        C first = first();
        C last = last();
        ((DiscreteDomain.IntegerDomain) discreteDomain).getClass();
        long intValue = ((long) ((Integer) last).intValue()) - ((long) ((Integer) first).intValue());
        if (intValue >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) intValue) + 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.common.collect.RegularContiguousSet<C extends java.lang.Comparable> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
        return subSetImpl((boolean) ((Comparable) obj), z, (boolean) ((Comparable) obj2), z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.common.collect.RegularContiguousSet<C extends java.lang.Comparable> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public /* bridge */ /* synthetic */ ImmutableSortedSet tailSetImpl(Object obj, boolean z) {
        return tailSetImpl((RegularContiguousSet<C>) ((Comparable) obj), z);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.range, this.domain, null);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
        return this.range.lowerBound.leastValueAbove(this.domain);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> headSetImpl(C c, boolean z) {
        return intersectionInCurrentDomain(Range.upTo(c, BoundType.forBoolean(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
        return this.range.upperBound.greatestValueBelow(this.domain);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return intersectionInCurrentDomain(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2)));
        }
        return new EmptyContiguousSet(this.domain);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> tailSetImpl(C c, boolean z) {
        return intersectionInCurrentDomain(Range.downTo(c, BoundType.forBoolean(z)));
    }
}
