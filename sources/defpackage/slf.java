package defpackage;

/* renamed from: slf  reason: default package */
public final class slf {
    static final int a;
    private static final long b = rlf.b;
    private static final int c;

    static {
        int intValue = Integer.getInteger("io.netty.util.internal.shaded.org.jctools.sparse.shift", 0).intValue();
        a = intValue;
        c = vlf.b + intValue;
    }

    public static long a(long j, long j2) {
        return b + ((j & j2) << c);
    }
}
