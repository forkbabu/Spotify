package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.j;

/* renamed from: o9  reason: default package */
public class o9 extends n9<z8> {
    static final String j = j.f("NetworkStateTracker");
    private final ConnectivityManager g = ((ConnectivityManager) this.b.getSystemService("connectivity"));
    private b h;
    private a i;

    /* renamed from: o9$a */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                j.c().a(o9.j, "Network broadcast received", new Throwable[0]);
                o9 o9Var = o9.this;
                o9Var.d(o9Var.g());
            }
        }
    }

    /* renamed from: o9$b */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(o9.j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            o9 o9Var = o9.this;
            o9Var.d(o9Var.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.c().a(o9.j, "Network connection lost", new Throwable[0]);
            o9 o9Var = o9.this;
            o9Var.d(o9Var.g());
        }
    }

    public o9(Context context, na naVar) {
        super(context, naVar);
        if (h()) {
            this.h = new b();
        } else {
            this.i = new a();
        }
    }

    private static boolean h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.n9
    public z8 b() {
        return g();
    }

    @Override // defpackage.n9
    public void e() {
        if (h()) {
            try {
                j.c().a(j, "Registering network callback", new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.h);
            } catch (IllegalArgumentException | SecurityException e) {
                j.c().b(j, "Received exception while registering network callback", e);
            }
        } else {
            j.c().a(j, "Registering broadcast receiver", new Throwable[0]);
            this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override // defpackage.n9
    public void f() {
        if (h()) {
            try {
                j.c().a(j, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
            } catch (IllegalArgumentException | SecurityException e) {
                j.c().b(j, "Received exception while unregistering network callback", e);
            }
        } else {
            j.c().a(j, "Unregistering broadcast receiver", new Throwable[0]);
            this.b.unregisterReceiver(this.i);
        }
    }

    /* access modifiers changed from: package-private */
    public z8 g() {
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean z3 = Build.VERSION.SDK_INT >= 23 && (networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork())) != null && networkCapabilities.hasCapability(16);
        boolean isActiveNetworkMetered = this.g.isActiveNetworkMetered();
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new z8(z2, z3, isActiveNetworkMetered, z);
    }
}
