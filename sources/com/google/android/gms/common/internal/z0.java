package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.g;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class z0 implements ServiceConnection, b1 {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    private int b = 2;
    private boolean c;
    private IBinder f;
    private final g.a n;
    private ComponentName o;
    private final /* synthetic */ x0 p;

    public z0(x0 x0Var, g.a aVar) {
        this.p = x0Var;
        this.n = aVar;
    }

    public final void a(ServiceConnection serviceConnection) {
        this.a.remove(serviceConnection);
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void c(String str) {
        this.b = 3;
        boolean d = this.p.g.d(this.p.e, str, this.n.a(this.p.e), this, this.n.c());
        this.c = d;
        if (d) {
            this.p.f.sendMessageDelayed(this.p.f.obtainMessage(1, this.n), this.p.i);
            return;
        }
        this.b = 2;
        try {
            this.p.g.c(this.p.e, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final int f() {
        return this.b;
    }

    public final void g() {
        this.p.f.removeMessages(1, this.n);
        this.p.g.c(this.p.e, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h() {
        return this.a.isEmpty();
    }

    public final IBinder i() {
        return this.f;
    }

    public final ComponentName j() {
        return this.o;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.p.d) {
            this.p.f.removeMessages(1, this.n);
            this.f = iBinder;
            this.o = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.p.d) {
            this.p.f.removeMessages(1, this.n);
            this.f = null;
            this.o = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
