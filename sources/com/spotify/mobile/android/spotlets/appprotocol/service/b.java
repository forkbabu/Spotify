package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothSocket;
import java.io.InputStream;
import java.io.OutputStream;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ InputStream b;
    public final /* synthetic */ OutputStream c;
    public final /* synthetic */ BluetoothSocket f;

    public /* synthetic */ b(d0 d0Var, InputStream inputStream, OutputStream outputStream, BluetoothSocket bluetoothSocket) {
        this.a = d0Var;
        this.b = inputStream;
        this.c = outputStream;
        this.f = bluetoothSocket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c, this.f);
    }
}
