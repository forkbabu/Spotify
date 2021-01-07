package defpackage;

import android.app.NotificationManager;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: yu7  reason: default package */
public class yu7 {
    private final NotificationManager a;
    private final dw7 b;
    private final cw7 c;

    public yu7(NotificationManager notificationManager, dw7 dw7, cw7 cw7) {
        this.a = notificationManager;
        this.b = dw7;
        this.c = cw7;
    }

    public void a(Intent intent) {
        pv7 pv7 = (pv7) intent.getParcelableExtra("push_data");
        if (pv7 instanceof nv7) {
            nv7 nv7 = (nv7) pv7;
            Logger.b("Processing acton %s", nv7);
            this.a.cancel(nv7.f());
            if (!nv7.c()) {
                ((yv7) this.c).a("PRIMARY_ACTION", nv7.e(), nv7.a(), nv7.g());
            } else {
                ((yv7) this.c).a("OPEN_URL", nv7.e(), nv7.a(), nv7.g());
            }
            this.b.c(nv7.e(), nv7.g(), nv7.c());
        } else if (pv7 instanceof mv7) {
            mv7 mv7 = (mv7) pv7;
            Logger.b("Processing acton %s", mv7);
            this.a.cancel(mv7.e());
            this.b.c(mv7.c(), ViewUris.M1.toString(), true);
            ((yv7) this.c).a("PUSH_SETTINGS", mv7.c(), mv7.a(), null);
        } else {
            Logger.d("Unrecognized PushNotificationAction %s", pv7);
        }
    }
}
