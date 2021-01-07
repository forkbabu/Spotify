package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.b;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.utils.k;
import androidx.work.impl.utils.n;
import androidx.work.j;
import java.util.Collections;
import java.util.List;

public class d implements a9, b, n.b {
    private static final String s = j.f("DelayMetCommandHandler");
    private final Context a;
    private final int b;
    private final String c;
    private final e f;
    private final b9 n;
    private final Object o = new Object();
    private int p = 0;
    private PowerManager.WakeLock q;
    private boolean r = false;

    d(Context context, int i, String str, e eVar) {
        this.a = context;
        this.b = i;
        this.f = eVar;
        this.c = str;
        this.n = new b9(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.o) {
            this.n.e();
            this.f.h().c(this.c);
            PowerManager.WakeLock wakeLock = this.q;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.c().a(s, String.format("Releasing wakelock %s for WorkSpec %s", this.q, this.c), new Throwable[0]);
                this.q.release();
            }
        }
    }

    private void g() {
        synchronized (this.o) {
            if (this.p < 2) {
                this.p = 2;
                j c2 = j.c();
                String str = s;
                c2.a(str, String.format("Stopping work for WorkSpec %s", this.c), new Throwable[0]);
                Context context = this.a;
                String str2 = this.c;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                e eVar = this.f;
                eVar.j(new e.b(eVar, intent, this.b));
                if (this.f.d().d(this.c)) {
                    j.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.c), new Throwable[0]);
                    Intent c3 = b.c(this.a, this.c);
                    e eVar2 = this.f;
                    eVar2.j(new e.b(eVar2, c3, this.b));
                } else {
                    j.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.c), new Throwable[0]);
                }
            } else {
                j.c().a(s, String.format("Already stopped work for %s", this.c), new Throwable[0]);
            }
        }
    }

    @Override // androidx.work.impl.utils.n.b
    public void a(String str) {
        j.c().a(s, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // defpackage.a9
    public void b(List<String> list) {
        g();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.q = k.b(this.a, String.format("%s (%s)", this.c, Integer.valueOf(this.b)));
        j c2 = j.c();
        String str = s;
        c2.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.q, this.c), new Throwable[0]);
        this.q.acquire();
        ga p2 = ((ia) this.f.g().o().z()).p(this.c);
        if (p2 == null) {
            g();
            return;
        }
        boolean b2 = p2.b();
        this.r = b2;
        if (!b2) {
            j.c().a(str, String.format("No constraints for %s", this.c), new Throwable[0]);
            f(Collections.singletonList(this.c));
            return;
        }
        this.n.d(Collections.singletonList(p2));
    }

    @Override // androidx.work.impl.b
    public void e(String str, boolean z) {
        j.c().a(s, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        c();
        if (z) {
            Intent c2 = b.c(this.a, this.c);
            e eVar = this.f;
            eVar.j(new e.b(eVar, c2, this.b));
        }
        if (this.r) {
            Intent a2 = b.a(this.a);
            e eVar2 = this.f;
            eVar2.j(new e.b(eVar2, a2, this.b));
        }
    }

    @Override // defpackage.a9
    public void f(List<String> list) {
        if (list.contains(this.c)) {
            synchronized (this.o) {
                if (this.p == 0) {
                    this.p = 1;
                    j.c().a(s, String.format("onAllConstraintsMet for %s", this.c), new Throwable[0]);
                    if (this.f.d().i(this.c, null)) {
                        this.f.h().b(this.c, 600000, this);
                    } else {
                        c();
                    }
                } else {
                    j.c().a(s, String.format("Already started work for %s", this.c), new Throwable[0]);
                }
            }
        }
    }
}
