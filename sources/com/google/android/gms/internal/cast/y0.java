package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class y0 extends r5<y0, a> implements a7 {
    private static volatile i7<y0> zzahx;
    private static final y0 zzajg;
    private int zzahj;
    private int zzaja;
    private int zzajb;
    private int zzajc;
    private int zzajd;
    private x0 zzaje;
    private int zzajf;

    public static final class a extends r5.b<y0, a> implements a7 {
        a(w0 w0Var) {
            super(y0.zzajg);
        }
    }

    static {
        y0 y0Var = new y0();
        zzajg = y0Var;
        r5.l(y0.class, y0Var);
    }

    private y0() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (w0.a[i - 1]) {
            case 1:
                return new y0();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzajg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzahj", "zzaja", "zzajb", h1.a, "zzajc", "zzajd", "zzaje", "zzajf", f1.a});
            case 4:
                return zzajg;
            case 5:
                i7<y0> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (y0.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzajg);
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
