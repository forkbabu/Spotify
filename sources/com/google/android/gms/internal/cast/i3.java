package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class i3 extends r5<i3, a> implements a7 {
    private static volatile i7<i3> zzahx;
    private static final i3 zzbmk;
    private int zzahj;
    private String zzbhd = "";
    private z5<f4> zzbmh = j7.f();
    private z5<z3> zzbmi = j7.f();
    private boolean zzbmj;

    public static final class a extends r5.b<i3, a> implements a7 {
        a(y2 y2Var) {
            super(i3.zzbmk);
        }
    }

    static {
        i3 i3Var = new i3();
        zzbmk = i3Var;
        r5.l(i3.class, i3Var);
    }

    private i3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new i3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbmk, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzahj", "zzbhd", "zzbmh", f4.class, "zzbmi", z3.class, "zzbmj"});
            case 4:
                return zzbmk;
            case 5:
                i7<i3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (i3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbmk);
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
