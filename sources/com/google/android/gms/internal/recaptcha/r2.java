package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.g0;

public final class r2 extends g0<r2, a> implements g1 {
    private static final r2 zzg;
    private static volatile n1<r2> zzh;
    private int zzc;
    private String zzd = "";
    private t2 zze;
    private String zzf = "";

    public static final class a extends g0.b<r2, a> implements g1 {
        a(q2 q2Var) {
            super(r2.zzg);
        }
    }

    static {
        r2 r2Var = new r2();
        zzg = r2Var;
        g0.f(r2.class, r2Var);
    }

    private r2() {
    }

    public static r2 g() {
        return zzg;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.g0
    public final Object c(int i, Object obj, Object obj2) {
        switch (q2.a[i - 1]) {
            case 1:
                return new r2();
            case 2:
                return new a(null);
            case 3:
                return new o1(zzg, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\t\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 4:
                return zzg;
            case 5:
                n1<r2> n1Var = zzh;
                if (n1Var == null) {
                    synchronized (r2.class) {
                        n1Var = zzh;
                        if (n1Var == null) {
                            n1Var = new g0.a<>(zzg);
                            zzh = n1Var;
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
