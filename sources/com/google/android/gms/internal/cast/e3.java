package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class e3 extends r5<e3, a> implements a7 {
    private static volatile i7<e3> zzahx;
    private static final e3 zzblu;
    private int zzahj;
    private int zzblr;
    private int zzbls;
    private int zzblt;

    public static final class a extends r5.b<e3, a> implements a7 {
        a(y2 y2Var) {
            super(e3.zzblu);
        }
    }

    static {
        e3 e3Var = new e3();
        zzblu = e3Var;
        r5.l(e3.class, e3Var);
    }

    private e3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new e3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzblu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zzahj", "zzblr", "zzbls", e2.a, "zzblt"});
            case 4:
                return zzblu;
            case 5:
                i7<e3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (e3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzblu);
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
