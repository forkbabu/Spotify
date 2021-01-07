package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;

public final class zzci$zzb extends f4<zzci$zzb, a> implements m5 {
    private static final zzci$zzb zzk;
    private static volatile s5<zzci$zzb> zzl;
    private int zzc;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private long zzg;
    private double zzh;
    private m4<zzci$zzb> zzi = x5.f();
    private String zzj = "";

    public static final class a extends f4.b<zzci$zzb, a> implements m5 {
        a(i1 i1Var) {
            super(zzci$zzb.zzk);
        }
    }

    public enum zzb implements j4 {
        UNDEFINED(0),
        NULL(1),
        STRING(2),
        NUMBER(3),
        BOOLEAN(4),
        LIST(5),
        MAP(6),
        STATEMENT(7);
        
        private final int zzj;

        private zzb(int i) {
            this.zzj = i;
        }

        public static zzb d(int i) {
            switch (i) {
                case 0:
                    return UNDEFINED;
                case 1:
                    return NULL;
                case 2:
                    return STRING;
                case 3:
                    return NUMBER;
                case 4:
                    return BOOLEAN;
                case 5:
                    return LIST;
                case 6:
                    return MAP;
                case 7:
                    return STATEMENT;
                default:
                    return null;
            }
        }

        @Override // com.google.android.gms.internal.measurement.j4
        public final int a() {
            return this.zzj;
        }

        @Override // java.lang.Enum, java.lang.Object
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
        }
    }

    static {
        zzci$zzb zzci_zzb = new zzci$zzb();
        zzk = zzci_zzb;
        f4.r(zzci$zzb.class, zzci_zzb);
    }

    private zzci$zzb() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (i1.a[i - 1]) {
            case 1:
                return new zzci$zzb();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", l1.a, "zze", "zzf", "zzg", "zzh", "zzi", zzci$zzb.class, "zzj"});
            case 4:
                return zzk;
            case 5:
                s5<zzci$zzb> s5Var = zzl;
                if (s5Var == null) {
                    synchronized (zzci$zzb.class) {
                        s5Var = zzl;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzk);
                            zzl = s5Var;
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
