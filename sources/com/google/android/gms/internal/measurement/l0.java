package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class l0 extends f4<l0, a> implements m5 {
    private static final l0 zzl;
    private static volatile s5<l0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private m4<m0> zzf = x5.f();
    private boolean zzg;
    private zzbv$zzd zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends f4.b<l0, a> implements m5 {
        private a() {
            super(l0.zzl);
        }

        public final a t(int i, m0 m0Var) {
            if (this.c) {
                q();
                this.c = false;
            }
            l0.v((l0) this.b, i, m0Var);
            return this;
        }

        public final a u(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            l0.w((l0) this.b, str);
            return this;
        }

        public final m0 v(int i) {
            return ((l0) this.b).u(i);
        }

        public final String w() {
            return ((l0) this.b).z();
        }

        public final int x() {
            return ((l0) this.b).B();
        }

        a(o0 o0Var) {
            super(l0.zzl);
        }
    }

    static {
        l0 l0Var = new l0();
        zzl = l0Var;
        f4.r(l0.class, l0Var);
    }

    private l0() {
    }

    public static a I() {
        return (a) zzl.s();
    }

    static void v(l0 l0Var, int i, m0 m0Var) {
        l0Var.getClass();
        m0Var.getClass();
        m4<m0> m4Var = l0Var.zzf;
        if (!m4Var.a()) {
            l0Var.zzf = f4.n(m4Var);
        }
        l0Var.zzf.set(i, m0Var);
    }

    static void w(l0 l0Var, String str) {
        l0Var.getClass();
        str.getClass();
        l0Var.zzc |= 2;
        l0Var.zze = str;
    }

    public final List<m0> A() {
        return this.zzf;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final boolean C() {
        return (this.zzc & 8) != 0;
    }

    public final zzbv$zzd D() {
        zzbv$zzd zzbv_zzd = this.zzh;
        return zzbv_zzd == null ? zzbv$zzd.E() : zzbv_zzd;
    }

    public final boolean E() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzj;
    }

    public final boolean G() {
        return (this.zzc & 64) != 0;
    }

    public final boolean H() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (o0.a[i - 1]) {
            case 1:
                return new l0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", m0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                s5<l0> s5Var = zzm;
                if (s5Var == null) {
                    synchronized (l0.class) {
                        s5Var = zzm;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzl);
                            zzm = s5Var;
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

    public final m0 u(int i) {
        return this.zzf.get(i);
    }

    public final boolean x() {
        return (this.zzc & 1) != 0;
    }

    public final int y() {
        return this.zzd;
    }

    public final String z() {
        return this.zze;
    }
}
