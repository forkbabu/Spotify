package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.c;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public final class f<T> extends a<T, T> {
    final long b;
    final TimeUnit c;
    final y f;
    final boolean n;

    static final class a<T> implements x<T>, io.reactivex.disposables.b {
        final x<? super T> a;
        final long b;
        final TimeUnit c;
        final y.c f;
        final boolean n;
        io.reactivex.disposables.b o;

        /* renamed from: io.reactivex.internal.operators.observable.f$a$a  reason: collision with other inner class name */
        final class RunnableC0616a implements Runnable {
            RunnableC0616a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.a.onComplete();
                } finally {
                    a.this.f.dispose();
                }
            }
        }

        final class b implements Runnable {
            private final Throwable a;

            b(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.a.onError(this.a);
                } finally {
                    a.this.f.dispose();
                }
            }
        }

        /* JADX WARN: Field signature parse error: a */
        final class c implements Runnable {
            private final Object a;

            /* JADX WARN: Failed to parse method signature: (TT)V */
            c(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.onNext((Object) this.a);
            }
        }

        a(x<? super T> xVar, long j, TimeUnit timeUnit, y.c cVar, boolean z) {
            this.a = xVar;
            this.b = j;
            this.c = timeUnit;
            this.f = cVar;
            this.n = z;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.f.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.o.dispose();
            this.f.dispose();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.f.c(new RunnableC0616a(), this.b, this.c);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.f.c(new b(th), this.n ? this.b : 0, this.c);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.f.c(new c(t), this.b, this.c);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.n(this.o, bVar)) {
                this.o = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public f(v<T> vVar, long j, TimeUnit timeUnit, y yVar, boolean z) {
        super(vVar);
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
        this.n = z;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        c cVar;
        if (this.n) {
            cVar = xVar;
        } else {
            cVar = new c(xVar);
        }
        this.a.subscribe(new a(cVar, this.b, this.c, this.f.a(), this.n));
    }
}
