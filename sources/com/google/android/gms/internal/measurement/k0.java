package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.n0;
import java.util.List;

public final class k0 extends f4<k0, a> implements m5 {
    private static final k0 zzi;
    private static volatile s5<k0> zzj;
    private int zzc;
    private int zzd;
    private m4<n0> zze = x5.f();
    private m4<l0> zzf = x5.f();
    private boolean zzg;
    private boolean zzh;

    public static final class a extends f4.b<k0, a> implements m5 {
        private a() {
            super(k0.zzi);
        }

        public final int t() {
            return ((k0) this.b).B();
        }

        public final a u(int i, l0.a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            k0.v((k0) this.b, i, (l0) ((f4) aVar.s()));
            return this;
        }

        public final a v(int i, n0.a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            k0.w((k0) this.b, i, (n0) ((f4) aVar.s()));
            return this;
        }

        public final n0 w(int i) {
            return ((k0) this.b).u(i);
        }

        public final int x() {
            return ((k0) this.b).D();
        }

        public final l0 y(int i) {
            return ((k0) this.b).z(i);
        }

        /* synthetic */ a(o0 o0Var) {
            this();
        }
    }

    static {
        k0 k0Var = new k0();
        zzi = k0Var;
        f4.r(k0.class, k0Var);
    }

    private k0() {
    }

    static void v(k0 k0Var, int i, l0 l0Var) {
        k0Var.getClass();
        m4<l0> m4Var = k0Var.zzf;
        if (!m4Var.a()) {
            k0Var.zzf = f4.n(m4Var);
        }
        k0Var.zzf.set(i, l0Var);
    }

    static void w(k0 k0Var, int i, n0 n0Var) {
        k0Var.getClass();
        m4<n0> m4Var = k0Var.zze;
        if (!m4Var.a()) {
            k0Var.zze = f4.n(m4Var);
        }
        k0Var.zze.set(i, n0Var);
    }

    public final List<n0> A() {
        return this.zze;
    }

    public final int B() {
        return this.zze.size();
    }

    public final List<l0> C() {
        return this.zzf;
    }

    public final int D() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (o0.a[i - 1]) {
            case 1:
                return new k0();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", n0.class, "zzf", l0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                s5<k0> s5Var = zzj;
                if (s5Var == null) {
                    synchronized (k0.class) {
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

    public final n0 u(int i) {
        return this.zze.get(i);
    }

    public final boolean x() {
        return (this.zzc & 1) != 0;
    }

    public final int y() {
        return this.zzd;
    }

    public final l0 z(int i) {
        return this.zzf.get(i);
    }
}
