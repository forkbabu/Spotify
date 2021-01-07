package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.d;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.v;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class d0 extends f<g> {
    private static final b e0 = new b("CastClientImpl");
    private static final Object f0 = new Object();
    private static final Object g0 = new Object();
    private d L;
    private final CastDevice M;
    private final e.c N;
    private final Map<String, e.d> O = new HashMap();
    private final long P;
    private final Bundle Q;
    private e0 R;
    private String S;
    private boolean T;
    private boolean U;
    private boolean V;
    private double W;
    private v X;
    private int Y;
    private int Z;
    private String a0;
    private String b0;
    private Bundle c0;
    private final Map<Long, com.google.android.gms.common.api.internal.e<Status>> d0;

    public d0(Context context, Looper looper, c cVar, CastDevice castDevice, long j, e.c cVar2, Bundle bundle, c.a aVar, c.b bVar) {
        super(context, looper, 10, cVar, aVar, bVar);
        this.M = castDevice;
        this.N = cVar2;
        this.P = j;
        this.Q = bundle;
        new AtomicLong(0);
        this.d0 = new HashMap();
        n0();
        s0();
    }

    static /* synthetic */ com.google.android.gms.common.api.internal.e a0(d0 d0Var) {
        return null;
    }

    static void c0(d0 d0Var, int i) {
        synchronized (g0) {
        }
    }

    static void d0(d0 d0Var, long j, int i) {
        com.google.android.gms.common.api.internal.e<Status> remove;
        synchronized (d0Var.d0) {
            remove = d0Var.d0.remove(Long.valueOf(j));
        }
        if (remove != null) {
            remove.a(new Status(i, (String) null));
        }
    }

    static void e0(d0 d0Var, c cVar) {
        boolean z;
        d0Var.getClass();
        String I1 = cVar.I1();
        if (!a.d(I1, d0Var.S)) {
            d0Var.S = I1;
            z = true;
        } else {
            z = false;
        }
        e0.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(d0Var.U));
        e.c cVar2 = d0Var.N;
        if (cVar2 != null && (z || d0Var.U)) {
            cVar2.d();
        }
        d0Var.U = false;
    }

    static void f0(d0 d0Var, m0 m0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        d0Var.getClass();
        d U0 = m0Var.U0();
        if (!a.d(U0, d0Var.L)) {
            d0Var.L = U0;
            d0Var.N.c(U0);
        }
        double o2 = m0Var.o2();
        if (Double.isNaN(o2) || Math.abs(o2 - d0Var.W) <= 1.0E-7d) {
            z = false;
        } else {
            d0Var.W = o2;
            z = true;
        }
        boolean p2 = m0Var.p2();
        if (p2 != d0Var.T) {
            d0Var.T = p2;
            z = true;
        }
        Double.isNaN(m0Var.r2());
        b bVar = e0;
        bVar.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(d0Var.V));
        e.c cVar = d0Var.N;
        if (cVar != null && (z || d0Var.V)) {
            cVar.f();
        }
        int I1 = m0Var.I1();
        if (I1 != d0Var.Y) {
            d0Var.Y = I1;
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(d0Var.V));
        e.c cVar2 = d0Var.N;
        if (cVar2 != null && (z2 || d0Var.V)) {
            cVar2.a(d0Var.Y);
        }
        int Q1 = m0Var.Q1();
        if (Q1 != d0Var.Z) {
            d0Var.Z = Q1;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(d0Var.V));
        e.c cVar3 = d0Var.N;
        if (cVar3 != null && (z3 || d0Var.V)) {
            cVar3.e(d0Var.Z);
        }
        if (!a.d(d0Var.X, m0Var.q2())) {
            d0Var.X = m0Var.q2();
        }
        d0Var.V = false;
    }

    static /* synthetic */ com.google.android.gms.common.api.internal.e l0(d0 d0Var) {
        return null;
    }

    /* access modifiers changed from: private */
    public final void n0() {
        this.Y = -1;
        this.Z = -1;
        this.L = null;
        this.S = null;
        this.W = 0.0d;
        s0();
        this.T = false;
        this.X = null;
    }

    private final void r0() {
        e0.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.O) {
            this.O.clear();
        }
    }

    private final double s0() {
        if (this.M.r2(2048)) {
            return 0.02d;
        }
        if (!this.M.r2(4) || this.M.r2(1) || "Chromecast Audio".equals(this.M.q2())) {
            return 0.05d;
        }
        return 0.02d;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String A() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.b
    public final void E(ConnectionResult connectionResult) {
        connectionResult.I1();
        System.currentTimeMillis();
        r0();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final void F(int i, IBinder iBinder, Bundle bundle, int i2) {
        e0.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.U = true;
            this.V = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.c0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.F(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final void d() {
        b bVar = e0;
        bVar.a("disconnect(); ServiceListener=%s, isConnected=%b", this.R, Boolean.valueOf(h()));
        e0 e0Var = this.R;
        this.R = null;
        if (e0Var == null || e0Var.D3() == null) {
            bVar.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        r0();
        try {
            ((g) z()).d();
        } catch (RemoteException | IllegalStateException e) {
            e0.b(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        } finally {
            super.d();
        }
    }

    public final void g0(int i) {
        synchronized (f0) {
        }
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int l() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new f(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Bundle u() {
        Bundle bundle = this.c0;
        if (bundle == null) {
            return null;
        }
        this.c0 = null;
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final Bundle w() {
        Bundle bundle = new Bundle();
        e0.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.a0, this.b0);
        CastDevice castDevice = this.M;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.P);
        Bundle bundle2 = this.Q;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        e0 e0Var = new e0(this);
        this.R = e0Var;
        bundle.putParcelable("listener", new BinderWrapper(e0Var));
        String str = this.a0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.b0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }
}
