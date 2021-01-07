package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class g implements Executor {
    private final ArrayDeque<a> a = new ArrayDeque<>();
    private final Executor b;
    private final Object c = new Object();
    private volatile Runnable f;

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        final g a;
        final Runnable b;

        a(g gVar, Runnable runnable) {
            this.a = gVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } finally {
                this.a.b();
            }
        }
    }

    public g(Executor executor) {
        this.b = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.c) {
            z = !this.a.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (this.c) {
            a poll = this.a.poll();
            this.f = poll;
            if (poll != null) {
                this.b.execute(this.f);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.c) {
            this.a.add(new a(this, runnable));
            if (this.f == null) {
                b();
            }
        }
    }
}
