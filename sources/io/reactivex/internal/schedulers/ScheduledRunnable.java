package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, b {
    static final Object a = new Object();
    static final Object b = new Object();
    static final Object c = new Object();
    static final Object f = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;

    public ScheduledRunnable(Runnable runnable, a aVar) {
        super(3);
        this.actual = runnable;
        lazySet(0, aVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f) {
                if (obj == b) {
                    future.cancel(false);
                    return;
                } else if (obj == c) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        Object obj = get(0);
        if (obj == a || obj == f) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5 = f;
        while (true) {
            Object obj6 = get(1);
            if (obj6 == obj5 || obj6 == (obj3 = b) || obj6 == (obj4 = c)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj6, obj3)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == obj5 || obj == (obj2 = a) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((a) obj).c(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3 = c;
        Object obj4 = b;
        Object obj5 = a;
        Object obj6 = f;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj7 = get(0);
            if (!(obj7 == obj5 || !compareAndSet(0, obj7, obj6) || obj7 == null)) {
                ((a) obj7).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            throw th;
        }
        lazySet(2, null);
        Object obj8 = get(0);
        if (!(obj8 == obj5 || !compareAndSet(0, obj8, obj6) || obj8 == null)) {
            ((a) obj8).c(this);
        }
        do {
            obj = get(1);
            if (obj == obj4 || obj == obj3) {
                return;
            }
        } while (!compareAndSet(1, obj, obj6));
    }
}
