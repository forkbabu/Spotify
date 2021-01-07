package com.spotify.music.homething.addnewdevice.scandevices.service;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.google.common.base.Charsets;
import com.spotify.base.java.logging.Logger;
import com.spotify.http.wg.TokenResponse;
import com.spotify.music.homething.addnewdevice.scandevices.service.HomethingActivationService;
import io.reactivex.functions.g;
import java.util.Arrays;
import java.util.UUID;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ HomethingActivationService.a a;
    public final /* synthetic */ BluetoothGattCharacteristic b;

    public /* synthetic */ c(HomethingActivationService.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.a = aVar;
        this.b = bluetoothGattCharacteristic;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        HomethingActivationService.a aVar = this.a;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.b;
        TokenResponse tokenResponse = (TokenResponse) obj;
        HomethingActivationService.h(HomethingActivationService.this, true);
        HomethingActivationService.p(HomethingActivationService.this);
        if (bluetoothGattCharacteristic == null) {
            Logger.d("ERROR: Characteristic is 'null', ignoring setNotify request", new Object[0]);
        } else {
            HomethingActivationService.m(HomethingActivationService.this).setCharacteristicNotification(bluetoothGattCharacteristic, true);
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
            if (descriptor == null) {
                Logger.d("ERROR: Could not get CCC descriptor for characteristic", new Object[0]);
            } else if (HomethingActivationService.s(HomethingActivationService.this).add(new b(aVar, descriptor))) {
                HomethingActivationService.t(HomethingActivationService.this);
            } else {
                Logger.d("ERROR: Could not enqueue write command", new Object[0]);
            }
        }
        HomethingActivationService.i(HomethingActivationService.this).f(tokenResponse.accessToken);
        byte[] bytes = HomethingActivationService.i(HomethingActivationService.this).b().getBytes(Charsets.UTF_8);
        int length = bytes.length % 18;
        int length2 = (bytes.length / 18) + (length > 0 ? 1 : 0);
        byte[][] bArr = new byte[length2][];
        int i = 0;
        while (true) {
            if (i >= (length > 0 ? length2 - 1 : length2)) {
                break;
            }
            int i2 = i * 18;
            bArr[i] = Arrays.copyOfRange(bytes, i2, i2 + 18);
            i++;
        }
        if (length > 0) {
            int i3 = length2 - 1;
            int i4 = i3 * 18;
            bArr[i3] = Arrays.copyOfRange(bytes, i4, length + i4);
        }
        for (int i5 = 0; i5 < length2; i5++) {
            HomethingActivationService.j(HomethingActivationService.this, bluetoothGattCharacteristic, bArr[i5]);
        }
        byte[] bArr2 = {0};
        HomethingActivationService.j(HomethingActivationService.this, bluetoothGattCharacteristic, bArr2);
        HomethingActivationService.j(HomethingActivationService.this, bluetoothGattCharacteristic, "OK".getBytes(Charsets.UTF_8));
        HomethingActivationService.j(HomethingActivationService.this, bluetoothGattCharacteristic, bArr2);
        HomethingActivationService.k(HomethingActivationService.this);
    }
}
