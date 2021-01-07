package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.k;
import com.spotify.music.C0707R;
import com.spotify.music.container.app.foregroundstate.d;
import defpackage.rbd;
import io.reactivex.functions.g;

/* renamed from: ncd  reason: default package */
public final /* synthetic */ class ncd implements g {
    public final /* synthetic */ d a;
    public final /* synthetic */ t7d b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ NotificationManager f;

    public /* synthetic */ ncd(d dVar, t7d t7d, Context context, NotificationManager notificationManager) {
        this.a = dVar;
        this.b = t7d;
        this.c = context;
        this.f = notificationManager;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str;
        d dVar = this.a;
        t7d t7d = this.b;
        Context context = this.c;
        NotificationManager notificationManager = this.f;
        rbd.b bVar = (rbd.b) obj;
        if (dVar.a()) {
            t7d.b(bVar.a());
            return;
        }
        String a2 = bVar.a();
        if (a2 != null) {
            str = context.getResources().getString(C0707R.string.social_listening_notification_message_title_containing_host_name_multi_output_design, a2);
        } else {
            str = context.getResources().getString(C0707R.string.social_listening_notification_message_title_multi_output_design);
        }
        k kVar = new k(context, "social_listening_channel");
        kVar.j(str);
        kVar.i(context.getString(C0707R.string.social_listening_notification_message_subtitle));
        kVar.w(2);
        kVar.z(C0707R.drawable.icn_notification);
        Notification a3 = kVar.a();
        if (Build.VERSION.SDK_INT >= 26 && notificationManager.getNotificationChannel("social_listening_channel") == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("social_listening_channel", context.getString(C0707R.string.social_listening_notification_channel_title), 4));
        }
        notificationManager.notify(C0707R.id.notification_id, a3);
    }
}
