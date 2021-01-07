package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.g0;

public final class o extends g0<o, a> implements g1 {
    private static final o zze;
    private static volatile n1<o> zzf;
    private int zzc;
    private String zzd = "";

    public static final class a extends g0.b<o, a> implements g1 {
        a(n nVar) {
            super(o.zze);
        }
    }

    static {
        o oVar = new o();
        zze = oVar;
        g0.f(o.class, oVar);
    }

    private o() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.g0
    public final Object c(int i, Object obj, Object obj2) {
        switch (n.a[i - 1]) {
            case 1:
                return new o();
            case 2:
                return new a(null);
            case 3:
                return new o1(zze, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0000", new Object[]{"zzc", "zzd"});
            case 4:
                return zze;
            case 5:
                n1<o> n1Var = zzf;
                if (n1Var == null) {
                    synchronized (o.class) {
                        n1Var = zzf;
                        if (n1Var == null) {
                            n1Var = new g0.a<>(zze);
                            zzf = n1Var;
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
