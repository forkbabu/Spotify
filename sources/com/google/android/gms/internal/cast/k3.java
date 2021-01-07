package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class k3 extends r5<k3, a> implements a7 {
    private static volatile i7<k3> zzahx;
    private static final k3 zzbmm;
    private int zzahj;
    private int zzbis;
    private int zzbit;
    private p3 zzbiu;

    public static final class a extends r5.b<k3, a> implements a7 {
        a(y2 y2Var) {
            super(k3.zzbmm);
        }
    }

    static {
        k3 k3Var = new k3();
        zzbmm = k3Var;
        r5.l(k3.class, k3Var);
    }

    private k3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new k3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbmm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbis", o2.a, "zzbit", "zzbiu"});
            case 4:
                return zzbmm;
            case 5:
                i7<k3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (k3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbmm);
                            zzahx = i7Var;
                        }
                    }
                }
                return i7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
