package androidx.work.impl.utils;

import androidx.work.j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class n {
    private static final String f = j.f("WorkTimer");
    private final ThreadFactory a;
    private final ScheduledExecutorService b;
    final Map<String, c> c = new HashMap();
    final Map<String, b> d = new HashMap();
    final Object e = new Object();

    class a implements ThreadFactory {
        private int a = 0;

        a(n nVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder V0 = je.V0("WorkManager-WorkTimer-thread-");
            V0.append(this.a);
            newThread.setName(V0.toString());
            this.a++;
            return newThread;
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c implements Runnable {
        private final n a;
        private final String b;

        c(n nVar, String str) {
            this.a = nVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.e) {
                if (this.a.c.remove(this.b) != null) {
                    b remove = this.a.d.remove(this.b);
                    if (remove != null) {
                        remove.a(this.b);
                    }
                } else {
                    j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.b), new Throwable[0]);
                }
            }
        }
    }

    public n() {
        a aVar = new a(this);
        this.a = aVar;
        this.b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.b.isShutdown()) {
            this.b.shutdownNow();
        }
    }

    public void b(String str, long j, b bVar) {
        synchronized (this.e) {
            j.c().a(f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.d.put(str, bVar);
            this.b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.e) {
            if (this.c.remove(str) != null) {
                j.c().a(f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.d.remove(str);
            }
        }
    }
}
