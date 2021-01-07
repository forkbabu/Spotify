package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class zzbv$zzd extends f4<zzbv$zzd, a> implements m5 {
    private static final zzbv$zzd zzi;
    private static volatile s5<zzbv$zzd> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    public static final class a extends f4.b<zzbv$zzd, a> implements m5 {
        a(o0 o0Var) {
            super(zzbv$zzd.zzi);
        }
    }

    public enum zza implements j4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        private final int zzg;

        private zza(int i) {
            this.zzg = i;
        }

        public static zza d(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        @Override // com.google.android.gms.internal.measurement.j4
        public final int a() {
            return this.zzg;
        }

        @Override // java.lang.Enum, java.lang.Object
        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }
    }

    static {
        zzbv$zzd zzbv_zzd = new zzbv$zzd();
        zzi = zzbv_zzd;
        f4.r(zzbv$zzd.class, zzbv_zzd);
    }

    private zzbv$zzd() {
    }

    public static zzbv$zzd E() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzc & 8) != 0;
    }

    public final String B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zzc & 16) != 0;
    }

    public final String D() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (o0.a[i - 1]) {
            case 1:
                return new zzbv$zzd();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", p0.a, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                s5<zzbv$zzd> s5Var = zzj;
                if (s5Var == null) {
                    synchronized (zzbv$zzd.class) {
                        s5Var = zzj;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzi);
                            zzj = s5Var;
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

    public final boolean u() {
        return (this.zzc & 1) != 0;
    }

    public final zza v() {
        zza d = zza.d(this.zzd);
        return d == null ? zza.UNKNOWN_COMPARISON_TYPE : d;
    }

    public final boolean w() {
        return (this.zzc & 2) != 0;
    }

    public final boolean x() {
        return this.zze;
    }

    public final boolean y() {
        return (this.zzc & 4) != 0;
    }

    public final String z() {
        return this.zzf;
    }
}
