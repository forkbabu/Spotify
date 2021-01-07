package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class w implements Runnable {
    private final /* synthetic */ g a;
    private final /* synthetic */ x b;

    w(x xVar, g gVar) {
        this.b = xVar;
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            g a2 = this.b.b.a(this.a.n());
            if (a2 == null) {
                this.b.b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = i.b;
            a2.i(executor, this.b);
            a2.f(executor, this.b);
            a2.a(executor, this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.b((Exception) e.getCause());
            } else {
                this.b.b(e);
            }
        } catch (CancellationException unused) {
            this.b.d();
        } catch (Exception e2) {
            this.b.b(e2);
        }
    }
}
