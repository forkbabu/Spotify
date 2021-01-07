package okhttp3;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.d;
import okhttp3.internal.connection.f;

public final class j {
    private static final Executor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), rnf.z("OkHttp ConnectionPool", true));
    private final int a = 5;
    private final long b;
    private final Runnable c = new a();
    private final Deque<c> d = new ArrayDeque();
    final d e = new d();
    boolean f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a2 = j.this.a(System.nanoTime());
                if (a2 != -1) {
                    if (a2 > 0) {
                        long j = a2 / 1000000;
                        long j2 = a2 - (1000000 * j);
                        synchronized (j.this) {
                            try {
                                j.this.wait(j, (int) j2);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public j() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.b = timeUnit.toNanos(5);
    }

    private int e(c cVar, long j) {
        List<Reference<f>> list = cVar.n;
        int i = 0;
        while (i < list.size()) {
            Reference<f> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder V0 = je.V0("A connection to ");
                V0.append(cVar.m().a.a);
                V0.append(" was leaked. Did you forget to close a response body?");
                sof.h().n(V0.toString(), ((f.a) reference).a);
                list.remove(i);
                cVar.k = true;
                if (list.isEmpty()) {
                    cVar.o = j - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j) {
        synchronized (this) {
            c cVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (c cVar2 : this.d) {
                if (e(cVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - cVar2.o;
                    if (j3 > j2) {
                        cVar = cVar2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.b;
            if (j2 < j4) {
                if (i <= this.a) {
                    if (i > 0) {
                        return j4 - j2;
                    } else if (i2 > 0) {
                        return j4;
                    } else {
                        this.f = false;
                        return -1;
                    }
                }
            }
            this.d.remove(cVar);
            rnf.h(cVar.n());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(c cVar) {
        if (cVar.k || this.a == 0) {
            this.d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public Socket c(a aVar, f fVar) {
        for (c cVar : this.d) {
            if (cVar.i(aVar, null) && cVar.k() && cVar != fVar.d()) {
                return fVar.k(cVar);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public c d(a aVar, f fVar, f0 f0Var) {
        for (c cVar : this.d) {
            if (cVar.i(aVar, f0Var)) {
                fVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(c cVar) {
        if (!this.f) {
            this.f = true;
            g.execute(this.c);
        }
        this.d.add(cVar);
    }
}
