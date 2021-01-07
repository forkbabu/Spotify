package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import defpackage.zd5;
import io.reactivex.t;
import io.reactivex.u;

/* renamed from: xd5  reason: default package */
public final /* synthetic */ class xd5 implements u {
    public final /* synthetic */ BluetoothAdapter a;
    public final /* synthetic */ Context b;

    public /* synthetic */ xd5(BluetoothAdapter bluetoothAdapter, Context context) {
        this.a = bluetoothAdapter;
        this.b = context;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        BluetoothAdapter bluetoothAdapter = this.a;
        bluetoothAdapter.getProfileProxy(this.b, new zd5.a(tVar, bluetoothAdapter), 2);
    }
}
