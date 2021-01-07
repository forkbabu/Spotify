package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.g0;

public final class t2 extends g0<t2, a> implements g1 {
    private static final t2 zzi;
    private static volatile n1<t2> zzj;
    private String zzc = "";
    private int zzd;
    private String zze = "";
    private long zzf;
    private o zzg;
    private int zzh;

    public static final class a extends g0.b<t2, a> implements g1 {
        a(q2 q2Var) {
            super(t2.zzi);
        }
    }

    static {
        t2 t2Var = new t2();
        zzi = t2Var;
        g0.f(t2.class, t2Var);
    }

    private t2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.g0
    public final Object c(int i, Object obj, Object obj2) {
        switch (q2.a[i - 1]) {
            case 1:
                return new t2();
            case 2:
                return new a(null);
            case 3:
                return new o1(zzi, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0002\u0005\t\u0007\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                n1<t2> n1Var = zzj;
                if (n1Var == null) {
                    synchronized (t2.class) {
                        n1Var = zzj;
                        if (n1Var == null) {
                            n1Var = new g0.a<>(zzi);
                            zzj = n1Var;
                        }
                    }
                }
                return n1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
