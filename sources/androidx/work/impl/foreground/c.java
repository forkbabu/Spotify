package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.b;
import androidx.work.impl.l;
import androidx.work.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class c implements a9, b {
    static final String u = j.f("SystemFgDispatcher");
    private Context a;
    private l b;
    private final na c;
    final Object f = new Object();
    String n;
    e o;
    final Map<String, e> p;
    final Map<String, ga> q;
    final Set<ga> r;
    final b9 s;
    private a t;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    c(Context context) {
        this.a = context;
        l k = l.k(this.a);
        this.b = k;
        na q2 = k.q();
        this.c = q2;
        this.n = null;
        this.o = null;
        this.p = new LinkedHashMap();
        this.r = new HashSet();
        this.q = new HashMap();
        this.s = new b9(this.a, q2, this);
        this.b.m().a(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.c().a(u, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (!(notification == null || this.t == null)) {
            this.p.put(stringExtra, new e(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.n)) {
                this.n = stringExtra;
                ((SystemForegroundService) this.t).e(intExtra, intExtra2, notification);
                return;
            }
            ((SystemForegroundService) this.t).d(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, e> entry : this.p.entrySet()) {
                    i |= entry.getValue().a();
                }
                e eVar = this.p.get(this.n);
                if (eVar != null) {
                    ((SystemForegroundService) this.t).e(eVar.c(), i, eVar.b());
                }
            }
        }
    }

    @Override // defpackage.a9
    public void b(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                j.c().a(u, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                this.b.x(str);
            }
        }
    }

    @Override // androidx.work.impl.b
    public void e(String str, boolean z) {
        a aVar;
        Map.Entry<String, e> entry;
        synchronized (this.f) {
            ga remove = this.q.remove(str);
            if (remove != null ? this.r.remove(remove) : false) {
                this.s.d(this.r);
            }
        }
        this.o = this.p.remove(str);
        if (!str.equals(this.n)) {
            e eVar = this.o;
            if (eVar != null && (aVar = this.t) != null) {
                ((SystemForegroundService) aVar).a(eVar.c());
            }
        } else if (this.p.size() > 0) {
            Iterator<Map.Entry<String, e>> it = this.p.entrySet().iterator();
            Map.Entry<String, e> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.n = entry.getKey();
            if (this.t != null) {
                e value = entry.getValue();
                ((SystemForegroundService) this.t).e(value.c(), value.a(), value.b());
                ((SystemForegroundService) this.t).a(value.c());
            }
        }
    }

    @Override // defpackage.a9
    public void f(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    public void g() {
        j.c().d(u, "Stopping foreground service", new Throwable[0]);
        a aVar = this.t;
        if (aVar != null) {
            e eVar = this.o;
            if (eVar != null) {
                ((SystemForegroundService) aVar).a(eVar.c());
                this.o = null;
            }
            ((SystemForegroundService) this.t).f();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.t = null;
        synchronized (this.f) {
            this.s.e();
        }
        this.b.m().g(this);
    }

    /* access modifiers changed from: package-private */
    public void i(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j.c().d(u, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((oa) this.c).a(new b(this, this.b.o(), stringExtra));
            d(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            d(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            j.c().d(u, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                this.b.g(UUID.fromString(stringExtra2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(a aVar) {
        if (this.t != null) {
            j.c().b(u, "A callback already exists.", new Throwable[0]);
        } else {
            this.t = aVar;
        }
    }
}
