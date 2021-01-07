package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.j;

public final class t<T, U> extends a<T, U> {
    final l<? super T, ? extends U> f;

    static final class a<T, U> extends io.reactivex.internal.subscribers.a<T, U> {
        final l<? super T, ? extends U> o;

        a(io.reactivex.internal.fuseable.a<? super U> aVar, l<? super T, ? extends U> lVar) {
            super(aVar);
            this.o = lVar;
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            if (this.f) {
                return false;
            }
            try {
                Object apply = this.o.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper function returned a null value.");
                return this.a.e(apply);
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.f) {
                if (this.n != 0) {
                    this.a.onNext(null);
                    return;
                }
                try {
                    Object apply = this.o.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The mapper function returned a null value.");
                    this.a.onNext(apply);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public U poll() {
            T poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            U u = (U) this.o.apply(poll);
            io.reactivex.internal.functions.a.c(u, "The mapper function returned a null value.");
            return u;
        }
    }

    static final class b<T, U> extends io.reactivex.internal.subscribers.b<T, U> {
        final l<? super T, ? extends U> o;

        b(upf<? super U> upf, l<? super T, ? extends U> lVar) {
            super(upf);
            this.o = lVar;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.f) {
                if (this.n != 0) {
                    this.a.onNext(null);
                    return;
                }
                try {
                    Object apply = this.o.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The mapper function returned a null value.");
                    this.a.onNext(apply);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public U poll() {
            T poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            U u = (U) this.o.apply(poll);
            io.reactivex.internal.functions.a.c(u, "The mapper function returned a null value.");
            return u;
        }
    }

    public t(g<T> gVar, l<? super T, ? extends U> lVar) {
        super(gVar);
        this.f = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super U> upf) {
        if (upf instanceof io.reactivex.internal.fuseable.a) {
            this.c.subscribe((j) new a((io.reactivex.internal.fuseable.a) upf, this.f));
        } else {
            this.c.subscribe((j) new b(upf, this.f));
        }
    }
}
