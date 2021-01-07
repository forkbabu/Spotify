package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class n3 extends r5<n3, a> implements a7 {
    private static volatile i7<n3> zzahx;
    private static final x5<Integer, Object> zzbmw = new p4();
    private static final n3 zzbmx;
    private int zzahj;
    private int zzbis;
    private int zzbmt;
    private y5 zzbmv = t5.i();

    public static final class a extends r5.b<n3, a> implements a7 {
        a(y2 y2Var) {
            super(n3.zzbmx);
        }
    }

    static {
        n3 n3Var = new n3();
        zzbmx = n3Var;
        r5.l(n3.class, n3Var);
    }

    private n3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new n3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbmx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001e", new Object[]{"zzahj", "zzbis", v2.a, "zzbmt", s1.a, "zzbmv", u2.a});
            case 4:
                return zzbmx;
            case 5:
                i7<n3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (n3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbmx);
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
