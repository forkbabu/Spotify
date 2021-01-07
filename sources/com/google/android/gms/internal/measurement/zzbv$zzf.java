package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class zzbv$zzf extends f4<zzbv$zzf, a> implements m5 {
    private static final zzbv$zzf zzh;
    private static volatile s5<zzbv$zzf> zzi;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private m4<String> zzg = x5.f();

    public static final class a extends f4.b<zzbv$zzf, a> implements m5 {
        a(o0 o0Var) {
            super(zzbv$zzf.zzh);
        }
    }

    public enum zzb implements j4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        private final int zzi;

        private zzb(int i) {
            this.zzi = i;
        }

        public static zzb d(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        @Override // com.google.android.gms.internal.measurement.j4
        public final int a() {
            return this.zzi;
        }

        @Override // java.lang.Enum, java.lang.Object
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }
    }

    static {
        zzbv$zzf zzbv_zzf = new zzbv$zzf();
        zzh = zzbv_zzf;
        f4.r(zzbv$zzf.class, zzbv_zzf);
    }

    private zzbv$zzf() {
    }

    public static zzbv$zzf C() {
        return zzh;
    }

    public final List<String> A() {
        return this.zzg;
    }

    public final int B() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (o0.a[i - 1]) {
            case 1:
                return new zzbv$zzf();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", u0.a, "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                s5<zzbv$zzf> s5Var = zzi;
                if (s5Var == null) {
                    synchronized (zzbv$zzf.class) {
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

    public final boolean u() {
        return (this.zzc & 1) != 0;
    }

    public final zzb v() {
        zzb d = zzb.d(this.zzd);
        return d == null ? zzb.UNKNOWN_MATCH_TYPE : d;
    }

    public final boolean w() {
        return (this.zzc & 2) != 0;
    }

    public final String x() {
        return this.zze;
    }

    public final boolean y() {
        return (this.zzc & 4) != 0;
    }

    public final boolean z() {
        return this.zzf;
    }
}
