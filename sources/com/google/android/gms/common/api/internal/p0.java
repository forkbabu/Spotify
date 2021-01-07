package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.l0;
import java.util.Set;

public final class p0 extends av implements c.a, c.b {
    private static a.AbstractC0094a<? extends qv, xu> h = nv.c;
    private final Context a;
    private final Handler b;
    private final a.AbstractC0094a<? extends qv, xu> c;
    private Set<Scope> d;
    private com.google.android.gms.common.internal.c e;
    private qv f;
    private s0 g;

    public p0(Context context, Handler handler, com.google.android.gms.common.internal.c cVar) {
        a.AbstractC0094a<? extends qv, xu> aVar = h;
        this.a = context;
        this.b = handler;
        g.k(cVar, "ClientSettings must not be null");
        this.e = cVar;
        this.d = cVar.g();
        this.c = aVar;
    }

    static void E3(p0 p0Var, jv jvVar) {
        p0Var.getClass();
        ConnectionResult I1 = jvVar.I1();
        if (I1.q2()) {
            l0 Q1 = jvVar.Q1();
            g.l(Q1);
            ConnectionResult Q12 = Q1.Q1();
            if (!Q12.q2()) {
                String.valueOf(Q12).length();
                new Exception();
                ((g.c) p0Var.g).c(Q12);
                p0Var.f.d();
                return;
            }
            ((g.c) p0Var.g).d(Q1.I1(), p0Var.d);
        } else {
            ((g.c) p0Var.g).c(I1);
        }
        p0Var.f.d();
    }

    public final void D3() {
        qv qvVar = this.f;
        if (qvVar != null) {
            qvVar.d();
        }
    }

    public final void F3(s0 s0Var) {
        qv qvVar = this.f;
        if (qvVar != null) {
            qvVar.d();
        }
        this.e.h(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0094a<? extends qv, xu> aVar = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        com.google.android.gms.common.internal.c cVar = this.e;
        this.f = (qv) aVar.a(context, looper, cVar, cVar.j(), this, this);
        this.g = s0Var;
        Set<Scope> set = this.d;
        if (set == null || set.isEmpty()) {
            this.b.post(new r0(this));
        } else {
            this.f.g();
        }
    }

    public final void G3(jv jvVar) {
        this.b.post(new q0(this, jvVar));
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void g(Bundle bundle) {
        this.f.o(this);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void i(int i) {
        this.f.d();
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void n(ConnectionResult connectionResult) {
        ((g.c) this.g).c(connectionResult);
    }
}
