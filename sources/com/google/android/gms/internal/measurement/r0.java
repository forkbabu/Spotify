package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class r0 extends f4<r0, a> implements m5 {
    private static final r0 zzh;
    private static volatile s5<r0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public static final class a extends f4.b<r0, a> implements m5 {
        private a() {
            super(r0.zzh);
        }

        public final a t(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            r0.v((r0) this.b, str);
            return this;
        }

        public final String u() {
            return ((r0) this.b).u();
        }

        public final boolean v() {
            return ((r0) this.b).w();
        }

        public final boolean w() {
            return ((r0) this.b).x();
        }

        public final boolean x() {
            return ((r0) this.b).y();
        }

        public final int y() {
            return ((r0) this.b).z();
        }

        a(v0 v0Var) {
            super(r0.zzh);
        }
    }

    static {
        r0 r0Var = new r0();
        zzh = r0Var;
        f4.r(r0.class, r0Var);
    }

    private r0() {
    }

    static void v(r0 r0Var, String str) {
        r0Var.getClass();
        str.getClass();
        r0Var.zzc |= 1;
        r0Var.zzd = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (v0.a[i - 1]) {
            case 1:
                return new r0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s5<r0> s5Var = zzi;
                if (s5Var == null) {
                    synchronized (r0.class) {
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

    public final String u() {
        return this.zzd;
    }

    public final boolean w() {
        return this.zze;
    }

    public final boolean x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zzc & 8) != 0;
    }

    public final int z() {
        return this.zzg;
    }
}
