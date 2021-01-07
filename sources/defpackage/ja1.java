package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.observablestates.docking.e;
import com.spotify.mobile.android.service.plugininterfaces.b;

/* renamed from: ja1  reason: default package */
public class ja1 implements b {
    private final Context a;
    private final e b;
    private BroadcastReceiver c;

    /* renamed from: ja1$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("status", -1);
            boolean z = intExtra == 2 || intExtra == 5;
            Logger.b("PowerConnectionReceiver - status : %d", Integer.valueOf(intExtra));
            ja1.this.b.b(z);
        }
    }

    public ja1(Context context, e eVar) {
        this.a = context;
        this.b = eVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        a aVar = new a();
        this.c = aVar;
        this.a.registerReceiver(aVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "BatteryChargingPlugin";
    }
}
