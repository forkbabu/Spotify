package io.netty.util.internal;

import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import io.netty.util.internal.chmv8.LongAdderV8;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;
import sun.misc.Unsafe;

public final class PlatformDependent {
    private static final b a = c.b(PlatformDependent.class.getName());
    private static final Pattern b = Pattern.compile("\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$");
    private static final boolean c;
    private static final boolean d;
    private static final int e;
    private static final boolean f;
    private static final boolean g;
    private static final boolean h;
    private static final boolean i;
    private static final boolean j;
    private static final long k = L();
    private static final long l = n.c();
    private static final boolean m;
    private static final boolean n;
    private static final AtomicLong o;
    private static final long p;
    public static final boolean q = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    private static final class AtomicLongCounter extends AtomicLong implements g {
        private static final long serialVersionUID = 4074772784610639305L;

        AtomicLongCounter(m mVar) {
        }

        @Override // io.netty.util.internal.g
        public void a() {
            incrementAndGet();
        }

        @Override // io.netty.util.internal.g
        public void b(long j) {
            addAndGet(j);
        }
    }

    /* access modifiers changed from: private */
    public static final class a {
        private static final boolean a;

        /* renamed from: io.netty.util.internal.PlatformDependent$a$a  reason: collision with other inner class name */
        static class C0606a implements PrivilegedAction<Object> {
            C0606a() {
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return ulf.a;
            }
        }

        static {
            if ((PlatformDependent.z() ? AccessController.doPrivileged(new C0606a()) : null) == null) {
                PlatformDependent.a.p("org.jctools-core.MpscChunkedArrayQueue: unavailable");
                a = false;
                return;
            }
            PlatformDependent.a.p("org.jctools-core.MpscChunkedArrayQueue: available");
            a = true;
        }

