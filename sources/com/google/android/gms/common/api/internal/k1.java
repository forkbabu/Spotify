package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.d;

public class k1 extends d1 {
    private final o1<b<?>> o = new o1<>();
    private final g p;

    private k1(j jVar, g gVar) {
        super(jVar, d.f());
        this.p = gVar;
        jVar.F("ConnectionlessLifecycleHelper", this);
    }

    public static void n(Activity activity, g gVar, b<?> bVar) {
        j c = LifecycleCallback.c(activity);
        k1 k1Var = (k1) c.a0("ConnectionlessLifecycleHelper", k1.class);
        if (k1Var == null) {
            k1Var = new k1(c, gVar);
        }
        g.k(bVar, "ApiKey cannot be null");
        k1Var.o.add(bVar);
        gVar.m(k1Var);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void f() {
        if (!this.o.isEmpty()) {
            this.p.m(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void h() {
        this.b = true;
        if (!this.o.isEmpty()) {
            this.p.m(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        this.b = false;
        this.p.v(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.d1
    public final void j() {
        this.p.x();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.d1
    public final void k(ConnectionResult connectionResult, int i) {
        this.p.u(connectionResult, i);
    }

    /* access modifiers changed from: package-private */
    public final o1<b<?>> o() {
        return this.o;
    }
}
