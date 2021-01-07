package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class g4 extends r5<g4, a> implements a7 {
    private static volatile i7<g4> zzahx;
    private static final g4 zzbkg;
    private z5<c4> zzbkf = j7.f();

    public static final class a extends r5.b<g4, a> implements a7 {
        a(y2 y2Var) {
            super(g4.zzbkg);
        }
    }

    static {
        g4 g4Var = new g4();
        zzbkg = g4Var;
        r5.l(g4.class, g4Var);
    }

    private g4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new g4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbkg, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbkf", c4.class});
            case 4:
                return zzbkg;
            case 5:
                i7<g4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (g4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbkg);
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
