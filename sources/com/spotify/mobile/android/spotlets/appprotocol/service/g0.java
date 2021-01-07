package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.UUID;

public class g0 extends Thread implements b0 {
    private BluetoothServerSocket a;
    private final UUID b;
    private final BluetoothAdapter c;
    private final a f;
    private boolean n;

    /* access modifiers changed from: package-private */
    public interface a {
        void a(BluetoothSocket bluetoothSocket);
    }

    public g0(UUID uuid, BluetoothAdapter bluetoothAdapter, a aVar) {
        this.b = uuid;
        this.c = bluetoothAdapter;
        this.f = aVar;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.service.b0
    public void cancel() {
        this.n = true;
        try {
            BluetoothServerSocket bluetoothServerSocket = this.a;
            if (bluetoothServerSocket != null) {
                bluetoothServerSocket.close();
            }
        } catch (IOException e) {
            Logger.e(e, "Error closing BT server socket", new Object[0]);
        }
        this.a = null;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.service.b0
    public boolean l() {
        return this.n || !isAlive();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            BluetoothAdapter bluetoothAdapter = this.c;
            if (bluetoothAdapter != null) {
                this.a = bluetoothAdapter.listenUsingRfcommWithServiceRecord("Spotify", this.b);
            }
        } catch (IOException e) {
            Logger.e(e, "Error closing BT server socket. UUID: %s", this.b.toString());
        }
        if (this.a == null) {
            Logger.d("BT server socket is null", new Object[0]);
            cancel();
            return;
        }
        while (!l()) {
            try {
                BluetoothSocket accept = this.a.accept();
                if (accept != null) {
                    this.f.a(accept);
                }
            } catch (IOException e2) {
                Logger.c(e2, "IOException, most likely from socket.accept() call being aborted. UUID: %s", this.b.toString());
                return;
            }
        }
    }
}
