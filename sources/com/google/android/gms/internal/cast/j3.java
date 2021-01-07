package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class j3 extends r5<j3, a> implements a7 {
    private static volatile i7<j3> zzahx;
    private static final j3 zzbml;
    private int zzahj;
    private p3 zzbiu;

    public static final class a extends r5.b<j3, a> implements a7 {
        a(y2 y2Var) {
            super(j3.zzbml);
        }
    }

    static {
        j3 j3Var = new j3();
        zzbml = j3Var;
        r5.l(j3.class, j3Var);
    }

    private j3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new j3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbml, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzahj", "zzbiu"});
            case 4:
                return zzbml;
            case 5:
                i7<j3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (j3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbml);
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
