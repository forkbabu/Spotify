package defpackage;

import java.lang.reflect.Field;
import java.util.Iterator;
import sun.misc.Unsafe;

/* renamed from: nlf  reason: default package */
public class nlf<E> extends plf<E> {
    private static final long s;
    private static final long t;
    private static final long u;
    private static final Object v = new Object();

    static {
        try {
            Field declaredField = qlf.class.getDeclaredField("a");
            Unsafe unsafe = ulf.a;
            s = unsafe.objectFieldOffset(declaredField);
            try {
                t = unsafe.objectFieldOffset(plf.class.getDeclaredField("r"));
                try {
                    u = unsafe.objectFieldOffset(olf.class.getDeclaredField("n"));
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    public nlf(int i, int i2, boolean z) {
        if (i < 2) {
            throw new IllegalArgumentException("Initial capacity must be 2 or more");
        } else if (i2 < 4) {
            throw new IllegalArgumentException("Max capacity must be 4 or more");
        } else if (yif.L(i) < yif.L(i2)) {
            int L = yif.L(i);
            long j = (long) ((L - 1) << 1);
            E[] eArr = (E[]) new Object[(L + 1)];
            this.f = eArr;
            this.c = j;
            this.q = eArr;
            this.p = j;
            this.b = ((long) yif.L(i2)) << 1;
            this.o = z;
            l(j);
        } else {
            throw new IllegalArgumentException("Initial capacity cannot exceed maximum capacity(both rounded up to a power of 2)");
        }
    }

    private boolean c(long j, long j2) {
        return ulf.a.compareAndSwapLong(this, s, j, j2);
    }

    private boolean d(long j, long j2) {
        return ulf.a.compareAndSwapLong(this, u, j, j2);
    }

    private E[] e(E[] eArr, long j) {
        long i = i(j + 2, Long.MAX_VALUE);
        E[] eArr2 = (E[]) ((Object[]) vlf.a(eArr, i));
        vlf.b(eArr, i, null);
        return eArr2;
    }

    private long f() {
        return ulf.a.getLongVolatile(this, t);
    }

    private long h() {
        return ulf.a.getLongVolatile(this, s);
    }

    private static long i(long j, long j2) {
        return vlf.a + ((j & j2) << (vlf.b - 1));
    }

    private void j(long j) {
        ulf.a.putOrderedLong(this, t, j);
    }

    private void k(long j) {
        ulf.a.putOrderedLong(this, s, j);
    }

    private void l(long j) {
        ulf.a.putOrderedLong(this, u, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0007 A[SYNTHETIC] */
    @Override // java.util.Queue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean offer(E r21) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlf.offer(java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @Override // java.util.Queue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E peek() {
        /*
            r11 = this;
            E[] r0 = r11.q
            long r1 = r11.r
            long r3 = r11.p
            long r5 = i(r1, r3)
            java.lang.Object r7 = defpackage.vlf.a(r0, r5)
            if (r7 != 0) goto L_0x001f
            long r8 = r11.h()
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x001f
        L_0x0018:
            java.lang.Object r7 = defpackage.vlf.a(r0, r5)
            if (r7 != 0) goto L_0x001f
            goto L_0x0018
        L_0x001f:
            java.lang.Object r5 = defpackage.nlf.v
            if (r7 != r5) goto L_0x0044
            java.lang.Object[] r0 = r11.e(r0, r3)
            r11.q = r0
            int r3 = r0.length
            int r3 = r3 + -2
            int r3 = r3 << 1
            long r3 = (long) r3
            r11.p = r3
            long r1 = i(r1, r3)
            java.lang.Object r0 = defpackage.vlf.a(r0, r1)
            if (r0 == 0) goto L_0x003c
            return r0
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "new buffer must have at least one element"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlf.peek():java.lang.Object");
    }

    @Override // java.util.Queue
    public E poll() {
        E[] eArr = this.q;
        long j = this.r;
        long j2 = this.p;
        long i = i(j, j2);
        E e = (E) vlf.a(eArr, i);
        if (e == null) {
            if (j == h()) {
                return null;
            }
            do {
                e = (E) vlf.a(eArr, i);
            } while (e == null);
        }
        if (e == v) {
            E[] e2 = e(eArr, j2);
            this.q = e2;
            long length = (long) ((e2.length - 2) << 1);
            this.p = length;
            long i2 = i(j, length);
            E e3 = (E) vlf.a(e2, i2);
            if (e3 != null) {
                vlf.b(e2, i2, null);
                j(j + 2);
                return e3;
            }
            throw new IllegalStateException("new buffer must have at least one element");
        }
        vlf.b(eArr, i, null);
        j(j + 2);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long f = f();
        while (true) {
            long h = h();
            long f2 = f();
            if (f == f2) {
                return ((int) (h - f2)) >> 1;
            }
            f = f2;
        }
    }
}
