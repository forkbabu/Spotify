package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class d4 extends r5<d4, a> implements a7 {
    private static volatile i7<d4> zzahx;
    private static final d4 zzbjz;
    private int zzahj;
    private int zzbfh;
    private int zzbjt;
    private int zzbju;
    private y5 zzbjv = t5.i();
    private y5 zzbjw = t5.i();
    private z5<String> zzbjx = j7.f();
    private z5<String> zzbjy = j7.f();

    public static final class a extends r5.b<d4, a> implements a7 {
        a(y2 y2Var) {
            super(d4.zzbjz);
        }
    }

    static {
        d4 d4Var = new d4();
        zzbjz = d4Var;
        r5.l(d4.class, d4Var);
    }

    private d4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new d4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbjz, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002ဌ\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007ဌ\u0002", new Object[]{"zzahj", "zzbjt", "zzbju", w1.a, "zzbjv", "zzbjw", "zzbjx", "zzbjy", "zzbfh", s1.a});
            case 4:
                return zzbjz;
            case 5:
                i7<d4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (d4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbjz);
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
