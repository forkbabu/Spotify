package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class z2 extends r5<z2, a> implements a7 {
    private static volatile i7<z2> zzahx;
    private static final x5<Integer, zzkj> zzber = new n4();
    private static final z2 zzbes;
    private int zzahj;
    private String zzbeo = "";
    private String zzbep = "";
    private y5 zzbeq = t5.i();

    public static final class a extends r5.b<z2, a> implements a7 {
        a(y2 y2Var) {
            super(z2.zzbes);
        }
    }

    static {
        z2 z2Var = new z2();
        zzbes = z2Var;
        r5.l(z2.class, z2Var);
    }

    private z2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new z2();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbes, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"zzahj", "zzbeo", "zzbep", "zzbeq", w2.a});
            case 4:
                return zzbes;
            case 5:
                i7<z2> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (z2.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbes);
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
