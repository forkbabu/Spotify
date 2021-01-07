package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class f3 extends r5<f3, a> implements a7 {
    private static volatile i7<f3> zzahx;
    private static final f3 zzbly;
    private int zzahj;
    private z5<k3> zzblv = j7.f();
    private z5<y3> zzblw = j7.f();
    private j3 zzblx;

    public static final class a extends r5.b<f3, a> implements a7 {
        a(y2 y2Var) {
            super(f3.zzbly);
        }
    }

    static {
        f3 f3Var = new f3();
        zzbly = f3Var;
        r5.l(f3.class, f3Var);
    }

    private f3() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new f3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbly, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzahj", "zzblv", k3.class, "zzblw", y3.class, "zzblx"});
            case 4:
                return zzbly;
            case 5:
                i7<f3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (f3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbly);
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
