package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class h4 extends r5<h4, a> implements a7 {
    private static volatile i7<h4> zzahx;
    private static final h4 zzbkk;
    private int zzahj;
    private int zzbkh;
    private int zzbki;
    private f4 zzbkj;

    public static final class a extends r5.b<h4, a> implements a7 {
        a(y2 y2Var) {
            super(h4.zzbkk);
        }
    }

    static {
        h4 h4Var = new h4();
        zzbkk = h4Var;
        r5.l(h4.class, h4Var);
    }

    private h4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new h4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbkk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbkh", "zzbki", "zzbkj"});
            case 4:
                return zzbkk;
            case 5:
                i7<h4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (h4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbkk);
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
