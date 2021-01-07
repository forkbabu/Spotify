package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.j;
import java.util.HashMap;
import java.util.Map;

public class b implements androidx.work.impl.b {
    private static final String f = j.f("CommandHandler");
    public static final /* synthetic */ int n = 0;
    private final Context a;
    private final Map<String, androidx.work.impl.b> b = new HashMap();
    private final Object c = new Object();

    b(Context context) {
        this.a = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    @Override // androidx.work.impl.b
    public void e(String str, boolean z) {
        synchronized (this.c) {
            androidx.work.impl.b remove = this.b.remove(str);
            if (remove != null) {
                remove.e(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Intent intent, int i, e eVar) {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            j.c().a(f, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            new c(this.a, i, eVar).a();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j.c().a(f, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            eVar.g().t();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 1) {
                        z = true;
                        break;
                    } else if (extras.get(strArr[i2]) == null) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z = false;
            if (!z) {
                j.c().b(f, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                j c2 = j.c();
                String str = f;
                c2.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
                WorkDatabase o = eVar.g().o();
                o.c();
                try {
                    ga p = ((ia) o.z()).p(string);
                    if (p == null) {
                        j c3 = j.c();
                        c3.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    } else if (p.b.d()) {
                        j c4 = j.c();
                        c4.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    } else {
                        long a2 = p.a();
                        if (!p.b()) {
                            j.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a2)), new Throwable[0]);
                            a.c(this.a, eVar.g(), string, a2);
                        } else {
                            j.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a2)), new Throwable[0]);
                            a.c(this.a, eVar.g(), string, a2);
                            eVar.j(new e.b(eVar, a(this.a), i));
                        }
                        o.s();
                    }
                } finally {
                    o.h();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.c) {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    j c5 = j.c();
                    String str2 = f;
                    c5.a(str2, String.format("Handing delay met for %s", string2), new Throwable[0]);
                    if (!this.b.containsKey(string2)) {
                        d dVar = new d(this.a, i, string2, eVar);
                        this.b.put(string2, dVar);
                        dVar.d();
                    } else {
                        j.c().a(str2, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                j.c().a(f, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
                eVar.g().y(string3);
                a.a(this.a, eVar.g(), string3);
                eVar.e(string3, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z2 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                j.c().a(f, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                e(string4, z2);
            } else {
                j.c().h(f, String.format("Ignoring intent %s", intent), new Throwable[0]);
            }
        }
    }
}
