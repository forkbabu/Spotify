package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.spotify.music.libs.bluetooth.CategorizerResponse;
import io.reactivex.functions.g;

public final /* synthetic */ class q implements g {
    public final /* synthetic */ f0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BluetoothDevice f;
    public final /* synthetic */ BroadcastReceiver.PendingResult n;

    public /* synthetic */ q(f0 f0Var, Context context, boolean z, BluetoothDevice bluetoothDevice, BroadcastReceiver.PendingResult pendingResult) {
        this.a = f0Var;
        this.b = context;
        this.c = z;
        this.f = bluetoothDevice;
        this.n = pendingResult;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, this.c, this.f, this.n, (CategorizerResponse) obj);
    }
}
