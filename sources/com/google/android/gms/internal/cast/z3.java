package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class z3 extends r5<z3, a> implements a7 {
    private static volatile i7<z3> zzahx;
    private static final z3 zzbiy;
    private int zzahj;
    private String zzbiw = "";
    private String zzbix = "";

    public static final class a extends r5.b<z3, a> implements a7 {
        private a() {
            super(z3.zzbiy);
        }

        a(y2 y2Var) {
            super(z3.zzbiy);
        }
    }

    static {
        z3 z3Var = new z3();
        zzbiy = z3Var;
        r5.l(z3.class, z3Var);
    }

    private z3() {
    }

    static void n(z3 z3Var, String str) {
        z3Var.getClass();
        str.getClass();
        z3Var.zzahj |= 1;
        z3Var.zzbiw = str;
    }

    public static a o() {
        return (a) zzbiy.m();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new z3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbiy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbiw", "zzbix"});
            case 4:
                return zzbiy;
            case 5:
                i7<z3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (z3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbiy);
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
