package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.container.app.foregroundstate.h;
import java.util.Locale;
import kotlin.Pair;
import kotlin.text.e;

/* renamed from: l2e  reason: default package */
public class l2e {
    private final SparseArray<Pair<Notification, Boolean>> a = new SparseArray<>();
    private int b = -1;
    private final Service c;
    private final NotificationManager d;
    private final m2e e;
    private final i2e f;
    private final int g;
    private final int h;
    private final h i;

    public l2e(Service service, NotificationManager notificationManager, m2e m2e, i2e i2e, int i2, int i3, h hVar) {
        kotlin.jvm.internal.h.e(service, "service");
        kotlin.jvm.internal.h.e(notificationManager, "notificationManager");
        kotlin.jvm.internal.h.e(m2e, "placeholderNotificationFactory");
        kotlin.jvm.internal.h.e(i2e, "serviceStarterFeatureGate");
        kotlin.jvm.internal.h.e(hVar, "foregroundServicesStatusRefresher");
        this.c = service;
        this.d = notificationManager;
        this.e = m2e;
        this.f = i2e;
        this.g = i2;
        this.h = i3;
        this.i = hVar;
        if (Build.VERSION.SDK_INT >= 26) {
            String string = service.getResources().getString(i2);
            kotlin.jvm.internal.h.d(string, "service.resources.getStr…(notificationChannelName)");
            String string2 = service.getResources().getString(i3);
            kotlin.jvm.internal.h.d(string2, "service.resources.getStr…cationChannelDescription)");
            NotificationChannel notificationChannel = new NotificationChannel("spotify_updates_channel", string, 2);
            notificationChannel.setDescription(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private final void c(int i2, Notification notification) {
        Logger.g("Notifying notification: %d", Integer.valueOf(i2));
        try {
            this.d.notify(i2, notification);
        } catch (RuntimeException e2) {
            if (Build.VERSION.SDK_INT == 19) {
                String str = Build.MANUFACTURER;
                kotlin.jvm.internal.h.d(str, "Build.MANUFACTURER");
                Locale locale = Locale.ENGLISH;
                kotlin.jvm.internal.h.d(locale, "Locale.ENGLISH");
                String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (e.c(lowerCase, "samsung", false, 2, null) && e.f("bad array lengths", e2.getMessage(), true)) {
                    Assertion.i("Notification failed with Exception. Most likely Android 4.4 Samsung problem", e2);
                    Logger.e(e2, "Notification failed with Exception. Most likely Android 4.4 Samsung problem", new Object[0]);
                    return;
                }
            }
            throw e2;
        }
    }

    private final void d(int i2, Notification notification) {
        Logger.g("Setting %s as foreground with notification: %d", this.c.getClass().getSimpleName(), Integer.valueOf(i2));
        this.c.startForeground(i2, notification);
        this.i.b();
        this.b = i2;
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = this.a.keyAt(i3);
            if (keyAt != this.b) {
                c(keyAt, this.a.get(keyAt).c());
            }
        }
    }

    private final void g(boolean z) {
        Logger.g("Stopping %s as foreground, last foreground notification: %d", this.c.getClass().getSimpleName(), Integer.valueOf(this.b));
        this.c.stopForeground(z);
        this.i.b();
        this.b = -1;
    }

    public final synchronized void a(Intent intent) {
        if (this.b != -1) {
            Logger.g("Foreground notification already present", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26 && this.b == -1) {
            kotlin.jvm.internal.h.e(intent, "intent");
            if (intent.getBooleanExtra("needs_foreground_start", false)) {
                if (this.f.a()) {
                    Logger.g("Adding placeholder notification", new Object[0]);
                    f(C0707R.id.notification_placeholder_fg_start, this.e.create(), true);
                }
            }
        }
    }

    public synchronized void b(int i2) {
        this.a.remove(i2);
        if (this.b == i2) {
            g(true);
            int size = this.a.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                int keyAt = this.a.keyAt(i3);
                Pair<Notification, Boolean> pair = this.a.get(keyAt);
                if (pair.d().booleanValue()) {
                    d(keyAt, pair.c());
                    break;
                }
                i3++;
            }
        } else {
            Logger.g("Canceling notification: %d", Integer.valueOf(i2));
            this.d.cancel(i2);
        }
        Logger.g("Ongoing notifications after hiding: %s", this.a.toString());
    }

    public synchronized void e(int i2, Notification notification) {
        kotlin.jvm.internal.h.e(notification, "notification");
        f(i2, notification, true);
    }

    public synchronized void f(int i2, Notification notification, boolean z) {
        boolean z2;
        kotlin.jvm.internal.h.e(notification, "notification");
        if (z && i2 != C0707R.id.notification_placeholder_fg_start && this.b == C0707R.id.notification_placeholder_fg_start) {
            Logger.g("Dismissing placeholder notification", new Object[0]);
            this.a.remove(C0707R.id.notification_placeholder_fg_start);
            this.d.cancel(C0707R.id.notification_placeholder_fg_start);
            this.b = -1;
        }
        if (z && this.b == -1) {
            d(i2, notification);
        } else if (z || i2 != this.b) {
            c(i2, notification);
        } else {
            int size = this.a.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z2 = false;
                    break;
                }
                int keyAt = this.a.keyAt(i3);
                Pair<Notification, Boolean> pair = this.a.get(keyAt);
                if (keyAt != i2 && pair.d().booleanValue()) {
                    d(keyAt, pair.c());
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (!z2) {
                g(false);
            }
            c(i2, notification);
        }
        this.a.put(i2, new Pair<>(notification, Boolean.valueOf(z)));
        Logger.g("Ongoing notifications: %s", this.a.toString());
    }
}
