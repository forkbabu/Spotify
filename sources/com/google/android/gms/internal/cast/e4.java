package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class e4 extends r5<e4, a> implements a7 {
    private static volatile i7<e4> zzahx;
    private static final e4 zzbka;
    private int zzahj;
    private int zzbju;

    public static final class a extends r5.b<e4, a> implements a7 {
        a(y2 y2Var) {
            super(e4.zzbka);
        }
    }

    static {
        e4 e4Var = new e4();
        zzbka = e4Var;
        r5.l(e4.class, e4Var);
    }

    private e4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new e4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbka, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzahj", "zzbju", w1.a});
            case 4:
                return zzbka;
            case 5:
                i7<e4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (e4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbka);
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
