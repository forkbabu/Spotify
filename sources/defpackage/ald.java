package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.spotlets.appprotocol.service.f0;
import com.spotify.remoteconfig.g7;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: ald  reason: default package */
public class ald extends BroadcastReceiver implements d {
    public static final /* synthetic */ int s = 0;
    private final g7 a;
    private final ekd b;
    private final f0 c;
    private final s<Boolean> f;
    private final y n;
    private final y o;
    private final Context p;
    private b q;
    private b r;

    public ald(Context context, g7 g7Var, ekd ekd, f0 f0Var, s<Boolean> sVar, y yVar, y yVar2) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.q = emptyDisposable;
        this.r = emptyDisposable;
        this.p = context;
        this.a = g7Var;
        this.b = ekd;
        this.c = f0Var;
        this.f = sVar;
        this.n = yVar;
        this.o = yVar2;
    }

    /* access modifiers changed from: package-private */
    public BluetoothDevice a(String str) {
        if (str == null) {
            return null;
        }
        for (BluetoothDevice bluetoothDevice : BluetoothAdapter.getDefaultAdapter().getBondedDevices()) {
            if (bluetoothDevice.getAddress().equals(str)) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(BluetoothDevice bluetoothDevice) {
        this.q.dispose();
        this.q = s.e0(0, 3, TimeUnit.SECONDS).N0(3).I0(this.n).o0(this.o).subscribe(new qkd(bluetoothDevice));
    }

    public /* synthetic */ void c(BluetoothDevice bluetoothDevice, Boolean bool) {
        if (!bool.booleanValue()) {
            this.c.c(this.p, false, bluetoothDevice, null);
            this.b.a(null);
            return;
        }
        this.q.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.a.b()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            this.p.registerReceiver(this, intentFilter);
            BluetoothDevice a2 = a(this.b.d());
            if (a2 != null) {
                b(a2);
                this.c.c(this.p, true, a2, null);
                this.r = this.f.Q(zkd.a).T().J(5, TimeUnit.SECONDS, this.n).C(z.z(Boolean.FALSE)).subscribe(new skd(this, a2), rkd.a);
            }
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (this.a.b()) {
            this.p.unregisterReceiver(this);
            this.q.dispose();
            this.r.dispose();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SuperbirdInterAppPlugin";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!action.equals("android.bluetooth.adapter.action.STATE_CHANGED") || intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) != 12) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null) {
                boolean equals = "android.bluetooth.device.action.ACL_CONNECTED".equals(action);
                boolean equals2 = "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action);
                String address = bluetoothDevice.getAddress();
                if (((String) MoreObjects.firstNonNull(bluetoothDevice.getName(), "")).contains("Car Thing")) {
                    this.r.dispose();
                    if (equals) {
                        this.b.a(address);
                    } else if (equals2) {
                        this.b.a(null);
                    }
                }
            }
        } else {
            BluetoothDevice a2 = a(this.b.d());
            if (a2 != null) {
                b(a2);
            }
        }
    }
}
