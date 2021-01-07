package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.e;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n extends io.reactivex.a {
    final e a;
    final long b;
    final TimeUnit c;
    final y f;
    final e n;

    final class a implements Runnable {
        private final AtomicBoolean a;
        final io.reactivex.disposables.a b;
        final c c;

        /* renamed from: io.reactivex.internal.operators.completable.n$a$a  reason: collision with other inner class name */
        final class C0612a implements c {
            C0612a() {
            }

            @Override // io.reactivex.c
            public void onComplete() {
                a.this.b.dispose();
                a.this.c.onComplete();
            }

            @Override // io.reactivex.c
            public void onError(Throwable th) {
                a.this.b.dispose();
                a.this.c.onError(th);
            }

            @Override // io.reactivex.c
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                a.this.b.b(bVar);
            }
        }

        a(AtomicBoolean atomicBoolean, io.reactivex.disposables.a aVar, c cVar) {
            this.a = atomicBoolean;
            this.b = aVar;
            this.c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.compareAndSet(false, true)) {
                this.b.f();
                e eVar = n.this.n;
                if (eVar == null) {
                    c cVar = this.c;
                    n nVar = n.this;
                    cVar.onError(new TimeoutException(ExceptionHelper.d(nVar.b, nVar.c)));
                    return;
                }
                eVar.subscribe(new C0612a());
            }
        }
    }

    static final class b implements c {
        private final io.reactivex.disposables.a a;
        private final AtomicBoolean b;
        private final c c;

        b(io.reactivex.disposables.a aVar, AtomicBoolean atomicBoolean, c cVar) {
            this.a = aVar;
            this.b = atomicBoolean;
            this.c = cVar;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            if (this.b.compareAndSet(false, true)) {
                this.a.dispose();
                this.c.onComplete();
            }
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                this.a.dispose();
                this.c.onError(th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.a.b(bVar);
        }
    }

    public n(e eVar, long j, TimeUnit timeUnit, y yVar, e eVar2) {
        this.a = eVar;
        this.b = j;
        this.c = timeUnit;
        this.f = yVar;
        this.n = eVar2;
    }

    @Override // io.reactivex.a
    public void F(c cVar) {
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
        cVar.onSubscribe(aVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        aVar.b(this.f.c(new a(atomicBoolean, aVar, cVar), this.b, this.c));
        this.a.subscribe(new b(aVar, atomicBoolean, cVar));
    }
}
