package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class j1 extends f4<j1, a> implements m5 {
    private static final j1 zzd;
    private static volatile s5<j1> zze;
    private m4<zzci$zzb> zzc = x5.f();

    public static final class a extends f4.b<j1, a> implements m5 {
        a(i1 i1Var) {
            super(j1.zzd);
        }
    }

    static {
        j1 j1Var = new j1();
        zzd = j1Var;
        f4.r(j1.class, j1Var);
    }

    private j1() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (i1.a[i - 1]) {
            case 1:
                return new j1();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzci$zzb.class});
            case 4:
                return zzd;
            case 5:
                s5<j1> s5Var = zze;
                if (s5Var == null) {
                    synchronized (j1.class) {
                        s5Var = zze;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzd);
                            zze = s5Var;
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
