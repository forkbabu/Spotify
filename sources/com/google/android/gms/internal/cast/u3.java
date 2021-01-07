package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class u3 extends r5<u3, a> implements a7 {
    private static volatile i7<u3> zzahx;
    private static final u3 zzbgg;
    private int zzahj;
    private int zzbgf;

    public static final class a extends r5.b<u3, a> implements a7 {
        a(y2 y2Var) {
            super(u3.zzbgg);
        }
    }

    static {
        u3 u3Var = new u3();
        zzbgg = u3Var;
        r5.l(u3.class, u3Var);
    }

    private u3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new u3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbgg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzahj", "zzbgf", n1.a});
            case 4:
                return zzbgg;
            case 5:
                i7<u3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (u3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbgg);
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
