package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rg  reason: default package */
class rg implements Executor {
    private final Executor a;

    /* renamed from: rg$a */
    static class a implements Runnable {
        private final Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                bh.c("Executor", "Background execution failure.", e);
            }
        }
    }

    rg(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
