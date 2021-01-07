package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class zzcd$zzh extends f4<zzcd$zzh, a> implements m5 {
    private static final zzcd$zzh zzf;
    private static volatile s5<zzcd$zzh> zzg;
    private int zzc;
    private int zzd = 1;
    private m4<z0> zze = x5.f();

    public static final class a extends f4.b<zzcd$zzh, a> implements m5 {
        a(g1 g1Var) {
            super(zzcd$zzh.zzf);
        }
    }

    public enum zza implements j4 {
        RADS(1),
        PROVISIONING(2);
        
        private final int zzd;

        private zza(int i) {
            this.zzd = i;
        }

        public static zza d(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        @Override // com.google.android.gms.internal.measurement.j4
        public final int a() {
            return this.zzd;
        }

        @Override // java.lang.Enum, java.lang.Object
        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }
    }

    static {
        zzcd$zzh zzcd_zzh = new zzcd$zzh();
        zzf = zzcd_zzh;
        f4.r(zzcd$zzh.class, zzcd_zzh);
    }

    private zzcd$zzh() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new zzcd$zzh();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", h1.a, "zze", z0.class});
            case 4:
                return zzf;
            case 5:
                s5<zzcd$zzh> s5Var = zzg;
                if (s5Var == null) {
                    synchronized (zzcd$zzh.class) {
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
