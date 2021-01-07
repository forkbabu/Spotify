package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class r3 extends r5<r3, a> implements a7 {
    private static volatile i7<r3> zzahx;
    private static final r3 zzbfp;
    private int zzahj;
    private String zzbfn = "";
    private String zzbfo = "";

    public static final class a extends r5.b<r3, a> implements a7 {
        private a() {
            super(r3.zzbfp);
        }

        a(y2 y2Var) {
            super(r3.zzbfp);
        }
    }

    static {
        r3 r3Var = new r3();
        zzbfp = r3Var;
        r5.l(r3.class, r3Var);
    }

    private r3() {
    }

    static void n(r3 r3Var, String str) {
        r3Var.getClass();
        str.getClass();
        r3Var.zzahj |= 1;
        r3Var.zzbfn = str;
    }

    static void o(r3 r3Var, String str) {
        r3Var.getClass();
        str.getClass();
        r3Var.zzahj |= 2;
        r3Var.zzbfo = str;
    }

    public static a p() {
        return (a) zzbfp.m();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new r3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbfp, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzahj", "zzbfn", "zzbfo"});
            case 4:
                return zzbfp;
            case 5:
                i7<r3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (r3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbfp);
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
