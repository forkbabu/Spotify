package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: dqe  reason: default package */
public class dqe {
    private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    private final Handler b = new Handler();
    private final Map<Runnable, ScheduledFuture<?>> c = new HashMap();

    /* renamed from: dqe$a */
    private class a implements Runnable {
        private final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            dqe.this.b.post(this.a);
        }
    }

    public void b(Runnable runnable) {
        ScheduledFuture<?> scheduledFuture = this.c.get(runnable);
        if (scheduledFuture != null) {
            this.c.remove(runnable);
            scheduledFuture.cancel(false);
        }
    }

    public void c(Runnable runnable, long j, TimeUnit timeUnit) {
        this.c.put(runnable, this.a.schedule(new a(runnable), j, timeUnit));
    }
}
