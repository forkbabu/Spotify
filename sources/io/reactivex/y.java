package io.reactivex;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.f;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;

public abstract class y {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* access modifiers changed from: package-private */
    public static final class a implements io.reactivex.disposables.b, Runnable {
        final Runnable a;
        final c b;
        Thread c;

        a(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.c == Thread.currentThread()) {
                c cVar = this.b;
                if (cVar instanceof f) {
                    ((f) cVar).i();
                    return;
                }
            }
            this.b.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c = Thread.currentThread();
            try {
                this.a.run();
            } finally {
                dispose();
                this.c = null;
            }
        }
    }

    static final class b implements io.reactivex.disposables.b, Runnable {
        final Runnable a;
        final c b;
        volatile boolean c;

        b(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.c = true;
            this.b.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.c) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    yif.V(th);
                    this.b.dispose();
                    throw ExceptionHelper.e(th);
                }
            }
        }
    }

    public static abstract class c implements io.reactivex.disposables.b {

        /* access modifiers changed from: package-private */
        public final class a implements Runnable {
            final Runnable a;
            final SequentialDisposable b;
            final long c;
            long f;
            long n;
            long o;

            a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.a = runnable;
                this.b = sequentialDisposable;
                this.c = j3;
                this.n = j2;
                this.o = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                this.a.run();
                if (!this.b.d()) {
                    c cVar = c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a2 = cVar.a(timeUnit);
                    long j2 = y.a;
                    long j3 = this.n;
                    if (a2 + j2 >= j3) {
                        long j4 = this.c;
                        if (a2 < j3 + j4 + j2) {
                            long j5 = this.o;
                            long j6 = this.f + 1;
                            this.f = j6;
                            j = (j6 * j4) + j5;
                            this.n = a2;
                            DisposableHelper.i(this.b, c.this.c(this, j - a2, timeUnit));
                        }
                    }
                    long j7 = this.c;
                    j = a2 + j7;
                    long j8 = this.f + 1;
                    this.f = j8;
                    this.o = j - (j7 * j8);
                    this.n = a2;
                    DisposableHelper.i(this.b, c.this.c(this, j - a2, timeUnit));
                }
            }
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public io.reactivex.disposables.b b(Runnable runnable) {
            return c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public abstract io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit);

        public io.reactivex.disposables.b e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            long nanos = timeUnit.toNanos(j2);
            long a2 = a(TimeUnit.NANOSECONDS);
            io.reactivex.disposables.b c = c(new a(timeUnit.toNanos(j) + a2, runnable, a2, sequentialDisposable2, nanos), j, timeUnit);
            if (c == EmptyDisposable.INSTANCE) {
                return c;
            }
            DisposableHelper.i(sequentialDisposable, c);
            return sequentialDisposable2;
        }
    }

    public abstract c a();

    public io.reactivex.disposables.b b(Runnable runnable) {
        return c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        c a2 = a();
        if (runnable != null) {
            a aVar = new a(runnable, a2);
            a2.c(aVar, j, timeUnit);
            return aVar;
        }
        throw new NullPointerException("run is null");
    }

    public io.reactivex.disposables.b d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c a2 = a();
        if (runnable != null) {
            b bVar = new b(runnable, a2);
            io.reactivex.disposables.b e = a2.e(bVar, j, j2, timeUnit);
            return e == EmptyDisposable.INSTANCE ? e : bVar;
        }
        throw new NullPointerException("run is null");
    }
}
