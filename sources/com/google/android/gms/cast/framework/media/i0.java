package com.google.android.gms.cast.framework.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.u;

final class i0 extends BroadcastReceiver {
    private final /* synthetic */ MediaNotificationService a;

    i0(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        if (MediaNotificationService.c(this.a).j()) {
            intent2.setFlags(603979776);
            pendingIntent = PendingIntent.getActivity(context, 1, intent2, 134217728);
        } else {
            u h = u.h(this.a);
            h.f(componentName);
            h.c(intent2);
            pendingIntent = h.i(1, 134217728);
        }
        try {
            pendingIntent.send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException e) {
            MediaNotificationService.i().b(e, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
