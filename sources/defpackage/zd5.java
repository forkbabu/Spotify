package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.t;

/* renamed from: zd5  reason: default package */
public class zd5 {
    private final BluetoothAdapter a;

    /* renamed from: zd5$a */
    static class a implements BluetoothProfile.ServiceListener {
        final t<ae5> a;
        final BluetoothAdapter b;

        public a(t<ae5> tVar, BluetoothAdapter bluetoothAdapter) {
            this.a = tVar;
            this.b = bluetoothAdapter;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            for (BluetoothDevice bluetoothDevice : bluetoothProfile.getConnectedDevices()) {
                ae5 ae5 = new ae5(bluetoothDevice);
                if (ae5.c()) {
                    t<ae5> tVar = this.a;
                    if (!tVar.d()) {
                        tVar.onNext(ae5);
                    }
                }
            }
            t<ae5> tVar2 = this.a;
            if (!tVar2.d()) {
                tVar2.onComplete();
            }
            this.b.closeProfileProxy(i, bluetoothProfile);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
        }
    }

    public zd5(BluetoothAdapter bluetoothAdapter) {
        this.a = bluetoothAdapter;
    }

    public ae5 a(String str) {
        if (!c() || !BluetoothAdapter.checkBluetoothAddress(str)) {
            return null;
        }
        BluetoothAdapter bluetoothAdapter = this.a;
        bluetoothAdapter.getClass();
        return new ae5(bluetoothAdapter.getRemoteDevice(str));
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<ae5> */
    public s<ae5> b(Context context) {
        if (!c()) {
            return o.a;
        }
        BluetoothAdapter bluetoothAdapter = this.a;
        bluetoothAdapter.getClass();
        return s.y(new xd5(bluetoothAdapter, context.getApplicationContext()));
    }

    public boolean c() {
        return this.a != null;
    }
}
