package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* access modifiers changed from: package-private */
public class l4 extends BroadcastReceiver {
    private final r9 a;
    private boolean b;
    private boolean c;

    l4(r9 r9Var) {
        this.a = r9Var;
    }

    public final void b() {
        this.a.b0();
        this.a.k().b();
        if (!this.b) {
            this.a.i().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.c = this.a.S().w();
            this.a.l().M().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
            this.b = true;
        }
    }

    public final void c() {
        this.a.b0();
        this.a.k().b();
        this.a.k().b();
        if (this.b) {
            this.a.l().M().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.i().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.l().E().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.b0();
        String action = intent.getAction();
        this.a.l().M().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean w = this.a.S().w();
            if (this.c != w) {
                this.c = w;
                this.a.k().y(new k4(this, w));
                return;
            }
            return;
        }
        this.a.l().H().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
