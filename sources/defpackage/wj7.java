package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.k;
import com.spotify.music.C0707R;

/* renamed from: wj7  reason: default package */
public class wj7 {
    private final Context a;

    wj7(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(PendingIntent pendingIntent) {
        String string = this.a.getString(C0707R.string.notification_incognito_mode_disabled_title);
        k kVar = new k(this.a, "spotify_updates_channel");
        kVar.h(pendingIntent);
        kVar.j(string);
        kVar.D(string);
        kVar.i(this.a.getString(C0707R.string.notification_incognito_mode_disabled_message));
        kVar.z(C0707R.drawable.icn_notification);
        kVar.d(true);
        ((NotificationManager) this.a.getSystemService("notification")).notify(C0707R.id.notification_incognito_mode_disabled, kVar.a());
    }
}
