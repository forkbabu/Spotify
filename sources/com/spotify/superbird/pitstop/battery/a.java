package com.spotify.superbird.pitstop.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.spotify.superbird.pitstop.battery.BatteryStatusEvent;
import kotlin.jvm.internal.h;

public class a {
    private final PowerManager a;
    private final C0390a b;
    private final Context c;
    private final dpe d;
    private final cqe e;

    /* renamed from: com.spotify.superbird.pitstop.battery.a$a  reason: collision with other inner class name */
    public static final class C0390a extends BroadcastReceiver {
        final /* synthetic */ a a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0390a(a aVar) {
            this.a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.a.b();
        }
    }

    public a(Context context, dpe dpe, cqe cqe) {
        h.e(context, "context");
        h.e(dpe, "pitstopLogger");
        h.e(cqe, "clock");
        this.c = context;
        this.d = dpe;
        this.e = cqe;
        Object systemService = context.getSystemService("power");
        if (systemService != null) {
            this.a = (PowerManager) systemService;
            this.b = new C0390a(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b() {
        BatteryStatusEvent.PowerMode powerMode;
        Intent registerReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        int intExtra = registerReceiver != null ? (registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1) : -1;
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        boolean z = i == 2 || i == 5;
        if (Build.VERSION.SDK_INT < 21 || !this.a.isPowerSaveMode()) {
            powerMode = BatteryStatusEvent.PowerMode.NORMAL;
        } else {
            powerMode = BatteryStatusEvent.PowerMode.LOW;
        }
        this.d.c(new BatteryStatusEvent(powerMode, intExtra, z, this.e.d()));
    }

    public void c() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_LOW");
        if (Build.VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        }
        this.c.registerReceiver(this.b, intentFilter);
        b();
    }

    public void d() {
        try {
            this.c.unregisterReceiver(this.b);
        } catch (IllegalArgumentException unused) {
        }
    }
}
