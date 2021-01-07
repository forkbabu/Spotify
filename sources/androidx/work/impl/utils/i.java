package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.l;
import androidx.work.j;

public class i implements Runnable {
    private static final String f = j.f("StopWorkRunnable");
    private final l a;
    private final String b;
    private final boolean c;

    public i(l lVar, String str, boolean z) {
        this.a = lVar;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        WorkDatabase o = this.a.o();
        d m = this.a.m();
        ha z2 = o.z();
        o.c();
        try {
            boolean f2 = m.f(this.b);
            if (this.c) {
                z = this.a.m().m(this.b);
            } else {
                if (!f2) {
                    ia iaVar = (ia) z2;
                    if (iaVar.n(this.b) == WorkInfo.State.RUNNING) {
                        iaVar.z(WorkInfo.State.ENQUEUED, this.b);
                    }
                }
                z = this.a.m().n(this.b);
            }
            j.c().a(f, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.b, Boolean.valueOf(z)), new Throwable[0]);
            o.s();
        } finally {
            o.h();
        }
    }
}
