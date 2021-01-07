package defpackage;

import android.bluetooth.BluetoothDevice;
import io.reactivex.functions.g;

/* renamed from: skd  reason: default package */
public final /* synthetic */ class skd implements g {
    public final /* synthetic */ ald a;
    public final /* synthetic */ BluetoothDevice b;

    public /* synthetic */ skd(ald ald, BluetoothDevice bluetoothDevice) {
        this.a = ald;
        this.b = bluetoothDevice;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, (Boolean) obj);
    }
}
