package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.bluetooth.CategorizerResponse;
import com.spotify.music.libs.bluetooth.j;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class f0 {
    private final j a;
    private final y b;
    private final y c;
    private final h2e d;
    private b e;

    public f0(j jVar, y yVar, y yVar2, h2e h2e) {
        this.a = jVar;
        this.b = yVar;
        this.c = yVar2;
        this.d = h2e;
    }

    public void a(Context context, boolean z, BluetoothDevice bluetoothDevice, BroadcastReceiver.PendingResult pendingResult, CategorizerResponse categorizerResponse) {
        if (categorizerResponse.isInterapp()) {
            h2e h2e = this.d;
            int i = AppProtocolBluetoothService.u;
            Intent intent = new Intent(context, AppProtocolBluetoothService.class);
            intent.putExtra("start_server", z);
            intent.putExtra("device", bluetoothDevice);
            intent.putExtra("categorization", categorizerResponse);
            h2e.b(context, intent, "AppProtocolServiceStarter", new Object[0]);
        }
        this.a.e();
        this.e.dispose();
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }

    public void b(BroadcastReceiver.PendingResult pendingResult, Throwable th) {
        Logger.e(th, "failed getting bluetooth category", new Object[0]);
        this.a.e();
        this.e.dispose();
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }

    public void c(Context context, boolean z, BluetoothDevice bluetoothDevice, BroadcastReceiver.PendingResult pendingResult) {
        g<CategorizerResponse> k0 = this.a.a(bluetoothDevice.getName()).e0(this.b).k0(5, TimeUnit.SECONDS, this.b);
        CategorizerResponse categorizerResponse = CategorizerResponse.DEFAULT_RESPONSE;
        this.e = k0.D(categorizerResponse).C(z.z(categorizerResponse)).B(this.c).subscribe(new q(this, context, z, bluetoothDevice, pendingResult), new p(this, pendingResult));
    }
}
