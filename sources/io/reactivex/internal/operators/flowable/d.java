package io.reactivex.internal.operators.flowable;

import io.reactivex.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.subscribers.b;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public final class d<T> extends a<T, T> {
    final long f;
    final TimeUnit n;
    final y o;
    final boolean p;

    static final class a<T> implements j<T>, vpf {
        final upf<? super T> a;
        final long b;
        final TimeUnit c;
        final y.c f;
        final boolean n;
        vpf o;

        /* renamed from: io.reactivex.internal.operators.flowable.d$a$a  reason: collision with other inner class name */
        final class RunnableC0613a implements Runnable {
            RunnableC0613a() {
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

        a(upf<? super T> upf, long j, TimeUnit timeUnit, y.c cVar, boolean z) {
            this.a = upf;
            this.b = j;
            this.c = timeUnit;
            this.f = cVar;
            this.n = z;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.o.cancel();
            this.f.dispose();
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.o.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            this.f.c(new RunnableC0613a(), this.b, this.c);
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            this.f.c(new b(th), this.n ? this.b : 0, this.c);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.f.c(new c(t), this.b, this.c);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.o, vpf)) {
                this.o = vpf;
                this.a.onSubscribe(this);
            }
        }
    }

    public d(g<T> gVar, long j, TimeUnit timeUnit, y yVar, boolean z) {
        super(gVar);
        this.f = j;
        this.n = timeUnit;
        this.o = yVar;
        this.p = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        b bVar;
        if (this.p) {
            bVar = upf;
        } else {
            bVar = new b(upf);
        }
        this.c.subscribe((j) new a(bVar, this.f, this.n, this.o.a(), this.p));
    }
}
