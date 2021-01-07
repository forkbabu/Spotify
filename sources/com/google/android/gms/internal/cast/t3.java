package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class t3 extends r5<t3, a> implements a7 {
    private static volatile i7<t3> zzahx;
    private static final t3 zzbge;
    private int zzahj;
    private int zzbez;
    private int zzbgb;
    private int zzbgc;
    private int zzbgd;

    public static final class a extends r5.b<t3, a> implements a7 {
        a(y2 y2Var) {
            super(t3.zzbge);
        }
    }

    static {
        t3 t3Var = new t3();
        zzbge = t3Var;
        r5.l(t3.class, t3Var);
    }

    private t3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new t3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbge, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"zzahj", "zzbgb", "zzbez", "zzbgc", a2.a, "zzbgd"});
            case 4:
                return zzbge;
            case 5:
                i7<t3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (t3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbge);
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
