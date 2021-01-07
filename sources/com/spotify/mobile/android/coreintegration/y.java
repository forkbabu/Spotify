package com.spotify.mobile.android.coreintegration;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.k;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import java.util.Random;

/* access modifiers changed from: package-private */
public class y {
    private final Context a;
    private final NotificationManager b;
    private final Random c;
    private final String d;

    y(Context context, NotificationManager notificationManager, Random random, String str) {
        this.a = context.getApplicationContext();
        this.b = notificationManager;
        this.c = random;
        this.d = str;
    }

    public void a() {
        this.b.cancel(C0707R.id.notification_no_storage_device);
    }

    public void b(int i) {
        if (i == 1301) {
            Logger.d("There is no cache location, giving up starting Core.", new Object[0]);
            Intent intent = new Intent();
            intent.setClassName(this.a, this.d);
            intent.addFlags(268435456);
            PendingIntent activity = PendingIntent.getActivity(this.a.getApplicationContext(), 0, intent, 0);
            k kVar = new k(this.a, null);
            kVar.j(this.a.getString(C0707R.string.alert_title_no_sd_card_found));
            kVar.i(this.a.getString(C0707R.string.alert_text_no_sd_card_found));
            kVar.z(C0707R.drawable.icn_notification);
            kVar.v(true);
            kVar.G(0);
            kVar.e("err");
            kVar.w(0);
            kVar.h(activity);
            kVar.d(true);
            this.b.notify(C0707R.id.notification_no_storage_device, kVar.a());
            if (this.c.nextDouble() >= 0.99d) {
                Assertion.v("Could not find valid cache location. (Throttled 99%)");
            }
        }
    }
}
