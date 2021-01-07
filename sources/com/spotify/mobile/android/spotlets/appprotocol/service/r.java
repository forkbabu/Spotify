package com.spotify.mobile.android.spotlets.appprotocol.service;

public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ AppProtocolBluetoothService a;

    public /* synthetic */ r(AppProtocolBluetoothService appProtocolBluetoothService) {
        this.a = appProtocolBluetoothService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.stopSelf();
    }
}
