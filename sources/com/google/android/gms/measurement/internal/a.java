package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.exoplayer2.util.g;
import java.util.Map;

public final class a extends c2 {
    private final Map<String, Long> b = new m1();
    private final Map<String, Integer> c = new m1();
    private long d;

    public a(f5 f5Var) {
        super(f5Var);
    }

    private final void A(String str, long j, p7 p7Var) {
        if (p7Var == null) {
            super.l().M().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            super.l().M().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            o7.M(p7Var, bundle, true);
            super.o().W("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void B(long j) {
        for (String str : this.b.keySet()) {
            this.b.put(str, Long.valueOf(j));
        }
        if (!this.b.isEmpty()) {
            this.d = j;
        }
    }

    static void C(a aVar, String str, long j) {
        super.b();
        g.i(str);
        Integer num = aVar.c.get(str);
        if (num != null) {
            p7 C = super.s().C(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                aVar.c.remove(str);
                Long l = aVar.b.get(str);
                if (l == null) {
                    super.l().E().a("First ad unit exposure time was never set");
                } else {
                    aVar.b.remove(str);
                    aVar.A(str, j - l.longValue(), C);
                }
                if (aVar.c.isEmpty()) {
                    long j2 = aVar.d;
                    if (j2 == 0) {
                        super.l().E().a("First ad exposure time was never set");
                        return;
                    }
                    aVar.w(j - j2, C);
                    aVar.d = 0;
                    return;
                }
                return;
            }
            aVar.c.put(str, Integer.valueOf(intValue));
            return;
        }
        super.l().E().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void w(long j, p7 p7Var) {
        if (p7Var == null) {
            super.l().M().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            super.l().M().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            o7.M(p7Var, bundle, true);
            super.o().W("am", "_xa", bundle);
        }
    }

    static void y(a aVar, String str, long j) {
        super.b();
        g.i(str);
        if (aVar.c.isEmpty()) {
            aVar.d = j;
        }
        Integer num = aVar.c.get(str);
        if (num != null) {
            aVar.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (aVar.c.size() >= 100) {
            super.l().H().a("Too many ads visible");
        } else {
            aVar.c.put(str, 1);
            aVar.b.put(str, Long.valueOf(j));
        }
    }

    public final void D(String str, long j) {
        if (str == null || str.length() == 0) {
            super.l().E().a("Ad unit id must be a non-empty string");
        } else {
            super.k().y(new a0(this, str, j));
        }
    }

    public final void v(long j) {
        p7 C = super.s().C(false);
        for (String str : this.b.keySet()) {
            A(str, j - this.b.get(str).longValue(), C);
        }
        if (!this.b.isEmpty()) {
            w(j - this.d, C);
        }
        B(j);
    }

    public final void z(String str, long j) {
        if (str == null || str.length() == 0) {
            super.l().E().a("Ad unit id must be a non-empty string");
        } else {
            super.k().y(new b1(this, str, j));
        }
    }
}
