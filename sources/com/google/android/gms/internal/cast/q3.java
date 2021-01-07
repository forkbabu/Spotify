package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class q3 extends r5<q3, a> implements a7 {
    private static volatile i7<q3> zzahx;
    private static final q3 zzbfm;
    private int zzahj;
    private int zzbff;
    private boolean zzbfg;
    private int zzbfh;
    private boolean zzbfi;
    private z5<c3> zzbfj = j7.f();
    private z5<c3> zzbfk = j7.f();
    private String zzbfl = "";

    public static final class a extends r5.b<q3, a> implements a7 {
        a(y2 y2Var) {
            super(q3.zzbfm);
        }
    }

    static {
        q3 q3Var = new q3();
        zzbfm = q3Var;
        r5.l(q3.class, q3Var);
    }

    private q3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new q3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbfm, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzahj", "zzbff", i1.a, "zzbfg", "zzbfh", s1.a, "zzbfi", "zzbfj", c3.class, "zzbfk", c3.class, "zzbfl"});
            case 4:
                return zzbfm;
            case 5:
                i7<q3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (q3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbfm);
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
