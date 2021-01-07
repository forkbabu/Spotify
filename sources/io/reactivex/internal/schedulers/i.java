package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class i extends y {
    private static final i b = new i();

    static final class a implements Runnable {
        private final Runnable a;
        private final c b;
        private final long c;

        a(Runnable runnable, c cVar, long j) {
            this.a = runnable;
            this.b = cVar;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.b.f) {
                long a2 = this.b.a(TimeUnit.MILLISECONDS);
                long j = this.c;
                if (j > a2) {
                    try {
                        Thread.sleep(j - a2);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        io.reactivex.plugins.a.g(e);
                        return;
                    }
                }
                if (!this.b.f) {
                    this.a.run();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Comparable<b> {
        final Runnable a;
        final long b;
        final int c;
        volatile boolean f;

        b(Runnable runnable, Long l, int i) {
            this.a = runnable;
            this.b = l.longValue();
            this.c = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            long j = this.b;
            long j2 = bVar2.b;
            int i = 0;
            int i2 = j < j2 ? -1 : j > j2 ? 1 : 0;
            if (i2 != 0) {
                return i2;
            }
            int i3 = this.c;
            int i4 = bVar2.c;
            if (i3 < i4) {
                i = -1;
            } else if (i3 > i4) {
                i = 1;
            }
            return i;
        }
    }

    static final class c extends y.c implements io.reactivex.disposables.b {
        final PriorityBlockingQueue<b> a = new PriorityBlockingQueue<>();
        private final AtomicInteger b = new AtomicInteger();
        final AtomicInteger c = new AtomicInteger();
        volatile boolean f;

        /* access modifiers changed from: package-private */
        public final class a implements Runnable {
            final b a;

            a(b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.f = true;
                c.this.a.remove(this.a);
            }
        }

        c() {
        }

        @Override // io.reactivex.y.c
        public io.reactivex.disposables.b b(Runnable runnable) {
            return f(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.y.c
        public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + a(TimeUnit.MILLISECONDS);
            return f(new a(runnable, this, millis), millis);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f = true;
        }

        /* access modifiers changed from: package-private */
        public io.reactivex.disposables.b f(Runnable runnable, long j) {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (this.f) {
                return emptyDisposable;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.a.add(bVar);
            if (this.b.getAndIncrement() != 0) {
                return io.reactivex.disposables.c.c(new a(bVar));
            }
            int i = 1;
            while (!this.f) {
                b poll = this.a.poll();
                if (poll == null) {
                    i = this.b.addAndGet(-i);
                    if (i == 0) {
                        return emptyDisposable;
                    }
                } else if (!poll.f) {
                    poll.a.run();
                }
            }
            this.a.clear();
            return emptyDisposable;
        }
    }

    i() {
    }

    public static i e() {
        return b;
    }

    @Override // io.reactivex.y
    public y.c a() {
        return new c();
    }

    @Override // io.reactivex.y
    public io.reactivex.disposables.b b(Runnable runnable) {
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.y
    public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            if (runnable != null) {
                runnable.run();
                return EmptyDisposable.INSTANCE;
            }
            throw new NullPointerException("run is null");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            io.reactivex.plugins.a.g(e);
        }
    }
}
