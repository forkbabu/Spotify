package com.spotify.music.homething.addnewdevice.scandevices.service;

import android.bluetooth.BluetoothGattDescriptor;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.homething.addnewdevice.scandevices.service.HomethingActivationService;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ HomethingActivationService.a a;
    public final /* synthetic */ BluetoothGattDescriptor b;

    public /* synthetic */ b(HomethingActivationService.a aVar, BluetoothGattDescriptor bluetoothGattDescriptor) {
        this.a = aVar;
        this.b = bluetoothGattDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HomethingActivationService.a aVar = this.a;
        BluetoothGattDescriptor bluetoothGattDescriptor = this.b;
        aVar.getClass();
        bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        if (!HomethingActivationService.this.A.writeDescriptor(bluetoothGattDescriptor)) {
            Logger.d("ERROR: writeDescriptor failed", new Object[0]);
            HomethingActivationService.r(HomethingActivationService.this);
        }
    }
}
