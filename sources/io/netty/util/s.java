package io.netty.util;

import io.netty.util.concurrent.k;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s {
    private static final io.netty.util.internal.logging.b a = io.netty.util.internal.logging.c.b(s.class.getName());
    static final ThreadFactory b;
    private static final Queue<b> c = PlatformDependent.S();
    private static final c d = new c(null);
    private static final AtomicBoolean e = new AtomicBoolean();

    /* access modifiers changed from: private */
    public static final class b {
        final Thread a;
        final Runnable b;
        final boolean c;

        b(Thread thread, Runnable runnable, boolean z) {
            this.a = thread;
            this.b = runnable;
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final class c implements Runnable {
        private final List<b> a = new ArrayList();

        c(a aVar) {
        }

        private void a() {
            while (true) {
                b bVar = (b) s.c.poll();
                if (bVar != null) {
                    if (bVar.c) {
                        this.a.add(bVar);
                    } else {
                        this.a.remove(bVar);
                    }
                } else {
                    return;
                }
            }
        }

        private void b() {
            List<b> list = this.a;
            int i = 0;
            while (i < list.size()) {
                b bVar = list.get(i);
                if (!bVar.a.isAlive()) {
                    list.remove(i);
                    try {
                        bVar.b.run();
                    } catch (Throwable th) {
                        s.a.j("Thread death watcher task raised an exception:", th);
                    }
                } else {
                    i++;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                a();
                b();
                a();
                b();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
                if (this.a.isEmpty() && s.c.isEmpty()) {
                    s.e.compareAndSet(true, false);
                    if (s.c.isEmpty() || !s.e.compareAndSet(false, true)) {
                        return;
                    }
                }
            }
        }
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
        String str = "threadDeathWatcher";
        String a2 = io.netty.util.internal.s.a("io.netty.serviceThreadPrefix", null);
        String str2 = r.a;
        if (!(a2 == null || a2.isEmpty())) {
            str = je.x0(a2, str);
        }
        b = new k(str, true, 1, null);
    }

    private s() {
    }

    private static void d(Thread thread, Runnable runnable, boolean z) {
        c.add(new b(thread, runnable, z));
        if (e.compareAndSet(false, true)) {
            b.newThread(d).start();
        }
    }

    public static void e(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        } else if (runnable != null) {
            d(thread, runnable, false);
        } else {
            throw new NullPointerException("task");
        }
    }

    public static void f(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        } else if (thread.isAlive()) {
            d(thread, runnable, true);
        } else {
            throw new IllegalArgumentException("thread must be alive.");
        }
    }
}
