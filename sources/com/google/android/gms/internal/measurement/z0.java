package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class z0 extends f4<z0, a> implements m5 {
    private static final z0 zzf;
    private static volatile s5<z0> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    public static final class a extends f4.b<z0, a> implements m5 {
        a(g1 g1Var) {
            super(z0.zzf);
        }
    }

    static {
        z0 z0Var = new z0();
        zzf = z0Var;
        f4.r(z0.class, z0Var);
    }

    private z0() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new z0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s5<z0> s5Var = zzg;
                if (s5Var == null) {
                    synchronized (z0.class) {
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
}
