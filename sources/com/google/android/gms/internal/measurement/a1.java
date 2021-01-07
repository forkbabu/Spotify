package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class a1 extends f4<a1, a> implements m5 {
    private static final a1 zzj;
    private static volatile s5<a1> zzk;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private float zzg;
    private double zzh;
    private m4<a1> zzi = x5.f();

    public static final class a extends f4.b<a1, a> implements m5 {
        private a() {
            super(a1.zzj);
        }

        public final a A(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.D((a1) this.b, str);
            return this;
        }

        public final a B() {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.E((a1) this.b);
            return this;
        }

        public final int C() {
            return ((a1) this.b).P();
        }

        public final a D() {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.H((a1) this.b);
            return this;
        }

        public final a t() {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.u((a1) this.b);
            return this;
        }

        public final a u(double d) {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.v((a1) this.b, d);
            return this;
        }

        public final a v(long j) {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.w((a1) this.b, j);
            return this;
        }

        public final a w(a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.x((a1) this.b, (a1) ((f4) aVar.s()));
            return this;
        }

        public final a x(Iterable<? extends a1> iterable) {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.y((a1) this.b, iterable);
            return this;
        }

        public final a y(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.z((a1) this.b, str);
            return this;
        }

        public final a z() {
            if (this.c) {
                q();
                this.c = false;
            }
            a1.C((a1) this.b);
            return this;
        }

        a(g1 g1Var) {
            super(a1.zzj);
        }
    }

    static {
        a1 a1Var = new a1();
        zzj = a1Var;
        f4.r(a1.class, a1Var);
    }

    private a1() {
    }

    static void C(a1 a1Var) {
        a1Var.zzc &= -5;
        a1Var.zzf = 0;
    }

    static void D(a1 a1Var, String str) {
        a1Var.getClass();
        str.getClass();
        a1Var.zzc |= 2;
        a1Var.zze = str;
    }

    static void E(a1 a1Var) {
        a1Var.zzc &= -17;
        a1Var.zzh = 0.0d;
    }

    static void H(a1 a1Var) {
        a1Var.getClass();
        a1Var.zzi = x5.f();
    }

    public static a Q() {
        return (a) zzj.s();
    }

    static void u(a1 a1Var) {
        a1Var.zzc &= -3;
        a1Var.zze = zzj.zze;
    }

    static void v(a1 a1Var, double d) {
        a1Var.zzc |= 16;
        a1Var.zzh = d;
    }

    static void w(a1 a1Var, long j) {
        a1Var.zzc |= 4;
        a1Var.zzf = j;
    }

    static void x(a1 a1Var, a1 a1Var2) {
        a1Var.getClass();
        m4<a1> m4Var = a1Var.zzi;
        if (!m4Var.a()) {
            a1Var.zzi = f4.n(m4Var);
        }
        a1Var.zzi.add(a1Var2);
    }

    static void y(a1 a1Var, Iterable iterable) {
        m4<a1> m4Var = a1Var.zzi;
        if (!m4Var.a()) {
            a1Var.zzi = f4.n(m4Var);
        }
        z2.h(iterable, a1Var.zzi);
    }

    static void z(a1 a1Var, String str) {
        a1Var.getClass();
        str.getClass();
        a1Var.zzc |= 1;
        a1Var.zzd = str;
    }

    public final boolean A() {
        return (this.zzc & 1) != 0;
    }

    public final String B() {
        return this.zzd;
    }

    public final boolean F() {
        return (this.zzc & 2) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzc & 4) != 0;
    }

    public final long J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzc & 8) != 0;
    }

    public final float L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzc & 16) != 0;
    }

    public final double N() {
        return this.zzh;
    }

    public final List<a1> O() {
        return this.zzi;
    }

    public final int P() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new a1();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", a1.class});
            case 4:
                return zzj;
            case 5:
                s5<a1> s5Var = zzk;
                if (s5Var == null) {
                    synchronized (a1.class) {
                        s5Var = zzk;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzj);
                            zzk = s5Var;
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
}
