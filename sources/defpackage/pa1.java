package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import io.reactivex.x;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: pa1  reason: default package */
public class pa1 implements BluetoothProfile.ServiceListener {
    final /* synthetic */ x a;
    final /* synthetic */ BluetoothAdapter b;
    final /* synthetic */ qa1 c;

    pa1(qa1 qa1, x xVar, BluetoothAdapter bluetoothAdapter) {
        this.c = qa1;
        this.a = xVar;
        this.b = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (!(this.c.d)) {
            List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
            if (!connectedDevices.isEmpty()) {
                this.a.onNext(na1.a(sa1.a(connectedDevices.get(0))));
            } else {
                this.a.onNext(na1.f());
            }
            this.b.closeProfileProxy(2, bluetoothProfile);
            this.a.onComplete();
            this.c.d = true;
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i) {
    }
}
