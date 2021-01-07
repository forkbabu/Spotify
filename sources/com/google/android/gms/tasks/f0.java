package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class f0 implements Runnable {
    private final /* synthetic */ b0 a;
    private final /* synthetic */ Callable b;

    f0(b0 b0Var, Callable callable) {
        this.a = b0Var;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.v(this.b.call());
        } catch (Exception e) {
            this.a.u(e);
        } catch (Throwable th) {
            this.a.u(new RuntimeException(th));
        }
    }
}
