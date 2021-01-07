package com.spotify.music.homething.addnewdevice.scandevices.service;

import android.bluetooth.BluetoothGatt;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.homething.addnewdevice.scandevices.service.HomethingActivationService;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ HomethingActivationService.a a;
    public final /* synthetic */ BluetoothGatt b;

    public /* synthetic */ d(HomethingActivationService.a aVar, BluetoothGatt bluetoothGatt) {
        this.a = aVar;
        this.b = bluetoothGatt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HomethingActivationService.a aVar = this.a;
        BluetoothGatt bluetoothGatt = this.b;
        aVar.getClass();
        if (!bluetoothGatt.discoverServices()) {
            Logger.d("discoverServices failed to start", new Object[0]);
        }
        HomethingActivationService.f(HomethingActivationService.this, null);
    }
}
