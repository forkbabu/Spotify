package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class n0 extends f4<n0, a> implements m5 {
    private static final n0 zzj;
    private static volatile s5<n0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private m0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public static final class a extends f4.b<n0, a> implements m5 {
        private a() {
            super(n0.zzj);
        }

        public final a t(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            n0.u((n0) this.b, str);
            return this;
        }

        a(o0 o0Var) {
            super(n0.zzj);
        }
    }

    static {
        n0 n0Var = new n0();
        zzj = n0Var;
        f4.r(n0.class, n0Var);
    }

    private n0() {
    }

    public static a D() {
        return (a) zzj.s();
    }

    static void u(n0 n0Var, String str) {
        n0Var.getClass();
        str.getClass();
        n0Var.zzc |= 2;
        n0Var.zze = str;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzc & 32) != 0;
    }

    public final boolean C() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (o0.a[i - 1]) {
            case 1:
                return new n0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                s5<n0> s5Var = zzk;
                if (s5Var == null) {
                    synchronized (n0.class) {
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

    public final boolean v() {
        return (this.zzc & 1) != 0;
    }

    public final int w() {
        return this.zzd;
    }

    public final String x() {
        return this.zze;
    }

    public final m0 y() {
        m0 m0Var = this.zzf;
        return m0Var == null ? m0.D() : m0Var;
    }

    public final boolean z() {
        return this.zzg;
    }
}
