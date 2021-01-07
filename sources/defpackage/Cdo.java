package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import com.google.android.exoplayer2.offline.f;
import com.google.android.exoplayer2.offline.n;
import com.google.android.exoplayer2.util.f0;

/* renamed from: do  reason: invalid class name and default package */
public final class Cdo {
    private final Context a;
    private final d b;
    private final co c;
    private final Handler d = new Handler(f0.p());
    private c e;
    private int f;
    private b g;

    /* access modifiers changed from: private */
    /* renamed from: do$b */
    public final class b extends ConnectivityManager.NetworkCallback {
        b(a aVar) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Cdo.this.d.post(new bo(this));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Cdo.this.d.post(new bo(this));
        }
    }

    /* renamed from: do$c */
    private class c extends BroadcastReceiver {
        c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                Cdo.a(Cdo.this);
            }
        }
    }

    /* renamed from: do$d */
    public interface d {
    }

    public Cdo(Context context, d dVar, co coVar) {
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = coVar;
    }

    static void a(Cdo doVar) {
        int a2 = doVar.c.a(doVar.a);
        if (doVar.f != a2) {
            doVar.f = a2;
            n.d(((f) doVar.b).a, doVar, a2);
        }
    }

    public co d() {
        return this.c;
    }

    public int e() {
        this.f = this.c.a(this.a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.c.e()) {
            if (f0.a >= 23) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
                connectivityManager.getClass();
                NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
                b bVar = new b(null);
                this.g = bVar;
                connectivityManager.registerNetworkCallback(build, bVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.c.b()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.c.c()) {
            if (f0.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        c cVar = new c(null);
        this.e = cVar;
        this.a.registerReceiver(cVar, intentFilter, null, this.d);
        return this.f;
    }

    public void f() {
        Context context = this.a;
        c cVar = this.e;
        cVar.getClass();
        context.unregisterReceiver(cVar);
        this.e = null;
        if (this.g != null && f0.a >= 21) {
            b bVar = this.g;
            bVar.getClass();
            ((ConnectivityManager) this.a.getSystemService("connectivity")).unregisterNetworkCallback(bVar);
            this.g = null;
        }
    }
}
