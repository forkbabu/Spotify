package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class h5 implements o8 {
    private final zzlo a;

    private h5(zzlo zzlo) {
        Charset charset = v5.a;
        this.a = zzlo;
        zzlo.a = this;
    }

    public static h5 a(zzlo zzlo) {
        h5 h5Var = zzlo.a;
        if (h5Var != null) {
            return h5Var;
        }
        return new h5(zzlo);
    }

    public final void A(int i, int i2) {
        this.a.L(i, i2);
    }

    public final void B(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzlo.o(list.get(i4).intValue());
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.i(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.J(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void C(int i, int i2) {
        this.a.M(i, i2);
    }

    public final void D(int i, long j) {
        this.a.d(i, j);
    }

    public final void E(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                int i5 = zzlo.d;
                i3++;
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.B(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.v(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void F(int i, int i2) {
        this.a.O(i, i2);
    }

    public final void G(int i, long j) {
        this.a.C(i, j);
    }

    public final void H(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzlo.p(list.get(i4).intValue());
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.L(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void I(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                int i5 = zzlo.d;
                i3 += 4;
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void J(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                int i5 = zzlo.d;
                i3 += 8;
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.C(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void K(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzlo.q(list.get(i4).intValue());
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.k(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.M(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void L(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzlo.a0(list.get(i4).longValue());
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.U(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.t(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void M(int i, int i2) {
        this.a.O(i, i2);
    }

    public final void N(int i, int i2) {
        this.a.J(i, i2);
    }

    public final void b(int i, double d) {
        zzlo zzlo = this.a;
        zzlo.getClass();
        zzlo.C(i, Double.doubleToRawLongBits(d));
    }

    public final void c(int i, float f) {
        zzlo zzlo = this.a;
        zzlo.getClass();
        zzlo.O(i, Float.floatToRawIntBits(f));
    }

    public final void d(int i, long j) {
        this.a.d(i, j);
    }

    public final void e(int i, zzlb zzlb) {
        this.a.e(i, zzlb);
    }

    public final <K, V> void f(int i, r6<K, V> r6Var, Map<K, V> map) {
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            this.a.b(i, 2);
            next.getKey();
            next.getValue();
            throw null;
        }
    }

    public final void g(int i, Object obj, m7 m7Var) {
        this.a.g(i, (z6) obj, m7Var);
    }

    public final void h(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            while (i2 < list.size()) {
                Object S0 = g6Var.S0(i2);
                if (S0 instanceof String) {
                    this.a.D(i, (String) S0);
                } else {
                    this.a.e(i, (zzlb) S0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.D(i, list.get(i2));
            i2++;
        }
    }

    public final void i(int i, List<?> list, m7 m7Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.g(i, (z6) list.get(i2), m7Var);
        }
    }

    public final void j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzlo.o(list.get(i4).intValue());
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.i(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.J(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void k(int i, long j) {
        this.a.t(i, j);
    }

    public final void l(int i, Object obj) {
        if (obj instanceof zzlb) {
            this.a.u(i, (zzlb) obj);
        } else {
            this.a.f(i, (z6) obj);
        }
    }

    public final void m(int i, Object obj, m7 m7Var) {
        zzlo zzlo = this.a;
        zzlo.b(i, 3);
        m7Var.f((z6) obj, zzlo.a);
        zzlo.b(i, 4);
    }

    public final void n(int i, List<zzlb> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.e(i, list.get(i2));
        }
    }

    public final void o(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                int i5 = zzlo.d;
                i3 += 4;
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.O(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void p(int i, boolean z) {
        this.a.v(i, z);
    }

    public final void q(int i) {
        this.a.b(i, 3);
    }

    public final void r(int i) {
        this.a.b(i, 4);
    }

    public final void s(int i, long j) {
        this.a.C(i, j);
    }

    public final void t(int i, String str) {
        this.a.D(i, str);
    }

    public final void u(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzlo.Z(list.get(i4).longValue());
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.d(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void v(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzlo.Z(list.get(i4).longValue());
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.d(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void w(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                int i5 = zzlo.d;
                i3 += 8;
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                this.a.W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.C(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void x(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                int i5 = zzlo.d;
                i3 += 4;
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                zzlo zzlo = this.a;
                float floatValue = list.get(i2).floatValue();
                zzlo.getClass();
                zzlo.l(Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzlo zzlo2 = this.a;
            float floatValue2 = list.get(i2).floatValue();
            zzlo2.getClass();
            zzlo2.O(i, Float.floatToRawIntBits(floatValue2));
            i2++;
        }
    }

    public final void y(int i, int i2) {
        this.a.J(i, i2);
    }

    public final void z(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                int i5 = zzlo.d;
                i3 += 8;
            }
            this.a.j(i3);
            while (i2 < list.size()) {
                zzlo zzlo = this.a;
                double doubleValue = list.get(i2).doubleValue();
                zzlo.getClass();
                zzlo.W(Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzlo zzlo2 = this.a;
            double doubleValue2 = list.get(i2).doubleValue();
            zzlo2.getClass();
            zzlo2.C(i, Double.doubleToRawLongBits(doubleValue2));
            i2++;
        }
    }
}
