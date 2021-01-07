package com.spotify.music.features.preloadnotification;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* access modifiers changed from: package-private */
public class d {
    private final th7 a;
    private final AlarmManager b;
    private final Application c;
    private PendingIntent d;

    public d(th7 th7, AlarmManager alarmManager, Application application) {
        this.a = th7;
        this.b = alarmManager;
        this.c = application;
    }

    private PendingIntent b() {
        if (this.d == null) {
            Intent intent = new Intent(this.c, PreloadNotificationReceiver.class);
            intent.setAction("com.spotify.music.features.preloadnotification.ALARM");
            this.d = PendingIntent.getBroadcast(this.c, 101, intent, 134217728);
        }
        return this.d;
    }

    public void a() {
        this.b.cancel(b());
    }

    public void c() {
        long a2 = this.a.a();
        if (a2 != Long.MAX_VALUE) {
            this.b.set(1, a2, b());
        } else {
            Logger.d("Tried to schedule notification even though it shouldn't be scheduled again.", new Object[0]);
        }
    }
}