        static <T> Queue<T> a(int i) {
            if (a) {
                return new nlf(1024, Math.max(Math.min(i, 1073741824), 2048), true);
            }
            return new io.netty.util.internal.shaded.org.jctools.queues.atomic.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016a A[Catch:{ all -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0173 A[Catch:{ all -> 0x01fb }] */
    static {
        /*
        // Method dump skipped, instructions count: 841
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.PlatformDependent.<clinit>():void");
    }

    private PlatformDependent() {
    }

    public static int A(CharSequence charSequence) {
        int i2;
        int i3;
        int length = charSequence.length() & 7;
        int i4 = -1028477387;
        switch (charSequence.length()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i4 = C(charSequence, charSequence.length() - 8, -1028477387);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i4 = C(charSequence, charSequence.length() - 16, C(charSequence, charSequence.length() - 8, -1028477387));
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                i4 = C(charSequence, charSequence.length() - 24, C(charSequence, charSequence.length() - 16, C(charSequence, charSequence.length() - 8, -1028477387)));
                break;
            default:
                int length2 = charSequence.length();
                while (true) {
                    length2 -= 8;
                    if (length2 < length) {
                        break;
                    } else {
                        i4 = C(charSequence, length2, i4);
                    }
                }
        }
        switch (length) {
            case 1:
                return (i4 * 461845907) + (charSequence.charAt(0) & 31);
            case 2:
                i3 = i4 * 461845907;
                i2 = E(charSequence, 0);
                break;
            case 3:
                i3 = ((i4 * 461845907) + (charSequence.charAt(0) & 31)) * 461845907;
                i2 = E(charSequence, 1);
                break;
            case 4:
                i3 = i4 * 461845907;
                i2 = D(charSequence, 0);
                break;
            case 5:
                i3 = ((i4 * 461845907) + (charSequence.charAt(0) & 31)) * 461845907;
                i2 = D(charSequence, 1);
                break;
            case 6:
                i3 = ((i4 * 461845907) + E(charSequence, 0)) * 461845907;
                i2 = D(charSequence, 2);
                break;
            case 7:
                i3 = ((((i4 * 461845907) + (charSequence.charAt(0) & 31)) * 461845907) + E(charSequence, 1)) * 461845907;
                i2 = D(charSequence, 3);
                break;
            default:
                return i4;
        }
        return i3 + i2;
    }

    public static int B(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        short s;
        int i6;
        long j2;
        long j3;
        if (h && n.K()) {
            return n.t(bArr, i2, i3);
        }
        int i7 = i3 & 7;
        int i8 = i2 + i7;
        int i9 = -1028477387;
        for (int i10 = (i2 - 8) + i3; i10 >= i8; i10 -= 8) {
            if (q) {
                j3 = ((((long) bArr[i10 + 1]) & 255) << 48) | (((long) bArr[i10]) << 56) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
                j2 = ((long) bArr[i10 + 7]) & 255;
            } else {
                j3 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
                j2 = (((long) bArr[i10 + 7]) & 255) << 56;
            }
            i9 = n.u(j3 | j2, i9);
        }
        switch (i7) {
            case 1:
                i4 = i9 * 461845907;
                byte b2 = bArr[i2];
                Unsafe unsafe = n.b;
                i5 = b2 & 31;
                i9 = i4 + i5;
                return i9;
            case 2:
                i4 = i9 * 461845907;
                s = w(bArr, i2);
                i5 = s & 7967;
                i9 = i4 + i5;
                return i9;
            case 3:
                byte b3 = bArr[i2];
                Unsafe unsafe2 = n.b;
                i4 = ((i9 * 461845907) + (b3 & 31)) * 461845907;
                s = w(bArr, i2 + 1);
                i5 = s & 7967;
                i9 = i4 + i5;
                return i9;
            case 4:
                i4 = i9 * 461845907;
                i6 = r(bArr, i2);
                i5 = i6 & 522133279;
                i9 = i4 + i5;
                return i9;
            case 5:
                byte b4 = bArr[i2];
                Unsafe unsafe3 = n.b;
                i4 = ((i9 * 461845907) + (b4 & 31)) * 461845907;
                i6 = r(bArr, i2 + 1);
                i5 = i6 & 522133279;
                i9 = i4 + i5;
                return i9;
            case 6:
                i4 = ((i9 * 461845907) + (w(bArr, i2) & 7967)) * 461845907;
                i6 = r(bArr, i2 + 2);
                i5 = i6 & 522133279;
                i9 = i4 + i5;
                return i9;
            case 7:
                byte b5 = bArr[i2];
                Unsafe unsafe4 = n.b;
                i4 = ((((i9 * 461845907) + (b5 & 31)) * 461845907) + (w(bArr, i2 + 1) & 7967)) * 461845907;
                i6 = r(bArr, i2 + 3);
                i5 = i6 & 522133279;
                i9 = i4 + i5;
                return i9;
            default:
                return i9;
        }
    }

    private static int C(CharSequence charSequence, int i2, int i3) {
        return (D(charSequence, i2) * 461845907) + (i3 * 461845907) + D(charSequence, i2 + 4);
    }

    private static int D(CharSequence charSequence, int i2) {
        int charAt;
        int charAt2;
        if (q) {
            charAt = (charSequence.charAt(i2) & 31) | ((charSequence.charAt(i2 + 2) & 31) << 8) | ((charSequence.charAt(i2 + 1) & 31) << 16);
            charAt2 = (charSequence.charAt(i2) & 31) << 24;
        } else {
            charAt = ((charSequence.charAt(i2 + 3) & 31) << 24) | ((charSequence.charAt(i2 + 2) & 31) << 16) | ((charSequence.charAt(i2 + 1) & 31) << 8);
            charAt2 = charSequence.charAt(i2) & 31;
        }
        return charAt2 | charAt;
    }

    private static int E(CharSequence charSequence, int i2) {
        int i3;
        int i4;
        if (q) {
            i4 = charSequence.charAt(i2 + 1) & 31;
            i3 = (charSequence.charAt(i2) & 31) << 8;
        } else {
            i4 = (charSequence.charAt(i2 + 1) & 31) << 8;
            i3 = charSequence.charAt(i2) & 31;
        }
        return i3 | i4;
    }

    private static void F(int i2) {
        AtomicLong atomicLong;
        long j2;
        long j3;
        if (o != null) {
            do {
                atomicLong = o;
                j2 = atomicLong.get();
                j3 = ((long) i2) + j2;
                long j4 = p;
                if (j3 > j4) {
                    throw new OutOfDirectMemoryError("failed to allocate " + i2 + " byte(s) of direct memory (used: " + j2 + ", max: " + j4 + ')');
                }
            } while (!atomicLong.compareAndSet(j2, j3));
        }
    }

    public static boolean G() {
        return c;
    }

    public static boolean H() {
        return n.v();
    }

    public static boolean I() {
        return d;
    }

    public static int J() {
        return e;
    }

    public static long K() {
        return k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r0 != 'm') goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long L() {
        /*
            r0 = 0
            r1 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "sun.misc.VM"
            java.lang.ClassLoader r6 = x()     // Catch:{ all -> 0x0024 }
            java.lang.Class r5 = java.lang.Class.forName(r5, r3, r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r6 = "maxDirectMemory"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x0024 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ all -> 0x0024 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0024 }
            java.lang.Object r5 = r5.invoke(r0, r6)     // Catch:{ all -> 0x0024 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0024 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x002a
            return r5
        L_0x002a:
            java.lang.String r7 = "java.lang.management.ManagementFactory"
            java.lang.ClassLoader r8 = x()     // Catch:{ all -> 0x00af }
            java.lang.Class r7 = java.lang.Class.forName(r7, r3, r8)     // Catch:{ all -> 0x00af }
            java.lang.String r8 = "java.lang.management.RuntimeMXBean"
            java.lang.ClassLoader r9 = x()     // Catch:{ all -> 0x00af }
            java.lang.Class r8 = java.lang.Class.forName(r8, r3, r9)     // Catch:{ all -> 0x00af }
            java.lang.String r9 = "getRuntimeMXBean"
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x00af }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r9, r10)     // Catch:{ all -> 0x00af }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x00af }
            java.lang.Object r0 = r7.invoke(r0, r9)     // Catch:{ all -> 0x00af }
            java.lang.String r7 = "getInputArguments"
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ all -> 0x00af }
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r7, r9)     // Catch:{ all -> 0x00af }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x00af }
            java.lang.Object r0 = r7.invoke(r0, r8)     // Catch:{ all -> 0x00af }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00af }
            int r7 = r0.size()     // Catch:{ all -> 0x00af }
            int r7 = r7 - r3
        L_0x0061:
            if (r7 < 0) goto L_0x00b0
            java.util.regex.Pattern r8 = io.netty.util.internal.PlatformDependent.b     // Catch:{ all -> 0x00af }
            java.lang.Object r9 = r0.get(r7)     // Catch:{ all -> 0x00af }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x00af }
            java.util.regex.Matcher r8 = r8.matcher(r9)     // Catch:{ all -> 0x00af }
            boolean r9 = r8.matches()     // Catch:{ all -> 0x00af }
            if (r9 != 0) goto L_0x0078
            int r7 = r7 + -1
            goto L_0x0061
        L_0x0078:
            java.lang.String r0 = r8.group(r3)     // Catch:{ all -> 0x00af }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x00af }
            r0 = 2
            java.lang.String r0 = r8.group(r0)     // Catch:{ all -> 0x00af }
            char r0 = r0.charAt(r4)     // Catch:{ all -> 0x00af }
            r3 = 71
            if (r0 == r3) goto L_0x00a9
            r3 = 75
            if (r0 == r3) goto L_0x00a6
            r3 = 77
            if (r0 == r3) goto L_0x00a2
            r3 = 103(0x67, float:1.44E-43)
            if (r0 == r3) goto L_0x00a9
            r3 = 107(0x6b, float:1.5E-43)
            if (r0 == r3) goto L_0x00a6
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 == r3) goto L_0x00a2
            goto L_0x00b0
        L_0x00a2:
            r3 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x00ac
        L_0x00a6:
            r3 = 1024(0x400, double:5.06E-321)
            goto L_0x00ac
        L_0x00a9:
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
        L_0x00ac:
            long r5 = r5 * r3
            goto L_0x00b0
        L_0x00af:
        L_0x00b0:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00c8
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r5 = r0.maxMemory()
            io.netty.util.internal.logging.b r0 = io.netty.util.internal.PlatformDependent.a
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "maxDirectMemory: {} bytes (maybe)"
            r0.r(r2, r1)
            goto L_0x00d3
        L_0x00c8:
            io.netty.util.internal.logging.b r0 = io.netty.util.internal.PlatformDependent.a
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "maxDirectMemory: {} bytes"
            r0.r(r2, r1)
        L_0x00d3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.PlatformDependent.L():long");
    }

    public static <T> AtomicIntegerFieldUpdater<T> M(Class<? super T> cls, String str) {
        if (!h) {
            return null;
        }
        try {
            return new v(n.b, cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> AtomicLongFieldUpdater<T> N(Class<? super T> cls, String str) {
        if (!h) {
            return null;
        }
        try {
            return new w(n.b, cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <U, W> AtomicReferenceFieldUpdater<U, W> O(Class<? super U> cls, String str) {
        if (!h) {
            return null;
        }
        try {
            return new x(n.b, cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <K, V> ConcurrentMap<K, V> P() {
        if (i) {
            return new ConcurrentHashMapV8();
        }
        return new ConcurrentHashMap();
    }

    public static <T> Queue<T> Q(int i2) {
        return h ? new glf(i2) : new io.netty.util.internal.shaded.org.jctools.queues.atomic.a(i2);
    }

    public static g R() {
        if (h) {
            return new LongAdderV8();
        }
        return new AtomicLongCounter(null);
    }

    public static <T> Queue<T> S() {
        return a.a(1048576);
    }

    public static <T> Queue<T> T(int i2) {
        return a.a(i2);
    }

    public static void U(long j2, byte b2) {
        n.y(j2, b2);
    }

    public static void V(byte[] bArr, int i2, byte b2) {
        n.z(bArr, i2, b2);
    }

    public static void W(long j2, int i2) {
        n.A(j2, i2);
    }

    public static void X(byte[] bArr, int i2, int i3) {
        n.B(bArr, i2, i3);
    }

    public static void Y(long j2, long j3) {
        n.C(j2, j3);
    }

    public static void Z(byte[] bArr, int i2, long j2) {
        n.D(bArr, i2, j2);
    }

    public static void a0(long j2, short s) {
        n.E(j2, s);
    }

    public static ByteBuffer b(int i2) {
        F(i2);
        try {
            return n.b(i2);
        } catch (Throwable th) {
            g(i2);
            if (h) {
                n.J(th);
                return null;
            }
            throw th;
        }
    }

    public static void b0(byte[] bArr, int i2, short s) {
        n.F(bArr, i2, s);
    }

    public static boolean c() {
        return f;
    }

    public static ByteBuffer c0(ByteBuffer byteBuffer, int i2) {
        int capacity = i2 - byteBuffer.capacity();
        F(capacity);
        try {
            return n.G(byteBuffer, i2);
        } catch (Throwable th) {
            g(capacity);
            if (h) {
                n.J(th);
                return null;
            }
            throw th;
        }
    }

    public static void d(long j2, long j3, long j4) {
        n.d(j2, j3, j4);
    }

    public static void d0(long j2, long j3, byte b2) {
        n.H(j2, j3, b2);
    }

    public static void e(long j2, byte[] bArr, int i2, long j3) {
        n.e(null, j2, bArr, l + ((long) i2), j3);
    }

    public static void e0(byte[] bArr, int i2, long j2, byte b2) {
        n.I(bArr, l + ((long) i2), j2, b2);
    }

    public static void f(byte[] bArr, int i2, long j2, long j3) {
        n.e(bArr, l + ((long) i2), null, j2, j3);
    }

    public static void f0(Throwable th) {
        if (h) {
            n.J(th);
            return;
        }
        throw th;
    }

    private static void g(int i2) {
        AtomicLong atomicLong = o;
        if (atomicLong != null) {
            atomicLong.addAndGet((long) (-i2));
        }
    }

    private static File g0(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        } catch (Exception unused) {
            return file;
        }
    }

    public static long h(ByteBuffer byteBuffer) {
        return n.f(byteBuffer);
    }

    public static boolean h0() {
        return n;
    }

    public static boolean i() {
        return j;
    }

    public static boolean j(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (h && n.K()) {
            return n.g(bArr, i2, bArr2, i3, i4);
        }
        int i5 = i4 + i2;
        while (i2 < i5) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public static void k(ByteBuffer byteBuffer) {
        if (h && !c) {
            b.a(byteBuffer);
        }
    }

    public static void l(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        n.h(n.f(byteBuffer));
        g(capacity);
    }

    public static byte m(long j2) {
        return n.i(j2);
    }

    public static byte n(byte[] bArr, int i2) {
        return n.j(bArr, i2);
    }

    public static ClassLoader o(Class<?> cls) {
        Unsafe unsafe = n.b;
        if (System.getSecurityManager() == null) {
            return cls.getClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new o(cls));
    }

    public static int p(long j2) {
        return n.k(j2);
    }

    public static int q(byte[] bArr, int i2) {
        return n.l(bArr, i2);
    }

    private static int r(byte[] bArr, int i2) {
        int i3;
        int i4;
        if (q) {
            i3 = (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
            i4 = bArr[i2 + 3] & 255;
        } else {
            i3 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            i4 = bArr[i2 + 3] << 24;
        }
        return i4 | i3;
    }

    public static long s(long j2) {
        return n.m(j2);
    }

    public static long t(byte[] bArr, int i2) {
        return n.o(bArr, i2);
    }

    public static short u(long j2) {
        return n.q(j2);
    }

    public static short v(byte[] bArr, int i2) {
        return n.r(bArr, i2);
    }

    private static short w(byte[] bArr, int i2) {
        int i3;
        int i4;
        if (q) {
            i3 = bArr[i2] << 8;
            i4 = bArr[i2 + 1] & 255;
        } else {
            i3 = bArr[i2] & 255;
            i4 = bArr[i2 + 1] << 8;
        }
        return (short) (i4 | i3);
    }

    public static ClassLoader x() {
        Unsafe unsafe = n.b;
        if (System.getSecurityManager() == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new q());
    }

    public static boolean y() {
        return m;
    }

    public static boolean z() {
        return h;
    }
}
