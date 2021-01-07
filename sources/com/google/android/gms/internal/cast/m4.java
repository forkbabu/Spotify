package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class m4 extends r5<m4, a> implements a7 {
    private static volatile i7<m4> zzahx;
    private static final m4 zzbkz;
    private int zzahj;
    private int zzbft;
    private int zzbjo;
    private int zzbkc;
    private int zzbkw;
    private boolean zzbkx;
    private boolean zzbky;

    public static final class a extends r5.b<m4, a> implements a7 {
        a(y2 y2Var) {
            super(m4.zzbkz);
        }
    }

    static {
        m4 m4Var = new m4();
        zzbkz = m4Var;
        r5.l(m4.class, m4Var);
    }

    private m4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new m4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbkz, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဆ\u0005", new Object[]{"zzahj", "zzbkc", "zzbkw", d2.a, "zzbkx", "zzbky", "zzbjo", o1.a, "zzbft"});
            case 4:
                return zzbkz;
            case 5:
                i7<m4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (m4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbkz);
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
