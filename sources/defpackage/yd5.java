package defpackage;

import android.bluetooth.BluetoothSocket;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.f;

/* renamed from: yd5  reason: default package */
public final /* synthetic */ class yd5 implements f {
    public final /* synthetic */ BluetoothSocket a;

    public /* synthetic */ yd5(BluetoothSocket bluetoothSocket) {
        this.a = bluetoothSocket;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        BluetoothSocket bluetoothSocket = this.a;
        if (!bluetoothSocket.isConnected()) {
            bluetoothSocket.close();
            Logger.g("Go: Socket closed", new Object[0]);
        }
    }
}
