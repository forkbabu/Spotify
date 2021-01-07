package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import defpackage.lea;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: mea  reason: default package */
public final class mea implements lea, BluetoothProfile.ServiceListener {
    private final BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();
    private BluetoothA2dp b;
    private final Context c;

    public mea(Context context) {
        h.e(context, "context");
        this.c = context;
    }

    @Override // defpackage.lea
    public lea.a a() {
        List<lea.a> b2 = b();
        boolean z = true;
        if (b2.size() != 1) {
            z = false;
        }
        if (!z) {
            b2 = null;
        }
        if (b2 != null) {
            return b2.get(0);
        }
        return null;
    }

    @Override // defpackage.lea
    public List<lea.a> b() {
        BluetoothA2dp bluetoothA2dp = this.b;
        if (bluetoothA2dp == null) {
            return EmptyList.a;
        }
        List<BluetoothDevice> connectedDevices = bluetoothA2dp.getConnectedDevices();
        h.d(connectedDevices, "proxy.connectedDevices");
        ArrayList arrayList = new ArrayList(d.e(connectedDevices, 10));
        for (T t : connectedDevices) {
            h.d(t, "it");
            String name = t.getName();
            h.d(name, "it.name");
            arrayList.add(new lea.a(name, t.getAddress(), bluetoothA2dp.isA2dpPlaying(t)));
        }
        return arrayList;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        h.e(bluetoothProfile, "proxy");
        if (bluetoothProfile instanceof BluetoothA2dp) {
            this.b = (BluetoothA2dp) bluetoothProfile;
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i) {
        if (i == 2) {
            this.b = null;
        }
    }

    @Override // defpackage.lea
    public void start() {
        BluetoothAdapter bluetoothAdapter = this.a;
        if (bluetoothAdapter == null) {
            Logger.b("Bluetooth not supported", new Object[0]);
        } else {
            bluetoothAdapter.getProfileProxy(this.c, this, 2);
        }
    }

    @Override // defpackage.lea
    public void stop() {
        BluetoothA2dp bluetoothA2dp;
        BluetoothAdapter bluetoothAdapter = this.a;
        if (bluetoothAdapter != null && (bluetoothA2dp = this.b) != null) {
            bluetoothAdapter.closeProfileProxy(2, bluetoothA2dp);
            this.b = null;
        }
    }
}
