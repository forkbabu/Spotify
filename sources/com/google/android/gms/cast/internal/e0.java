package com.google.android.gms.cast.internal;

import android.os.Handler;
import com.google.android.gms.cast.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o0;
import java.util.concurrent.atomic.AtomicReference;

final class e0 extends h {
    private final AtomicReference<d0> a;
    private final Handler b;

    public e0(d0 d0Var) {
        this.a = new AtomicReference<>(d0Var);
        this.b = new o0(d0Var.x());
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void C(d dVar, String str, String str2, boolean z) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0Var.L = dVar;
            d0Var.a0 = dVar.I1();
            d0Var.b0 = str2;
            d0Var.S = str;
            synchronized (d0.f0) {
                if (d0.l0(d0Var) != null) {
                    d0.l0(d0Var).a(new f0(new Status(0, (String) null), dVar, str, str2, z));
                    d0.a0(d0Var);
                }
            }
        }
    }

    public final d0 D3() {
        d0 andSet = this.a.getAndSet(null);
        if (andSet == null) {
            return null;
        }
        andSet.n0();
        return andSet;
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void E1(int i) {
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void G1(int i) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0Var.a0 = null;
            d0Var.b0 = null;
            d0.c0(d0Var, i);
            if (d0Var.N != null) {
                this.b.post(new h0(d0Var, i));
            }
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void H1(String str, long j) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0.d0(d0Var, j, 0);
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void M(String str, double d, boolean z) {
        d0.e0.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void P(c cVar) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0.e0.a("onApplicationStatusChanged", new Object[0]);
            this.b.post(new j0(d0Var, cVar));
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void S0(int i) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0.c0(d0Var, i);
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void T0(String str, byte[] bArr) {
        if (this.a.get() != null) {
            d0.e0.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void e1(int i) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0.c0(d0Var, i);
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void f0(int i) {
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void h3(String str, String str2) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0.e0.a("Receive (type=text, ns=%s) %s", str, str2);
            this.b.post(new i0(d0Var, str, str2));
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void l3(m0 m0Var) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0.e0.a("onDeviceStatusChanged", new Object[0]);
            this.b.post(new g0(d0Var, m0Var));
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void r(int i) {
        d0 d0Var = null;
        d0 andSet = this.a.getAndSet(null);
        if (andSet != null) {
            andSet.n0();
            d0Var = andSet;
        }
        if (d0Var != null) {
            d0.e0.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                d0Var.H(2);
            }
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void v2(String str, long j, int i) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0.d0(d0Var, j, i);
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void z(int i) {
        d0 d0Var = this.a.get();
        if (d0Var != null) {
            d0Var.g0(i);
        }
    }
}
