package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class m0 extends f4<m0, a> implements m5 {
    private static final m0 zzh;
    private static volatile s5<m0> zzi;
    private int zzc;
    private zzbv$zzf zzd;
    private zzbv$zzd zze;
    private boolean zzf;
    private String zzg = "";

    public static final class a extends f4.b<m0, a> implements m5 {
        private a() {
            super(m0.zzh);
        }

        public final a t(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            m0.u((m0) this.b, str);
            return this;
        }

        a(o0 o0Var) {
            super(m0.zzh);
        }
    }

    static {
        m0 m0Var = new m0();
        zzh = m0Var;
        f4.r(m0.class, m0Var);
    }

    private m0() {
    }

    public static m0 D() {
        return zzh;
    }

    static void u(m0 m0Var, String str) {
        m0Var.getClass();
        str.getClass();
        m0Var.zzc |= 8;
        m0Var.zzg = str;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zzc & 8) != 0;
    }

    public final String C() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (o0.a[i - 1]) {
            case 1:
                return new m0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s5<m0> s5Var = zzi;
                if (s5Var == null) {
                    synchronized (m0.class) {
                        s5Var = zzi;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzh);
                            zzi = s5Var;
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

    public final zzbv$zzf w() {
        zzbv$zzf zzbv_zzf = this.zzd;
        return zzbv_zzf == null ? zzbv$zzf.C() : zzbv_zzf;
    }

    public final boolean x() {
        return (this.zzc & 2) != 0;
    }

    public final zzbv$zzd y() {
        zzbv$zzd zzbv_zzd = this.zze;
        return zzbv_zzd == null ? zzbv$zzd.E() : zzbv_zzd;
    }

    public final boolean z() {
        return (this.zzc & 4) != 0;
    }
}
