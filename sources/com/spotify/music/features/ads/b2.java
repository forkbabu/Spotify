package com.spotify.music.features.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
public class b2 extends BroadcastReceiver {
    final /* synthetic */ KeyguardManager a;
    final /* synthetic */ c2 b;

    b2(c2 c2Var, KeyguardManager keyguardManager) {
        this.b = c2Var;
        this.a = keyguardManager;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(action) || "android.intent.action.SCREEN_OFF".equals(action)) {
            KeyguardManager keyguardManager = this.a;
            this.b.a.a("screen_lock", Boolean.toString(keyguardManager != null && keyguardManager.isKeyguardLocked()));
        }
    }
}
