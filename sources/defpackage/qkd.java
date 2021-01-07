package defpackage;

import android.bluetooth.BluetoothDevice;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import java.io.IOException;
import java.util.UUID;

/* renamed from: qkd  reason: default package */
public final /* synthetic */ class qkd implements g {
    public final /* synthetic */ BluetoothDevice a;

    public /* synthetic */ qkd(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        BluetoothDevice bluetoothDevice = this.a;
        Long l = (Long) obj;
        try {
            Logger.b("Initiate SDP scan for reconnection.", new Object[0]);
            bluetoothDevice.createRfcommSocketToServiceRecord(UUID.fromString("AA-BB-CC-DD-EE")).connect();
        } catch (IOException unused) {
        }
    }
}
