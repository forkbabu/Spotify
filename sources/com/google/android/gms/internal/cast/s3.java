package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class s3 extends r5<s3, a> implements a7 {
    private static volatile i7<s3> zzahx;
    private static final s3 zzbga;
    private int zzahj;
    private z3 zzbfq;
    private boolean zzbfr;
    private long zzbfs;
    private int zzbft;
    private int zzbfu;
    private int zzbfv;
    private int zzbfw;
    private int zzbfx;
    private g3 zzbfy;
    private int zzbfz;

    public static final class a extends r5.b<s3, a> implements a7 {
        private a() {
            super(s3.zzbga);
        }

        public final a o(int i) {
            if (this.c) {
                k();
                this.c = false;
            }
            s3.o((s3) this.b, i);
            return this;
        }

        a(y2 y2Var) {
            super(s3.zzbga);
        }
    }

    static {
        s3 s3Var = new s3();
        zzbga = s3Var;
        r5.l(s3.class, s3Var);
    }

    private s3() {
    }

    public static a n(s3 s3Var) {
        r5.b m = zzbga.m();
        m.j(s3Var);
        return (a) m;
    }

    static void o(s3 s3Var, int i) {
        s3Var.zzahj |= 64;
        s3Var.zzbfw = i;
    }

    static void p(s3 s3Var, long j) {
        s3Var.zzahj |= 4;
        s3Var.zzbfs = j;
    }

    static void q(s3 s3Var, z3 z3Var) {
        s3Var.getClass();
        z3Var.getClass();
        s3Var.zzbfq = z3Var;
        s3Var.zzahj |= 1;
    }

    static void r(s3 s3Var, boolean z) {
        s3Var.zzahj |= 2;
        s3Var.zzbfr = z;
    }

    static void s(s3 s3Var, int i) {
        s3Var.zzahj |= 128;
        s3Var.zzbfx = i;
    }

    public static a t() {
        return (a) zzbga.m();
    }

    public static s3 u() {
        return zzbga;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new s3();
            case 2:
                return new a(null);
            case 3:
                int i2 = zzge.y0;
                return new n7(zzbga, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t", new Object[]{"zzahj", "zzbfq", "zzbfr", "zzbfs", "zzbft", "zzbfu", k1.a, "zzbfv", j1.a, "zzbfw", "zzbfx", "zzbfy", "zzbfz", t1.a});
            case 4:
                return zzbga;
            case 5:
                i7<s3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (s3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbga);
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
