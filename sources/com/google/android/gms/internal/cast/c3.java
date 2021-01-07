package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class c3 extends r5<c3, a> implements a7 {
    private static volatile i7<c3> zzahx;
    private static final c3 zzblj;
    private int zzahj;
    private int zzbkc;
    private String zzbli = "";

    public static final class a extends r5.b<c3, a> implements a7 {
        a(y2 y2Var) {
            super(c3.zzblj);
        }
    }

    static {
        c3 c3Var = new c3();
        zzblj = c3Var;
        r5.l(c3.class, c3Var);
    }

    private c3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new c3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzblj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbkc", "zzbli"});
            case 4:
                return zzblj;
            case 5:
                i7<c3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (c3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzblj);
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
