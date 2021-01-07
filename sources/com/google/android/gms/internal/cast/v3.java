package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class v3 extends r5<v3, a> implements a7 {
    private static volatile i7<v3> zzahx;
    private static final v3 zzbgm;
    private int zzahj;
    private int zzbgh;
    private int zzbgi;
    private int zzbgj;
    private boolean zzbgk;
    private int zzbgl;

    public static final class a extends r5.b<v3, a> implements a7 {
        a(y2 y2Var) {
            super(v3.zzbgm);
        }
    }

    static {
        v3 v3Var = new v3();
        zzbgm = v3Var;
        r5.l(v3.class, v3Var);
    }

    private v3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new v3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbgm, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzahj", "zzbgh", h2.a, "zzbgi", f2.a, "zzbgj", g2.a, "zzbgk", "zzbgl"});
            case 4:
                return zzbgm;
            case 5:
                i7<v3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (v3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbgm);
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
