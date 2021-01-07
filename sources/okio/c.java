package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class c extends x {
    private static final long h;
    private static final long i;
    static c j;
    private boolean e;
    private c f;
    private long g;

    /* access modifiers changed from: private */
    public static final class a extends Thread {
        a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            r1.n();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<okio.c> r0 = okio.c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                okio.c r1 = okio.c.i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                okio.c r2 = okio.c.j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                okio.c.j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.n()
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.c.a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    static c i() {
        c cVar = j.f;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            c.class.wait(h);
            if (j.f != null || System.nanoTime() - nanoTime < i) {
                return null;
            }
            return j;
        }
        long nanoTime2 = cVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / 1000000;
            c.class.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
            return null;
        }
        j.f = cVar.f;
        cVar.f = null;
        return cVar;
    }

    public final void j() {
        c cVar;
        if (!this.e) {
            long h2 = h();
            boolean e2 = e();
            if (h2 != 0 || e2) {
                this.e = true;
                synchronized (c.class) {
                    if (j == null) {
                        j = new c();
                        new a().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (h2 != 0 && e2) {
                        this.g = Math.min(h2, c() - nanoTime) + nanoTime;
                    } else if (h2 != 0) {
                        this.g = h2 + nanoTime;
                    } else if (e2) {
                        this.g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j2 = this.g - nanoTime;
                    c cVar2 = j;
                    while (true) {
                        cVar = cVar2.f;
                        if (cVar == null) {
                            break;
                        } else if (j2 < cVar.g - nanoTime) {
                            break;
                        } else {
                            cVar2 = cVar;
                        }
                    }
                    this.f = cVar;
                    cVar2.f = this;
                    if (cVar2 == j) {
                        c.class.notify();
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    public final void k(boolean z) {
        if (l() && z) {
            throw m(null);
        }
    }

    public final boolean l() {
        boolean z = false;
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (c.class) {
            c cVar = j;
            while (true) {
                if (cVar == null) {
                    z = true;
                    break;
                }
                c cVar2 = cVar.f;
                if (cVar2 == this) {
                    cVar.f = this.f;
                    this.f = null;
                    break;
                }
                cVar = cVar2;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public IOException m(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: protected */
    public void n() {
    }
}
