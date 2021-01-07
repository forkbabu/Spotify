package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.Cut;
import java.io.Serializable;
import java.lang.Comparable;

public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {
    private static final Range<Comparable> ALL = new Range<>(Cut.BelowAll.access$000(), Cut.AboveAll.access$100());
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = 0;
    final Cut<C> lowerBound;
    final Cut<C> upperBound;

    private Range(Cut<C> cut, Cut<C> cut2) {
        cut.getClass();
        this.lowerBound = cut;
        cut2.getClass();
        this.upperBound = cut2;
        if (cut.compareTo((Cut) cut2) > 0 || cut == Cut.AboveAll.access$100() || cut2 == Cut.BelowAll.access$000()) {
            StringBuilder V0 = je.V0("Invalid range: ");
            StringBuilder sb = new StringBuilder(16);
            cut.describeAsLowerBound(sb);
            sb.append("..");
            cut2.describeAsUpperBound(sb);
            V0.append(sb.toString());
            throw new IllegalArgumentException(V0.toString());
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return (Range<C>) ALL;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c) {
        return new Range<>(new Cut.BelowValue(c), Cut.AboveAll.access$100());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c) {
        return new Range<>(Cut.BelowAll.access$000(), new Cut.AboveValue(c));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c, C c2) {
        return new Range<>(new Cut.BelowValue(c), new Cut.BelowValue(c2));
    }

    static <C extends Comparable<?>> Range<C> create(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c, BoundType boundType) {
        int ordinal = boundType.ordinal();
        if (ordinal == 0) {
            return new Range<>(new Cut.AboveValue(c), Cut.AboveAll.access$100());
        }
        if (ordinal == 1) {
            return new Range<>(new Cut.BelowValue(c), Cut.AboveAll.access$100());
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> range(C c, BoundType boundType, C c2, BoundType boundType2) {
        Cut cut;
        Cut cut2;
        boundType.getClass();
        boundType2.getClass();
        BoundType boundType3 = BoundType.OPEN;
        if (boundType == boundType3) {
            cut = new Cut.AboveValue(c);
        } else {
            cut = new Cut.BelowValue(c);
        }
        if (boundType2 == boundType3) {
            cut2 = new Cut.BelowValue(c2);
        } else {
            cut2 = new Cut.AboveValue(c2);
        }
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c, BoundType boundType) {
        int ordinal = boundType.ordinal();
        if (ordinal == 0) {
            return new Range<>(Cut.BelowAll.access$000(), new Cut.BelowValue(c));
        }
        if (ordinal == 1) {
            return new Range<>(Cut.BelowAll.access$000(), new Cut.AboveValue(c));
        }
        throw new AssertionError();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.common.collect.Range<C extends java.lang.Comparable> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(Object obj) {
        return contains((Comparable) obj);
    }

    public boolean contains(C c) {
        c.getClass();
        return this.lowerBound.isLessThan(c) && !this.upperBound.isLessThan(c);
    }

    @Override // java.lang.Object, com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.lowerBound.equals(range.lowerBound) || !this.upperBound.equals(range.upperBound)) {
            return false;
        }
        return true;
    }

    public boolean hasLowerBound() {
        return this.lowerBound != Cut.BelowAll.access$000();
    }

    public boolean hasUpperBound() {
        return this.upperBound != Cut.AboveAll.access$100();
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        int compareTo = this.lowerBound.compareTo((Cut) range.lowerBound);
        int compareTo2 = this.upperBound.compareTo((Cut) range.upperBound);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return range;
        }
        return new Range<>(compareTo >= 0 ? this.lowerBound : range.lowerBound, compareTo2 <= 0 ? this.upperBound : range.upperBound);
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public BoundType lowerBoundType() {
        return this.lowerBound.typeAsLowerBound();
    }

    public C lowerEndpoint() {
        return this.lowerBound.endpoint();
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        Range<Comparable> range = ALL;
        return equals(range) ? range : this;
    }

    @Override // java.lang.Object
    public String toString() {
        Cut<C> cut = this.lowerBound;
        Cut<C> cut2 = this.upperBound;
        StringBuilder sb = new StringBuilder(16);
        cut.describeAsLowerBound(sb);
        sb.append("..");
        cut2.describeAsUpperBound(sb);
        return sb.toString();
    }

    public BoundType upperBoundType() {
        return this.upperBound.typeAsUpperBound();
    }

    public C upperEndpoint() {
        return this.upperBound.endpoint();
    }
}
