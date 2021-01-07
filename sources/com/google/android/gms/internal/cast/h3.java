package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class h3 extends r5<h3, a> implements a7 {
    private static volatile i7<h3> zzahx;
    private static final h3 zzbmg;
    private int zzahj;
    private z3 zzbfq;
    private int zzbgf;
    private long zzbkt;
    private int zzbmc;
    private int zzbmd;
    private int zzbme;
    private z5<z3> zzbmf = j7.f();

    public static final class a extends r5.b<h3, a> implements a7 {
        a(y2 y2Var) {
            super(h3.zzbmg);
        }
    }

    static {
        h3 h3Var = new h3();
        zzbmg = h3Var;
        r5.l(h3.class, h3Var);
    }

    private h3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new h3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbmg, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzahj", "zzbfq", "zzbmc", k2.a, "zzbgf", j2.a, "zzbmd", s1.a, "zzbme", m1.a, "zzbkt", "zzbmf", z3.class});
            case 4:
                return zzbmg;
            case 5:
                i7<h3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (h3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbmg);
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
