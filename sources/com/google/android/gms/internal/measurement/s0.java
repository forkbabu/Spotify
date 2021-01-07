package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.r0;
import java.util.Collections;
import java.util.List;

public final class s0 extends f4<s0, a> implements m5 {
    private static final s0 zzm;
    private static volatile s5<s0> zzn;
    private int zzc;
    private long zzd;
    private String zze = "";
    private int zzf;
    private m4<t0> zzg = x5.f();
    private m4<r0> zzh = x5.f();
    private m4<k0> zzi = x5.f();
    private String zzj = "";
    private boolean zzk;
    private m4<j1> zzl = x5.f();

    public static final class a extends f4.b<s0, a> implements m5 {
        private a() {
            super(s0.zzm);
        }

        public final int t() {
            return ((s0) this.b).C();
        }

        public final r0 u(int i) {
            return ((s0) this.b).u(i);
        }

        public final a v(int i, r0.a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            s0.w((s0) this.b, i, (r0) ((f4) aVar.s()));
            return this;
        }

        public final List<k0> w() {
            return Collections.unmodifiableList(((s0) this.b).D());
        }

        public final a x() {
            if (this.c) {
                q();
                this.c = false;
            }
            s0.v((s0) this.b);
            return this;
        }

        a(v0 v0Var) {
            super(s0.zzm);
        }
    }

    static {
        s0 s0Var = new s0();
        zzm = s0Var;
        f4.r(s0.class, s0Var);
    }

    private s0() {
    }

    public static a F() {
        return (a) zzm.s();
    }

    public static s0 G() {
        return zzm;
    }

    static void v(s0 s0Var) {
        s0Var.getClass();
        s0Var.zzi = x5.f();
    }

    static void w(s0 s0Var, int i, r0 r0Var) {
        s0Var.getClass();
        m4<r0> m4Var = s0Var.zzh;
        if (!m4Var.a()) {
            s0Var.zzh = f4.n(m4Var);
        }
        s0Var.zzh.set(i, r0Var);
    }

    public final String A() {
        return this.zze;
    }

    public final List<t0> B() {
        return this.zzg;
    }

    public final int C() {
        return this.zzh.size();
    }

    public final List<k0> D() {
        return this.zzi;
    }

    public final boolean E() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (v0.a[i - 1]) {
            case 1:
                return new s0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", t0.class, "zzh", r0.class, "zzi", k0.class, "zzj", "zzk", "zzl", j1.class});
            case 4:
                return zzm;
            case 5:
                s5<s0> s5Var = zzn;
                if (s5Var == null) {
                    synchronized (s0.class) {
                        s5Var = zzn;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzm);
                            zzn = s5Var;
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

    public final r0 u(int i) {
        return this.zzh.get(i);
    }

    public final boolean x() {
        return (this.zzc & 1) != 0;
    }

    public final long y() {
        return this.zzd;
    }

    public final boolean z() {
        return (this.zzc & 2) != 0;
    }
}
