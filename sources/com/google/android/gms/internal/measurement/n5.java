package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class n5<T> implements y5<T> {
    private static final int[] p = new int[0];
    private static final Unsafe q = q6.s();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final l5 e;
    private final boolean f;
    private final boolean g;
    private final int[] h;
    private final int i;
    private final int j;
    private final r5 k;
    private final w4 l;
    private final l6<?, ?> m;
    private final w3<?> n;
    private final f5 o;

    /* JADX WARN: Incorrect args count in method signature: ([I[Ljava/lang/Object;IILcom/google/android/gms/internal/measurement/l5;ZZ[IIILcom/google/android/gms/internal/measurement/r5;Lcom/google/android/gms/internal/measurement/w4;Lcom/google/android/gms/internal/measurement/l6<**>;Lcom/google/android/gms/internal/measurement/w3<*>;Lcom/google/android/gms/internal/measurement/f5;)V */
    private n5(int[] iArr, Object[] objArr, int i2, int i3, l5 l5Var, boolean z, int[] iArr2, int i4, int i5, r5 r5Var, w4 w4Var, l6 l6Var, w3 w3Var, f5 f5Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        boolean z2 = l5Var instanceof f4;
        this.g = z;
        this.f = w3Var != null && w3Var.e(l5Var);
        this.h = iArr2;
        this.i = i4;
        this.j = i5;
        this.k = r5Var;
        this.l = w4Var;
        this.m = l6Var;
        this.n = w3Var;
        this.e = l5Var;
        this.o = f5Var;
    }

    private final Object A(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    private final void B(T t, int i2) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            q6.g(t, j2, (1 << (i3 >>> 20)) | q6.b(t, j2));
        }
    }

    private final void C(T t, int i2, int i3) {
        q6.g(t, (long) (this.a[i3 + 2] & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void D(T r18, com.google.android.gms.internal.measurement.z6 r19) {
        /*
        // Method dump skipped, instructions count: 1446
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.D(java.lang.Object, com.google.android.gms.internal.measurement.z6):void");
    }

    private final void E(T t, T t2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (w(t2, i4, i2)) {
            Object A = q6.A(t, j2);
            Object A2 = q6.A(t2, j2);
            if (A != null && A2 != null) {
                q6.i(t, j2, h4.c(A, A2));
                C(t, i4, i2);
            } else if (A2 != null) {
                q6.i(t, j2, A2);
                C(t, i4, i2);
            }
        }
    }

    private static <T> float F(T t, long j2) {
        return ((Float) q6.A(t, j2)).floatValue();
    }

    private final l4 G(int i2) {
        return (l4) this.b[((i2 / 3) << 1) + 1];
    }

    private final boolean H(T t, T t2, int i2) {
        return v(t, i2) == v(t2, i2);
    }

    private final int I(int i2) {
        return this.a[i2 + 1];
    }

    private static <T> int J(T t, long j2) {
        return ((Integer) q6.A(t, j2)).intValue();
    }

    private final int K(int i2) {
        return this.a[i2 + 2];
    }

    private static <T> long L(T t, long j2) {
        return ((Long) q6.A(t, j2)).longValue();
    }

    private static n6 M(Object obj) {
        f4 f4Var = (f4) obj;
        n6 n6Var = f4Var.zzb;
        if (n6Var != n6.a()) {
            return n6Var;
        }
        n6 g2 = n6.g();
        f4Var.zzb = g2;
        return g2;
    }

    private static <T> boolean N(T t, long j2) {
        return ((Boolean) q6.A(t, j2)).booleanValue();
    }

    private final int j(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, g3 g3Var) {
        int i10;
        Unsafe unsafe = q;
        long j3 = (long) (this.a[i9 + 2] & 1048575);
        boolean z = true;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(o2.v(bArr, i2))));
                    i10 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(o2.h(bArr, i2))));
                    i10 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = o2.u(bArr, i2, g3Var);
                    unsafe.putObject(t, j2, Long.valueOf(g3Var.b));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = o2.i(bArr, i2, g3Var);
                    unsafe.putObject(t, j2, Integer.valueOf(g3Var.a));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(o2.v(bArr, i2)));
                    i10 = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(o2.h(bArr, i2)));
                    i10 = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    i10 = o2.u(bArr, i2, g3Var);
                    if (g3Var.b == 0) {
                        z = false;
                    }
                    unsafe.putObject(t, j2, Boolean.valueOf(z));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    int i11 = o2.i(bArr, i2, g3Var);
                    int i12 = g3Var.a;
                    if (i12 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else if ((i7 & 536870912) == 0 || t6.e(bArr, i11, i11 + i12)) {
                        unsafe.putObject(t, j2, new String(bArr, i11, i12, h4.a));
                        i11 += i12;
                    } else {
                        throw zzig.e();
                    }
                    unsafe.putInt(t, j3, i5);
                    return i11;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    int g2 = o2.g(o(i9), bArr, i2, i3, g3Var);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, g3Var.c);
                    } else {
                        unsafe.putObject(t, j2, h4.c(object, g3Var.c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return g2;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    i10 = o2.z(bArr, i2, g3Var);
                    unsafe.putObject(t, j2, g3Var.c);
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int i13 = o2.i(bArr, i2, g3Var);
                    int i14 = g3Var.a;
                    l4 l4Var = (l4) this.b[((i9 / 3) << 1) + 1];
                    if (l4Var == null || l4Var.g(i14)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i14));
                        i10 = i13;
                        unsafe.putInt(t, j3, i5);
                        return i10;
                    }
                    M(t).c(i4, Long.valueOf((long) i14));
                    return i13;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    i10 = o2.i(bArr, i2, g3Var);
                    unsafe.putObject(t, j2, Integer.valueOf(m3.b(g3Var.a)));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    i10 = o2.u(bArr, i2, g3Var);
                    unsafe.putObject(t, j2, Long.valueOf(m3.a(g3Var.b)));
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    i10 = o2.f(o(i9), bArr, i2, i3, (i4 & -8) | 4, g3Var);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, g3Var.c);
                    } else {
                        unsafe.putObject(t, j2, h4.c(object2, g3Var.c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:263:0x0180 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:265:0x0191 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:266:0x01b5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:267:0x0191 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x04a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x04a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01de  */
    private final int k(T r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, com.google.android.gms.internal.measurement.g3 r31) {
        /*
        // Method dump skipped, instructions count: 1264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.k(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.g3):int");
    }

    private final <K, V> int l(T t, byte[] bArr, int i2, int i3, int i4, long j2, g3 g3Var) {
        Unsafe unsafe = q;
        Object obj = this.b[(i4 / 3) << 1];
        Object object = unsafe.getObject(t, j2);
        if (this.o.f(object)) {
            Object h2 = this.o.h(obj);
            this.o.d(h2, object);
            unsafe.putObject(t, j2, h2);
            object = h2;
        }
        this.o.g(obj);
        this.o.b(object);
        int i5 = o2.i(bArr, i2, g3Var);
        int i6 = g3Var.a;
        if (i6 < 0 || i6 > i3 - i5) {
            throw zzig.a();
        }
        throw null;
    }

    /* JADX WARN: Incorrect args count in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Lcom/google/android/gms/internal/measurement/j5;Lcom/google/android/gms/internal/measurement/r5;Lcom/google/android/gms/internal/measurement/w4;Lcom/google/android/gms/internal/measurement/l6<**>;Lcom/google/android/gms/internal/measurement/w3<*>;Lcom/google/android/gms/internal/measurement/f5;)Lcom/google/android/gms/internal/measurement/n5<TT;>; */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0342  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.n5 n(com.google.android.gms.internal.measurement.j5 r33, com.google.android.gms.internal.measurement.r5 r34, com.google.android.gms.internal.measurement.w4 r35, com.google.android.gms.internal.measurement.l6 r36, com.google.android.gms.internal.measurement.w3 r37, com.google.android.gms.internal.measurement.f5 r38) {
        /*
        // Method dump skipped, instructions count: 1042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.n(com.google.android.gms.internal.measurement.j5, com.google.android.gms.internal.measurement.r5, com.google.android.gms.internal.measurement.w4, com.google.android.gms.internal.measurement.l6, com.google.android.gms.internal.measurement.w3, com.google.android.gms.internal.measurement.f5):com.google.android.gms.internal.measurement.n5");
    }

    private final y5 o(int i2) {
        int i3 = (i2 / 3) << 1;
        y5 y5Var = (y5) this.b[i3];
        if (y5Var != null) {
            return y5Var;
        }
        y5<T> b2 = u5.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b2;
        return b2;
    }

    private static Field p(Class<?> cls, String str) {
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

    private static List<?> q(Object obj, long j2) {
        return (List) q6.A(obj, j2);
    }

    private static void r(int i2, Object obj, z6 z6Var) {
        if (obj instanceof String) {
            ((t3) z6Var).k(i2, (String) obj);
            return;
        }
        ((t3) z6Var).g(i2, (zzgm) obj);
    }

    private static <UT, UB> void s(l6<UT, UB> l6Var, T t, z6 z6Var) {
        l6Var.c(l6Var.e(t), z6Var);
    }

    private final <K, V> void t(z6 z6Var, int i2, Object obj, int i3) {
        if (obj != null) {
            ((t3) z6Var).h(i2, this.o.g(this.b[(i3 / 3) << 1]), this.o.c(obj));
        }
    }

    private final void u(T t, T t2, int i2) {
        long j2 = (long) (this.a[i2 + 1] & 1048575);
        if (v(t2, i2)) {
            Object A = q6.A(t, j2);
            Object A2 = q6.A(t2, j2);
            if (A != null && A2 != null) {
                q6.i(t, j2, h4.c(A, A2));
                B(t, i2);
            } else if (A2 != null) {
                q6.i(t, j2, A2);
                B(t, i2);
            }
        }
    }

    private final boolean v(T t, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 == 1048575) {
            int i4 = iArr[i2 + 1];
            long j3 = (long) (i4 & 1048575);
            switch ((i4 & 267386880) >>> 20) {
                case 0:
                    return q6.z(t, j3) != 0.0d;
                case 1:
                    return q6.w(t, j3) != 0.0f;
                case 2:
                    return q6.n(t, j3) != 0;
                case 3:
                    return q6.n(t, j3) != 0;
                case 4:
                    return q6.b(t, j3) != 0;
                case 5:
                    return q6.n(t, j3) != 0;
                case 6:
                    return q6.b(t, j3) != 0;
                case 7:
                    return q6.v(t, j3);
                case 8:
                    Object A = q6.A(t, j3);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof zzgm) {
                        return !zzgm.a.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return q6.A(t, j3) != null;
                case 10:
                    return !zzgm.a.equals(q6.A(t, j3));
                case 11:
                    return q6.b(t, j3) != 0;
                case 12:
                    return q6.b(t, j3) != 0;
                case 13:
                    return q6.b(t, j3) != 0;
                case 14:
                    return q6.n(t, j3) != 0;
                case 15:
                    return q6.b(t, j3) != 0;
                case 16:
                    return q6.n(t, j3) != 0;
                case 17:
                    return q6.A(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (q6.b(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
    }

    private final boolean w(T t, int i2, int i3) {
        return q6.b(t, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    private final boolean x(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return v(t, i2);
        }
        return (i4 & i5) != 0;
    }

    private static <T> double y(T t, long j2) {
        return ((Double) q6.A(t, j2)).doubleValue();
    }

    private final int z(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final T a() {
        return (T) this.k.b(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final int b(T t) {
        int i2;
        int i3;
        int i4;
        int i5;
        int length = this.a.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int I = I(i7);
            int i8 = this.a[i7];
            long j2 = (long) (1048575 & I);
            int i9 = 37;
            switch ((I & 267386880) >>> 20) {
                case 0:
                    i3 = i6 * 53;
                    i2 = h4.a(Double.doubleToLongBits(q6.z(t, j2)));
                    i6 = i2 + i3;
                    break;
                case 1:
                    i3 = i6 * 53;
                    i2 = Float.floatToIntBits(q6.w(t, j2));
                    i6 = i2 + i3;
                    break;
                case 2:
                    i3 = i6 * 53;
                    i2 = h4.a(q6.n(t, j2));
                    i6 = i2 + i3;
                    break;
                case 3:
                    i3 = i6 * 53;
                    i2 = h4.a(q6.n(t, j2));
                    i6 = i2 + i3;
                    break;
                case 4:
                    i5 = i6 * 53;
                    i4 = q6.b(t, j2);
                    i6 = i5 + i4;
                    break;
                case 5:
                    i3 = i6 * 53;
                    i2 = h4.a(q6.n(t, j2));
                    i6 = i2 + i3;
                    break;
                case 6:
                    i5 = i6 * 53;
                    i4 = q6.b(t, j2);
                    i6 = i5 + i4;
                    break;
                case 7:
                    i3 = i6 * 53;
                    i2 = h4.b(q6.v(t, j2));
                    i6 = i2 + i3;
                    break;
                case 8:
                    i3 = i6 * 53;
                    i2 = ((String) q6.A(t, j2)).hashCode();
                    i6 = i2 + i3;
                    break;
                case 9:
                    Object A = q6.A(t, j2);
                    if (A != null) {
                        i9 = A.hashCode();
                    }
                    i6 = (i6 * 53) + i9;
                    break;
                case 10:
                    i3 = i6 * 53;
                    i2 = q6.A(t, j2).hashCode();
                    i6 = i2 + i3;
                    break;
                case 11:
                    i5 = i6 * 53;
                    i4 = q6.b(t, j2);
                    i6 = i5 + i4;
                    break;
                case 12:
                    i5 = i6 * 53;
                    i4 = q6.b(t, j2);
                    i6 = i5 + i4;
                    break;
                case 13:
                    i5 = i6 * 53;
                    i4 = q6.b(t, j2);
                    i6 = i5 + i4;
                    break;
                case 14:
                    i3 = i6 * 53;
                    i2 = h4.a(q6.n(t, j2));
                    i6 = i2 + i3;
                    break;
                case 15:
                    i5 = i6 * 53;
                    i4 = q6.b(t, j2);
                    i6 = i5 + i4;
                    break;
                case 16:
                    i3 = i6 * 53;
                    i2 = h4.a(q6.n(t, j2));
                    i6 = i2 + i3;
                    break;
                case 17:
                    Object A2 = q6.A(t, j2);
                    if (A2 != null) {
                        i9 = A2.hashCode();
                    }
                    i6 = (i6 * 53) + i9;
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
                    i3 = i6 * 53;
                    i2 = q6.A(t, j2).hashCode();
                    i6 = i2 + i3;
                    break;
                case 50:
                    i3 = i6 * 53;
                    i2 = q6.A(t, j2).hashCode();
                    i6 = i2 + i3;
                    break;
                case 51:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = h4.a(Double.doubleToLongBits(y(t, j2)));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = Float.floatToIntBits(F(t, j2));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = h4.a(L(t, j2));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = h4.a(L(t, j2));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(t, i8, i7)) {
                        i5 = i6 * 53;
                        i4 = J(t, j2);
                        i6 = i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = h4.a(L(t, j2));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(t, i8, i7)) {
                        i5 = i6 * 53;
                        i4 = J(t, j2);
                        i6 = i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = h4.b(N(t, j2));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = ((String) q6.A(t, j2)).hashCode();
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = q6.A(t, j2).hashCode();
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = q6.A(t, j2).hashCode();
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(t, i8, i7)) {
                        i5 = i6 * 53;
                        i4 = J(t, j2);
                        i6 = i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(t, i8, i7)) {
                        i5 = i6 * 53;
                        i4 = J(t, j2);
                        i6 = i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(t, i8, i7)) {
                        i5 = i6 * 53;
                        i4 = J(t, j2);
                        i6 = i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = h4.a(L(t, j2));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(t, i8, i7)) {
                        i5 = i6 * 53;
                        i4 = J(t, j2);
                        i6 = i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = h4.a(L(t, j2));
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(t, i8, i7)) {
                        i3 = i6 * 53;
                        i2 = q6.A(t, j2).hashCode();
                        i6 = i2 + i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.m.e(t).hashCode() + (i6 * 53);
        return this.f ? (hashCode * 53) + this.n.b(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.y5
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
        if (this.g) {
            Unsafe unsafe = q;
            int i11 = 0;
            for (int i12 = 0; i12 < this.a.length; i12 += 3) {
                int I = I(i12);
                int i13 = (I & 267386880) >>> 20;
                int i14 = this.a[i12];
                long j2 = (long) (I & 1048575);
                if (i13 >= zzhp.DOUBLE_LIST_PACKED.a() && i13 <= zzhp.SINT64_LIST_PACKED.a()) {
                    int i15 = this.a[i12 + 2];
                }
                switch (i13) {
                    case 0:
                        if (v(t, i12)) {
                            i7 = zzhf.y(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (v(t, i12)) {
                            i7 = zzhf.p(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (v(t, i12)) {
                            i7 = zzhf.H(i14, q6.n(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (v(t, i12)) {
                            i7 = zzhf.L(i14, q6.n(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (v(t, i12)) {
                            i7 = zzhf.P(i14, q6.b(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (v(t, i12)) {
                            i7 = zzhf.U(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (v(t, i12)) {
                            i7 = zzhf.Z(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (v(t, i12)) {
                            i7 = zzhf.z(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (v(t, i12)) {
                            Object A = q6.A(t, j2);
                            if (A instanceof zzgm) {
                                i7 = zzhf.A(i14, (zzgm) A);
                            } else {
                                i7 = zzhf.q(i14, (String) A);
                            }
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (v(t, i12)) {
                            i7 = z5.a(i14, q6.A(t, j2), o(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (v(t, i12)) {
                            i7 = zzhf.A(i14, (zzgm) q6.A(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (v(t, i12)) {
                            i7 = zzhf.T(i14, q6.b(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (v(t, i12)) {
                            i7 = zzhf.b0(i14, q6.b(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (v(t, i12)) {
                            i7 = zzhf.a0(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (v(t, i12)) {
                            i7 = zzhf.X(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (v(t, i12)) {
                            i7 = zzhf.W(i14, q6.b(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (v(t, i12)) {
                            i7 = zzhf.Q(i14, q6.n(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (v(t, i12)) {
                            i7 = zzhf.B(i14, (l5) q6.A(t, j2), o(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i7 = z5.N(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 19:
                        i7 = z5.K(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 20:
                        i7 = z5.l(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 21:
                        i7 = z5.t(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 22:
                        i7 = z5.B(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 23:
                        i7 = z5.N(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 24:
                        i7 = z5.K(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 25:
                        List<?> q2 = q(t, j2);
                        int i16 = z5.e;
                        int size = q2.size();
                        if (size == 0) {
                            i7 = 0;
                        } else {
                            i7 = size * zzhf.z(i14);
                        }
                        i11 += i7;
                        break;
                    case 26:
                        i7 = z5.b(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 27:
                        i7 = z5.c(i14, q(t, j2), o(i12));
                        i11 += i7;
                        break;
                    case 28:
                        i7 = z5.m(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 29:
                        i7 = z5.E(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 30:
                        i7 = z5.y(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 31:
                        i7 = z5.K(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 32:
                        i7 = z5.N(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 33:
                        i7 = z5.H(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 34:
                        i7 = z5.u(i14, q(t, j2));
                        i11 += i7;
                        break;
                    case 35:
                        i10 = z5.O((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i10 = z5.L((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i10 = z5.d((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i10 = z5.o((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i10 = z5.C((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i10 = z5.O((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i10 = z5.L((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i17 = z5.e;
                        i10 = ((List) unsafe.getObject(t, j2)).size();
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i10 = z5.F((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i10 = z5.z((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i10 = z5.L((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i10 = z5.O((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i10 = z5.I((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i10 = z5.v((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            i9 = zzhf.K(i14);
                            i8 = zzhf.S(i10);
                            i11 = i8 + i9 + i10 + i11;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        i7 = z5.n(i14, q(t, j2), o(i12));
                        i11 += i7;
                        break;
                    case 50:
                        i7 = this.o.i(i14, q6.A(t, j2), A(i12));
                        i11 += i7;
                        break;
                    case 51:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.y(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.p(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.H(i14, L(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.L(i14, L(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.P(i14, J(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.U(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.Z(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.z(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (w(t, i14, i12)) {
                            Object A2 = q6.A(t, j2);
                            if (A2 instanceof zzgm) {
                                i7 = zzhf.A(i14, (zzgm) A2);
                            } else {
                                i7 = zzhf.q(i14, (String) A2);
                            }
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (w(t, i14, i12)) {
                            i7 = z5.a(i14, q6.A(t, j2), o(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.A(i14, (zzgm) q6.A(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.T(i14, J(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.b0(i14, J(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.a0(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.X(i14);
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.W(i14, J(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.Q(i14, L(t, j2));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (w(t, i14, i12)) {
                            i7 = zzhf.B(i14, (l5) q6.A(t, j2), o(i12));
                            i11 += i7;
                            break;
                        } else {
                            break;
                        }
                }
            }
            l6<?, ?> l6Var = this.m;
            return i11 + l6Var.j(l6Var.e(t));
        }
        Unsafe unsafe2 = q;
        int i18 = 0;
        int i19 = 1048575;
        int i20 = 0;
        for (int i21 = 0; i21 < this.a.length; i21 += 3) {
            int I2 = I(i21);
            int[] iArr = this.a;
            int i22 = iArr[i21];
            int i23 = (I2 & 267386880) >>> 20;
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
            long j3 = (long) (I2 & 1048575);
            switch (i23) {
                case 0:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.y(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.p(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.H(i22, unsafe2.getLong(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.L(i22, unsafe2.getLong(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.P(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.U(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.Z(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.z(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i20 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzgm) {
                            i3 = zzhf.A(i22, (zzgm) object);
                        } else {
                            i3 = zzhf.q(i22, (String) object);
                        }
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i20 & i2) != 0) {
                        i3 = z5.a(i22, unsafe2.getObject(t, j3), o(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.A(i22, (zzgm) unsafe2.getObject(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.T(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.b0(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.a0(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.X(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.W(i22, unsafe2.getInt(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.Q(i22, unsafe2.getLong(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i20 & i2) != 0) {
                        i3 = zzhf.B(i22, (l5) unsafe2.getObject(t, j3), o(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = z5.N(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 19:
                    i3 = z5.K(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 20:
                    i3 = z5.l(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 21:
                    i3 = z5.t(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 22:
                    i3 = z5.B(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 23:
                    i3 = z5.N(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 24:
                    i3 = z5.K(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 25:
                    int i26 = z5.e;
                    int size2 = ((List) unsafe2.getObject(t, j3)).size();
                    if (size2 == 0) {
                        i3 = 0;
                    } else {
                        i3 = size2 * zzhf.z(i22);
                    }
                    i18 += i3;
                    break;
                case 26:
                    i3 = z5.b(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 27:
                    i3 = z5.c(i22, (List) unsafe2.getObject(t, j3), o(i21));
                    i18 += i3;
                    break;
                case 28:
                    i3 = z5.m(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 29:
                    i3 = z5.E(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 30:
                    i3 = z5.y(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 31:
                    i3 = z5.K(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 32:
                    i3 = z5.N(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 33:
                    i3 = z5.H(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 34:
                    i3 = z5.u(i22, (List) unsafe2.getObject(t, j3));
                    i18 += i3;
                    break;
                case 35:
                    i6 = z5.O((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i6 = z5.L((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i6 = z5.d((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i6 = z5.o((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i6 = z5.C((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i6 = z5.O((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i6 = z5.L((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i27 = z5.e;
                    i6 = ((List) unsafe2.getObject(t, j3)).size();
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i6 = z5.F((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    i6 = z5.z((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i6 = z5.L((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i6 = z5.O((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i6 = z5.I((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i6 = z5.v((List) unsafe2.getObject(t, j3));
                    if (i6 > 0) {
                        i5 = zzhf.K(i22);
                        i4 = zzhf.S(i6);
                        i18 = i4 + i5 + i6 + i18;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    i3 = z5.n(i22, (List) unsafe2.getObject(t, j3), o(i21));
                    i18 += i3;
                    break;
                case 50:
                    i3 = this.o.i(i22, unsafe2.getObject(t, j3), A(i21));
                    i18 += i3;
                    break;
                case 51:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.y(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.p(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.H(i22, L(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.L(i22, L(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.P(i22, J(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.U(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.Z(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.z(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(t, i22, i21)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzgm) {
                            i3 = zzhf.A(i22, (zzgm) object2);
                        } else {
                            i3 = zzhf.q(i22, (String) object2);
                        }
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (w(t, i22, i21)) {
                        i3 = z5.a(i22, unsafe2.getObject(t, j3), o(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.A(i22, (zzgm) unsafe2.getObject(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.T(i22, J(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.b0(i22, J(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.a0(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.X(i22);
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.W(i22, J(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.Q(i22, L(t, j3));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(t, i22, i21)) {
                        i3 = zzhf.B(i22, (l5) unsafe2.getObject(t, j3), o(i21));
                        i18 += i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        l6<?, ?> l6Var2 = this.m;
        int j4 = i18 + l6Var2.j(l6Var2.e(t));
        if (!this.f) {
            return j4;
        }
        a4<?> b2 = this.n.b(t);
        int i28 = 0;
        for (int i29 = 0; i29 < b2.a.j(); i29++) {
            Map.Entry<T, Object> h2 = b2.a.h(i29);
            i28 += a4.a(h2.getKey(), h2.getValue());
        }
        for (Map.Entry<T, Object> entry : b2.a.m()) {
            i28 += a4.a(entry.getKey(), entry.getValue());
        }
        return j4 + i28;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.z5.k(com.google.android.gms.internal.measurement.q6.A(r10, r6), com.google.android.gms.internal.measurement.q6.A(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.q6.n(r10, r6) == com.google.android.gms.internal.measurement.q6.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.q6.b(r10, r6) == com.google.android.gms.internal.measurement.q6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.q6.n(r10, r6) == com.google.android.gms.internal.measurement.q6.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.q6.b(r10, r6) == com.google.android.gms.internal.measurement.q6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.q6.b(r10, r6) == com.google.android.gms.internal.measurement.q6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.q6.b(r10, r6) == com.google.android.gms.internal.measurement.q6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.z5.k(com.google.android.gms.internal.measurement.q6.A(r10, r6), com.google.android.gms.internal.measurement.q6.A(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.z5.k(com.google.android.gms.internal.measurement.q6.A(r10, r6), com.google.android.gms.internal.measurement.q6.A(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.z5.k(com.google.android.gms.internal.measurement.q6.A(r10, r6), com.google.android.gms.internal.measurement.q6.A(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.q6.v(r10, r6) == com.google.android.gms.internal.measurement.q6.v(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.q6.b(r10, r6) == com.google.android.gms.internal.measurement.q6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.q6.n(r10, r6) == com.google.android.gms.internal.measurement.q6.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.q6.b(r10, r6) == com.google.android.gms.internal.measurement.q6.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.q6.n(r10, r6) == com.google.android.gms.internal.measurement.q6.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.q6.n(r10, r6) == com.google.android.gms.internal.measurement.q6.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.q6.w(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.q6.w(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.q6.z(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.q6.z(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.z5.k(com.google.android.gms.internal.measurement.q6.A(r10, r6), com.google.android.gms.internal.measurement.q6.A(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // com.google.android.gms.internal.measurement.y5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 640
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.d(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.google.android.gms.internal.measurement.y5 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: com.google.android.gms.internal.measurement.y5 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: com.google.android.gms.internal.measurement.y5 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean e(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.i) {
                return !this.f || this.n.b(t).p();
            }
            int i7 = this.h[i6];
            int i8 = this.a[i7];
            int I = I(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = q.getInt(t, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & I) != 0) && !x(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & I) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (w(t, i8, i7) && !o(i7).e(q6.A(t, (long) (I & 1048575)))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !this.o.c(q6.A(t, (long) (I & 1048575))).isEmpty()) {
                            this.o.g(A(i7));
                            throw null;
                        }
                    }
                }
                List list = (List) q6.A(t, (long) (I & 1048575));
                if (!list.isEmpty()) {
                    y5 o2 = o(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!o2.e(list.get(i13))) {
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
            } else if (x(t, i7, i3, i2, i11) && !o(i7).e(q6.A(t, (long) (I & 1048575)))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final void f(T t) {
        int i2;
        int i3 = this.i;
        while (true) {
            i2 = this.j;
            if (i3 >= i2) {
                break;
            }
            long I = (long) (I(this.h[i3]) & 1048575);
            Object A = q6.A(t, I);
            if (A != null) {
                q6.i(t, I, this.o.e(A));
            }
            i3++;
        }
        int length = this.h.length;
        while (i2 < length) {
            this.l.d(t, (long) this.h[i2]);
            i2++;
        }
        this.m.h(t);
        if (this.f) {
            this.n.g(t);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final void g(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.a.length; i2 += 3) {
            int I = I(i2);
            long j2 = (long) (1048575 & I);
            int i3 = this.a[i2];
            switch ((I & 267386880) >>> 20) {
                case 0:
                    if (v(t2, i2)) {
                        q6.e(t, j2, q6.z(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(t2, i2)) {
                        q6.f(t, j2, q6.w(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(t2, i2)) {
                        q6.h(t, j2, q6.n(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(t2, i2)) {
                        q6.h(t, j2, q6.n(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(t2, i2)) {
                        q6.g(t, j2, q6.b(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(t2, i2)) {
                        q6.h(t, j2, q6.n(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(t2, i2)) {
                        q6.g(t, j2, q6.b(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(t2, i2)) {
                        q6.j(t, j2, q6.v(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(t2, i2)) {
                        q6.i(t, j2, q6.A(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    u(t, t2, i2);
                    break;
                case 10:
                    if (v(t2, i2)) {
                        q6.i(t, j2, q6.A(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(t2, i2)) {
                        q6.g(t, j2, q6.b(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(t2, i2)) {
                        q6.g(t, j2, q6.b(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(t2, i2)) {
                        q6.g(t, j2, q6.b(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(t2, i2)) {
                        q6.h(t, j2, q6.n(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(t2, i2)) {
                        q6.g(t, j2, q6.b(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(t2, i2)) {
                        q6.h(t, j2, q6.n(t2, j2));
                        B(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    u(t, t2, i2);
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
                    this.l.b(t, t2, j2);
                    break;
                case 50:
                    f5 f5Var = this.o;
                    int i4 = z5.e;
                    q6.i(t, j2, f5Var.d(q6.A(t, j2), q6.A(t2, j2)));
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
                    if (w(t2, i3, i2)) {
                        q6.i(t, j2, q6.A(t2, j2));
                        C(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    E(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (w(t2, i3, i2)) {
                        q6.i(t, j2, q6.A(t2, j2));
                        C(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    E(t, t2, i2);
                    break;
            }
        }
        l6<?, ?> l6Var = this.m;
        int i5 = z5.e;
        l6Var.d(t, l6Var.g(l6Var.e(t), l6Var.e(t2)));
        if (this.f) {
            w3<?> w3Var = this.n;
            a4<?> b2 = w3Var.b(t2);
            if (!b2.a.isEmpty()) {
                w3Var.f(t).f(b2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033c, code lost:
        if (r0 == r0) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0383, code lost:
        if (r0 == r15) goto L_0x0385;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.measurement.y5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.measurement.g3 r33) {
        /*
        // Method dump skipped, instructions count: 1042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.h(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.g3):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0572  */
    @Override // com.google.android.gms.internal.measurement.y5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(T r13, com.google.android.gms.internal.measurement.z6 r14) {
        /*
        // Method dump skipped, instructions count: 1566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.i(java.lang.Object, com.google.android.gms.internal.measurement.z6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03e2, code lost:
        if (r0 == r10) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0439, code lost:
        if (r0 == r15) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x043b, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04a3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.g3 r36) {
        /*
        // Method dump skipped, instructions count: 1448
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.m(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.g3):int");
    }
}
