package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class e {
    private final Context a;
    private BluetoothConnectionState b;
    private BroadcastReceiver c;
    private BluetoothDevice d;
    private boolean e;
    protected final Collection<b> f = new CopyOnWriteArrayList();

    /* access modifiers changed from: package-private */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras = intent.getExtras();
            if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                Parcelable parcelable = extras.getParcelable("android.bluetooth.device.extra.DEVICE");
                if (parcelable != null) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
                    int i = extras.getInt("android.bluetooth.profile.extra.STATE", -1);
                    if (i == 2) {
                        e.this.d = bluetoothDevice;
                        e.this.e();
                    } else if (i == 3 || i == 0) {
                        e.this.d = null;
                        e.this.e();
                    }
                }
            } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int i2 = extras.getInt("android.bluetooth.adapter.extra.STATE", -1);
                if (i2 == 13 || i2 == 10) {
                    e.this.d = null;
                    e.this.e();
                }
            }
        }
    }

    public interface b {
        void a(BluetoothConnectionState bluetoothConnectionState);
    }

    public e(Context context) {
        this.a = context;
        this.b = new BluetoothConnectionState(BluetoothConnectionState.State.DISCONNECTED);
        this.e = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        BluetoothDevice bluetoothDevice = this.d;
        if (bluetoothDevice == null) {
            this.b = new BluetoothConnectionState(BluetoothConnectionState.State.DISCONNECTED);
        } else if (bluetoothDevice.getName() == null || this.d.getName().isEmpty()) {
            this.b = new BluetoothConnectionState(BluetoothConnectionState.State.CONNECTED_UNKNOWN_DEVICE);
        } else {
            this.b = new BluetoothConnectionState(BluetoothConnectionState.State.CONNECTED, this.d.getName());
        }
        for (b bVar : this.f) {
            bVar.a(this.b);
        }
    }

    public void c() {
        BluetoothAdapter bluetoothAdapter;
        if (this.e) {
            e();
            return;
        }
        boolean z = true;
        this.e = true;
        String str = Build.MODEL;
        if (!str.contains("google_sdk") && !str.contains("Emulator") && !str.contains("Android SDK built for x86") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
            z = false;
        }
        if (z) {
            this.b = new BluetoothConnectionState(BluetoothConnectionState.State.CONNECTED_UNKNOWN_DEVICE);
            e();
            return;
        }
        this.c = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.a.registerReceiver(this.c, intentFilter);
        if (Build.VERSION.SDK_INT < 18) {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        } else {
            BluetoothManager bluetoothManager = (BluetoothManager) this.a.getSystemService("bluetooth");
            if (bluetoothManager == null) {
                bluetoothAdapter = null;
            } else {
                bluetoothAdapter = bluetoothManager.getAdapter();
            }
        }
        if (bluetoothAdapter == null) {
            e();
        } else if (bluetoothAdapter.getProfileConnectionState(2) == 2) {
            bluetoothAdapter.getProfileProxy(this.a, new f(this, bluetoothAdapter), 2);
        } else {
            e();
        }
    }

    public void d() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
            this.c = null;
        }
        this.d = null;
        this.e = false;
    }
}
