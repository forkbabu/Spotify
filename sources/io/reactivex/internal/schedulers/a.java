package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends y {
    static final b d;
    static final RxThreadFactory e;
    static final int f;
    static final c g;
    final ThreadFactory b;
    final AtomicReference<b> c;

    /* renamed from: io.reactivex.internal.schedulers.a$a  reason: collision with other inner class name */
    static final class C0620a extends y.c {
        private final io.reactivex.internal.disposables.b a;
        private final io.reactivex.disposables.a b;
        private final io.reactivex.internal.disposables.b c;
        private final c f;
        volatile boolean n;

        C0620a(c cVar) {
            this.f = cVar;
            io.reactivex.internal.disposables.b bVar = new io.reactivex.internal.disposables.b();
            this.a = bVar;
            io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
            this.b = aVar;
            io.reactivex.internal.disposables.b bVar2 = new io.reactivex.internal.disposables.b();
            this.c = bVar2;
            bVar2.b(bVar);
            bVar2.b(aVar);
        }

        @Override // io.reactivex.y.c
        public io.reactivex.disposables.b b(Runnable runnable) {
            if (this.n) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f.f(runnable, 0, TimeUnit.MILLISECONDS, this.a);
        }

        @Override // io.reactivex.y.c
        public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.n) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f.f(runnable, j, timeUnit, this.b);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.n;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.n) {
                this.n = true;
                this.c.dispose();
            }
        }
    }

    static final class b {
        final int a;
        final c[] b;
        long c;

        b(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return a.g;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends f {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f = availableProcessors;
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        g = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        e = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        d = bVar;
        for (c cVar2 : bVar.b) {
            cVar2.dispose();
        }
    }

    public a() {
        RxThreadFactory rxThreadFactory = e;
        this.b = rxThreadFactory;
        b bVar = d;
        AtomicReference<b> atomicReference = new AtomicReference<>(bVar);
        this.c = atomicReference;
        b bVar2 = new b(f, rxThreadFactory);
        if (!atomicReference.compareAndSet(bVar, bVar2)) {
            for (c cVar : bVar2.b) {
                cVar.dispose();
            }
        }
    }

    @Override // io.reactivex.y
    public y.c a() {
        return new C0620a(this.c.get().a());
    }

    @Override // io.reactivex.y
    public io.reactivex.disposables.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.c.get().a().g(runnable, j, timeUnit);
    }

    @Override // io.reactivex.y
    public io.reactivex.disposables.b d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.c.get().a().h(runnable, j, j2, timeUnit);
    }
}
