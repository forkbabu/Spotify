package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class d1 extends f4<d1, a> implements m5 {
    private static final d1 zzg;
    private static volatile s5<d1> zzh;
    private n4 zzc = a5.h();
    private n4 zzd = a5.h();
    private m4<x0> zze = x5.f();
    private m4<e1> zzf = x5.f();

    public static final class a extends f4.b<d1, a> implements m5 {
        private a() {
            super(d1.zzg);
        }

        public final a A(Iterable<? extends e1> iterable) {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.H((d1) this.b, iterable);
            return this;
        }

        public final a t() {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.w((d1) this.b);
            return this;
        }

        public final a u(int i) {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.x((d1) this.b, i);
            return this;
        }

        public final a v(Iterable<? extends Long> iterable) {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.y((d1) this.b, iterable);
            return this;
        }

        public final a w() {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.B((d1) this.b);
            return this;
        }

        public final a x(int i) {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.C((d1) this.b, i);
            return this;
        }

        public final a y(Iterable<? extends Long> iterable) {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.D((d1) this.b, iterable);
            return this;
        }

        public final a z(Iterable<? extends x0> iterable) {
            if (this.c) {
                q();
                this.c = false;
            }
            d1.F((d1) this.b, iterable);
            return this;
        }

        a(g1 g1Var) {
            super(d1.zzg);
        }
    }

    static {
        d1 d1Var = new d1();
        zzg = d1Var;
        f4.r(d1.class, d1Var);
    }

    private d1() {
    }

    static void B(d1 d1Var) {
        d1Var.getClass();
        d1Var.zzd = a5.h();
    }

    static void C(d1 d1Var, int i) {
        m4<e1> m4Var = d1Var.zzf;
        if (!m4Var.a()) {
            d1Var.zzf = f4.n(m4Var);
        }
        d1Var.zzf.remove(i);
    }

    static void D(d1 d1Var, Iterable iterable) {
        n4 n4Var = d1Var.zzd;
        if (!((c3) n4Var).a()) {
            d1Var.zzd = f4.o(n4Var);
        }
        z2.h(iterable, d1Var.zzd);
    }

    static void F(d1 d1Var, Iterable iterable) {
        m4<x0> m4Var = d1Var.zze;
        if (!m4Var.a()) {
            d1Var.zze = f4.n(m4Var);
        }
        z2.h(iterable, d1Var.zze);
    }

    static void H(d1 d1Var, Iterable iterable) {
        m4<e1> m4Var = d1Var.zzf;
        if (!m4Var.a()) {
            d1Var.zzf = f4.n(m4Var);
        }
        z2.h(iterable, d1Var.zzf);
    }

    public static a M() {
        return (a) zzg.s();
    }

    public static d1 N() {
        return zzg;
    }

    static void w(d1 d1Var) {
        d1Var.getClass();
        d1Var.zzc = a5.h();
    }

    static void x(d1 d1Var, int i) {
        m4<x0> m4Var = d1Var.zze;
        if (!m4Var.a()) {
            d1Var.zze = f4.n(m4Var);
        }
        d1Var.zze.remove(i);
    }

    static void y(d1 d1Var, Iterable iterable) {
        n4 n4Var = d1Var.zzc;
        if (!((c3) n4Var).a()) {
            d1Var.zzc = f4.o(n4Var);
        }
        z2.h(iterable, d1Var.zzc);
    }

    public final e1 A(int i) {
        return this.zzf.get(i);
    }

    public final List<Long> E() {
        return this.zzd;
    }

    public final int G() {
        return ((a5) this.zzd).size();
    }

    public final List<x0> I() {
        return this.zze;
    }

    public final int J() {
        return this.zze.size();
    }

    public final List<e1> K() {
        return this.zzf;
    }

    public final int L() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new d1();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", x0.class, "zzf", e1.class});
            case 4:
                return zzg;
            case 5:
                s5<d1> s5Var = zzh;
                if (s5Var == null) {
                    synchronized (d1.class) {
                        s5Var = zzh;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzg);
                            zzh = s5Var;
                        }
                    }
                }
                return s5Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final x0 u(int i) {
        return this.zze.get(i);
    }

    public final List<Long> v() {
        return this.zzc;
    }

    public final int z() {
        return ((a5) this.zzc).size();
    }
}
