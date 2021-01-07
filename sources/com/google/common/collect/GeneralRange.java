package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final T lowerEndpoint;
    private final BoundType upperBoundType;
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator2, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        comparator2.getClass();
        this.comparator = comparator2;
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        boundType.getClass();
        this.lowerBoundType = boundType;
        this.upperEndpoint = t2;
        boundType2.getClass();
        this.upperBoundType = boundType2;
        if (z) {
            comparator2.compare(t, t);
        }
        if (z2) {
            comparator2.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator2.compare(t, t2);
            boolean z3 = true;
            MoreObjects.checkArgument(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                MoreObjects.checkArgument((boundType != boundType3) | (boundType2 == boundType3 ? false : z3));
            }
        }
    }

    static <T> GeneralRange<T> all(Comparator<? super T> comparator2) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator2, false, null, boundType, false, null, boundType);
    }

    static <T> GeneralRange<T> downTo(Comparator<? super T> comparator2, T t, BoundType boundType) {
        return new GeneralRange<>(comparator2, true, t, boundType, false, null, BoundType.OPEN);
    }

    static <T> GeneralRange<T> upTo(Comparator<? super T> comparator2, T t, BoundType boundType) {
        return new GeneralRange<>(comparator2, false, null, BoundType.OPEN, true, t, boundType);
    }

    /* access modifiers changed from: package-private */
    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    /* access modifiers changed from: package-private */
    public boolean contains(T t) {
        return !tooLow(t) && !tooHigh(t);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        if (!this.comparator.equals(generalRange.comparator) || this.hasLowerBound != generalRange.hasLowerBound || this.hasUpperBound != generalRange.hasUpperBound || !this.lowerBoundType.equals(generalRange.lowerBoundType) || !this.upperBoundType.equals(generalRange.upperBoundType) || !rw.equal(this.lowerEndpoint, generalRange.lowerEndpoint) || !rw.equal(this.upperEndpoint, generalRange.upperEndpoint)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    /* access modifiers changed from: package-private */
    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    /* access modifiers changed from: package-private */
    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    /* access modifiers changed from: package-private */
    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    /* access modifiers changed from: package-private */
    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    /* access modifiers changed from: package-private */
    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.comparator, this.lowerEndpoint, this.lowerBoundType, this.upperEndpoint, this.upperBoundType});
    }

    /* access modifiers changed from: package-private */
    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
        BoundType boundType;
        BoundType boundType2;
        T t;
        int compare;
        int compare2;
        int compare3;
        BoundType boundType3 = BoundType.OPEN;
        MoreObjects.checkArgument(this.comparator.equals(generalRange.comparator));
        boolean z = this.hasLowerBound;
        T t2 = this.lowerEndpoint;
        BoundType boundType4 = this.lowerBoundType;
        if (!z) {
            z = generalRange.hasLowerBound;
            t2 = generalRange.lowerEndpoint;
            boundType4 = generalRange.lowerBoundType;
        } else if (generalRange.hasLowerBound && ((compare3 = this.comparator.compare(t2, generalRange.lowerEndpoint)) < 0 || (compare3 == 0 && generalRange.lowerBoundType == boundType3))) {
            t2 = generalRange.lowerEndpoint;
            boundType4 = generalRange.lowerBoundType;
        }
        boolean z2 = this.hasUpperBound;
        T t3 = this.upperEndpoint;
        BoundType boundType5 = this.upperBoundType;
        if (!z2) {
            z2 = generalRange.hasUpperBound;
            t3 = generalRange.upperEndpoint;
            boundType5 = generalRange.upperBoundType;
        } else if (generalRange.hasUpperBound && ((compare2 = this.comparator.compare(t3, generalRange.upperEndpoint)) > 0 || (compare2 == 0 && generalRange.upperBoundType == boundType3))) {
            t3 = generalRange.upperEndpoint;
            boundType5 = generalRange.upperBoundType;
        }
        if (!z || !z2 || ((compare = this.comparator.compare(t2, t3)) <= 0 && !(compare == 0 && boundType4 == boundType3 && boundType5 == boundType3))) {
            t = t2;
            boundType2 = boundType4;
            boundType = boundType5;
        } else {
            boundType = BoundType.CLOSED;
            boundType2 = boundType3;
            t = t3;
        }
        return new GeneralRange<>(this.comparator, z, t, boundType2, z2, t3, boundType);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comparator);
        sb.append(":");
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        sb.append(boundType == boundType2 ? '[' : '(');
        sb.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        sb.append(',');
        sb.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        sb.append(this.upperBoundType == boundType2 ? ']' : ')');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean tooHigh(T t) {
        boolean z = false;
        if (!this.hasUpperBound) {
            return false;
        }
        int compare = this.comparator.compare(t, this.upperEndpoint);
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (this.upperBoundType == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    /* access modifiers changed from: package-private */
    public boolean tooLow(T t) {
        boolean z = false;
        if (!this.hasLowerBound) {
            return false;
        }
        int compare = this.comparator.compare(t, this.lowerEndpoint);
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (this.lowerBoundType == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }
}
