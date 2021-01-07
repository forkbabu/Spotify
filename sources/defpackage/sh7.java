package defpackage;

import android.app.AlarmManager;
import android.app.Application;

/* renamed from: sh7  reason: default package */
public final class sh7 implements fjf<AlarmManager> {
    private final wlf<Application> a;

    public sh7(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AlarmManager alarmManager = (AlarmManager) this.a.get().getSystemService("alarm");
        yif.g(alarmManager, "Cannot return null from a non-@Nullable @Provides method");
        return alarmManager;
    }
}
