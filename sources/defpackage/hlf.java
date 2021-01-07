package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: hlf  reason: default package */
public abstract class hlf<E> extends klf<E> {
    private static final long q;
    protected long p;

    static {
        try {
            q = ulf.a.objectFieldOffset(hlf.class.getDeclaredField("p"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public hlf(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final long h() {
        return ulf.a.getLongVolatile(this, q);
    }

    /* access modifiers changed from: protected */
    public void i(long j) {
        ulf.a.putOrderedLong(this, q, j);
    }
}
