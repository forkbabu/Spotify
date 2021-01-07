package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class t3 implements z6 {
    private final zzhf a;

    private t3(zzhf zzhf) {
        Charset charset = h4.a;
        this.a = zzhf;
        zzhf.a = this;
    }

    public static t3 a(zzhf zzhf) {
        t3 t3Var = zzhf.a;
        if (t3Var != null) {
            return t3Var;
        }
        return new t3(zzhf);
    }

    public final void A(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhf.M(list.get(i4).longValue());
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void B(int i, int i2) {
        this.a.D(i, i2);
    }

    public final void C(int i, long j) {
        this.a.v(i, j);
    }

    public final void D(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                int i5 = zzhf.d;
                i3 += 8;
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.F(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.E(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void E(int i, int i2) {
        this.a.J(i, i2);
    }

    public final void F(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                int i5 = zzhf.d;
                i3 += 4;
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                zzhf zzhf = this.a;
                float floatValue = list.get(i2).floatValue();
                zzhf.getClass();
                zzhf.I(Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzhf zzhf2 = this.a;
            float floatValue2 = list.get(i2).floatValue();
            zzhf2.getClass();
            zzhf2.N(i, Float.floatToRawIntBits(floatValue2));
            i2++;
        }
    }

    public final void G(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                int i5 = zzhf.d;
                i3 += 8;
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                zzhf zzhf = this.a;
                double doubleValue = list.get(i2).doubleValue();
                zzhf.getClass();
                zzhf.F(Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzhf zzhf2 = this.a;
            double doubleValue2 = list.get(i2).doubleValue();
            zzhf2.getClass();
            zzhf2.E(i, Double.doubleToRawLongBits(doubleValue2));
            i2++;
        }
    }

    public final void H(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhf.O(list.get(i4).intValue());
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.f(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.u(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void I(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                int i5 = zzhf.d;
                i3++;
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.e(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.m(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void J(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhf.S(list.get(i4).intValue());
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.t(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.D(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void K(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                int i5 = zzhf.d;
                i3 += 4;
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.I(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.N(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void L(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                int i5 = zzhf.d;
                i3 += 8;
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.F(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.E(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void M(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhf.V(list.get(i4).intValue());
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.C(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.J(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void N(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhf.R(list.get(i4).longValue());
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.x(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.v(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void b(int i) {
        this.a.g(i, 3);
    }

    public final void c(int i, double d) {
        zzhf zzhf = this.a;
        zzhf.getClass();
        zzhf.E(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i, float f) {
        zzhf zzhf = this.a;
        zzhf.getClass();
        zzhf.N(i, Float.floatToRawIntBits(f));
    }

    public final void e(int i, int i2) {
        this.a.N(i, i2);
    }

    public final void f(int i, long j) {
        this.a.h(i, j);
    }

    public final void g(int i, zzgm zzgm) {
        this.a.i(i, zzgm);
    }

    public final <K, V> void h(int i, d5<K, V> d5Var, Map<K, V> map) {
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            this.a.g(i, 2);
            next.getKey();
            next.getValue();
            throw null;
        }
    }

    public final void i(int i, Object obj) {
        if (obj instanceof zzgm) {
            this.a.w(i, (zzgm) obj);
        } else {
            this.a.j(i, (l5) obj);
        }
    }

    public final void j(int i, Object obj, y5 y5Var) {
        this.a.k(i, (l5) obj, y5Var);
    }

    public final void k(int i, String str) {
        this.a.l(i, str);
    }

    public final void l(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof t4) {
            t4 t4Var = (t4) list;
            while (i2 < list.size()) {
                Object r = t4Var.r(i2);
                if (r instanceof String) {
                    this.a.l(i, (String) r);
                } else {
                    this.a.i(i, (zzgm) r);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.l(i, list.get(i2));
            i2++;
        }
    }

    public final void m(int i, List<?> list, y5 y5Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.k(i, (l5) list.get(i2), y5Var);
        }
    }

    public final void n(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhf.O(list.get(i4).intValue());
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.f(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.u(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void o(int i, boolean z) {
        this.a.m(i, z);
    }

    public final void p(int i) {
        this.a.g(i, 4);
    }

    public final void q(int i, int i2) {
        this.a.u(i, i2);
    }

    public final void r(int i, long j) {
        this.a.E(i, j);
    }

    public final void s(int i, Object obj, y5 y5Var) {
        zzhf zzhf = this.a;
        zzhf.g(i, 3);
        y5Var.i((l5) obj, zzhf.a);
        zzhf.g(i, 4);
    }

    public final void t(int i, List<zzgm> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.i(i, list.get(i2));
        }
    }

    public final void u(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                int i5 = zzhf.d;
                i3 += 4;
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.I(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.N(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void v(int i, int i2) {
        this.a.u(i, i2);
    }

    public final void w(int i, long j) {
        this.a.h(i, j);
    }

    public final void x(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhf.M(list.get(i4).longValue());
            }
            this.a.t(i3);
            while (i2 < list.size()) {
                this.a.n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void y(int i, int i2) {
        this.a.N(i, i2);
    }

    public final void z(int i, long j) {
        this.a.E(i, j);
    }
}
