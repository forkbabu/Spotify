package defpackage;

import android.app.Application;
import android.app.NotificationManager;

/* renamed from: pu2  reason: default package */
public final class pu2 implements fjf<NotificationManager> {
    private final wlf<Application> a;

    public pu2(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        NotificationManager notificationManager = (NotificationManager) this.a.get().getSystemService("notification");
        yif.g(notificationManager, "Cannot return null from a non-@Nullable @Provides method");
        return notificationManager;
    }
}
