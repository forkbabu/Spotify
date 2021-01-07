package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import androidx.core.app.k;
import androidx.core.content.a;
import com.spotify.mobile.android.service.o;
import com.spotify.music.C0707R;

/* renamed from: zx5  reason: default package */
public final class zx5 {
    private final Context a;
    private final o b;

    public zx5(Service service, o oVar) {
        this.a = service;
        this.b = oVar;
    }

    public Notification a() {
        k kVar = new k(this.a, "spotify_updates_channel");
        kVar.h(this.b.b(this.a));
        kVar.z(C0707R.drawable.icn_notification);
        kVar.j(this.a.getString(C0707R.string.notification_placeholder_fg_title));
        kVar.g(a.b(this.a, C0707R.color.notification_bg_color));
        kVar.F(1);
        kVar.E(new long[]{0});
        kVar.w(-1);
        PendingIntent service = PendingIntent.getService(this.a, 0, this.b.c(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 134217728);
        f6 f6Var = new f6();
        f6Var.n(true);
        f6Var.k(service);
        kVar.B(f6Var);
        return kVar.a();
    }
}
