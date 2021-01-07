package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.q;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.utils.k;
import androidx.work.j;

public class SystemAlarmService extends q implements e.c {
    private static final String f = j.f("SystemAlarmService");
    private e b;
    private boolean c;

    public void a() {
        this.c = true;
        j.c().a(f, "All commands completed in dispatcher", new Throwable[0]);
        k.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.q, android.app.Service
    public void onCreate() {
        super.onCreate();
        e eVar = new e(this);
        this.b = eVar;
        eVar.l(this);
        this.c = false;
    }

    @Override // androidx.lifecycle.q, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.i();
    }

    @Override // androidx.lifecycle.q, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            j.c().d(f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.b.i();
            e eVar = new e(this);
            this.b = eVar;
            eVar.l(this);
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
