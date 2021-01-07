package okhttp3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import okhttp3.z;

public final class n {
    private ExecutorService a;
    private final Deque<z.b> b = new ArrayDeque();
    private final Deque<z.b> c = new ArrayDeque();
    private final Deque<z> d = new ArrayDeque();

    private <T> void c(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean f() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.Deque<okhttp3.z$b> r1 = r15.b     // Catch:{ all -> 0x008a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x008a }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x008a }
            okhttp3.z$b r2 = (okhttp3.z.b) r2     // Catch:{ all -> 0x008a }
            java.util.Deque<okhttp3.z$b> r3 = r15.c     // Catch:{ all -> 0x008a }
            int r3 = r3.size()     // Catch:{ all -> 0x008a }
            r4 = 64
            if (r3 < r4) goto L_0x0023
            goto L_0x0037
        L_0x0023:
            int r3 = r15.g(r2)     // Catch:{ all -> 0x008a }
            r4 = 5
            if (r3 < r4) goto L_0x002b
            goto L_0x000c
        L_0x002b:
            r1.remove()     // Catch:{ all -> 0x008a }
            r0.add(r2)     // Catch:{ all -> 0x008a }
            java.util.Deque<okhttp3.z$b> r3 = r15.c     // Catch:{ all -> 0x008a }
            r3.add(r2)     // Catch:{ all -> 0x008a }
            goto L_0x000c
        L_0x0037:
            monitor-enter(r15)     // Catch:{ all -> 0x008a }
            java.util.Deque<okhttp3.z$b> r1 = r15.c     // Catch:{ all -> 0x0087 }
            int r1 = r1.size()     // Catch:{ all -> 0x0087 }
            java.util.Deque<okhttp3.z> r2 = r15.d     // Catch:{ all -> 0x0087 }
            int r2 = r2.size()     // Catch:{ all -> 0x0087 }
            int r1 = r1 + r2
            monitor-exit(r15)
            r2 = 0
            if (r1 <= 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            monitor-exit(r15)
            int r3 = r0.size()
            r4 = 0
        L_0x0052:
            if (r4 >= r3) goto L_0x0086
            java.lang.Object r5 = r0.get(r4)
            okhttp3.z$b r5 = (okhttp3.z.b) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch:{ all -> 0x0083 }
            if (r6 != 0) goto L_0x007a
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x0083 }
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0083 }
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x0083 }
            r13.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = "OkHttp Dispatcher"
            java.util.concurrent.ThreadFactory r14 = defpackage.rnf.z(r7, r2)     // Catch:{ all -> 0x0083 }
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ all -> 0x0083 }
            r15.a = r6     // Catch:{ all -> 0x0083 }
        L_0x007a:
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch:{ all -> 0x0083 }
            monitor-exit(r15)
            r5.b(r6)
            int r4 = r4 + 1
            goto L_0x0052
        L_0x0083:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0086:
            return r1
        L_0x0087:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x008a:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x008e
        L_0x008d:
            throw r0
        L_0x008e:
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.n.f():boolean");
    }

    private int g(z.b bVar) {
        int i = 0;
        for (z.b bVar2 : this.c) {
            z zVar = z.this;
            if (!zVar.o && zVar.n.a.d.equals(z.this.n.a.d)) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void a(z.b bVar) {
        synchronized (this) {
            this.b.add(bVar);
        }
        f();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(z zVar) {
        this.d.add(zVar);
    }

    /* access modifiers changed from: package-private */
    public void d(z.b bVar) {
        c(this.c, bVar);
    }

    /* access modifiers changed from: package-private */
    public void e(z zVar) {
        c(this.d, zVar);
    }
}
