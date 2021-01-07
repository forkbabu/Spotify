package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class g3 extends r5<g3, a> implements a7 {
    private static volatile i7<g3> zzahx;
    private static final g3 zzbmb;
    private int zzahj;
    private int zzblz;
    private int zzbma;

    public static final class a extends r5.b<g3, a> implements a7 {
        a(y2 y2Var) {
            super(g3.zzbmb);
        }
    }

    static {
        g3 g3Var = new g3();
        zzbmb = g3Var;
        r5.l(g3.class, g3Var);
    }

    private g3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new g3();
            case 2:
                return new a(null);
            case 3:
                w5 w5Var = h2.a;
                return new n7(zzbmb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzahj", "zzblz", w5Var, "zzbma", w5Var});
            case 4:
                return zzbmb;
            case 5:
                i7<g3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (g3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbmb);
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
