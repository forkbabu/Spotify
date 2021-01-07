package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class p3 extends r5<p3, a> implements a7 {
    private static volatile i7<p3> zzahx;
    private static final p3 zzbfe;
    private int zzahj;
    private int zzbez;
    private double zzbfa;
    private double zzbfb;
    private double zzbfc;
    private double zzbfd;

    public static final class a extends r5.b<p3, a> implements a7 {
        a(y2 y2Var) {
            super(p3.zzbfe);
        }
    }

    static {
        p3 p3Var = new p3();
        zzbfe = p3Var;
        r5.l(p3.class, p3Var);
    }

    private p3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new p3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbfe, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzahj", "zzbez", "zzbfa", "zzbfb", "zzbfc", "zzbfd"});
            case 4:
                return zzbfe;
            case 5:
                i7<p3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (p3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbfe);
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
