package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class x0 extends r5<x0, a> implements a7 {
    private static final x0 zzahw;
    private static volatile i7<x0> zzahx;
    private int zzahj;
    private int zzahk;
    private int zzahl;
    private int zzahm;
    private int zzahn;
    private int zzaho;
    private int zzahp;
    private int zzahq;
    private int zzahr;
    private int zzahs;
    private int zzaht;
    private int zzahu;
    private boolean zzahv;

    public static final class a extends r5.b<x0, a> implements a7 {
        a(w0 w0Var) {
            super(x0.zzahw);
        }
    }

    static {
        x0 x0Var = new x0();
        zzahw = x0Var;
        r5.l(x0.class, x0Var);
    }

    private x0() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (w0.a[i - 1]) {
            case 1:
                return new x0();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzahw, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tင\b\nင\t\u000bင\n\fဇ\u000b", new Object[]{"zzahj", "zzahk", "zzahl", "zzahm", b1.a, "zzahn", c1.a, "zzaho", a1.a, "zzahp", d1.a, "zzahq", e1.a, "zzahr", z0.a, "zzahs", "zzaht", "zzahu", "zzahv"});
            case 4:
                return zzahw;
            case 5:
                i7<x0> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (x0.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzahw);
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
