package org.apache.commons.lang3.tuple;

public final class ImmutableTriple<L, M, R> extends Triple<L, M, R> {
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    public ImmutableTriple(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public L d() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public M g() {
        return this.middle;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public R h() {
        return this.right;
    }
}
