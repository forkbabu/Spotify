package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.k;
import androidx.core.content.a;
import com.spotify.mobile.android.service.o;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: xd2  reason: default package */
public final class xd2 {
    private final Context a;
    private final o b;

    public xd2(Context context, o oVar) {
        h.e(context, "context");
        h.e(oVar, "intentFactory");
        this.a = context;
        this.b = oVar;
    }

    public final Notification a() {
        k kVar = new k(this.a, "spotify_updates_channel");
        kVar.h(this.b.b(this.a));
        kVar.z(C0707R.drawable.icn_notification);
        kVar.j(this.a.getString(C0707R.string.prepare_alarm_notification_title));
        kVar.g(a.b(this.a, C0707R.color.notification_bg_color));
        kVar.F(1);
        kVar.E(new long[]{0});
        h.d(kVar, "builder.setContentIntent…etVibrate(longArrayOf(0))");
        kVar.w(-1);
        f6 f6Var = new f6();
        if (Build.VERSION.SDK_INT < 21) {
            Intent c = this.b.c(this.a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN");
            h.d(c, "intentFactory.getSpotify…ATION_CLOSE\n            )");
            PendingIntent service = PendingIntent.getService(this.a, 0, c, 134217728);
            f6Var.n(true);
            f6Var.k(service);
        }
        kVar.B(f6Var);
        Notification a2 = kVar.a();
        h.d(a2, "builder.build()");
        return a2;
    }
}
