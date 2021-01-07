package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.d;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.j;

public final class f<T, K> extends a<T, T> {
    final l<? super T, K> f;
    final d<? super K, ? super K> n;

    static final class a<T, K> extends io.reactivex.internal.subscribers.a<T, T> {
        final l<? super T, K> o;
        final d<? super K, ? super K> p;
        K q;
        boolean r;

        a(io.reactivex.internal.fuseable.a<? super T> aVar, l<? super T, K> lVar, d<? super K, ? super K> dVar) {
            super(aVar);
            this.o = lVar;
            this.p = dVar;
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            if (this.f) {
                return false;
            }
            if (this.n != 0) {
                return this.a.e(t);
            }
            try {
                K apply = this.o.apply(t);
                if (this.r) {
                    boolean a = this.p.a(this.q, apply);
                    this.q = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.r = true;
                    this.q = apply;
                }
                this.a.onNext(t);
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
            while (true) {
                T poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.o.apply(poll);
                if (!this.r) {
                    this.r = true;
                    this.q = apply;
                    return poll;
                } else if (!this.p.a(this.q, apply)) {
                    this.q = apply;
                    return poll;
                } else {
                    this.q = apply;
                    if (this.n != 1) {
                        this.b.n(1);
                    }
                }
            }
        }
    }

    static final class b<T, K> extends io.reactivex.internal.subscribers.b<T, T> implements io.reactivex.internal.fuseable.a<T> {
        final l<? super T, K> o;
        final d<? super K, ? super K> p;
        K q;
        boolean r;

        b(upf<? super T> upf, l<? super T, K> lVar, d<? super K, ? super K> dVar) {
            super(upf);
            this.o = lVar;
            this.p = dVar;
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            if (this.f) {
                return false;
            }
            if (this.n != 0) {
                this.a.onNext(t);
                return true;
            }
            try {
                K apply = this.o.apply(t);
                if (this.r) {
                    boolean a = this.p.a(this.q, apply);
                    this.q = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.r = true;
                    this.q = apply;
                }
                this.a.onNext(t);
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
            while (true) {
                T poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.o.apply(poll);
                if (!this.r) {
                    this.r = true;
                    this.q = apply;
                    return poll;
                } else if (!this.p.a(this.q, apply)) {
                    this.q = apply;
                    return poll;
                } else {
                    this.q = apply;
                    if (this.n != 1) {
                        this.b.n(1);
                    }
                }
            }
        }
    }

    public f(g<T> gVar, l<? super T, K> lVar, d<? super K, ? super K> dVar) {
        super(gVar);
        this.f = lVar;
        this.n = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        if (upf instanceof io.reactivex.internal.fuseable.a) {
            this.c.subscribe((j) new a((io.reactivex.internal.fuseable.a) upf, this.f, this.n));
        } else {
            this.c.subscribe((j) new b(upf, this.f, this.n));
        }
    }
}
