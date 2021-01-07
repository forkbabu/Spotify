package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.f4;

public final class w0 extends f4<w0, a> implements m5 {
    private static final w0 zzh;
    private static volatile s5<w0> zzi;
    private int zzc;
    private int zzd;
    private d1 zze;
    private d1 zzf;
    private boolean zzg;

    public static final class a extends f4.b<w0, a> implements m5 {
        private a() {
            super(w0.zzh);
        }

        public final a t(int i) {
            if (this.c) {
                q();
                this.c = false;
            }
            w0.u((w0) this.b, i);
            return this;
        }

        public final a u(d1.a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            w0.v((w0) this.b, (d1) ((f4) aVar.s()));
            return this;
        }

        public final a v(d1 d1Var) {
            if (this.c) {
                q();
                this.c = false;
            }
            w0.z((w0) this.b, d1Var);
            return this;
        }

        public final a w(boolean z) {
            if (this.c) {
                q();
                this.c = false;
            }
            w0.w((w0) this.b, z);
            return this;
        }

        a(g1 g1Var) {
            super(w0.zzh);
        }
    }

    static {
        w0 w0Var = new w0();
        zzh = w0Var;
        f4.r(w0.class, w0Var);
    }

    private w0() {
    }

    public static a F() {
        return (a) zzh.s();
    }

    static void u(w0 w0Var, int i) {
        w0Var.zzc |= 1;
        w0Var.zzd = i;
    }

    static void v(w0 w0Var, d1 d1Var) {
        w0Var.getClass();
        w0Var.zze = d1Var;
        w0Var.zzc |= 2;
    }

    static void w(w0 w0Var, boolean z) {
        w0Var.zzc |= 8;
        w0Var.zzg = z;
    }

    static void z(w0 w0Var, d1 d1Var) {
        w0Var.getClass();
        d1Var.getClass();
        w0Var.zzf = d1Var;
        w0Var.zzc |= 4;
    }

    public final d1 A() {
        d1 d1Var = this.zze;
        return d1Var == null ? d1.N() : d1Var;
    }

    public final boolean B() {
        return (this.zzc & 4) != 0;
    }

    public final d1 C() {
        d1 d1Var = this.zzf;
        return d1Var == null ? d1.N() : d1Var;
    }

    public final boolean D() {
        return (this.zzc & 8) != 0;
    }

    public final boolean E() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new w0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s5<w0> s5Var = zzi;
                if (s5Var == null) {
                    synchronized (w0.class) {
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

    public final boolean x() {
        return (this.zzc & 1) != 0;
    }

    public final int y() {
        return this.zzd;
    }
}
