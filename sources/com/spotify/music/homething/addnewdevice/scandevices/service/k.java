package com.spotify.music.homething.addnewdevice.scandevices.service;

import android.bluetooth.BluetoothGattCharacteristic;

public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ HomethingActivationService a;
    public final /* synthetic */ BluetoothGattCharacteristic b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ k(HomethingActivationService homethingActivationService, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        this.a = homethingActivationService;
        this.b = bluetoothGattCharacteristic;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.y(this.b, this.c);
    }
}
