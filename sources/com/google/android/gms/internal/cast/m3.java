package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class m3 extends r5<m3, a> implements a7 {
    private static volatile i7<m3> zzahx;
    private static final m3 zzbmu;
    private int zzahj;
    private int zzbmp;
    private int zzbmq;
    private z5<z3> zzbmr = j7.f();
    private z5<z3> zzbms = j7.f();
    private int zzbmt;

    public static final class a extends r5.b<m3, a> implements a7 {
        a(y2 y2Var) {
            super(m3.zzbmu);
        }
    }

    static {
        m3 m3Var = new m3();
        zzbmu = m3Var;
        r5.l(m3.class, m3Var);
    }

    private m3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new m3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbmu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"zzahj", "zzbmp", r2.a, "zzbmq", t2.a, "zzbmr", z3.class, "zzbms", z3.class, "zzbmt", s1.a});
            case 4:
                return zzbmu;
            case 5:
                i7<m3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (m3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbmu);
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
