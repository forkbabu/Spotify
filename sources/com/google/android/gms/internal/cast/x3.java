package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class x3 extends r5<x3, a> implements a7 {
    private static volatile i7<x3> zzahx;
    private static final x3 zzbir;
    private int zzahj;
    private int zzbio = 0;
    private Object zzbip;
    private long zzbiq;

    public static final class a extends r5.b<x3, a> implements a7 {
        a(y2 y2Var) {
            super(x3.zzbir);
        }
    }

    static {
        x3 x3Var = new x3();
        zzbir = x3Var;
        r5.l(x3.class, x3Var);
    }

    private x3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new x3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbir, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002်\u0000\u0003ဵ\u0000\u0004း\u0000", new Object[]{"zzbip", "zzbio", "zzahj", "zzbiq"});
            case 4:
                return zzbir;
            case 5:
                i7<x3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (x3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbir);
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
