package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public class h {
    private final ExecutorService a;
    private g<Void> b = j.e(null);
    private final Object c = new Object();
    private ThreadLocal<Boolean> d = new ThreadLocal<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.d.set(Boolean.TRUE);
        }
    }

    public h(ExecutorService executorService) {
        this.a = executorService;
        executorService.submit(new a());
    }

    public void b() {
        if (!Boolean.TRUE.equals(this.d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    public <T> g<T> d(Callable<T> callable) {
        g gVar;
        synchronized (this.c) {
            gVar = (g<TContinuationResult>) this.b.k(this.a, new j(this, callable));
            this.b = gVar.k(this.a, new k(this));
        }
        return gVar;
    }

    public <T> g<T> e(Callable<g<T>> callable) {
        g gVar;
        synchronized (this.c) {
            gVar = (g<TContinuationResult>) this.b.l(this.a, new j(this, callable));
            this.b = gVar.k(this.a, new k(this));
        }
        return gVar;
    }
}
