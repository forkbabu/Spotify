package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class f1 extends f4<f1, a> implements m5 {
    private static final f1 zzj;
    private static volatile s5<f1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    public static final class a extends f4.b<f1, a> implements m5 {
        private a() {
            super(f1.zzj);
        }

        public final a A() {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.E((f1) this.b);
            return this;
        }

        public final a t() {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.u((f1) this.b);
            return this;
        }

        public final a u(double d) {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.v((f1) this.b, d);
            return this;
        }

        public final a v(long j) {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.w((f1) this.b, j);
            return this;
        }

        public final a w(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.x((f1) this.b, str);
            return this;
        }

        public final a x() {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.A((f1) this.b);
            return this;
        }

        public final a y(long j) {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.B((f1) this.b, j);
            return this;
        }

        public final a z(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            f1.C((f1) this.b, str);
            return this;
        }

        a(g1 g1Var) {
            super(f1.zzj);
        }
    }

    static {
        f1 f1Var = new f1();
        zzj = f1Var;
        f4.r(f1.class, f1Var);
    }

    private f1() {
    }

    static void A(f1 f1Var) {
        f1Var.zzc &= -9;
        f1Var.zzg = 0;
    }

    static void B(f1 f1Var, long j) {
        f1Var.zzc |= 8;
        f1Var.zzg = j;
    }

    static void C(f1 f1Var, String str) {
        f1Var.getClass();
        str.getClass();
        f1Var.zzc |= 4;
        f1Var.zzf = str;
    }

    static void E(f1 f1Var) {
        f1Var.zzc &= -33;
        f1Var.zzi = 0.0d;
    }

    public static a L() {
        return (a) zzj.s();
    }

    static void u(f1 f1Var) {
        f1Var.zzc &= -5;
        f1Var.zzf = zzj.zzf;
    }

    static void v(f1 f1Var, double d) {
        f1Var.zzc |= 32;
        f1Var.zzi = d;
    }

    static void w(f1 f1Var, long j) {
        f1Var.zzc |= 1;
        f1Var.zzd = j;
    }

    static void x(f1 f1Var, String str) {
        f1Var.getClass();
        str.getClass();
        f1Var.zzc |= 2;
        f1Var.zze = str;
    }

    public final String D() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzc & 4) != 0;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzc & 8) != 0;
    }

    public final long I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzc & 32) != 0;
    }

    public final double K() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new f1();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                s5<f1> s5Var = zzk;
                if (s5Var == null) {
                    synchronized (f1.class) {
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

    public final boolean y() {
        return (this.zzc & 1) != 0;
    }

    public final long z() {
        return this.zzd;
    }
}
