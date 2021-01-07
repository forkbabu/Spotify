package com.spotify.music.samsungpersonalization.customization;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.k;
import com.spotify.music.C0707R;
import io.reactivex.functions.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

final class j<T> implements g<List<? extends m60>> {
    final /* synthetic */ TpoContextChangedService a;

    j(TpoContextChangedService tpoContextChangedService) {
        this.a = tpoContextChangedService;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(List<? extends m60> list) {
        NotificationManager notificationManager;
        List<? extends m60> list2 = list;
        h.e(list2, "events");
        TpoContextChangedService tpoContextChangedService = this.a;
        int i = TpoContextChangedService.p;
        tpoContextChangedService.getClass();
        if (!list2.isEmpty() && (notificationManager = (NotificationManager) tpoContextChangedService.getSystemService("notification")) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.spotify.music.samsungpersonalization.customization.channel.TPO_CONTEXT", "tpoContext", 4));
            }
            k kVar = new k(tpoContextChangedService, "com.spotify.music.samsungpersonalization.customization.channel.TPO_CONTEXT");
            kVar.z(C0707R.drawable.icn_notification);
            kVar.j(tpoContextChangedService.getString(C0707R.string.tpo_context_update_notification_title));
            StringBuilder sb = new StringBuilder();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                StringBuilder S0 = je.S0('[');
                S0.append(it.next().a);
                S0.append(']');
                sb.append(S0.toString());
            }
            String sb2 = sb.toString();
            h.d(sb2, "builder.toString()");
            kVar.i(sb2);
            kVar.h(PendingIntent.getActivity(tpoContextChangedService, 0, new Intent(tpoContextChangedService, TpoContextActivity.class), 0));
            kVar.p("CS_GROUP_KEY_TPO");
            kVar.d(true);
            notificationManager.notify(C0707R.id.notification_id, kVar.a());
        }
    }
}
