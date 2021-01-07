package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class j4 extends r5<j4, a> implements a7 {
    private static volatile i7<j4> zzahx;
    private static final j4 zzbkr;
    private int zzahj;
    private byte zzbim = 2;
    private int zzbko;
    private int zzbkp;
    private int zzbkq;

    public static final class a extends r5.b<j4, a> implements a7 {
        a(y2 y2Var) {
            super(j4.zzbkr);
        }
    }

    static {
        j4 j4Var = new j4();
        zzbkr = j4Var;
        r5.l(j4.class, j4Var);
    }

    private j4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        int i2 = 1;
        switch (y2.a[i - 1]) {
            case 1:
                return new j4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbkr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzahj", "zzbko", b2.a, "zzbkp", "zzbkq", x2.a});
            case 4:
                return zzbkr;
            case 5:
                i7<j4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (j4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbkr);
                            zzahx = i7Var;
                        }
                    }
                }
                return i7Var;
            case 6:
                return Byte.valueOf(this.zzbim);
            case 7:
                if (obj == null) {
                    i2 = 0;
                }
                this.zzbim = (byte) i2;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
