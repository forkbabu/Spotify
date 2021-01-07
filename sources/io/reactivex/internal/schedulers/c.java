package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class c implements Callable<Void>, b {
    static final FutureTask<Void> o = new FutureTask<>(Functions.b, null);
    final Runnable a;
    final AtomicReference<Future<?>> b = new AtomicReference<>();
    final AtomicReference<Future<?>> c = new AtomicReference<>();
    final ExecutorService f;
    Thread n;

    c(Runnable runnable, ExecutorService executorService) {
        this.a = runnable;
        this.f = executorService;
    }

    /* access modifiers changed from: package-private */
    public void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.c.get();
            if (future2 == o) {
                future.cancel(this.n != Thread.currentThread());
                return;
            }
        } while (!this.c.compareAndSet(future2, future));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Void call() {
        this.n = Thread.currentThread();
        try {
            this.a.run();
            Future<?> submit = this.f.submit(this);
            while (true) {
                Future<?> future = this.b.get();
                if (future != o) {
                    if (this.b.compareAndSet(future, submit)) {
                        break;
                    }
                } else {
                    submit.cancel(this.n != Thread.currentThread());
                }
            }
            this.n = null;
        } catch (Throwable th) {
            this.n = null;
            a.g(th);
        }
        return null;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this.c.get() == o;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.c;
        FutureTask<Void> futureTask = o;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z = true;
        if (!(andSet == null || andSet == futureTask)) {
            andSet.cancel(this.n != Thread.currentThread());
        }
        Future<?> andSet2 = this.b.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.n == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }
}
