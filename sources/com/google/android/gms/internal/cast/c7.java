package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class c7<T> implements m7<T> {
    private static final int[] n = new int[0];
    private static final Unsafe o = f8.x();
    private final int[] a;
    private final Object[] b;
    private final z6 c;
    private final boolean d;
    private final boolean e;
    private final int[] f;
    private final int g;
    private final int h;
    private final d7 i;
    private final j6 j;
    private final a8<?, ?> k;
    private final i5<?> l;
    private final t6 m;

    /* JADX WARN: Incorrect args count in method signature: ([I[Ljava/lang/Object;IILcom/google/android/gms/internal/cast/z6;ZZ[IIILcom/google/android/gms/internal/cast/d7;Lcom/google/android/gms/internal/cast/j6;Lcom/google/android/gms/internal/cast/a8<**>;Lcom/google/android/gms/internal/cast/i5<*>;Lcom/google/android/gms/internal/cast/t6;)V */
    private c7(int[] iArr, Object[] objArr, int i2, int i3, z6 z6Var, boolean z, int[] iArr2, int i4, int i5, d7 d7Var, j6 j6Var, a8 a8Var, i5 i5Var, t6 t6Var) {
        this.a = iArr;
        this.b = objArr;
        boolean z2 = z6Var instanceof r5;
        this.e = z;
        this.d = i5Var != null && i5Var.d(z6Var);
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.i = d7Var;
        this.j = j6Var;
        this.k = a8Var;
        this.l = i5Var;
        this.c = z6Var;
        this.m = t6Var;
    }

    private static <T> double A(T t, long j2) {
        return ((Double) f8.B(t, j2)).doubleValue();
    }

    private static <T> float B(T t, long j2) {
        return ((Float) f8.B(t, j2)).floatValue();
    }

    private static <T> int C(T t, long j2) {
        return ((Integer) f8.B(t, j2)).intValue();
    }

    private static <T> long D(T t, long j2) {
        return ((Long) f8.B(t, j2)).longValue();
    }

    private static <T> boolean E(T t, long j2) {
        return ((Boolean) f8.B(t, j2)).booleanValue();
    }

    /* JADX WARN: Incorrect args count in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Lcom/google/android/gms/internal/cast/x6;Lcom/google/android/gms/internal/cast/d7;Lcom/google/android/gms/internal/cast/j6;Lcom/google/android/gms/internal/cast/a8<**>;Lcom/google/android/gms/internal/cast/i5<*>;Lcom/google/android/gms/internal/cast/t6;)Lcom/google/android/gms/internal/cast/c7<TT;>; */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0342  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.cast.c7 h(com.google.android.gms.internal.cast.x6 r33, com.google.android.gms.internal.cast.d7 r34, com.google.android.gms.internal.cast.j6 r35, com.google.android.gms.internal.cast.a8 r36, com.google.android.gms.internal.cast.i5 r37, com.google.android.gms.internal.cast.t6 r38) {
        /*
        // Method dump skipped, instructions count: 1042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.c7.h(com.google.android.gms.internal.cast.x6, com.google.android.gms.internal.cast.d7, com.google.android.gms.internal.cast.j6, com.google.android.gms.internal.cast.a8, com.google.android.gms.internal.cast.i5, com.google.android.gms.internal.cast.t6):com.google.android.gms.internal.cast.c7");
    }

    private static Field i(Class<?> cls, String str) {
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

    private static void j(int i2, Object obj, o8 o8Var) {
        if (obj instanceof String) {
            ((h5) o8Var).t(i2, (String) obj);
            return;
        }
        ((h5) o8Var).e(i2, (zzlb) obj);
    }

    private static <UT, UB> void k(a8<UT, UB> a8Var, T t, o8 o8Var) {
        a8Var.a(a8Var.g(t), o8Var);
    }

    private final <K, V> void l(o8 o8Var, int i2, Object obj, int i3) {
        if (obj != null) {
            ((h5) o8Var).f(i2, this.m.c(this.b[(i3 / 3) << 1]), this.m.e(obj));
        }
    }

    private final void m(T t, T t2, int i2) {
        long j2 = (long) (this.a[i2 + 1] & 1048575);
        if (n(t2, i2)) {
            Object B = f8.B(t, j2);
            Object B2 = f8.B(t2, j2);
            if (B != null && B2 != null) {
                f8.g(t, j2, v5.a(B, B2));
                q(t, i2);
            } else if (B2 != null) {
                f8.g(t, j2, B2);
                q(t, i2);
            }
        }
    }

    private final boolean n(T t, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 == 1048575) {
            int i4 = iArr[i2 + 1];
            long j3 = (long) (i4 & 1048575);
            switch ((i4 & 267386880) >>> 20) {
                case 0:
                    return f8.A(t, j3) != 0.0d;
                case 1:
                    return f8.z(t, j3) != 0.0f;
                case 2:
                    return f8.t(t, j3) != 0;
                case 3:
                    return f8.t(t, j3) != 0;
                case 4:
                    return f8.r(t, j3) != 0;
                case 5:
                    return f8.t(t, j3) != 0;
                case 6:
                    return f8.r(t, j3) != 0;
                case 7:
                    return f8.u(t, j3);
                case 8:
                    Object B = f8.B(t, j3);
                    if (B instanceof String) {
                        return !((String) B).isEmpty();
                    }
                    if (B instanceof zzlb) {
                        return !zzlb.a.equals(B);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return f8.B(t, j3) != null;
                case 10:
                    return !zzlb.a.equals(f8.B(t, j3));
                case 11:
                    return f8.r(t, j3) != 0;
                case 12:
                    return f8.r(t, j3) != 0;
                case 13:
                    return f8.r(t, j3) != 0;
                case 14:
                    return f8.t(t, j3) != 0;
                case 15:
                    return f8.r(t, j3) != 0;
                case 16:
                    return f8.t(t, j3) != 0;
                case 17:
                    return f8.B(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (f8.r(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
    }

    private final boolean o(T t, int i2, int i3) {
        return f8.r(t, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    private final boolean p(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return n(t, i2);
        }
        return (i4 & i5) != 0;
    }

    private final void q(T t, int i2) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            f8.e(t, j2, (1 << (i3 >>> 20)) | f8.r(t, j2));
        }
    }

    private final void r(T t, int i2, int i3) {
        f8.e(t, (long) (this.a[i3 + 2] & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void s(T r18, com.google.android.gms.internal.cast.o8 r19) {
        /*
        // Method dump skipped, instructions count: 1446
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.c7.s(java.lang.Object, com.google.android.gms.internal.cast.o8):void");
    }

    private final void t(T t, T t2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (o(t2, i4, i2)) {
            Object B = f8.B(t, j2);
            Object B2 = f8.B(t2, j2);
            if (B != null && B2 != null) {
                f8.g(t, j2, v5.a(B, B2));
                r(t, i4, i2);
            } else if (B2 != null) {
                f8.g(t, j2, B2);
                r(t, i4, i2);
            }
        }
    }

    private final m7 u(int i2) {
        int i3 = (i2 / 3) << 1;
        m7 m7Var = (m7) this.b[i3];
        if (m7Var != null) {
            return m7Var;
        }
        m7<T> a2 = l7.b().a((Class) this.b[i3 + 1]);
        this.b[i3] = a2;
        return a2;
    }

    private final Object v(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    private final int w(int i2) {
        return this.a[i2 + 1];
    }

    private final int x(int i2) {
        return this.a[i2 + 2];
    }

    private final boolean y(T t, T t2, int i2) {
        return n(t, i2) == n(t2, i2);
    }

    private static List<?> z(Object obj, long j2) {
        return (List) f8.B(obj, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        if (r3 != false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01db, code lost:
        if (r3 != false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01de, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e0, code lost:
        r2 = r2 + r8;
     */
    @Override // com.google.android.gms.internal.cast.m7
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r10) {
        /*
        // Method dump skipped, instructions count: 734
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.c7.a(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.cast.o7.o(com.google.android.gms.internal.cast.f8.B(r10, r6), com.google.android.gms.internal.cast.f8.B(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.cast.f8.t(r10, r6) == com.google.android.gms.internal.cast.f8.t(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.cast.f8.r(r10, r6) == com.google.android.gms.internal.cast.f8.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.cast.f8.t(r10, r6) == com.google.android.gms.internal.cast.f8.t(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.cast.f8.r(r10, r6) == com.google.android.gms.internal.cast.f8.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.cast.f8.r(r10, r6) == com.google.android.gms.internal.cast.f8.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.cast.f8.r(r10, r6) == com.google.android.gms.internal.cast.f8.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.cast.o7.o(com.google.android.gms.internal.cast.f8.B(r10, r6), com.google.android.gms.internal.cast.f8.B(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.cast.o7.o(com.google.android.gms.internal.cast.f8.B(r10, r6), com.google.android.gms.internal.cast.f8.B(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.cast.o7.o(com.google.android.gms.internal.cast.f8.B(r10, r6), com.google.android.gms.internal.cast.f8.B(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.cast.f8.u(r10, r6) == com.google.android.gms.internal.cast.f8.u(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.cast.f8.r(r10, r6) == com.google.android.gms.internal.cast.f8.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.cast.f8.t(r10, r6) == com.google.android.gms.internal.cast.f8.t(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.cast.f8.r(r10, r6) == com.google.android.gms.internal.cast.f8.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.cast.f8.t(r10, r6) == com.google.android.gms.internal.cast.f8.t(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.cast.f8.t(r10, r6) == com.google.android.gms.internal.cast.f8.t(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.cast.f8.z(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.cast.f8.z(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.cast.f8.A(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.cast.f8.A(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.cast.o7.o(com.google.android.gms.internal.cast.f8.B(r10, r6), com.google.android.gms.internal.cast.f8.B(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // com.google.android.gms.internal.cast.m7
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 640
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.c7.b(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final int c(T t) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.e) {
            Unsafe unsafe = o;
            int i11 = 0;
            for (int i12 = 0; i12 < this.a.length; i12 += 3) {
                int w = w(i12);
                int i13 = (w & 267386880) >>> 20;
                int i14 = this.a[i12];
                long j2 = (long) (w & 1048575);
                if (i13 >= zzly.DOUBLE_LIST_PACKED.d() && i13 <= zzly.SINT64_LIST_PACKED.d()) {
                    int i15 = this.a[i12 + 2];
                }
                switch (i13) {
                    case 0:
                        if (n(t, i12)) {
                            i7 = zzlo.x(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (n(t, i12)) {
                            i7 = zzlo.r(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (n(t, i12)) {
                            i7 = zzlo.E(i14, f8.t(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (n(t, i12)) {
                            i7 = zzlo.G(i14, f8.t(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (n(t, i12)) {
                            i7 = zzlo.Q(i14, f8.r(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (n(t, i12)) {
                            i7 = zzlo.I(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (n(t, i12)) {
                            i7 = zzlo.V(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (n(t, i12)) {
                            i7 = zzlo.y(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (n(t, i12)) {
                            Object B = f8.B(t, j2);
                            if (B instanceof zzlb) {
                                i7 = zzlo.z(i14, (zzlb) B);
                            } else {
                                i7 = zzlo.F(i14, (String) B);
                            }
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (n(t, i12)) {
                            i7 = o7.g(i14, f8.B(t, j2), u(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (n(t, i12)) {
                            i7 = zzlo.z(i14, (zzlb) f8.B(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (n(t, i12)) {
                            i7 = zzlo.R(i14, f8.r(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (n(t, i12)) {
                            i7 = zzlo.Y(i14, f8.r(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (n(t, i12)) {
                            i7 = zzlo.X(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (n(t, i12)) {
                            i7 = zzlo.K(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (n(t, i12)) {
                            i7 = zzlo.T(i14, f8.r(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (n(t, i12)) {
                            i7 = zzlo.H(i14, f8.t(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (n(t, i12)) {
                            i7 = zzlo.A(i14, (z6) f8.B(t, j2), u(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i7 = o7.U(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 19:
                        i7 = o7.T(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 20:
                        i7 = o7.L(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 21:
                        i7 = o7.M(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 22:
                        i7 = o7.Q(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 23:
                        i7 = o7.U(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 24:
                        i7 = o7.T(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 25:
                        List<?> z = z(t, j2);
                        int i16 = o7.e;
                        int size = z.size();
                        if (size == 0) {
                            i7 = 0;
                        } else {
                            i7 = size * zzlo.y(i14);
                        }
                        i11 += i7;
                        break;
                    case 26:
                        i7 = o7.h(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 27:
                        i7 = o7.i(i14, z(t, j2), u(i12));
                        i11 += i7;
                        break;
                    case 28:
                        i7 = o7.k(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 29:
                        i7 = o7.R(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 30:
                        i7 = o7.P(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 31:
                        i7 = o7.T(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 32:
                        i7 = o7.U(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 33:
                        i7 = o7.S(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 34:
                        i7 = o7.N(i14, z(t, j2));
                        i11 += i7;
                        break;
                    case 35:
                        i10 = o7.J((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i10 = o7.H((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i10 = o7.p((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i10 = o7.s((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i10 = o7.y((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i10 = o7.J((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i10 = o7.H((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = o7.e;
                        i10 = ((List) unsafe.getObject(t, j2)).size();
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i10 = o7.A((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i10 = o7.w((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i10 = o7.H((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i10 = o7.J((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i10 = o7.C((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i10 = o7.u((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzlo.m(i14);
                            i8 = zzlo.p(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        i7 = o7.l(i14, z(t, j2), u(i12));
                        i11 += i7;
                        break;
                    case 50:
                        i7 = this.m.a(i14, f8.B(t, j2), v(i12));
                        i11 += i7;
                        break;
                    case 51:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.x(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.r(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.E(i14, D(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.G(i14, D(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.Q(i14, C(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.I(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.V(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.y(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (o(t, i14, i12)) {
                            Object B2 = f8.B(t, j2);
                            if (B2 instanceof zzlb) {
                                i7 = zzlo.z(i14, (zzlb) B2);
                            } else {
                                i7 = zzlo.F(i14, (String) B2);
                            }
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (o(t, i14, i12)) {
                            i7 = o7.g(i14, f8.B(t, j2), u(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.z(i14, (zzlb) f8.B(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.R(i14, C(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.Y(i14, C(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.X(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.K(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.T(i14, C(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.H(i14, D(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (o(t, i14, i12)) {
                            i7 = zzlo.A(i14, (z6) f8.B(t, j2), u(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                }
            }
            a8<?, ?> a8Var = this.k;
            return i11 + a8Var.f(a8Var.g(t));
        }
        Unsafe unsafe2 = o;
        int i18 = 0;
        int i19 = 1048575;
        int i20 = 0;
        for (int i21 = 0; i21 < this.a.length; i21 += 3) {
            int w2 = w(i21);
            int[] iArr = this.a;
            int i22 = iArr[i21];
            int i23 = (w2 & 267386880) >>> 20;
            if (i23 <= 17) {
                int i24 = iArr[i21 + 2];
                int i25 = i24 & 1048575;
                i2 = 1 << (i24 >>> 20);
                if (i25 != i19) {
                    i20 = unsafe2.getInt(t, (long) i25);
                    i19 = i25;
                }
            } else {
                i2 = 0;
            }
            long j3 = (long) (w2 & 1048575);
            switch (i23) {
                case 0:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.x(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.r(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.E(i22, unsafe2.getLong(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.G(i22, unsafe2.getLong(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.Q(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.I(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.V(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.y(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i20 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzlb) {
                            i3 = zzlo.z(i22, (zzlb) object);
                        } else {
                            i3 = zzlo.F(i22, (String) object);
                        }
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i20 & i2) != 0) {
                        i3 = o7.g(i22, unsafe2.getObject(t, j3), u(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.z(i22, (zzlb) unsafe2.getObject(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.R(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.Y(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.X(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.K(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.T(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.H(i22, unsafe2.getLong(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i20 & i2) != 0) {
                        i3 = zzlo.A(i22, (z6) unsafe2.getObject(t, j3), u(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = o7.U(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 19:
                    i3 = o7.T(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 20:
                    i3 = o7.L(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 21:
                    i3 = o7.M(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 22:
                    i3 = o7.Q(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 23:
                    i3 = o7.U(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 24:
                    i3 = o7.T(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 25:
                    int i26 = o7.e;
                    int size2 = ((List) unsafe2.getObject(t, j3)).size();
                    if (size2 == 0) {
                        i3 = 0;
                    } else {
                        i3 = size2 * zzlo.y(i22);
                    }
                    i18 += i3;
                    break;
                case 26:
                    i3 = o7.h(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 27:
                    i3 = o7.i(i22, (List) unsafe2.getObject(t, j3), u(i21));
                    i18 += i3;
                    break;
                case 28:
                    i3 = o7.k(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 29:
                    i3 = o7.R(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 30:
                    i3 = o7.P(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 31:
                    i3 = o7.T(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 32:
                    i3 = o7.U(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 33:
                    i3 = o7.S(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 34:
                    i3 = o7.N(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 35:
                    i6 = o7.J((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i6 = o7.H((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i6 = o7.p((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i6 = o7.s((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i6 = o7.y((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i6 = o7.J((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i6 = o7.H((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i27 = o7.e;
                    i6 = ((List) unsafe2.getObject(t, j3)).size();
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i6 = o7.A((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    i6 = o7.w((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i6 = o7.H((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i6 = o7.J((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i6 = o7.C((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i6 = o7.u((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzlo.m(i22);
                        i4 = zzlo.p(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    i3 = o7.l(i22, (List) unsafe2.getObject(t, j3), u(i21));
                    i18 += i3;
                    break;
                case 50:
                    i3 = this.m.a(i22, unsafe2.getObject(t, j3), v(i21));
                    i18 += i3;
                    break;
                case 51:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.x(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.r(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.E(i22, D(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.G(i22, D(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.Q(i22, C(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.I(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.V(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.y(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (o(t, i22, i21)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzlb) {
                            i3 = zzlo.z(i22, (zzlb) object2);
                        } else {
                            i3 = zzlo.F(i22, (String) object2);
                        }
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (o(t, i22, i21)) {
                        i3 = o7.g(i22, unsafe2.getObject(t, j3), u(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.z(i22, (zzlb) unsafe2.getObject(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.R(i22, C(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.Y(i22, C(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.X(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.K(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.T(i22, C(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.H(i22, D(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o(t, i22, i21)) {
                        i3 = zzlo.A(i22, (z6) unsafe2.getObject(t, j3), u(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        a8<?, ?> a8Var2 = this.k;
        int f2 = i18 + a8Var2.f(a8Var2.g(t));
        if (!this.d) {
            return f2;
        }
        n5<?> c2 = this.l.c(t);
        int i28 = 0;
        for (int i29 = 0; i29 < c2.a.l(); i29++) {
            Map.Entry<T, Object> h2 = c2.a.h(i29);
            i28 += n5.i(h2.getKey(), h2.getValue());
        }
        for (Map.Entry<T, Object> entry : c2.a.m()) {
            i28 += n5.i(entry.getKey(), entry.getValue());
        }
        return f2 + i28;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.google.android.gms.internal.cast.m7 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: com.google.android.gms.internal.cast.m7 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: com.google.android.gms.internal.cast.m7 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.m7
    public final boolean d(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.g) {
                return !this.d || this.l.c(t).b();
            }
            int i7 = this.f[i6];
            int i8 = this.a[i7];
            int w = w(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(t, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & w) != 0) && !p(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & w) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (o(t, i8, i7) && !u(i7).d(f8.B(t, (long) (w & 1048575)))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !this.m.e(f8.B(t, (long) (w & 1048575))).isEmpty()) {
                            this.m.c(v(i7));
                            throw null;
                        }
                    }
                }
                List list = (List) f8.B(t, (long) (w & 1048575));
                if (!list.isEmpty()) {
                    m7 u = u(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!u.d(list.get(i13))) {
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
            } else if (p(t, i7, i3, i2, i11) && !u(i7).d(f8.B(t, (long) (w & 1048575)))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final void e(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.a.length; i2 += 3) {
            int w = w(i2);
            long j2 = (long) (1048575 & w);
            int i3 = this.a[i2];
            switch ((w & 267386880) >>> 20) {
                case 0:
                    if (n(t2, i2)) {
                        f8.c(t, j2, f8.A(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n(t2, i2)) {
                        f8.d(t, j2, f8.z(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (n(t2, i2)) {
                        f8.f(t, j2, f8.t(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (n(t2, i2)) {
                        f8.f(t, j2, f8.t(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (n(t2, i2)) {
                        f8.e(t, j2, f8.r(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (n(t2, i2)) {
                        f8.f(t, j2, f8.t(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (n(t2, i2)) {
                        f8.e(t, j2, f8.r(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (n(t2, i2)) {
                        f8.h(t, j2, f8.u(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (n(t2, i2)) {
                        f8.g(t, j2, f8.B(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m(t, t2, i2);
                    break;
                case 10:
                    if (n(t2, i2)) {
                        f8.g(t, j2, f8.B(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (n(t2, i2)) {
                        f8.e(t, j2, f8.r(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (n(t2, i2)) {
                        f8.e(t, j2, f8.r(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (n(t2, i2)) {
                        f8.e(t, j2, f8.r(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (n(t2, i2)) {
                        f8.f(t, j2, f8.t(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (n(t2, i2)) {
                        f8.e(t, j2, f8.r(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (n(t2, i2)) {
                        f8.f(t, j2, f8.t(t2, j2));
                        q(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m(t, t2, i2);
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
                    this.j.b(t, t2, j2);
                    break;
                case 50:
                    t6 t6Var = this.m;
                    int i4 = o7.e;
                    f8.g(t, j2, t6Var.b(f8.B(t, j2), f8.B(t2, j2)));
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
                    if (o(t2, i3, i2)) {
                        f8.g(t, j2, f8.B(t2, j2));
                        r(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    t(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (o(t2, i3, i2)) {
                        f8.g(t, j2, f8.B(t2, j2));
                        r(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    t(t, t2, i2);
                    break;
            }
        }
        a8<?, ?> a8Var = this.k;
        int i5 = o7.e;
        a8Var.c(t, a8Var.d(a8Var.g(t), a8Var.g(t2)));
        if (this.d) {
            i5<?> i5Var = this.l;
            n5<?> c2 = i5Var.c(t2);
            if (!c2.a.isEmpty()) {
                i5Var.e(t).f(c2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0572  */
    @Override // com.google.android.gms.internal.cast.m7
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(T r13, com.google.android.gms.internal.cast.o8 r14) {
        /*
        // Method dump skipped, instructions count: 1566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.c7.f(java.lang.Object, com.google.android.gms.internal.cast.o8):void");
    }

    @Override // com.google.android.gms.internal.cast.m7
    public final void g(T t) {
        int i2;
        int i3 = this.g;
        while (true) {
            i2 = this.h;
            if (i3 >= i2) {
                break;
            }
            long w = (long) (w(this.f[i3]) & 1048575);
            Object B = f8.B(t, w);
            if (B != null) {
                f8.g(t, w, this.m.d(B));
            }
            i3++;
        }
        int length = this.f.length;
        while (i2 < length) {
            this.j.a(t, (long) this.f[i2]);
            i2++;
        }
        this.k.e(t);
        if (this.d) {
            this.l.f(t);
        }
    }
}
