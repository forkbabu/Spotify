package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import java.util.List;

/* access modifiers changed from: package-private */
public class f implements BluetoothProfile.ServiceListener {
    final /* synthetic */ BluetoothAdapter a;
    final /* synthetic */ e b;

    f(e eVar, BluetoothAdapter bluetoothAdapter) {
        this.b = eVar;
        this.a = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
        if (!connectedDevices.isEmpty()) {
            this.b.d = connectedDevices.get(0);
        }
        this.a.closeProfileProxy(2, bluetoothProfile);
        this.b.e();
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i) {
        this.b.e();
    }
}
