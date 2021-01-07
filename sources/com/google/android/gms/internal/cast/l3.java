package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class l3 extends r5<l3, a> implements a7 {
    private static volatile i7<l3> zzahx;
    private static final l3 zzbmo;
    private int zzahj;
    private z5<c3> zzbfj = j7.f();
    private int zzblp;
    private int zzbmc;
    private z5<c3> zzbmn = j7.f();

    public static final class a extends r5.b<l3, a> implements a7 {
        a(y2 y2Var) {
            super(l3.zzbmo);
        }
    }

    static {
        l3 l3Var = new l3();
        zzbmo = l3Var;
        r5.l(l3.class, l3Var);
    }

    private l3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new l3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbmo, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzahj", "zzbmc", q2.a, "zzbfj", c3.class, "zzbmn", c3.class, "zzblp"});
            case 4:
                return zzbmo;
            case 5:
                i7<l3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (l3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbmo);
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
