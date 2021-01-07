package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.g;

final class c0 implements Runnable {
    private final /* synthetic */ ConnectionResult a;
    private final /* synthetic */ g.c b;

    c0(g.c cVar, ConnectionResult connectionResult) {
        this.b = cVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.a aVar = (g.a) g.this.s.get(this.b.b);
        if (aVar != null) {
            if (this.a.q2()) {
                this.b.e = true;
                if (this.b.a.f()) {
                    g.c.g(this.b);
                    return;
                }
                try {
                    this.b.a.j(null, this.b.a.i());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.b.a.a("Failed to get service from broker.");
                    aVar.n(new ConnectionResult(10));
                }
            } else {
                aVar.n(this.a);
            }
        }
    }
}
