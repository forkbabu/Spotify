package com.spotify.share.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.k;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class g {
    private NotificationManager a;
    private final Intent b = new Intent();

    public final void a(Activity activity) {
        h.e(activity, "activity");
        Object systemService = activity.getSystemService("notification");
        if (systemService != null) {
            this.a = (NotificationManager) systemService;
            Context applicationContext = activity.getApplicationContext();
            h.d(applicationContext, "activity.applicationContext");
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService2 = applicationContext.getSystemService("notification");
                if (systemService2 != null) {
                    NotificationChannel notificationChannel = new NotificationChannel(String.valueOf((int) C0707R.string.share_download_notification_channel_id), String.valueOf((int) C0707R.string.share_download_notification_channel_name), 3);
                    notificationChannel.setDescription(String.valueOf((int) C0707R.string.share_download_notification_channel_description));
                    ((NotificationManager) systemService2).createNotificationChannel(notificationChannel);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                }
            }
            k kVar = new k(activity.getApplicationContext(), String.valueOf((int) C0707R.string.share_download_notification_channel_id));
            kVar.z(17301633);
            kVar.j(activity.getBaseContext().getString(C0707R.string.download_notification_downloading));
            kVar.x(0, 0, true);
            kVar.w(0);
            NotificationManager notificationManager = this.a;
            if (notificationManager != null) {
                notificationManager.notify(C0707R.string.share_download_notification_channel_id, kVar.a());
            } else {
                h.k("notifyManager");
                throw null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    public final void b(Context context, Uri uri) {
        h.e(context, "context");
        h.e(uri, "uri");
        this.b.setAction("android.intent.action.VIEW");
        this.b.putExtra("output", uri);
        this.b.setDataAndType(uri, "image/*");
        PendingIntent activity = PendingIntent.getActivity(context, 0, this.b, 0);
        k kVar = new k(context, String.valueOf((int) C0707R.string.share_download_notification_channel_id));
        kVar.j(context.getString(C0707R.string.download_notification_completed));
        kVar.z(17301634);
        kVar.x(0, 0, false);
        kVar.h(activity);
        kVar.d(true);
        NotificationManager notificationManager = this.a;
        if (notificationManager != null) {
            notificationManager.notify(C0707R.string.share_download_notification_channel_id, kVar.a());
        } else {
            h.k("notifyManager");
            throw null;
        }
    }
}
