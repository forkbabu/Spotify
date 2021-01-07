package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class b3 extends r5<b3, a> implements a7 {
    private static volatile i7<b3> zzahx;
    private static final b3 zzblh;
    private int zzahj;
    private int zzble;
    private int zzblf;
    private int zzblg;

    public static final class a extends r5.b<b3, a> implements a7 {
        a(y2 y2Var) {
            super(b3.zzblh);
        }
    }

    static {
        b3 b3Var = new b3();
        zzblh = b3Var;
        r5.l(b3.class, b3Var);
    }

    private b3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new b3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzblh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzahj", "zzble", "zzblf", "zzblg"});
            case 4:
                return zzblh;
            case 5:
                i7<b3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (b3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzblh);
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
