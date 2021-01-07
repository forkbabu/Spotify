package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.v2;
import com.google.android.gms.internal.measurement.z1;

public final class v4 implements ServiceConnection {
    private final String a;
    final /* synthetic */ s4 b;

    v4(s4 s4Var, String str) {
        this.b = s4Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.l().H().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            z1 D3 = v2.D3(iBinder);
            if (D3 == null) {
                this.b.a.l().H().a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.l().M().a("Install Referrer Service connected");
            this.b.a.k().y(new u4(this, D3, this));
        } catch (Exception e) {
            this.b.a.l().H().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.l().M().a("Install Referrer Service disconnected");
    }
}
