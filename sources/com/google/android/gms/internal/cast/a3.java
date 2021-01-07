package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class a3 extends r5<a3, a> implements a7 {
    private static volatile i7<a3> zzahx;
    private static final a3 zzbld;
    private int zzahj;
    private long zzbla;
    private a6 zzblb = o6.h();
    private a6 zzblc = o6.h();

    public static final class a extends r5.b<a3, a> implements a7 {
        a(y2 y2Var) {
            super(a3.zzbld);
        }
    }

    static {
        a3 a3Var = new a3();
        zzbld = a3Var;
        r5.l(a3.class, a3Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.o6, com.google.android.gms.internal.cast.a6] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.cast.o6, com.google.android.gms.internal.cast.a6] */
    private a3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new a3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbld, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzahj", "zzbla", "zzblb", "zzblc"});
            case 4:
                return zzbld;
            case 5:
                i7<a3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (a3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbld);
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
