package com.spotify.music.features.preloadnotification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.h;
import androidx.core.app.k;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;

/* access modifiers changed from: package-private */
public class e {
    private final Application a;
    private final uh7 b;
    private final NotificationManager c;
    private final o d;

    public e(Application application, uh7 uh7, NotificationManager notificationManager, o oVar) {
        this.a = application;
        this.b = uh7;
        this.c = notificationManager;
        this.d = oVar;
    }

    public void a() {
        this.b.e();
        if (Build.VERSION.SDK_INT >= 26) {
            this.c.createNotificationChannel(new NotificationChannel("com.spotify.music.features.preloadnotification.CHANNEL", this.a.getString(C0707R.string.preload_notification_channel_title), 2));
        }
        k kVar = new k(this.a, "com.spotify.music.features.preloadnotification.CHANNEL");
        Intent b2 = this.d.b(n.a(ViewUris.d.toString()).a());
        b2.putExtra("android.intent.extra.REFERRER", Uri.parse("samsung-preload-notification"));
        PendingIntent activity = PendingIntent.getActivity(this.a, 0, b2, 0);
        kVar.j(this.a.getString(C0707R.string.preload_notification_title));
        kVar.i(this.a.getString(C0707R.string.preload_notification_text));
        kVar.z(C0707R.drawable.icn_notification);
        kVar.d(true);
        kVar.b.add(new h(C0707R.drawable.icn_download_header_waiting, this.a.getString(C0707R.string.preload_notification_cta), activity));
        kVar.h(activity);
        this.c.notify(C0707R.id.preload_notification_id, kVar.a());
    }
}
