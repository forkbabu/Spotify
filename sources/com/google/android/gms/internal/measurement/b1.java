package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class b1 extends f4<b1, a> implements m5 {
    private static final b1 zzd;
    private static volatile s5<b1> zze;
    private m4<c1> zzc = x5.f();

    public static final class a extends f4.b<b1, a> implements m5 {
        private a() {
            super(b1.zzd);
        }

        public final a t(c1.a aVar) {
            if (this.c) {
                q();
                this.c = false;
            }
            b1.w((b1) this.b, (c1) ((f4) aVar.s()));
            return this;
        }

        public final c1 u() {
            return ((b1) this.b).u();
        }

        a(g1 g1Var) {
            super(b1.zzd);
        }
    }

    static {
        b1 b1Var = new b1();
        zzd = b1Var;
        f4.r(b1.class, b1Var);
    }

    private b1() {
    }

    static void w(b1 b1Var, c1 c1Var) {
        b1Var.getClass();
        m4<c1> m4Var = b1Var.zzc;
        if (!m4Var.a()) {
            b1Var.zzc = f4.n(m4Var);
        }
        b1Var.zzc.add(c1Var);
    }

    public static a x() {
        return (a) zzd.s();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f4
    public final Object p(int i, Object obj, Object obj2) {
        switch (g1.a[i - 1]) {
            case 1:
                return new b1();
            case 2:
                return new a(null);
            case 3:
                return new w5(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", c1.class});
            case 4:
                return zzd;
            case 5:
                s5<b1> s5Var = zze;
                if (s5Var == null) {
                    synchronized (b1.class) {
                        s5Var = zze;
                        if (s5Var == null) {
                            s5Var = new f4.a<>(zzd);
                            zze = s5Var;
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

    public final c1 u() {
        return this.zzc.get(0);
    }

    public final List<c1> v() {
        return this.zzc;
    }
}
