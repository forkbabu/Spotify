package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class l4 extends r5<l4, a> implements a7 {
    private static volatile i7<l4> zzahx;
    private static final l4 zzbkv;
    private int zzahj;
    private int zzbgf;
    private long zzbkt;
    private int zzbku;

    public static final class a extends r5.b<l4, a> implements a7 {
        a(y2 y2Var) {
            super(l4.zzbkv);
        }
    }

    static {
        l4 l4Var = new l4();
        zzbkv = l4Var;
        r5.l(l4.class, l4Var);
    }

    private l4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new l4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbkv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"zzahj", "zzbgf", c2.a, "zzbkt", "zzbku", m1.a});
            case 4:
                return zzbkv;
            case 5:
                i7<l4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (l4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbkv);
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
