package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.f4;
import java.util.Collections;
import java.util.List;

public final class y0 extends f4<y0, a> implements m5 {
    private static final y0 zzi;
    private static volatile s5<y0> zzj;
    private int zzc;
    private m4<a1> zzd = x5.f();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    public static final class a extends f4.b<y0, a> implements m5 {
        private a() {
            super(y0.zzi);
        }

        public final a1 A(int i) {
            return ((y0) this.b).u(i);
        }

        public final List<a1> B() {
            return Collections.unmodifiableList(((y0) this.b).v());
        }

        public final int C() {
            return ((y0) this.b).D();
        }

        public final a D(int i) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.x((y0) this.b, i);
            return this;
        }

        public final a E(long j) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.E((y0) this.b, j);
            return this;
        }

        public final a F() {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.w((y0) this.b);
            return this;
        }

        public final String G() {
            return ((y0) this.b).F();
        }

        public final long H() {
            return ((y0) this.b).H();
        }

        public final long I() {
            return ((y0) this.b).J();
        }

        public final a t(int i, a1.a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.y((y0) this.b, i, (a1) ((f4) aVar.s()));
            return this;
        }

        public final a u(int i, a1 a1Var) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.y((y0) this.b, i, a1Var);
            return this;
        }

        public final a v(long j) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.z((y0) this.b, j);
            return this;
        }

        public final a w(a1.a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.A((y0) this.b, (a1) ((f4) aVar.s()));
            return this;
        }

        public final a x(a1 a1Var) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.A((y0) this.b, a1Var);
            return this;
        }

        public final a y(Iterable<? extends a1> iterable) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.B((y0) this.b, iterable);
            return this;
        }

        public final a z(String str) {
            if (this.c) {
                q();
                this.c = false;
            }
            y0.C((y0) this.b, str);
            return this;
        }

        a(g1 g1Var) {
            super(y0.zzi);
        }
    }

    static {
        y0 y0Var = new y0();
        zzi = y0Var;
        f4.r(y0.class, y0Var);
    }

    private y0() {
    }

    static void A(y0 y0Var, a1 a1Var) {
        y0Var.getClass();
        a1Var.getClass();
        y0Var.O();
        y0Var.zzd.add(a1Var);
    }

    static void B(y0 y0Var, Iterable iterable) {
        y0Var.O();
        z2.h(iterable, y0Var.zzd);
    }

    static void C(y0 y0Var, String str) {
        y0Var.getClass();
        str.getClass();
        y0Var.zzc |= 1;
        y0Var.zze = str;
    }

    static void E(y0 y0Var, long j) {
        y0Var.zzc |= 4;
        y0Var.zzg = j;
    }

    public static a M() {
        return (a) zzi.s();
    }

    private final void O() {
        m4<a1> m4Var = this.zzd;
        if (!m4Var.a()) {
            this.zzd = f4.n(m4Var);
        }
    }

    static void w(y0 y0Var) {
        y0Var.getClass();
        y0Var.zzd = x5.f();
    }

    static void x(y0 y0Var, int i) {
        y0Var.O();
        y0Var.zzd.remove(i);
    }

    static void y(y0 y0Var, int i, a1 a1Var) {
        y0Var.getClass();
        a1Var.getClass();
        y0Var.O();
        y0Var.zzd.set(i, a1Var);
    }

    static void z(y0 y0Var, long j) {
        y0Var.zzc |= 2;
        y0Var.zzf = j;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzc & 2) != 0;
    }

    public final long H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzc & 4) != 0;
    }

    public final long J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzc & 8) != 0;
    }

    public final int L() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new y0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", a1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                s5<y0> s5Var = zzj;
                if (s5Var == null) {
                    synchronized (y0.class) {
                        s5Var = zzj;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzi);
                            zzj = s5Var;
                        }
                    }
                }
                return s5Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final a1 u(int i) {
        return this.zzd.get(i);
    }

    public final List<a1> v() {
        return this.zzd;
    }
}
