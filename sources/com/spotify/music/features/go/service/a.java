package com.spotify.music.features.go.service;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ GoBluetoothService a;

    public /* synthetic */ a(GoBluetoothService goBluetoothService) {
        this.a = goBluetoothService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        GoBluetoothService.e(this.a, (com.spotify.music.features.go.connection.a) obj);
    }
}
