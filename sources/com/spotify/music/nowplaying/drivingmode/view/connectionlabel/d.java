package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.e;
import io.reactivex.h;

public final /* synthetic */ class d implements e.b {
    public final /* synthetic */ h a;

    public /* synthetic */ d(h hVar) {
        this.a = hVar;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.connectionlabel.e.b
    public final void a(BluetoothConnectionState bluetoothConnectionState) {
        this.a.onNext(bluetoothConnectionState);
    }
}
