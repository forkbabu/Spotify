package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements b {
    protected static final FutureTask<Void> a;
    protected static final FutureTask<Void> b;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        Runnable runnable2 = Functions.b;
        a = new FutureTask<>(runnable2, null);
        b = new FutureTask<>(runnable2, null);
    }

    AbstractDirectTask(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != a) {
                if (future2 == b) {
                    future.cancel(this.runner != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.b
    public final boolean d() {
        Future future = (Future) get();
        return future == a || future == b;
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != a && future != (futureTask = b) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.runner != Thread.currentThread());
        }
    }
}
