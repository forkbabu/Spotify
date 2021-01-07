package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.internal.measurement.kb;
import com.google.android.gms.internal.measurement.q7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class x7 extends d5 {
    private final r8 c;
    private s3 d;
    private volatile Boolean e;
    private final j f;
    private final l9 g;
    private final List<Runnable> h = new ArrayList();
    private final j i;

    protected x7(f5 f5Var) {
        super(f5Var);
        this.g = new l9(f5Var.d());
        this.c = new r8(this);
        this.f = new w7(this, f5Var);
        this.i = new g8(this, f5Var);
    }

    static void M(x7 x7Var, ComponentName componentName) {
        super.b();
        if (x7Var.d != null) {
            x7Var.d = null;
            super.l().M().b("Disconnected from device MeasurementService", componentName);
            super.b();
            x7Var.Y();
        }
    }

    private final void P(Runnable runnable) {
        super.b();
        if (U()) {
            runnable.run();
        } else if (((long) this.h.size()) >= 1000) {
            super.l().E().a("Discarding data. Max runnable queue size reached");
        } else {
            this.h.add(runnable);
            this.i.c(60000);
            Y();
        }
    }

    /* access modifiers changed from: private */
    public final void d0() {
        super.b();
        this.g.a();
        this.f.c(t.J.a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean e0() {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x7.e0():boolean");
    }

    /* access modifiers changed from: private */
    public final void f0() {
        super.b();
        super.l().M().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            } catch (Exception e2) {
                super.l().E().b("Task exception while flushing queue", e2);
            }
        }
        this.h.clear();
        this.i.e();
    }

    private final fa g0(boolean z) {
        return super.p().B(z ? super.l().N() : null);
    }

    static void i0(x7 x7Var) {
        super.b();
        if (x7Var.U()) {
            super.l().M().a("Inactivity, disconnecting from the service");
            x7Var.a0();
        }
    }

    public final void D(Bundle bundle) {
        super.b();
        w();
        P(new h8(this, bundle, g0(false)));
    }

    public final void E(kb kbVar) {
        super.b();
        w();
        P(new c8(this, g0(false), kbVar));
    }

    public final void F(kb kbVar, r rVar, String str) {
        super.b();
        w();
        if (super.f().t() != 0) {
            super.l().H().a("Not bundling data. Service unavailable or out of date");
            super.f().T(kbVar, new byte[0]);
            return;
        }
        P(new j8(this, rVar, str, kbVar));
    }

    /* access modifiers changed from: protected */
    public final void G(kb kbVar, String str, String str2) {
        super.b();
        w();
        P(new p8(this, str, str2, g0(false), kbVar));
    }

    /* access modifiers changed from: protected */
    public final void H(kb kbVar, String str, String str2, boolean z) {
        super.b();
        w();
        P(new z7(this, str, str2, z, g0(false), kbVar));
    }

    /* access modifiers changed from: protected */
    public final void I(r rVar, String str) {
        super.b();
        w();
        P(new k8(this, true, super.t().E(rVar), rVar, g0(true), str));
    }

    /* access modifiers changed from: protected */
    public final void J(s3 s3Var) {
        super.b();
        if (s3Var != null) {
            this.d = s3Var;
            d0();
            f0();
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: package-private */
    public final void K(s3 s3Var, a aVar, fa faVar) {
        int i2;
        super.b();
        w();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List C = super.t().C();
            if (C != null) {
                arrayList.addAll(C);
                i2 = C.size();
            } else {
                i2 = 0;
            }
            if (aVar != null && i2 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                a aVar2 = (a) obj;
                if (aVar2 instanceof r) {
                    try {
                        s3Var.d1((r) aVar2, faVar);
                    } catch (RemoteException e2) {
                        super.l().E().b("Failed to send event to the service", e2);
                    }
                } else if (aVar2 instanceof y9) {
                    try {
                        s3Var.U((y9) aVar2, faVar);
                    } catch (RemoteException e3) {
                        super.l().E().b("Failed to send user property to the service", e3);
                    }
                } else if (aVar2 instanceof oa) {
                    try {
                        s3Var.J((oa) aVar2, faVar);
                    } catch (RemoteException e4) {
                        super.l().E().b("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    super.l().E().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
    }

    /* access modifiers changed from: protected */
    public final void L(p7 p7Var) {
        super.b();
        w();
        P(new e8(this, p7Var));
    }

    /* access modifiers changed from: protected */
    public final void N(y9 y9Var) {
        super.b();
        w();
        P(new y7(this, super.t().F(y9Var), y9Var, g0(true)));
    }

    /* access modifiers changed from: protected */
    public final void O(oa oaVar) {
        super.b();
        w();
        P(new n8(this, super.t().G(oaVar), new oa(oaVar), g0(true), oaVar));
    }

    public final void Q(AtomicReference<String> atomicReference) {
        super.b();
        w();
        P(new d8(this, atomicReference, g0(false)));
    }

    /* access modifiers changed from: protected */
    public final void R(AtomicReference<List<oa>> atomicReference, String str, String str2, String str3) {
        super.b();
        w();
        P(new m8(this, atomicReference, str, str2, str3, g0(false)));
    }

    /* access modifiers changed from: protected */
    public final void S(AtomicReference<List<y9>> atomicReference, String str, String str2, String str3, boolean z) {
        super.b();
        w();
        P(new o8(this, atomicReference, str, str2, str3, z, g0(false)));
    }

    /* access modifiers changed from: protected */
    public final void T(boolean z) {
        if (q7.b() && super.j().r(t.P0)) {
            super.b();
            w();
            if (z) {
                super.t().H();
            }
            if (c0()) {
                P(new l8(this, g0(false)));
            }
        }
    }

    public final boolean U() {
        super.b();
        w();
        return this.d != null;
    }

    /* access modifiers changed from: protected */
    public final void V() {
        super.b();
        w();
        P(new i8(this, g0(true)));
    }

    /* access modifiers changed from: protected */
    public final void W() {
        super.b();
        w();
        fa g0 = g0(false);
        super.t().H();
        P(new a8(this, g0));
    }

    /* access modifiers changed from: protected */
    public final void X() {
        super.b();
        w();
        fa g0 = g0(true);
        super.t().I();
        P(new f8(this, g0));
    }

    /* access modifiers changed from: package-private */
    public final void Y() {
        super.b();
        w();
        if (!U()) {
            if (e0()) {
                this.c.d();
            } else if (!super.j().L()) {
                List<ResolveInfo> queryIntentServices = super.i().getPackageManager().queryIntentServices(new Intent().setClassName(super.i(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(super.i(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.b(intent);
                    return;
                }
                super.l().E().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean Z() {
        return this.e;
    }

    public final void a0() {
        super.b();
        w();
        this.c.a();
        try {
            sr.b().c(super.i(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    /* access modifiers changed from: package-private */
    public final boolean b0() {
        super.b();
        w();
        if (e0() && super.f().E0() < 200900) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean c0() {
        super.b();
        w();
        if (!super.j().r(t.Q0)) {
            return false;
        }
        if (e0() && super.f().E0() < t.R0.a(null).intValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.d5
    public final boolean z() {
        return false;
    }
}
