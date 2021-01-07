package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.music.features.go.service.GoBluetoothService;

/* renamed from: ke5  reason: default package */
public class ke5 implements b {
    private final Context a;
    private final h2e b;
    private final zd5 c;
    private io.reactivex.disposables.b f;

    public ke5(Context context, h2e h2e) {
        zd5 zd5 = new zd5(BluetoothAdapter.getDefaultAdapter());
        this.a = context;
        this.b = h2e;
        this.c = zd5;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        if (!this.c.c()) {
            Logger.d("Go: Bluetooth is not supported on this hardware platform", new Object[0]);
        } else {
            this.f = this.c.b(this.a).subscribe(new ie5(this), je5.a);
        }
    }

    public void b(ae5 ae5) {
        Logger.g("Go: A Go device is found connected: %s", ae5.a());
        h2e h2e = this.b;
        Context context = this.a;
        int i = GoBluetoothService.r;
        Intent intent = new Intent(context, GoBluetoothService.class);
        intent.putExtra("address", ae5.a());
        intent.putExtra("connected", true);
        h2e.b(context, intent, "GoBluetoothServicePlugin", new Object[0]);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        io.reactivex.disposables.b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
            this.f = null;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "GoBluetoothService";
    }
}
