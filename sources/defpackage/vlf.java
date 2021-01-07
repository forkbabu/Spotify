package defpackage;

import sun.misc.Unsafe;

/* renamed from: vlf  reason: default package */
public final class vlf {
    public static final long a;
    public static final int b;

    static {
        Unsafe unsafe = ulf.a;
        int arrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            b = 2;
        } else if (8 == arrayIndexScale) {
            b = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        a = (long) unsafe.arrayBaseOffset(Object[].class);
    }

    public static <E> E a(E[] eArr, long j) {
        return (E) ulf.a.getObjectVolatile(eArr, j);
    }

    public static <E> void b(E[] eArr, long j, E e) {
        ulf.a.putOrderedObject(eArr, j, e);
    }

    public static <E> void c(E[] eArr, long j, E e) {
        ulf.a.putObject(eArr, j, (Object) null);
    }
}
