package defpackage;

import android.bluetooth.BluetoothDevice;
import android.view.View;

/* renamed from: bs9  reason: default package */
public final /* synthetic */ class bs9 implements View.OnClickListener {
    public final /* synthetic */ cs9 a;
    public final /* synthetic */ BluetoothDevice b;

    public /* synthetic */ bs9(cs9 cs9, BluetoothDevice bluetoothDevice) {
        this.a = cs9;
        this.b = bluetoothDevice;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.Y(this.b, view);
    }
}
