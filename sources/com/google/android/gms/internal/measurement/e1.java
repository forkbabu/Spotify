package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class e1 extends f4<e1, a> implements m5 {
    private static final e1 zzf;
    private static volatile s5<e1> zzg;
    private int zzc;
    private int zzd;
    private n4 zze = a5.h();

    public static final class a extends f4.b<e1, a> implements m5 {
        private a() {
            super(e1.zzf);
        }

        public final a t(int i) {
            if (this.c) {
                q();
                this.c = false;
            }
            e1.v((e1) this.b, i);
            return this;
        }

        public final a u(Iterable<? extends Long> iterable) {
            if (this.c) {
                q();
                this.c = false;
            }
            e1.w((e1) this.b, iterable);
            return this;
        }

        a(g1 g1Var) {
            super(e1.zzf);
        }
    }

    static {
        e1 e1Var = new e1();
        zzf = e1Var;
        f4.r(e1.class, e1Var);
    }

    private e1() {
    }

    public static a B() {
        return (a) zzf.s();
    }

    static void v(e1 e1Var, int i) {
        e1Var.zzc |= 1;
        e1Var.zzd = i;
    }

    static void w(e1 e1Var, Iterable iterable) {
        n4 n4Var = e1Var.zze;
        if (!((c3) n4Var).a()) {
            e1Var.zze = f4.o(n4Var);
        }
        z2.h(iterable, e1Var.zze);
    }

    public final int A() {
        return ((a5) this.zze).size();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new e1();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                s5<e1> s5Var = zzg;
                if (s5Var == null) {
                    synchronized (e1.class) {
                        s5Var = zzg;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzf);
                            zzg = s5Var;
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

    public final long u(int i) {
        return ((a5) this.zze).e(i);
    }

    public final boolean x() {
        return (this.zzc & 1) != 0;
    }

    public final int y() {
        return this.zzd;
    }

    public final List<Long> z() {
        return this.zze;
    }
}
