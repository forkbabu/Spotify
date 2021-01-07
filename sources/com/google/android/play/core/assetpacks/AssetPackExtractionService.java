package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.play.core.internal.a;

public class AssetPackExtractionService extends Service {
    private final a a = new a("AssetPackExtractionService");
    Context b;
    s2 c;
    z f;
    private x n;
    private NotificationManager o;

    private final synchronized void c(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i >= 26 ? new Notification.Builder(this.b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.b).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (i >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.a.f("Starting foreground service.", new Object[0]);
        this.c.b(true);
        if (i >= 26) {
            this.o.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    public final synchronized Bundle a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        a aVar = this.a;
        Integer valueOf = Integer.valueOf(i);
        aVar.c("updateServiceState: %d", valueOf);
        if (i == 1) {
            c(bundle);
        } else if (i == 2) {
            b();
        } else {
            this.a.e("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        this.a.f("Stopping service.", new Object[0]);
        this.c.b(false);
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.n;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a.c("onCreate", new Object[0]);
        s1.a(getApplicationContext()).a(this);
        this.n = new x(this.b, this, this.f);
        this.o = (NotificationManager) this.b.getSystemService("notification");
    }
}
