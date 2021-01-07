package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import androidx.core.app.k;
import androidx.core.app.m;
import com.spotify.music.C0707R;
import com.spotify.music.container.app.foregroundstate.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ul1  reason: default package */
public class ul1 {
    private final Context a;
    private final NotificationManager b;
    private final h c;
    private final ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>(1);

    public ul1(Context context, NotificationManager notificationManager, h hVar) {
        this.a = context;
        this.b = notificationManager;
        this.c = hVar;
    }

    private ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>(1);
        for (String str : this.d.values()) {
            if (!"foreground-service-empty-notification-message".equals(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private void d() {
        if (!this.d.isEmpty()) {
            this.b.notify(28, a(b()));
        } else {
            this.b.cancel(28);
        }
    }

    /* access modifiers changed from: package-private */
    public Notification a(ArrayList<String> arrayList) {
        m mVar = new m();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            mVar.j(it.next());
        }
        k kVar = new k(this.a, "external_integration_service_channel");
        kVar.j(this.a.getString(C0707R.string.foreground_service_notification_title));
        kVar.z(C0707R.drawable.icn_notification);
        kVar.B(mVar);
        return kVar.a();
    }

    public boolean c(String str) {
        return this.d.get(str) != null;
    }

    public void e(Service service, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.createNotificationChannel(new NotificationChannel("external_integration_service_channel", this.a.getString(C0707R.string.foreground_service_notification_channel_title), 2));
        }
        service.startForeground(28, a(b()));
        this.c.b();
        this.d.put(str, "foreground-service-empty-notification-message");
    }

    public void f(Service service, String str) {
        this.d.remove(str);
        service.stopForeground(true);
        this.c.b();
        d();
    }

    public void g(String str, String str2) {
        if (this.d.containsKey(str)) {
            ConcurrentHashMap<String, String> concurrentHashMap = this.d;
            if (str2 == null) {
                str2 = "foreground-service-empty-notification-message";
            }
            concurrentHashMap.put(str, str2);
            d();
        }
    }
}
