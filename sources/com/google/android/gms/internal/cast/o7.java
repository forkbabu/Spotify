package com.google.android.gms.internal.cast;

import java.util.List;

final class o7 {
    private static final Class<?> a;
    private static final a8<?, ?> b = O(false);
    private static final a8<?, ?> c = O(true);
    private static final a8<?, ?> d = new b8();
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

    static int A(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t5) {
            t5 t5Var = (t5) list;
            i = 0;
            while (i2 < size) {
                i += zzlo.p(t5Var.T1(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzlo.p(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void B(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).o(i, list, z);
        }
    }

    static int C(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t5) {
            t5 t5Var = (t5) list;
            i = 0;
            while (i2 < size) {
                i += zzlo.q(t5Var.T1(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzlo.q(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void D(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).I(i, list, z);
        }
    }

    public static a8<?, ?> E() {
        return b;
    }

    public static a8<?, ?> F() {
        return c;
    }

    public static a8<?, ?> G() {
        return d;
    }

    static int H(List<?> list) {
        return list.size() << 2;
    }

    public static void I(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).B(i, list, z);
        }
    }

    static int J(List<?> list) {
        return list.size() << 3;
    }

    public static void K(int i, List<Boolean> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).E(i, list, z);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Long;>;Z)I */
    static int L(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzlo.m(i) * list.size()) + p(list);
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Long;>;Z)I */
    static int M(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlo.m(i) * size) + s(list);
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Long;>;Z)I */
    static int N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlo.m(i) * size) + u(list);
    }

    private static a8<?, ?> O(boolean z) {
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
            return (a8) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int P(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlo.m(i) * size) + w(list);
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int Q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlo.m(i) * size) + y(list);
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int R(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlo.m(i) * size) + A(list);
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Ljava/lang/Integer;>;Z)I */
    static int S(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlo.m(i) * size) + C(list);
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<*>;Z)I */
    static int T(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzlo.V(i) * size;
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<*>;Z)I */
    static int U(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzlo.I(i) * size;
    }

    public static void a(int i, List<String> list, o8 o8Var) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).h(i, list);
        }
    }

    public static void b(int i, List<?> list, o8 o8Var, m7 m7Var) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).i(i, list, m7Var);
        }
    }

    public static void c(int i, List<Double> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).z(i, list, z);
        }
    }

    public static void d(int i, List<zzlb> list, o8 o8Var) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).n(i, list);
        }
    }

    public static void e(int i, List<?> list, o8 o8Var, m7 m7Var) {
        if (!(list == null || list.isEmpty())) {
            h5 h5Var = (h5) o8Var;
            h5Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                h5Var.m(i, list.get(i2), m7Var);
            }
        }
    }

    public static void f(int i, List<Float> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).x(i, list, z);
        }
    }

    static int g(int i, Object obj, m7 m7Var) {
        if (!(obj instanceof e6)) {
            return zzlo.p(i << 3) + zzlo.c((z6) obj, m7Var);
        }
        int p = zzlo.p(i << 3);
        int d2 = ((e6) obj).d();
        return zzlo.p(d2) + d2 + p;
    }

    static int h(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int m = zzlo.m(i) * size;
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            while (i4 < size) {
                Object S0 = g6Var.S0(i4);
                if (S0 instanceof zzlb) {
                    i3 = zzlo.s((zzlb) S0);
                } else {
                    i3 = zzlo.n((String) S0);
                }
                m = i3 + m;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzlb) {
                    i2 = zzlo.s((zzlb) obj);
                } else {
                    i2 = zzlo.n((String) obj);
                }
                m = i2 + m;
                i4++;
            }
        }
        return m;
    }

    static int i(int i, List<?> list, m7 m7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = zzlo.m(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof e6) {
                int d2 = ((e6) obj).d();
                m += zzlo.p(d2) + d2;
            } else {
                m += zzlo.c((z6) obj, m7Var);
            }
        }
        return m;
    }

    public static void j(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).u(i, list, z);
        }
    }

    static int k(int i, List<zzlb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = zzlo.m(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            m += zzlo.s(list.get(i2));
        }
        return m;
    }

    static int l(int i, List<z6> list, m7 m7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzlo.A(i, list.get(i3), m7Var);
        }
        return i2;
    }

    public static void m(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).v(i, list, z);
        }
    }

    public static void n(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).L(i, list, z);
        }
    }

    static boolean o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int p(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o6) {
            o6 o6Var = (o6) list;
            i = 0;
            while (i2 < size) {
                i += zzlo.Z(o6Var.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzlo.Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void q(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).w(i, list, z);
        }
    }

    public static void r(Class<?> cls) {
        Class<?> cls2;
        if (!r5.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int s(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o6) {
            o6 o6Var = (o6) list;
            i = 0;
            while (i2 < size) {
                i += zzlo.Z(o6Var.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzlo.Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void t(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).J(i, list, z);
        }
    }

    static int u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o6) {
            o6 o6Var = (o6) list;
            i = 0;
            while (i2 < size) {
                i += zzlo.a0(o6Var.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzlo.a0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void v(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).j(i, list, z);
        }
    }

    static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t5) {
            t5 t5Var = (t5) list;
            i = 0;
            while (i2 < size) {
                i += zzlo.o(t5Var.T1(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzlo.o(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void x(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).H(i, list, z);
        }
    }

    static int y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t5) {
            t5 t5Var = (t5) list;
            i = 0;
            while (i2 < size) {
                i += zzlo.o(t5Var.T1(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzlo.o(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void z(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((h5) o8Var).K(i, list, z);
        }
    }
}
