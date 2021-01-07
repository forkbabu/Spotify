package io.reactivex.internal.schedulers;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.y;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ExecutorScheduler extends y {
    static final y c = io.reactivex.schedulers.a.d();
    final Executor b;

    static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, b {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct = new SequentialDisposable();
        final SequentialDisposable timed = new SequentialDisposable();

        DelayedRunnable(Runnable runnable) {
            super(runnable);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(null) != null) {
                DisposableHelper.g(this.timed);
                DisposableHelper.g(this.direct);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.timed.lazySet(disposableHelper);
                    this.direct.lazySet(disposableHelper);
                }
            }
        }
    }

    public static final class ExecutorWorker extends y.c implements Runnable {
        final boolean a;
        final Executor b;
        final MpscLinkedQueue<Runnable> c;
        volatile boolean f;
        final AtomicInteger n = new AtomicInteger();
        final io.reactivex.disposables.a o = new io.reactivex.disposables.a();

        /* access modifiers changed from: package-private */
        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, b {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            BooleanRunnable(Runnable runnable) {
                this.actual = runnable;
            }

            @Override // io.reactivex.disposables.b
            public boolean d() {
                return get();
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                lazySet(true);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!get()) {
                    try {
                        this.actual.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, b {
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final io.reactivex.internal.disposables.a tasks;
            volatile Thread thread;

            InterruptibleRunnable(Runnable runnable, io.reactivex.internal.disposables.a aVar) {
                this.run = runnable;
                this.tasks = aVar;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                io.reactivex.internal.disposables.a aVar = this.tasks;
                if (aVar != null) {
                    aVar.c(this);
                }
            }

            @Override // io.reactivex.disposables.b
            public boolean d() {
                return get() >= 2;
            }

            @Override // io.reactivex.disposables.b
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i < 2) {
                        if (i == 0) {
                            if (compareAndSet(0, 4)) {
                                a();
                                return;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread2 = this.thread;
                            if (thread2 != null) {
                                thread2.interrupt();
                                this.thread = null;
                            }
                            set(4);
                            a();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.thread = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                a();
                            }
                            throw th;
                        }
                    } else {
                        this.thread = null;
                    }
                }
            }
        }

        final class a implements Runnable {
            private final SequentialDisposable a;
            private final Runnable b;

            a(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.a = sequentialDisposable;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                DisposableHelper.i(this.a, ExecutorWorker.this.b(this.b));
            }
        }

        public ExecutorWorker(Executor executor, boolean z) {
            this.b = executor;
            this.c = new MpscLinkedQueue<>();
            this.a = z;
        }

        @Override // io.reactivex.y.c
        public b b(Runnable runnable) {
            b bVar;
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (this.f) {
                return emptyDisposable;
            }
            if (runnable != null) {
                if (this.a) {
                    bVar = new InterruptibleRunnable(runnable, this.o);
                    this.o.b(bVar);
                } else {
                    bVar = new BooleanRunnable(runnable);
                }
                this.c.offer(bVar);
                if (this.n.getAndIncrement() == 0) {
                    try {
                        this.b.execute(this);
                    } catch (RejectedExecutionException e) {
                        this.f = true;
                        this.c.clear();
                        io.reactivex.plugins.a.g(e);
                        return emptyDisposable;
                    }
                }
                return bVar;
            }
            throw new NullPointerException("run is null");
        }

        @Override // io.reactivex.y.c
        public b c(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (j <= 0) {
                return b(runnable);
            }
            if (this.f) {
                return emptyDisposable;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            if (runnable != null) {
                ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new a(sequentialDisposable2, runnable), this.o);
                this.o.b(scheduledRunnable);
                Executor executor = this.b;
                if (executor instanceof ScheduledExecutorService) {
                    try {
                        scheduledRunnable.a(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                    } catch (RejectedExecutionException e) {
                        this.f = true;
                        io.reactivex.plugins.a.g(e);
                        return emptyDisposable;
                    }
                } else {
                    scheduledRunnable.a(new b(ExecutorScheduler.c.c(scheduledRunnable, j, timeUnit)));
                }
                DisposableHelper.i(sequentialDisposable, scheduledRunnable);
                return sequentialDisposable2;
            }
            throw new NullPointerException("run is null");
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.f) {
                this.f = true;
                this.o.dispose();
                if (this.n.getAndIncrement() == 0) {
                    this.c.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.n.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.f == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        @Override // java.lang.Runnable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> r0 = r3.c
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L_0x0025
                boolean r2 = r3.f
                if (r2 == 0) goto L_0x001b
                r0.clear()
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.n
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            L_0x0025:
                r2.run()
                boolean r2 = r3.f
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.run():void");
        }
    }

    final class a implements Runnable {
        private final DelayedRunnable a;

        a(DelayedRunnable delayedRunnable) {
            this.a = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            DelayedRunnable delayedRunnable = this.a;
            DisposableHelper.i(delayedRunnable.direct, ExecutorScheduler.this.b(delayedRunnable));
        }
    }

    public ExecutorScheduler(Executor executor, boolean z) {
        this.b = executor;
    }

    @Override // io.reactivex.y
    public y.c a() {
        return new ExecutorWorker(this.b, false);
    }

    @Override // io.reactivex.y
    public b b(Runnable runnable) {
        if (runnable != null) {
            try {
                if (this.b instanceof ExecutorService) {
                    ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                    scheduledDirectTask.a(((ExecutorService) this.b).submit(scheduledDirectTask));
                    return scheduledDirectTask;
                }
                ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnable);
                this.b.execute(booleanRunnable);
                return booleanRunnable;
            } catch (RejectedExecutionException e) {
                io.reactivex.plugins.a.g(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            throw new NullPointerException("run is null");
        }
    }

    @Override // io.reactivex.y
    public b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run is null");
        } else if (this.b instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.a(((ScheduledExecutorService) this.b).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                io.reactivex.plugins.a.g(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
            DisposableHelper.i(delayedRunnable.timed, c.c(new a(delayedRunnable), j, timeUnit));
            return delayedRunnable;
        }
    }

    @Override // io.reactivex.y
    public b d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.b instanceof ScheduledExecutorService)) {
            return super.d(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            scheduledDirectPeriodicTask.a(((ScheduledExecutorService) this.b).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            io.reactivex.plugins.a.g(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
