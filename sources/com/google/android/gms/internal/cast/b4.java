package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class b4 extends r5<b4, a> implements a7 {
    private static volatile i7<b4> zzahx;
    private static final b4 zzbjp;
    private int zzahj;
    private boolean zzbjj;
    private int zzbjk;
    private int zzbjl;
    private int zzbjm;
    private m4 zzbjn;
    private int zzbjo;

    public static final class a extends r5.b<b4, a> implements a7 {
        a(y2 y2Var) {
            super(b4.zzbjp);
        }
    }

    static {
        b4 b4Var = new b4();
        zzbjp = b4Var;
        r5.l(b4.class, b4Var);
    }

    private b4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new b4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbjp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"zzahj", "zzbjj", "zzbjk", s1.a, "zzbjl", u1.a, "zzbjm", l1.a, "zzbjn", "zzbjo", t1.a});
            case 4:
                return zzbjp;
            case 5:
                i7<b4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (b4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbjp);
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
