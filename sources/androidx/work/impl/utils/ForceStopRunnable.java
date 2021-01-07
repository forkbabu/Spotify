package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.f;
import androidx.work.impl.k;
import androidx.work.impl.l;
import androidx.work.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {
    private static final String c = j.f("ForceStopRunnable");
    private static final long f = TimeUnit.DAYS.toMillis(3650);
    private final Context a;
    private final l b;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                j.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, l lVar) {
        this.a = context.getApplicationContext();
        this.b = lVar;
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b2 = b(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        } else {
            alarmManager.set(0, currentTimeMillis, b2);
        }
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            b.e(this.a);
        }
        WorkDatabase o = this.b.o();
        ha z = o.z();
        ea y = o.y();
        o.c();
        ia iaVar = (ia) z;
        try {
            List<ga> l = iaVar.l();
            boolean z2 = !((ArrayList) l).isEmpty();
            if (z2) {
                Iterator it = ((ArrayList) l).iterator();
                while (it.hasNext()) {
                    ga gaVar = (ga) it.next();
                    iaVar.z(WorkInfo.State.ENQUEUED, gaVar.a);
                    iaVar.u(gaVar.a, -1);
                }
            }
            ((fa) y).b();
            o.s();
            return z2;
        } finally {
            o.h();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        k.a(this.a);
        j c2 = j.c();
        String str = c;
        c2.a(str, "Performing cleanup operations.", new Throwable[0]);
        try {
            boolean a2 = a();
            if (this.b.l().a()) {
                j.c().a(str, "Rescheduling Workers.", new Throwable[0]);
                this.b.t();
                this.b.l().b(false);
            } else {
                if (b(this.a, 536870912) == null) {
                    c(this.a);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    j.c().a(str, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.b.t();
                } else if (a2) {
                    j.c().a(str, "Found unfinished work, scheduling it.", new Throwable[0]);
                    f.b(this.b.i(), this.b.o(), this.b.n());
                }
            }
            this.b.s();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteDatabaseCorruptException e) {
            j.c().b(c, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
            throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
        }
    }
}
