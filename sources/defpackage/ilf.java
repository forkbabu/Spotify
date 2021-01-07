package defpackage;

/* renamed from: ilf  reason: default package */
abstract class ilf<E> extends llf<E> {
    private static final long o;
    private volatile long n;

    static {
        try {
            o = ulf.a.objectFieldOffset(ilf.class.getDeclaredField("n"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public ilf(int i) {
        super(i);
        this.n = (long) i;
    }

    /* access modifiers changed from: protected */
    public final long e() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final void f(long j) {
        ulf.a.putOrderedLong(this, o, j);
    }
}
