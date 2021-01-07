package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.l;
import androidx.work.impl.utils.c;
import androidx.work.j;

/* access modifiers changed from: package-private */
public class a {
    private static final String a = j.f("Alarms");

    public static void a(Context context, l lVar, String str) {
        z9 z9Var = (z9) lVar.o().w();
        x9 a2 = z9Var.a(str);
        if (a2 != null) {
            b(context, str, a2.b);
            j.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            z9Var.c(str);
        }
    }

    private static void b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            j.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, l lVar, String str, long j) {
        WorkDatabase o = lVar.o();
        z9 z9Var = (z9) o.w();
        x9 a2 = z9Var.a(str);
        if (a2 != null) {
            b(context, str, a2.b);
            d(context, str, a2.b, j);
            return;
        }
        int a3 = new c(o).a();
        z9Var.b(new x9(str, a3));
        d(context, str, a3, j);
    }

    private static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, str), 134217728);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
