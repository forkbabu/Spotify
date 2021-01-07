package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class c4 extends r5<c4, a> implements a7 {
    private static volatile i7<c4> zzahx;
    private static final c4 zzbjs;
    private int zzahj;
    private String zzbhd = "";
    private boolean zzbjq;
    private n3 zzbjr;

    public static final class a extends r5.b<c4, a> implements a7 {
        a(y2 y2Var) {
            super(c4.zzbjs);
        }
    }

    static {
        c4 c4Var = new c4();
        zzbjs = c4Var;
        r5.l(c4.class, c4Var);
    }

    private c4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new c4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbjs, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"zzahj", "zzbhd", "zzbjq", "zzbjr"});
            case 4:
                return zzbjs;
            case 5:
                i7<c4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (c4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbjs);
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
