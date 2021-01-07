package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.e;
import androidx.work.j;

public class f implements e {
    private static final String b = j.f("SystemAlarmScheduler");
    private final Context a;

    public f(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // androidx.work.impl.e
    public void a(String str) {
        Context context = this.a;
        int i = b.n;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.a.startService(intent);
    }

    @Override // androidx.work.impl.e
    public void c(ga... gaVarArr) {
        for (ga gaVar : gaVarArr) {
            j.c().a(b, String.format("Scheduling work with workSpecId %s", gaVar.a), new Throwable[0]);
            this.a.startService(b.c(this.a, gaVar.a));
        }
    }

    @Override // androidx.work.impl.e
    public boolean d() {
        return true;
    }
}
