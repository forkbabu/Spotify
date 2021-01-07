package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class n implements Runnable {
    private final /* synthetic */ g a;
    private final /* synthetic */ l b;

    n(l lVar, g gVar) {
        this.b = lVar;
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            g gVar = (g) this.b.b.a(this.a);
            if (gVar == null) {
                this.b.b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = i.b;
            gVar.i(executor, this.b);
            gVar.f(executor, this.b);
            gVar.a(executor, this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.c.u((Exception) e.getCause());
            } else {
                this.b.c.u(e);
            }
        } catch (Exception e2) {
            this.b.c.u(e2);
        }
    }
}
