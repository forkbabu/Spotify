package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class k4 extends r5<k4, a> implements a7 {
    private static volatile i7<k4> zzahx;
    private static final k4 zzbks;
    private int zzahj;
    private String zzbeo = "";
    private String zzbep = "";

    public static final class a extends r5.b<k4, a> implements a7 {
        a(y2 y2Var) {
            super(k4.zzbks);
        }
    }

    static {
        k4 k4Var = new k4();
        zzbks = k4Var;
        r5.l(k4.class, k4Var);
    }

    private k4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new k4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbks, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbeo", "zzbep"});
            case 4:
                return zzbks;
            case 5:
                i7<k4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (k4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbks);
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
