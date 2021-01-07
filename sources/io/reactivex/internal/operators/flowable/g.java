package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.j;

public final class g<T> extends a<T, T> {
    final io.reactivex.functions.g<? super T> f;
    final io.reactivex.functions.g<? super Throwable> n;
    final io.reactivex.functions.a o;
    final io.reactivex.functions.a p;

    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {
        final io.reactivex.functions.g<? super T> o;
        final io.reactivex.functions.g<? super Throwable> p;
        final io.reactivex.functions.a q;
        final io.reactivex.functions.a r;

        a(io.reactivex.internal.fuseable.a<? super T> aVar, io.reactivex.functions.g<? super T> gVar, io.reactivex.functions.g<? super Throwable> gVar2, io.reactivex.functions.a aVar2, io.reactivex.functions.a aVar3) {
            super(aVar);
            this.o = gVar;
            this.p = gVar2;
            this.q = aVar2;
            this.r = aVar3;
        }

        @Override // io.reactivex.internal.fuseable.a
        public boolean e(T t) {
            if (this.f) {
                return false;
            }
            try {
                this.o.accept(t);
                return this.a.e(t);
            } catch (Throwable th) {
                a(th);
                return false;
            }
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // io.reactivex.internal.subscribers.a, defpackage.upf
        public void onComplete() {
            if (!this.f) {
                try {
                    this.q.run();
                    this.f = true;
                    this.a.onComplete();
                    try {
                        this.r.run();
                    } catch (Throwable th) {
                        yif.V(th);
                        io.reactivex.plugins.a.g(th);
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.a, defpackage.upf
        public void onError(Throwable th) {
            if (this.f) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            boolean z = true;
            this.f = true;
            try {
                this.p.accept(th);
            } catch (Throwable th2) {
                yif.V(th2);
                this.a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.a.onError(th);
            }
            try {
                this.r.run();
            } catch (Throwable th3) {
                yif.V(th3);
                io.reactivex.plugins.a.g(th3);
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.f) {
                if (this.n != 0) {
                    this.a.onNext(null);
                    return;
                }
                try {
                    this.o.accept(t);
                    this.a.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            try {
                T poll = this.c.poll();
                if (poll != null) {
                    try {
                        this.o.accept(poll);
                        this.r.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.n == 1) {
                    this.q.run();
                    this.r.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }
    }

    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> {
        final io.reactivex.functions.g<? super T> o;
        final io.reactivex.functions.g<? super Throwable> p;
        final io.reactivex.functions.a q;
        final io.reactivex.functions.a r;

        b(upf<? super T> upf, io.reactivex.functions.g<? super T> gVar, io.reactivex.functions.g<? super Throwable> gVar2, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2) {
            super(upf);
            this.o = gVar;
            this.p = gVar2;
            this.q = aVar;
            this.r = aVar2;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // io.reactivex.internal.subscribers.b, defpackage.upf
        public void onComplete() {
            if (!this.f) {
                try {
                    this.q.run();
                    this.f = true;
                    this.a.onComplete();
                    try {
                        this.r.run();
                    } catch (Throwable th) {
                        yif.V(th);
                        io.reactivex.plugins.a.g(th);
                    }
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.b, defpackage.upf
        public void onError(Throwable th) {
            if (this.f) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            boolean z = true;
            this.f = true;
            try {
                this.p.accept(th);
            } catch (Throwable th2) {
                yif.V(th2);
                this.a.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.a.onError(th);
            }
            try {
                this.r.run();
            } catch (Throwable th3) {
                yif.V(th3);
                io.reactivex.plugins.a.g(th3);
            }
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.f) {
                if (this.n != 0) {
                    this.a.onNext(null);
                    return;
                }
                try {
                    this.o.accept(t);
                    this.a.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            try {
                T poll = this.c.poll();
                if (poll != null) {
                    try {
                        this.o.accept(poll);
                        this.r.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.n == 1) {
                    this.q.run();
                    this.r.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }
    }

    public g(io.reactivex.g<T> gVar, io.reactivex.functions.g<? super T> gVar2, io.reactivex.functions.g<? super Throwable> gVar3, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2) {
        super(gVar);
        this.f = gVar2;
        this.n = gVar3;
        this.o = aVar;
        this.p = aVar2;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        if (upf instanceof io.reactivex.internal.fuseable.a) {
            this.c.subscribe((j) new a((io.reactivex.internal.fuseable.a) upf, this.f, this.n, this.o, this.p));
        } else {
            this.c.subscribe((j) new b(upf, this.f, this.n, this.o, this.p));
        }
    }
}
