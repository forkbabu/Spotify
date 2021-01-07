package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class x0 extends f4<x0, a> implements m5 {
    private static final x0 zzf;
    private static volatile s5<x0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    public static final class a extends f4.b<x0, a> implements m5 {
        private a() {
            super(x0.zzf);
        }

        public final a t(int i) {
            if (this.c) {
                q();
                this.c = false;
            }
            x0.u((x0) this.b, i);
            return this;
        }

        public final a u(long j) {
            if (this.c) {
                q();
                this.c = false;
            }
            x0.v((x0) this.b, j);
            return this;
        }

        a(g1 g1Var) {
            super(x0.zzf);
        }
    }

    static {
        x0 x0Var = new x0();
        zzf = x0Var;
        f4.r(x0.class, x0Var);
    }

    private x0() {
    }

    public static a A() {
        return (a) zzf.s();
    }

    static void u(x0 x0Var, int i) {
        x0Var.zzc |= 1;
        x0Var.zzd = i;
    }

    static void v(x0 x0Var, long j) {
        x0Var.zzc |= 2;
        x0Var.zze = j;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new x0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s5<x0> s5Var = zzg;
                if (s5Var == null) {
                    synchronized (x0.class) {
                        s5Var = zzg;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzf);
                            zzg = s5Var;
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

    public final boolean w() {
        return (this.zzc & 1) != 0;
    }

    public final int x() {
        return this.zzd;
    }

    public final boolean y() {
        return (this.zzc & 2) != 0;
    }

    public final long z() {
        return this.zze;
    }
}
