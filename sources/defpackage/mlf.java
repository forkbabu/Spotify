package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: mlf  reason: default package */
public abstract class mlf<E> extends jlf<E> {
    private static final long f;
    private volatile long c;

    static {
        try {
            f = ulf.a.objectFieldOffset(mlf.class.getDeclaredField("c"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public mlf(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final boolean c(long j, long j2) {
        return ulf.a.compareAndSwapLong(this, f, j, j2);
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return this.c;
    }
}
