package androidx.work.impl.utils;

import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.c;
import androidx.work.impl.f;
import androidx.work.impl.g;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.j;
import androidx.work.l;

public class b implements Runnable {
    private static final String c = j.f("EnqueueRunnable");
    private final g a;
    private final c b = new c();

    public b(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x029b A[LOOP:9: B:142:0x0295->B:144:0x029b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e4  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(androidx.work.impl.g r25) {
        /*
        // Method dump skipped, instructions count: 727
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.b.b(androidx.work.impl.g):boolean");
    }

    private static void c(ga gaVar) {
        androidx.work.b bVar = gaVar.j;
        if (bVar.f() || bVar.i()) {
            String str = gaVar.c;
            d.a aVar = new d.a();
            aVar.b(gaVar.e);
            aVar.g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            gaVar.c = ConstraintTrackingWorker.class.getName();
            gaVar.e = aVar.a();
        }
    }

    public l a() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.a.h()) {
                WorkDatabase o = this.a.g().o();
                o.c();
                try {
                    boolean b2 = b(this.a);
                    o.s();
                    if (b2) {
                        e.a(this.a.g().h(), RescheduleReceiver.class, true);
                        androidx.work.impl.l g = this.a.g();
                        f.b(g.i(), g.o(), g.n());
                    }
                    this.b.a(l.a);
                } finally {
                    o.h();
                }
            } else {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.a));
            }
        } catch (Throwable th) {
            this.b.a(new l.b.a(th));
        }
    }
}
