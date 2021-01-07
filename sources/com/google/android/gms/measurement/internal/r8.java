package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;

public final class r8 implements ServiceConnection, b.a, b.AbstractC0097b {
    private volatile boolean a;
    private volatile x3 b;
    final /* synthetic */ x7 c;

    protected r8(x7 x7Var) {
        this.c = x7Var;
    }

    public final void a() {
        if (this.b != null && (this.b.h() || this.b.s())) {
            this.b.d();
        }
        this.b = null;
    }

    public final void b(Intent intent) {
        this.c.b();
        Context i = this.c.i();
        sr b2 = sr.b();
        synchronized (this) {
            if (this.a) {
                this.c.l().M().a("Connection attempt already in progress");
                return;
            }
            this.c.l().M().a("Using local app measurement service");
            this.a = true;
            b2.a(i, intent, this.c.c, 129);
        }
    }

    public final void d() {
        this.c.b();
        Context i = this.c.i();
        synchronized (this) {
            if (this.a) {
                this.c.l().M().a("Connection attempt already in progress");
            } else if (this.b == null || (!this.b.s() && !this.b.h())) {
                this.b = new x3(i, Looper.getMainLooper(), this, this);
                this.c.l().M().a("Connecting to remote service");
                this.a = true;
                this.b.p();
            } else {
                this.c.l().M().a("Already awaiting connection attempt");
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void g(Bundle bundle) {
        g.g("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.k().y(new s8(this, (s3) this.b.z()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void i(int i) {
        g.g("MeasurementServiceConnection.onConnectionSuspended");
        this.c.l().L().a("Service connection suspended");
        this.c.k().y(new v8(this));
    }

    @Override // com.google.android.gms.common.internal.b.AbstractC0097b
    public final void n(ConnectionResult connectionResult) {
        g.g("MeasurementServiceConnection.onConnectionFailed");
        a4 A = this.c.a.A();
        if (A != null) {
            A.H().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.k().y(new u8(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s3 s3Var;
        g.g("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.l().E().a("Service connected with null binder");
                return;
            }
            s3 s3Var2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof s3) {
                        s3Var = (s3) queryLocalInterface;
                    } else {
                        s3Var = new u3(iBinder);
                    }
                    s3Var2 = s3Var;
                    this.c.l().M().a("Bound to IMeasurementService interface");
                } else {
                    this.c.l().E().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.l().E().a("Service connect failed to get IMeasurementService");
            }
            if (s3Var2 == null) {
                this.a = false;
                try {
                    sr.b().c(this.c.i(), this.c.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.k().y(new q8(this, s3Var2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g.g("MeasurementServiceConnection.onServiceDisconnected");
        this.c.l().L().a("Service disconnected");
        this.c.k().y(new t8(this, componentName));
    }
}
