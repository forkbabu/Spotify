package com.google.android.gms.internal.recaptcha;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class i1<T> implements q1<T> {
    private static final int[] m = new int[0];
    private static final Unsafe n = k2.p();
    private final int[] a;
    private final Object[] b;
    private final f1 c;
    private final boolean d;
    private final int[] e;
    private final int f;
    private final int g;
    private final j1 h;
    private final r0 i;
    private final e2<?, ?> j;
    private final b0<?> k;
    private final z0 l;

    /* JADX WARN: Incorrect args count in method signature: ([I[Ljava/lang/Object;IILcom/google/android/gms/internal/recaptcha/f1;ZZ[IIILcom/google/android/gms/internal/recaptcha/j1;Lcom/google/android/gms/internal/recaptcha/r0;Lcom/google/android/gms/internal/recaptcha/e2<**>;Lcom/google/android/gms/internal/recaptcha/b0<*>;Lcom/google/android/gms/internal/recaptcha/z0;)V */
    private i1(int[] iArr, Object[] objArr, int i2, int i3, f1 f1Var, boolean z, int[] iArr2, int i4, int i5, j1 j1Var, r0 r0Var, e2 e2Var, b0 b0Var, z0 z0Var) {
        this.a = iArr;
        this.b = objArr;
        boolean z2 = f1Var instanceof g0;
        this.d = b0Var != null && b0Var.b(f1Var);
        this.e = iArr2;
        this.f = i4;
        this.g = i5;
        this.h = j1Var;
        this.i = r0Var;
        this.j = e2Var;
        this.k = b0Var;
        this.c = f1Var;
        this.l = z0Var;
    }

    /* JADX WARN: Incorrect args count in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Lcom/google/android/gms/internal/recaptcha/d1;Lcom/google/android/gms/internal/recaptcha/j1;Lcom/google/android/gms/internal/recaptcha/r0;Lcom/google/android/gms/internal/recaptcha/e2<**>;Lcom/google/android/gms/internal/recaptcha/b0<*>;Lcom/google/android/gms/internal/recaptcha/z0;)Lcom/google/android/gms/internal/recaptcha/i1<TT;>; */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0342  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.recaptcha.i1 a(com.google.android.gms.internal.recaptcha.d1 r33, com.google.android.gms.internal.recaptcha.j1 r34, com.google.android.gms.internal.recaptcha.r0 r35, com.google.android.gms.internal.recaptcha.e2 r36, com.google.android.gms.internal.recaptcha.b0 r37, com.google.android.gms.internal.recaptcha.z0 r38) {
        /*
        // Method dump skipped, instructions count: 1042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.i1.a(com.google.android.gms.internal.recaptcha.d1, com.google.android.gms.internal.recaptcha.j1, com.google.android.gms.internal.recaptcha.r0, com.google.android.gms.internal.recaptcha.e2, com.google.android.gms.internal.recaptcha.b0, com.google.android.gms.internal.recaptcha.z0):com.google.android.gms.internal.recaptcha.i1");
    }

    private final q1 e(int i2) {
        int i3 = (i2 / 3) << 1;
        q1 q1Var = (q1) this.b[i3];
        if (q1Var != null) {
            return q1Var;
        }
        q1<T> b2 = p1.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b2;
        return b2;
    }

    private static Field h(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw new RuntimeException(je.I0(je.U0(je.N0(arrays, name.length() + je.N0(str, 40)), "Field ", str, " for ", name), " not found. Known fields are ", arrays));
        }
    }

    private final void i(T t, T t2, int i2) {
        long j2 = (long) (this.a[i2 + 1] & 1048575);
        if (j(t2, i2)) {
            Object v = k2.v(t, j2);
            Object v2 = k2.v(t2, j2);
            if (v != null && v2 != null) {
                k2.h(t, j2, i0.b(v, v2));
                m(t, i2);
            } else if (v2 != null) {
                k2.h(t, j2, v2);
                m(t, i2);
            }
        }
    }

    private final boolean j(T t, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 == 1048575) {
            int i4 = iArr[i2 + 1];
            long j3 = (long) (i4 & 1048575);
            switch ((i4 & 267386880) >>> 20) {
                case 0:
                    return k2.u(t, j3) != 0.0d;
                case 1:
                    return k2.s(t, j3) != 0.0f;
                case 2:
                    return k2.l(t, j3) != 0;
                case 3:
                    return k2.l(t, j3) != 0;
                case 4:
                    return k2.b(t, j3) != 0;
                case 5:
                    return k2.l(t, j3) != 0;
                case 6:
                    return k2.b(t, j3) != 0;
                case 7:
                    return k2.r(t, j3);
                case 8:
                    Object v = k2.v(t, j3);
                    if (v instanceof String) {
                        return !((String) v).isEmpty();
                    }
                    if (v instanceof zzct) {
                        return !zzct.a.equals(v);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return k2.v(t, j3) != null;
                case 10:
                    return !zzct.a.equals(k2.v(t, j3));
                case 11:
                    return k2.b(t, j3) != 0;
                case 12:
                    return k2.b(t, j3) != 0;
                case 13:
                    return k2.b(t, j3) != 0;
                case 14:
                    return k2.l(t, j3) != 0;
                case 15:
                    return k2.b(t, j3) != 0;
                case 16:
                    return k2.l(t, j3) != 0;
                case 17:
                    return k2.v(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (k2.b(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
    }

    private final boolean k(T t, int i2, int i3) {
        return k2.b(t, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    private final boolean l(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return j(t, i2);
        }
        return (i4 & i5) != 0;
    }

    private final void m(T t, int i2) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            k2.f(t, j2, (1 << (i3 >>> 20)) | k2.b(t, j2));
        }
    }

    private final void n(T t, int i2, int i3) {
        k2.f(t, (long) (this.a[i3 + 2] & 1048575), i2);
    }

    private final void o(T t, T t2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (k(t2, i4, i2)) {
            Object v = k2.v(t, j2);
            Object v2 = k2.v(t2, j2);
            if (v != null && v2 != null) {
                k2.h(t, j2, i0.b(v, v2));
                n(t, i4, i2);
            } else if (v2 != null) {
                k2.h(t, j2, v2);
                n(t, i4, i2);
            }
        }
    }

    private final boolean p(T t, T t2, int i2) {
        return j(t, i2) == j(t2, i2);
    }

    private final int q(int i2) {
        return this.a[i2 + 1];
    }

    private static <T> int r(T t, long j2) {
        return ((Integer) k2.v(t, j2)).intValue();
    }

    private final int s(int i2) {
        return this.a[i2 + 2];
    }

    private static <T> long t(T t, long j2) {
        return ((Long) k2.v(t, j2)).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        if (r3 != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ed, code lost:
        if (r3 != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f0, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f2, code lost:
        r2 = r2 + r8;
     */
    @Override // com.google.android.gms.internal.recaptcha.q1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(T r10) {
        /*
        // Method dump skipped, instructions count: 752
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.i1.b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.recaptcha.q1
    public final void c(T t) {
        int i2;
        int i3 = this.f;
        while (true) {
            i2 = this.g;
            if (i3 >= i2) {
                break;
            }
            long q = (long) (q(this.e[i3]) & 1048575);
            Object v = k2.v(t, q);
            if (v != null) {
                k2.h(t, q, this.l.e(v));
            }
            i3++;
        }
        int length = this.e.length;
        while (i2 < length) {
            this.i.d(t, (long) this.e[i2]);
            i2++;
        }
        this.j.d(t);
        if (this.d) {
            this.k.d(t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.recaptcha.r1.d(com.google.android.gms.internal.recaptcha.k2.v(r10, r6), com.google.android.gms.internal.recaptcha.k2.v(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.l(r10, r6) == com.google.android.gms.internal.recaptcha.k2.l(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.b(r10, r6) == com.google.android.gms.internal.recaptcha.k2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.l(r10, r6) == com.google.android.gms.internal.recaptcha.k2.l(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.b(r10, r6) == com.google.android.gms.internal.recaptcha.k2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.b(r10, r6) == com.google.android.gms.internal.recaptcha.k2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.b(r10, r6) == com.google.android.gms.internal.recaptcha.k2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.recaptcha.r1.d(com.google.android.gms.internal.recaptcha.k2.v(r10, r6), com.google.android.gms.internal.recaptcha.k2.v(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.recaptcha.r1.d(com.google.android.gms.internal.recaptcha.k2.v(r10, r6), com.google.android.gms.internal.recaptcha.k2.v(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.recaptcha.r1.d(com.google.android.gms.internal.recaptcha.k2.v(r10, r6), com.google.android.gms.internal.recaptcha.k2.v(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.r(r10, r6) == com.google.android.gms.internal.recaptcha.k2.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.b(r10, r6) == com.google.android.gms.internal.recaptcha.k2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.l(r10, r6) == com.google.android.gms.internal.recaptcha.k2.l(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.b(r10, r6) == com.google.android.gms.internal.recaptcha.k2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.l(r10, r6) == com.google.android.gms.internal.recaptcha.k2.l(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.recaptcha.k2.l(r10, r6) == com.google.android.gms.internal.recaptcha.k2.l(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.recaptcha.k2.s(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.recaptcha.k2.s(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.recaptcha.k2.u(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.recaptcha.k2.u(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.recaptcha.r1.d(com.google.android.gms.internal.recaptcha.k2.v(r10, r6), com.google.android.gms.internal.recaptcha.k2.v(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // com.google.android.gms.internal.recaptcha.q1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 640
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.i1.d(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.google.android.gms.internal.recaptcha.q1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: com.google.android.gms.internal.recaptcha.q1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: com.google.android.gms.internal.recaptcha.q1 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.recaptcha.q1
    public final boolean f(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.f) {
                return !this.d || this.k.a(t).l();
            }
            int i7 = this.e[i6];
            int i8 = this.a[i7];
            int q = q(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = n.getInt(t, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & q) != 0) && !l(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & q) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (k(t, i8, i7) && !e(i7).f(k2.v(t, (long) (q & 1048575)))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !this.l.c(k2.v(t, (long) (q & 1048575))).isEmpty()) {
                            this.l.g(this.b[(i7 / 3) << 1]);
                            throw null;
                        }
                    }
                }
                List list = (List) k2.v(t, (long) (q & 1048575));
                if (!list.isEmpty()) {
                    q1 e2 = e(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!e2.f(list.get(i13))) {
                            z = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (l(t, i7, i3, i2, i11) && !e(i7).f(k2.v(t, (long) (q & 1048575)))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.q1
    public final void g(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.a.length; i2 += 3) {
            int q = q(i2);
            long j2 = (long) (1048575 & q);
            int i3 = this.a[i2];
            switch ((q & 267386880) >>> 20) {
                case 0:
                    if (j(t2, i2)) {
                        k2.d(t, j2, k2.u(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (j(t2, i2)) {
                        k2.e(t, j2, k2.s(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (j(t2, i2)) {
                        k2.g(t, j2, k2.l(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (j(t2, i2)) {
                        k2.g(t, j2, k2.l(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (j(t2, i2)) {
                        k2.f(t, j2, k2.b(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (j(t2, i2)) {
                        k2.g(t, j2, k2.l(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (j(t2, i2)) {
                        k2.f(t, j2, k2.b(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (j(t2, i2)) {
                        k2.i(t, j2, k2.r(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (j(t2, i2)) {
                        k2.h(t, j2, k2.v(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i(t, t2, i2);
                    break;
                case 10:
                    if (j(t2, i2)) {
                        k2.h(t, j2, k2.v(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (j(t2, i2)) {
                        k2.f(t, j2, k2.b(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (j(t2, i2)) {
                        k2.f(t, j2, k2.b(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (j(t2, i2)) {
                        k2.f(t, j2, k2.b(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (j(t2, i2)) {
                        k2.g(t, j2, k2.l(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (j(t2, i2)) {
                        k2.f(t, j2, k2.b(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (j(t2, i2)) {
                        k2.g(t, j2, k2.l(t2, j2));
                        m(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.i.b(t, t2, j2);
                    break;
                case 50:
                    z0 z0Var = this.l;
                    int i4 = r1.e;
                    k2.h(t, j2, z0Var.d(k2.v(t, j2), k2.v(t2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (k(t2, i3, i2)) {
                        k2.h(t, j2, k2.v(t2, j2));
                        n(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    o(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (k(t2, i3, i2)) {
                        k2.h(t, j2, k2.v(t2, j2));
                        n(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    o(t, t2, i2);
                    break;
            }
        }
        e2<?, ?> e2Var = this.j;
        int i5 = r1.e;
        e2Var.a(t, e2Var.c(e2Var.b(t), e2Var.b(t2)));
        if (this.d) {
            b0<?> b0Var = this.k;
            c0<?> a2 = b0Var.a(t2);
            if (!a2.a.isEmpty()) {
                b0Var.c(t).d(a2);
            }
        }
    }
}
