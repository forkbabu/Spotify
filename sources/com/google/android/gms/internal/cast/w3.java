package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;
import com.google.android.gms.internal.cast.s3;

public final class w3 extends r5<w3, a> implements a7 {
    private static volatile i7<w3> zzahx;
    private static final w3 zzbin;
    private int zzahj;
    private String zzbfl = "";
    private int zzbgn;
    private long zzbgo;
    private long zzbgp;
    private int zzbgq;
    private e4 zzbgr;
    private e3 zzbgs;
    private d4 zzbgt;
    private b4 zzbgu;
    private u3 zzbgv;
    private d3 zzbgw;
    private q3 zzbgx;
    private l3 zzbgy;
    private a4 zzbgz;
    private y0 zzbha;
    private String zzbhb = "";
    private a3 zzbhc;
    private String zzbhd = "";
    private y5 zzbhe = t5.i();
    private z5<f4> zzbhf = j7.f();
    private z5<h4> zzbhg = j7.f();
    private z5<x3> zzbhh = j7.f();
    private z5<i3> zzbhi = j7.f();
    private int zzbhj;
    private int zzbhk;
    private z3 zzbhl;
    private int zzbhm;
    private v3 zzbhn;
    private z5<z3> zzbho = j7.f();
    private z3 zzbhp;
    private int zzbhq;
    private int zzbhr;
    private int zzbhs;
    private int zzbht;
    private int zzbhu;
    private int zzbhv;
    private m3 zzbhw;
    private s3 zzbhx;
    private z2 zzbhy;
    private j4 zzbhz;
    private h3 zzbia;
    private l4 zzbib;
    private z5<r3> zzbic = j7.f();
    private int zzbid;
    private b3 zzbie;
    private z5<t3> zzbif = j7.f();
    private boolean zzbig;
    private boolean zzbih;
    private int zzbii;
    private o3 zzbij;
    private f3 zzbik;
    private g4 zzbil;
    private byte zzbim = 2;

    public static final class a extends r5.b<w3, a> implements a7 {
        private a() {
            super(w3.zzbin);
        }

        public final a o(s3.a aVar) {
            if (this.c) {
                k();
                this.c = false;
            }
            w3.s((w3) this.b, (s3) ((r5) aVar.n()));
            return this;
        }

        public final s3 p() {
            return ((w3) this.b).v();
        }

        a(y2 y2Var) {
            super(w3.zzbin);
        }
    }

    static {
        w3 w3Var = new w3();
        zzbin = w3Var;
        r5.l(w3.class, w3Var);
    }

    private w3() {
    }

    public static a n(w3 w3Var) {
        r5.b m = zzbin.m();
        m.j(w3Var);
        return (a) m;
    }

    static void o(w3 w3Var, int i) {
        w3Var.zzahj |= 268435456;
        w3Var.zzbhv = i;
    }

    static void p(w3 w3Var, long j) {
        w3Var.zzahj |= 2;
        w3Var.zzbgp = j;
    }

    static void q(w3 w3Var, o3 o3Var) {
        w3Var.getClass();
        o3Var.getClass();
        w3Var.zzbij = o3Var;
        w3Var.zzbgn |= 256;
    }

    static void r(w3 w3Var, r3 r3Var) {
        w3Var.getClass();
        r3Var.getClass();
        z5<r3> z5Var = w3Var.zzbic;
        if (!z5Var.f0()) {
            int size = z5Var.size();
            w3Var.zzbic = z5Var.H0(size == 0 ? 10 : size << 1);
        }
        w3Var.zzbic.add(r3Var);
    }

    static void s(w3 w3Var, s3 s3Var) {
        w3Var.getClass();
        w3Var.zzbhx = s3Var;
        w3Var.zzahj |= 1073741824;
    }

    static void t(w3 w3Var, String str) {
        w3Var.getClass();
        str.getClass();
        w3Var.zzahj |= 16384;
        w3Var.zzbhb = str;
    }

    static void u(w3 w3Var, String str) {
        w3Var.getClass();
        str.getClass();
        w3Var.zzahj |= 65536;
        w3Var.zzbhd = str;
    }

    public static a w() {
        return (a) zzbin.m();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        int i2 = 1;
        switch (y2.a[i - 1]) {
            case 1:
                return new w3();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbin, "\u00013\u0000\u0002\u000133\u0000\b\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000f\u0011ဈ\u0010\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017ဌ\u0011\u0018ဉ\u0015\u0019\u001b\u001aဉ\u0016\u001bဌ\u0018\u001cင\u0019\u001dင\u001a\u001eင\u001b\u001fဆ\u001c ဉ\u001d!ဉ\u001e\"ဉ\u001f#ဌ\u0012$ဉ\u0013%ᐉ &ဉ!'ဉ\"(\u001b)ဌ#*ဉ$+\u001b,ဌ\u0017-ဇ%.ဇ&/ဌ'0ဉ(1င\u00142ဉ)3ဉ*", new Object[]{"zzahj", "zzbgn", "zzbgo", "zzbgp", "zzbgq", p2.a, "zzbgr", "zzbgs", "zzbgt", "zzbgu", "zzbgv", "zzbhb", "zzbgw", "zzbgx", "zzbgy", "zzbfl", "zzbgz", "zzbha", "zzbhc", "zzbhd", "zzbhe", "zzbhf", f4.class, "zzbhg", h4.class, "zzbhh", x3.class, "zzbhi", i3.class, "zzbhj", n2.a, "zzbhn", "zzbho", z3.class, "zzbhp", "zzbhr", y1.a, "zzbhs", "zzbht", "zzbhu", "zzbhv", "zzbhw", "zzbhx", "zzbhy", "zzbhk", l2.a, "zzbhl", "zzbhz", "zzbia", "zzbib", "zzbic", r3.class, "zzbid", m2.a, "zzbie", "zzbif", t3.class, "zzbhq", x1.a, "zzbig", "zzbih", "zzbii", v1.a, "zzbij", "zzbhm", "zzbik", "zzbil"});
            case 4:
                return zzbin;
            case 5:
                i7<w3> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (w3.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbin);
                            zzahx = i7Var;
                        }
                    }
                }
                return i7Var;
            case 6:
                return Byte.valueOf(this.zzbim);
            case 7:
                if (obj == null) {
                    i2 = 0;
                }
                this.zzbim = (byte) i2;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final s3 v() {
        s3 s3Var = this.zzbhx;
        return s3Var == null ? s3.u() : s3Var;
    }
}
