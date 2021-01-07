package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ga2  reason: default package */
public class ga2 implements ia2 {
    private static final xpf b = ypf.d(ga2.class);
    private final ExecutorService a;

    public ga2(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // defpackage.ia2
    public void a(Runnable runnable) {
        this.a.submit(runnable);
    }

    @Override // defpackage.w92
    public void dispose() {
        try {
            List<Runnable> shutdownNow = this.a.shutdownNow();
            if (!shutdownNow.isEmpty()) {
                b.l("Disposing ExecutorServiceWorkRunner with {} outstanding tasks.", Integer.valueOf(shutdownNow.size()));
            }
            if (!this.a.awaitTermination(100, TimeUnit.MILLISECONDS)) {
                b.d("ExecutorService shutdown timed out; there are still tasks executing");
            }
        } catch (InterruptedException e) {
            b.n("Timeout when disposing work runner", e);
        }
    }
}
