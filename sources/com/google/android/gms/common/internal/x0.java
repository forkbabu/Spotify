package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.g;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class x0 extends g {
    private final HashMap<g.a, z0> d = new HashMap<>();
    private final Context e;
    private final Handler f;
    private final sr g;
    private final long h;
    private final long i;

    x0(Context context) {
        this.e = context.getApplicationContext();
        this.f = new yt(context.getMainLooper(), new y0(this, null));
        this.g = sr.b();
        this.h = 5000;
        this.i = 300000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.g
    public final boolean b(g.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        com.google.android.exoplayer2.util.g.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            z0 z0Var = this.d.get(aVar);
            if (z0Var == null) {
                z0Var = new z0(this, aVar);
                z0Var.b(serviceConnection, serviceConnection);
                z0Var.c(str);
                this.d.put(aVar, z0Var);
            } else {
                this.f.removeMessages(0, aVar);
                if (!z0Var.e(serviceConnection)) {
                    z0Var.b(serviceConnection, serviceConnection);
                    int f2 = z0Var.f();
                    if (f2 == 1) {
                        ((b.i) serviceConnection).onServiceConnected(z0Var.j(), z0Var.i());
                    } else if (f2 == 2) {
                        z0Var.c(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d2 = z0Var.d();
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.g
    public final void c(g.a aVar, ServiceConnection serviceConnection, String str) {
        com.google.android.exoplayer2.util.g.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            z0 z0Var = this.d.get(aVar);
            if (z0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (z0Var.e(serviceConnection)) {
                z0Var.a(serviceConnection);
                if (z0Var.h()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, aVar), this.h);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
