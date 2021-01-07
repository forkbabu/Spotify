package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class h extends y {
    static final RxThreadFactory c = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    static final ScheduledExecutorService d;
    final AtomicReference<ScheduledExecutorService> b;

    static final class a extends y.c {
        final ScheduledExecutorService a;
        final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
        volatile boolean c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        @Override // io.reactivex.y.c
        public b c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> future;
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (this.c) {
                return emptyDisposable;
            }
            if (runnable != null) {
                ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.b);
                this.b.b(scheduledRunnable);
                if (j <= 0) {
                    try {
                        future = this.a.submit((Callable) scheduledRunnable);
                    } catch (RejectedExecutionException e) {
                        dispose();
                        io.reactivex.plugins.a.g(e);
                        return emptyDisposable;
                    }
                } else {
                    future = this.a.schedule((Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.a(future);
                return scheduledRunnable;
            }
            throw new NullPointerException("run is null");
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.c) {
                this.c = true;
                this.b.dispose();
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public h() {
        RxThreadFactory rxThreadFactory = c;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.b = atomicReference;
        atomicReference.lazySet(g.a(rxThreadFactory));
    }

    @Override // io.reactivex.y
    public y.c a() {
        return new a(this.b.get());
    }

    @Override // io.reactivex.y
    public b c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        if (runnable != null) {
            ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
            if (j <= 0) {
                try {
                    future = this.b.get().submit(scheduledDirectTask);
                } catch (RejectedExecutionException e) {
                    io.reactivex.plugins.a.g(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.b.get().schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.a(future);
            return scheduledDirectTask;
        }
        throw new NullPointerException("run is null");
    }

    @Override // io.reactivex.y
    public b d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.b.get();
            c cVar = new c(runnable, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(cVar);
                } catch (RejectedExecutionException e) {
                    io.reactivex.plugins.a.g(e);
                    return emptyDisposable;
                }
            } else {
                future = scheduledExecutorService.schedule(cVar, j, timeUnit);
            }
            cVar.a(future);
            return cVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.a(this.b.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            io.reactivex.plugins.a.g(e2);
            return emptyDisposable;
        }
    }

    public h(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.b = atomicReference;
        atomicReference.lazySet(g.a(threadFactory));
    }
}
