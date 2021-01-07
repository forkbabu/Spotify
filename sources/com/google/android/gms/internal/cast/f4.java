package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class f4 extends r5<f4, a> implements a7 {
    private static volatile i7<f4> zzahx;
    private static final f4 zzbke;
    private int zzahj;
    private int zzbkb;
    private int zzbkc;
    private int zzbkd;

    public static final class a extends r5.b<f4, a> implements a7 {
        a(y2 y2Var) {
            super(f4.zzbke);
        }
    }

    static {
        f4 f4Var = new f4();
        zzbke = f4Var;
        r5.l(f4.class, f4Var);
    }

    private f4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new f4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbke, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzahj", "zzbkb", w1.a, "zzbkc", "zzbkd"});
            case 4:
                return zzbke;
            case 5:
                i7<f4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (f4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbke);
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
