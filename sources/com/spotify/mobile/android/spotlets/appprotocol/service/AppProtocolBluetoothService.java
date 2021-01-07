package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.service.d0;
import com.spotify.mobile.android.spotlets.appprotocol.service.h0;
import com.spotify.mobile.android.spotlets.appprotocol.service.i0;
import com.spotify.mobile.android.spotlets.appprotocol.u3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.bluetooth.CategorizerResponse;
import com.spotify.remoteconfig.g7;
import dagger.android.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ServerSocketFactory;

public class AppProtocolBluetoothService extends g implements d0.a, h0.a, i0.a {
    private static final String t = AppProtocolBluetoothService.class.getName();
    public static final /* synthetic */ int u = 0;
    ul1 a;
    h2e b;
    j0 c;
    g7 f;
    private final List<a> n = new ArrayList(5);
    d0 o;
    long p = 5000;
    private h0 q;
    private final Runnable r = new r(this);
    private final Handler s = new Handler();

    /* access modifiers changed from: package-private */
    public static class a {
        private String a;
        private final String b;
        private final boolean c;
        private final CategorizerResponse d;
        private i0 e;

        public a(String str, String str2, boolean z, CategorizerResponse categorizerResponse) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = categorizerResponse;
        }

        public CategorizerResponse a() {
            return this.d;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }

        public boolean d() {
            return this.c;
        }

        public void e(String str) {
            this.a = str;
        }

        public void f(i0 i0Var) {
            this.e = i0Var;
        }

        public void g() {
            i0 i0Var = this.e;
            if (i0Var != null) {
                i0Var.i();
            }
        }

        public String toString() {
            StringBuilder V0 = je.V0("ConnectionHolder{mDeviceName='");
            je.A(V0, this.a, '\'', ", mDeviceAddress='");
            je.A(V0, this.b, '\'', ", mStartedFromExplicitBroadcast=");
            V0.append(this.c);
            V0.append(", mSessionManager=");
            V0.append(this.e);
            V0.append(", mCategorization=");
            V0.append(this.d);
            V0.append('}');
            return V0.toString();
        }
    }

    private void e(a aVar) {
        String b2 = aVar.b();
        if (!(h(b2) != null)) {
            Logger.b("Adding interapp connection for %s", b2);
            this.n.add(aVar);
            return;
        }
        Logger.n("Connection for address %s already exists, not adding", b2);
    }

    private void f() {
        Logger.g("Cancel stop self", new Object[0]);
        this.s.removeCallbacks(this.r);
    }

    public static Intent g(Context context, String str, String str2) {
        Intent intent = new Intent(context, AppProtocolBluetoothService.class);
        intent.putExtra("start_server", true);
        intent.putExtra("device_address", str);
        intent.putExtra("device_name", str2);
        return intent;
    }

    private a h(String str) {
        for (a aVar : this.n) {
            if (aVar.b().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private void j() {
        f();
        Logger.g("Schedule stop self", new Object[0]);
        this.s.postDelayed(this.r, this.p);
    }

    private boolean k() {
        return this.n.isEmpty();
    }

    private void m() {
        for (a aVar : this.n) {
            aVar.g();
        }
        this.n.clear();
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.service.i0.a
    public void c(i0 i0Var) {
        String c2 = i0Var.c();
        Logger.g("onSessionStarted %s", c2);
        a h = h(c2);
        if (h != null) {
            String c3 = h.c();
            if (MoreObjects.isNullOrEmpty(c3)) {
                c3 = getString(C0707R.string.app_remote_notification_is_connected_fallback);
            }
            this.a.g(t, getString(C0707R.string.app_remote_notification_is_connected, new Object[]{c3}));
        }
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.service.i0.a
    public void d(i0 i0Var) {
        String c2 = i0Var.c();
        a h = h(c2);
        if (h == null || !h.d() || !k()) {
            Logger.g("onSessionEnded %s - do nothing", c2);
        } else {
            j();
        }
    }

    public void i(u3 u3Var, String str) {
        a h = h(str);
        if (h == null) {
            if (this.f.a()) {
                Logger.n("No record of bluetooth device starting server, addr %s adding one", str);
                h = new a("Unknown", str, false, null);
                e(h);
            } else {
                Assertion.g("No record of bluetooth device starting server");
                j();
                return;
            }
        }
        h.g();
        String c2 = h.c();
        if (MoreObjects.isNullOrEmpty(c2)) {
            c2 = getString(C0707R.string.app_remote_notification_is_connected_fallback);
        }
        this.a.g(t, getString(C0707R.string.app_remote_notification_is_connecting, new Object[]{c2}));
        i0 b2 = this.c.b(u3Var, str, this, h.a());
        b2.h();
        h.f(b2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (ig0.a()) {
            return new Binder();
        }
        return null;
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        super.onCreate();
        Logger.g("onCreate, setting foreground", new Object[0]);
        f();
        this.a.e(this, t);
        h0 h0Var = new h0(this);
        this.q = h0Var;
        registerReceiver(h0Var, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            Logger.d("Bluetooth is not supported on this hardware platform", new Object[0]);
            j();
            return;
        }
        this.o = new d0(new c0(defaultAdapter, ServerSocketFactory.getDefault()), this, false);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.g("destroying service", new Object[0]);
        m();
        this.a.f(this, t);
        this.o.g();
        unregisterReceiver(this.q);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        f();
        this.a.e(this, t);
        this.b.a(intent);
        if (intent == null) {
            Logger.g("started with null intent", new Object[0]);
            if (k()) {
                Logger.g("started with null intent and stopping right away", new Object[0]);
                j();
            }
            return 2;
        }
        boolean booleanExtra = intent.getBooleanExtra("start_server", false);
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("device");
        CategorizerResponse categorizerResponse = (CategorizerResponse) intent.getParcelableExtra("categorization");
        boolean z = bluetoothDevice == null;
        String stringExtra = intent.getStringExtra("device_address");
        String stringExtra2 = intent.getStringExtra("device_name");
        if (!z) {
            stringExtra = bluetoothDevice.getAddress();
            stringExtra2 = bluetoothDevice.getName();
        }
        a h = h(stringExtra);
        if (h != null) {
            h.e(stringExtra2);
        } else if (!(stringExtra2 == null || stringExtra == null)) {
            h = new a(stringExtra2, stringExtra, z, categorizerResponse);
        }
        if (h != null) {
            if (booleanExtra) {
                this.o.f();
                e(h);
            } else {
                a h2 = h(h.b());
                if (h2 != null) {
                    h2.g();
                }
                Logger.g("categorized, not connecting", new Object[0]);
                String b2 = h.b();
                Iterator<a> it = this.n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().b().equals(b2)) {
                            Logger.g("Remove connection for %s", b2);
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (k()) {
                    j();
                }
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        Logger.g("task removed, action: %s", intent.getAction());
        if ("android.intent.action.MAIN".equals(intent.getAction())) {
            m();
        }
    }
}
