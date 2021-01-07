package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;
import java.util.Iterator;

public final class o3 extends r5<o3, a> implements a7 {
    private static volatile i7<o3> zzahx;
    private static final x5<Integer, zzkj> zzbex = new o4();
    private static final o3 zzbey;
    private int zzahj;
    private r3 zzbet;
    private k4 zzbeu;
    private z5<i4> zzbev = j7.f();
    private y5 zzbew = t5.i();

    public static final class a extends r5.b<o3, a> implements a7 {
        private a() {
            super(o3.zzbey);
        }

        a(y2 y2Var) {
            super(o3.zzbey);
        }
    }

    static {
        o3 o3Var = new o3();
        zzbey = o3Var;
        r5.l(o3.class, o3Var);
    }

    private o3() {
    }

    static void n(o3 o3Var, r3 r3Var) {
        o3Var.getClass();
        r3Var.getClass();
        o3Var.zzbet = r3Var;
        o3Var.zzahj |= 1;
    }

    static void o(o3 o3Var, Iterable iterable) {
        y5 y5Var = o3Var.zzbew;
        if (!((t4) y5Var).f0()) {
            t5 t5Var = (t5) y5Var;
            int size = t5Var.size();
            o3Var.zzbew = t5Var.H0(size == 0 ? 10 : size << 1);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((t5) o3Var.zzbew).e(((zzkj) it.next()).j());
        }
    }

    public static a p() {
        return (a) zzbey.m();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new o3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbey, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zzahj", "zzbet", "zzbeu", "zzbev", i4.class, "zzbew", w2.a});
            case 4:
                return zzbey;
            case 5:
                i7<o3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (o3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbey);
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
