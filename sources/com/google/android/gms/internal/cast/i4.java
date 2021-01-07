package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class i4 extends r5<i4, a> implements a7 {
    private static volatile i7<i4> zzahx;
    private static final i4 zzbkn;
    private int zzahj;
    private int zzbkl;
    private int zzbkm;

    public static final class a extends r5.b<i4, a> implements a7 {
        a(y2 y2Var) {
            super(i4.zzbkn);
        }
    }

    static {
        i4 i4Var = new i4();
        zzbkn = i4Var;
        r5.l(i4.class, i4Var);
    }

    private i4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new i4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbkn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"zzahj", "zzbkl", r1.a, "zzbkm"});
            case 4:
                return zzbkn;
            case 5:
                i7<i4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (i4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbkn);
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
