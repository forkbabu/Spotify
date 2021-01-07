package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.a;
import io.reactivex.y;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class f extends y.c implements b {
    private final ScheduledExecutorService a;
    volatile boolean b;

    public f(ThreadFactory threadFactory) {
        this.a = g.a(threadFactory);
    }

    @Override // io.reactivex.y.c
    public b b(Runnable runnable) {
        return c(runnable, 0, null);
    }

    @Override // io.reactivex.y.c
    public b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.b) {
            return EmptyDisposable.INSTANCE;
        }
        return f(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this.b;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    public ScheduledRunnable f(Runnable runnable, long j, TimeUnit timeUnit, a aVar) {
        Future<?> future;
        if (runnable != null) {
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, aVar);
            if (aVar != null && !aVar.b(scheduledRunnable)) {
                return scheduledRunnable;
            }
            if (j <= 0) {
                try {
                    future = this.a.submit((Callable) scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    if (aVar != null) {
                        aVar.a(scheduledRunnable);
                    }
                    io.reactivex.plugins.a.g(e);
                }
            } else {
                future = this.a.schedule((Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.a(future);
            return scheduledRunnable;
        }
        throw new NullPointerException("run is null");
    }

    public b g(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> future;
        if (runnable != null) {
            ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
            if (j <= 0) {
                try {
                    future = this.a.submit(scheduledDirectTask);
                } catch (RejectedExecutionException e) {
                    io.reactivex.plugins.a.g(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.a.schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.a(future);
            return scheduledDirectTask;
        }
        throw new NullPointerException("run is null");
    }

    public b h(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> future;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (runnable == null) {
            throw new NullPointerException("run is null");
        } else if (j2 <= 0) {
            c cVar = new c(runnable, this.a);
            if (j <= 0) {
                try {
                    future = this.a.submit(cVar);
                } catch (RejectedExecutionException e) {
                    io.reactivex.plugins.a.g(e);
                    return emptyDisposable;
                }
            } else {
                future = this.a.schedule(cVar, j, timeUnit);
            }
            cVar.a(future);
            return cVar;
        } else {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            try {
                scheduledDirectPeriodicTask.a(this.a.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                io.reactivex.plugins.a.g(e2);
                return emptyDisposable;
            }
        }
    }

    public void i() {
        if (!this.b) {
            this.b = true;
            this.a.shutdown();
        }
    }
}
