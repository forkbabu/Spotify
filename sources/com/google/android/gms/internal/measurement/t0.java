package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class t0 extends f4<t0, a> implements m5 {
    private static final t0 zzf;
    private static volatile s5<t0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    public static final class a extends f4.b<t0, a> implements m5 {
        a(v0 v0Var) {
            super(t0.zzf);
        }
    }

    static {
        t0 t0Var = new t0();
        zzf = t0Var;
        f4.r(t0.class, t0Var);
    }

    private t0() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (v0.a[i - 1]) {
            case 1:
                return new t0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s5<t0> s5Var = zzg;
                if (s5Var == null) {
                    synchronized (t0.class) {
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

    public final String u() {
        return this.zzd;
    }

    public final String v() {
        return this.zze;
    }
}
