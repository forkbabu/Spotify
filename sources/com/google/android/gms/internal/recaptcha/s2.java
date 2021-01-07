package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.g0;

public final class s2 extends g0<s2, a> implements g1 {
    private static final s2 zzh;
    private static volatile n1<s2> zzi;
    private int zzc;
    private String zzd = "";
    private t2 zze;
    private String zzf = "";
    private String zzg = "";

    public static final class a extends g0.b<s2, a> implements g1 {
        a(q2 q2Var) {
            super(s2.zzh);
        }
    }

    static {
        s2 s2Var = new s2();
        zzh = s2Var;
        g0.f(s2.class, s2Var);
    }

    private s2() {
    }

    public static s2 g() {
        return zzh;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.recaptcha.g0
    public final Object c(int i, Object obj, Object obj2) {
        switch (q2.a[i - 1]) {
            case 1:
                return new s2();
            case 2:
                return new a(null);
            case 3:
                return new o1(zzh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"zzc", "zzd", "zzf", "zzg", "zze"});
            case 4:
                return zzh;
            case 5:
                n1<s2> n1Var = zzi;
                if (n1Var == null) {
                    synchronized (s2.class) {
                        n1Var = zzi;
                        if (n1Var == null) {
                            n1Var = new g0.a<>(zzh);
                            zzi = n1Var;
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
