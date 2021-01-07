package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends y {
    static final RxThreadFactory d;
    static final RxThreadFactory e;
    private static final long f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit g = TimeUnit.SECONDS;
    static final c h;
    static final a i;
    final ThreadFactory b;
    final AtomicReference<a> c;

    static final class a implements Runnable {
        private final long a;
        private final ConcurrentLinkedQueue<c> b;
        final io.reactivex.disposables.a c;
        private final ScheduledExecutorService f;
        private final Future<?> n;
        private final ThreadFactory o;

        a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.a = nanos;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new io.reactivex.disposables.a();
            this.o = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, d.e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f = scheduledExecutorService;
            this.n = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        public c a() {
            if (this.c.d()) {
                return d.h;
            }
            while (!this.b.isEmpty()) {
                c poll = this.b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.o);
            this.c.b(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public void b(c cVar) {
            cVar.k(System.nanoTime() + this.a);
            this.b.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.c.dispose();
            Future<?> future = this.n;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.b.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<c> it = this.b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.j() > nanoTime) {
                        return;
                    }
                    if (this.b.remove(next)) {
                        this.c.a(next);
                    }
                }
            }
        }
    }

    static final class b extends y.c {
        private final io.reactivex.disposables.a a;
        private final a b;
        private final c c;
        final AtomicBoolean f = new AtomicBoolean();

        b(a aVar) {
            this.b = aVar;
            this.a = new io.reactivex.disposables.a();
            this.c = aVar.a();
        }

        @Override // io.reactivex.y.c
        public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.a.d()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.c.f(runnable, j, timeUnit, this.a);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f.get();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f.compareAndSet(false, true)) {
                this.a.dispose();
                this.b.b(this.c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends f {
        private long c = 0;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public long j() {
            return this.c;
        }

        public void k(long j) {
            this.c = j;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        h = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        d = rxThreadFactory;
        e = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0, null, rxThreadFactory);
        i = aVar;
        aVar.c();
    }

    public d() {
        RxThreadFactory rxThreadFactory = d;
        this.b = rxThreadFactory;
        a aVar = i;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.c = atomicReference;
        a aVar2 = new a(f, g, rxThreadFactory);
        if (!atomicReference.compareAndSet(aVar, aVar2)) {
            aVar2.c();
        }
    }

    @Override // io.reactivex.y
    public y.c a() {
        return new b(this.c.get());
    }
}
