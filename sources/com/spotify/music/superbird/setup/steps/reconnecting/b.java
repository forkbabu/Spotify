package com.spotify.music.superbird.setup.steps.reconnecting;

import android.bluetooth.BluetoothDevice;
import com.spotify.music.superbird.setup.domain.f;
import io.reactivex.functions.g;
import java.io.IOException;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final class b<T> implements g<Integer> {
    final /* synthetic */ ReconnectingFragment a;
    final /* synthetic */ BluetoothDevice b;

    b(ReconnectingFragment reconnectingFragment, BluetoothDevice bluetoothDevice) {
        this.a = reconnectingFragment;
        this.b = bluetoothDevice;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Integer num) {
        Integer num2 = num;
        try {
            this.b.createRfcommSocketToServiceRecord(UUID.fromString("AA-BB-CC-DD-EE")).connect();
        } catch (IOException unused) {
        }
        if (num2 != null && num2.intValue() == 3) {
            ReconnectingFragment.K4(this.a).h(f.h.a);
        }
    }
}
