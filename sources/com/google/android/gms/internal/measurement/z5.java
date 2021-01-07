package com.google.android.gms.internal.measurement;

import java.util.List;

/* access modifiers changed from: package-private */
public final class z5 {
    private static final Class<?> a;
    private static final l6<?, ?> b = f(false);
    private static final l6<?, ?> c = f(true);
    private static final l6<?, ?> d = new m6();
    public static final /* synthetic */ int e = 0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
    }

    public static void A(int i, List<Long> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).A(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int B(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhf.K(i) * size) + C(list);
    }

    static int C(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i4) {
            i4 i4Var = (i4) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.O(i4Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.O(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void D(int i, List<Long> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).N(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhf.K(i) * size) + F(list);
    }

    static int F(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i4) {
            i4 i4Var = (i4) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.S(i4Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.S(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void G(int i, List<Long> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).D(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int H(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhf.K(i) * size) + I(list);
    }

    static int I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i4) {
            i4 i4Var = (i4) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.V(i4Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.V(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void J(int i, List<Long> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).L(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<*>;Z)I */
    static int K(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzhf.Z(i) * size;
    }

    static int L(List<?> list) {
        return list.size() << 2;
    }

    public static void M(int i, List<Integer> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).n(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<*>;Z)I */
    static int N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzhf.U(i) * size;
    }

    static int O(List<?> list) {
        return list.size() << 3;
    }

    public static void P(int i, List<Integer> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).J(i, list, z);
        }
    }

    public static void Q(int i, List<Integer> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).M(i, list, z);
        }
    }

    public static void R(int i, List<Integer> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).u(i, list, z);
        }
    }

    public static void S(int i, List<Integer> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).K(i, list, z);
        }
    }

    public static void T(int i, List<Integer> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).H(i, list, z);
        }
    }

    public static void U(int i, List<Boolean> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).I(i, list, z);
        }
    }

    static int a(int i, Object obj, y5 y5Var) {
        if (!(obj instanceof r4)) {
            return zzhf.S(i << 3) + zzhf.d((l5) obj, y5Var);
        }
        int S = zzhf.S(i << 3);
        int b2 = ((r4) obj).b();
        return zzhf.S(b2) + b2 + S;
    }

    static int b(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int K = zzhf.K(i) * size;
        if (list instanceof t4) {
            t4 t4Var = (t4) list;
            while (i4 < size) {
                Object r = t4Var.r(i4);
                if (r instanceof zzgm) {
                    i3 = zzhf.r((zzgm) r);
                } else {
                    i3 = zzhf.s((String) r);
                }
                K = i3 + K;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzgm) {
                    i2 = zzhf.r((zzgm) obj);
                } else {
                    i2 = zzhf.s((String) obj);
                }
                K = i2 + K;
                i4++;
            }
        }
        return K;
    }

    static int c(int i, List<?> list, y5 y5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K = zzhf.K(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof r4) {
                K = zzhf.c((r4) obj) + K;
            } else {
                K += zzhf.d((l5) obj, y5Var);
            }
        }
        return K;
    }

    static int d(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.M(a5Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.M(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static l6<?, ?> e() {
        return b;
    }

    private static l6<?, ?> f(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (l6) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void g(int i, List<String> list, z6 z6Var) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).l(i, list);
        }
    }

    public static void h(int i, List<?> list, z6 z6Var, y5 y5Var) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).m(i, list, y5Var);
        }
    }

    public static void i(int i, List<Double> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).G(i, list, z);
        }
    }

    public static void j(Class<?> cls) {
        Class<?> cls2;
        if (!f4.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Long;>;Z)I */
    static int l(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzhf.K(i) * list.size()) + d(list);
    }

    static int m(int i, List<zzgm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K = zzhf.K(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            K += zzhf.r(list.get(i2));
        }
        return K;
    }

    static int n(int i, List<l5> list, y5 y5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzhf.B(i, list.get(i3), y5Var);
        }
        return i2;
    }

    static int o(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.M(a5Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.M(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static l6<?, ?> p() {
        return c;
    }

    public static void q(int i, List<zzgm> list, z6 z6Var) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).t(i, list);
        }
    }

    public static void r(int i, List<?> list, z6 z6Var, y5 y5Var) {
        if (!(list == null || list.isEmpty())) {
            t3 t3Var = (t3) z6Var;
            t3Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                t3Var.s(i, list.get(i2), y5Var);
            }
        }
    }

    public static void s(int i, List<Float> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).F(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Long;>;Z)I */
    static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhf.K(i) * size) + o(list);
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Long;>;Z)I */
    static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhf.K(i) * size) + v(list);
    }

    static int v(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.R(a5Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.R(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static l6<?, ?> w() {
        return d;
    }

    public static void x(int i, List<Long> list, z6 z6Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((t3) z6Var).x(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhf.K(i) * size) + z(list);
    }

    static int z(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i4) {
            i4 i4Var = (i4) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.O(i4Var.e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.O(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }
}
