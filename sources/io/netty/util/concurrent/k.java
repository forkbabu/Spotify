package io.netty.util.concurrent;

import io.netty.util.internal.r;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class k implements ThreadFactory {
    private static final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger a = new AtomicInteger();
    private final String b;
    private final boolean c;
    private final int f;
    protected final ThreadGroup n;

    private static final class a implements Runnable {
        private final Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } finally {
                p.g();
            }
        }
    }

    public k(String str, boolean z, int i, ThreadGroup threadGroup) {
        if (str == null) {
            throw new NullPointerException("poolName");
        } else if (i < 1 || i > 10) {
            throw new IllegalArgumentException(je.q0("priority: ", i, " (expected: Thread.MIN_PRIORITY <= priority <= Thread.MAX_PRIORITY)"));
        } else {
            this.b = str + '-' + o.incrementAndGet() + '-';
            this.c = z;
            this.f = i;
            this.n = threadGroup;
        }
    }

    public static String a(Class<?> cls) {
        if (cls != null) {
            String e = r.e(cls);
            int length = e.length();
            if (length == 0) {
                return "unknown";
            }
            if (length == 1) {
                return e.toLowerCase(Locale.US);
            }
            if (!Character.isUpperCase(e.charAt(0)) || !Character.isLowerCase(e.charAt(1))) {
                return e;
            }
            return Character.toLowerCase(e.charAt(0)) + e.substring(1);
        }
        throw new NullPointerException("poolType");
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        a aVar = new a(runnable);
        q qVar = new q(this.n, aVar, this.b + this.a.incrementAndGet());
        try {
            if (qVar.isDaemon()) {
                if (!this.c) {
                    qVar.setDaemon(false);
                }
            } else if (this.c) {
                qVar.setDaemon(true);
            }
            int priority = qVar.getPriority();
            int i = this.f;
            if (priority != i) {
                qVar.setPriority(i);
            }
        } catch (Exception unused) {
        }
        return qVar;
    }
}
