package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.l;
import androidx.work.impl.utils.g;
import androidx.work.impl.utils.k;
import androidx.work.impl.utils.n;
import androidx.work.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e implements androidx.work.impl.b {
    static final String t = j.f("SystemAlarmDispatcher");
    final Context a;
    private final na b;
    private final n c = new n();
    private final androidx.work.impl.d f;
    private final l n;
    final b o;
    private final Handler p;
    final List<Intent> q;
    Intent r;
    private c s;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            e eVar;
            synchronized (e.this.q) {
                e eVar2 = e.this;
                eVar2.r = eVar2.q.get(0);
            }
            Intent intent = e.this.r;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.r.getIntExtra("KEY_START_ID", 0);
                j c = j.c();
                String str = e.t;
                c.a(str, String.format("Processing command %s, %s", e.this.r, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b = k.b(e.this.a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    j.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.acquire();
                    e eVar3 = e.this;
                    eVar3.o.f(eVar3.r, intExtra, eVar3);
                    j.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    j.c().a(e.t, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.release();
                    e eVar4 = e.this;
                    eVar4.j(new d(eVar4));
                    throw th;
                }
                eVar.j(dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {
        private final e a;
        private final Intent b;
        private final int c;

        b(e eVar, Intent intent, int i) {
            this.a = eVar;
            this.b = intent;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
    }

    static class d implements Runnable {
        private final e a;

        d(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c();
        }
    }

    e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.o = new b(applicationContext);
        l k = l.k(context);
        this.n = k;
        androidx.work.impl.d m = k.m();
        this.f = m;
        this.b = k.q();
        m.a(this);
        this.q = new ArrayList();
        this.r = null;
        this.p = new Handler(Looper.getMainLooper());
    }

    private void b() {
        if (this.p.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock b2 = k.b(this.a, "ProcessCommand");
        try {
            b2.acquire();
            ((oa) this.n.q()).a(new a());
        } finally {
            b2.release();
        }
    }

    public boolean a(Intent intent, int i) {
        boolean z;
        j c2 = j.c();
        String str = t;
        boolean z2 = false;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.q) {
                Iterator<Intent> it = this.q.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(it.next().getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.q) {
            if (!this.q.isEmpty()) {
                z2 = true;
            }
            this.q.add(intent);
            if (!z2) {
                k();
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        j c2 = j.c();
        String str = t;
        c2.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.q) {
            if (this.r != null) {
                j.c().a(str, String.format("Removing command %s", this.r), new Throwable[0]);
                if (this.q.remove(0).equals(this.r)) {
                    this.r = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g b2 = ((oa) this.b).b();
            if (!this.o.d() && this.q.isEmpty() && !b2.a()) {
                j.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.s;
                if (cVar != null) {
                    ((SystemAlarmService) cVar).a();
                }
            } else if (!this.q.isEmpty()) {
                k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.d d() {
        return this.f;
    }

    @Override // androidx.work.impl.b
    public void e(String str, boolean z) {
        Context context = this.a;
        int i = b.n;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        this.p.post(new b(this, intent, 0));
    }

    /* access modifiers changed from: package-private */
    public na f() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public l g() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public n h() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        j.c().a(t, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f.g(this);
        this.c.a();
        this.s = null;
    }

    /* access modifiers changed from: package-private */
    public void j(Runnable runnable) {
        this.p.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void l(c cVar) {
        if (this.s != null) {
            j.c().b(t, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.s = cVar;
        }
    }
}
