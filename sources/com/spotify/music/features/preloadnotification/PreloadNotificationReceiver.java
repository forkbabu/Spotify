package com.spotify.music.features.preloadnotification;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import dagger.android.a;
import dagger.android.d;

public class PreloadNotificationReceiver extends d {
    a a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.g("onReceive: %s", intent);
        a.c(this, context);
        String action = intent.getAction();
        if (!MoreObjects.isNullOrEmpty(action)) {
            action.hashCode();
            if (action.equals("com.spotify.music.features.preloadnotification.ALARM")) {
                this.a.b();
            } else if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                Logger.n("Action not supported: %s", action);
            } else {
                this.a.c();
            }
        } else {
            Logger.n("Received intent without action", new Object[0]);
        }
    }
}
