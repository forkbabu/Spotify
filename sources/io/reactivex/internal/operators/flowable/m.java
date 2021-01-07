package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.n;
import io.reactivex.internal.fuseable.g;
import io.reactivex.j;

public final class m<T> extends a<T, T> {
    final n<? super T> f;

    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {
        final n<? super T> o;

        a(io.reactivex.internal.fuseable.a<? super T> aVar, n<? super T> nVar) {
            super(aVar);
            this.o = nVar;
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            if (this.f) {
                return false;
            }
            if (this.n != 0) {
                return this.a.e(null);
            }
            try {
                if (!this.o.test(t) || !this.a.e(t)) {
                    return false;
                }
                return true;
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
            if (!e(t)) {
                this.b.n(1);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            g<T> gVar = this.c;
            n<? super T> nVar = this.o;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (nVar.test(poll)) {
                    return poll;
                }
                if (this.n == 2) {
                    gVar.n(1);
                }
            }
        }
    }

    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> implements io.reactivex.internal.fuseable.a<T> {
        final n<? super T> o;

        b(upf<? super T> upf, n<? super T> nVar) {
            super(upf);
            this.o = nVar;
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            if (this.f) {
                return false;
            }
            if (this.n != 0) {
                this.a.onNext(null);
                return true;
            }
            try {
                boolean test = this.o.test(t);
                if (test) {
                    this.a.onNext(t);
                }
                return test;
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
            if (!e(t)) {
                this.b.n(1);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            g<T> gVar = this.c;
            n<? super T> nVar = this.o;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (nVar.test(poll)) {
                    return poll;
                }
                if (this.n == 2) {
                    gVar.n(1);
                }
            }
        }
    }

    public m(io.reactivex.g<T> gVar, n<? super T> nVar) {
        super(gVar);
        this.f = nVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        if (upf instanceof io.reactivex.internal.fuseable.a) {
            this.c.subscribe((j) new a((io.reactivex.internal.fuseable.a) upf, this.f));
        } else {
            this.c.subscribe((j) new b(upf, this.f));
        }
    }
}
