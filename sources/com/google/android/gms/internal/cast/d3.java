package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class d3 extends r5<d3, a> implements a7 {
    private static volatile i7<d3> zzahx;
    private static final d3 zzblq;
    private int zzahj;
    private String zzbfl = "";
    private boolean zzblk;
    private boolean zzbll;
    private int zzblm;
    private String zzbln = "";
    private int zzblo;
    private int zzblp;

    public static final class a extends r5.b<d3, a> implements a7 {
        a(y2 y2Var) {
            super(d3.zzblq);
        }
    }

    static {
        d3 d3Var = new d3();
        zzblq = d3Var;
        r5.l(d3.class, d3Var);
    }

    private d3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new d3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzblq, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzahj", "zzblk", "zzbll", "zzblm", "zzbln", "zzblo", "zzblp", "zzbfl"});
            case 4:
                return zzblq;
            case 5:
                i7<d3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (d3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzblq);
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
