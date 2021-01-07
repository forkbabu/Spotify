package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothAdapter;
import com.spotify.mobile.android.spotlets.appprotocol.service.g0;
import java.util.UUID;
import javax.net.ServerSocketFactory;

public class c0 {
    private final BluetoothAdapter a;
    private final ServerSocketFactory b;

    public c0(BluetoothAdapter bluetoothAdapter, ServerSocketFactory serverSocketFactory) {
        this.a = bluetoothAdapter;
        this.b = serverSocketFactory;
    }

    public b0 a(UUID uuid, g0.a aVar) {
        return new g0(uuid, this.a, aVar);
    }
}
