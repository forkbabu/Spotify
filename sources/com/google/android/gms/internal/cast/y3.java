package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class y3 extends r5<y3, a> implements a7 {
    private static volatile i7<y3> zzahx;
    private static final y3 zzbiv;
    private int zzahj;
    private int zzbis;
    private int zzbit;
    private p3 zzbiu;

    public static final class a extends r5.b<y3, a> implements a7 {
        a(y2 y2Var) {
            super(y3.zzbiv);
        }
    }

    static {
        y3 y3Var = new y3();
        zzbiv = y3Var;
        r5.l(y3.class, y3Var);
    }

    private y3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new y3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbiv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbis", p1.a, "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                i7<y3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (y3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbiv);
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
