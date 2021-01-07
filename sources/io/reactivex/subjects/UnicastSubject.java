package io.reactivex.subjects;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.a;
import io.reactivex.s;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class UnicastSubject<T> extends c<T> {
    final a<T> a;
    final AtomicReference<x<? super T>> b;
    final AtomicReference<Runnable> c = new AtomicReference<>();
    final boolean f;
    volatile boolean n;
    volatile boolean o;
    Throwable p;
    final AtomicBoolean q;
    final BasicIntQueueDisposable<T> r;
    boolean s;

    final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            UnicastSubject.this.a.clear();
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return UnicastSubject.this.n;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!UnicastSubject.this.n) {
                UnicastSubject.this.n = true;
                UnicastSubject.this.i1();
                UnicastSubject.this.b.lazySet(null);
                if (UnicastSubject.this.r.getAndIncrement() == 0) {
                    UnicastSubject.this.b.lazySet(null);
                    UnicastSubject unicastSubject = UnicastSubject.this;
                    if (!unicastSubject.s) {
                        unicastSubject.a.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.s = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return UnicastSubject.this.a.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            return UnicastSubject.this.a.poll();
        }
    }

    UnicastSubject(int i, boolean z) {
        io.reactivex.internal.functions.a.d(i, "capacityHint");
        this.a = new a<>(i);
        this.f = z;
        this.b = new AtomicReference<>();
        this.q = new AtomicBoolean();
        this.r = new UnicastQueueDisposable();
    }

    public static <T> UnicastSubject<T> h1() {
        return new UnicastSubject<>(s.g(), true);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        if (this.q.get() || !this.q.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("Only a single observer allowed.");
            xVar.onSubscribe(EmptyDisposable.INSTANCE);
            xVar.onError(illegalStateException);
            return;
        }
        xVar.onSubscribe(this.r);
        this.b.lazySet(xVar);
        if (this.n) {
            this.b.lazySet(null);
        } else {
            j1();
        }
    }

    /* access modifiers changed from: package-private */
    public void i1() {
        Runnable runnable = this.c.get();
        if (runnable != null && this.c.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        if (this.r.getAndIncrement() == 0) {
            x<? super T> xVar = this.b.get();
            int i = 1;
            int i2 = 1;
            while (xVar == null) {
                i2 = this.r.addAndGet(-i2);
                if (i2 != 0) {
                    xVar = this.b.get();
                } else {
                    return;
                }
            }
            if (this.s) {
                j<T> jVar = this.a;
                boolean z = !this.f;
                while (!this.n) {
                    boolean z2 = this.o;
                    if (!z || !z2 || !k1(jVar, xVar)) {
                        xVar.onNext(null);
                        if (z2) {
                            this.b.lazySet(null);
                            Throwable th = this.p;
                            if (th != null) {
                                xVar.onError(th);
                                return;
                            } else {
                                xVar.onComplete();
                                return;
                            }
                        } else {
                            i = this.r.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.b.lazySet(null);
                return;
            }
            a<T> aVar = this.a;
            boolean z3 = !this.f;
            boolean z4 = true;
            int i3 = 1;
            while (!this.n) {
                boolean z5 = this.o;
                T poll = this.a.poll();
                boolean z6 = poll == null;
                if (z5) {
                    if (z3 && z4) {
                        if (!k1(aVar, xVar)) {
                            z4 = false;
                        } else {
                            return;
                        }
                    }
                    if (z6) {
                        this.b.lazySet(null);
                        Throwable th2 = this.p;
                        if (th2 != null) {
                            xVar.onError(th2);
                            return;
                        } else {
                            xVar.onComplete();
                            return;
                        }
                    }
                }
                if (z6) {
                    i3 = this.r.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    xVar.onNext(poll);
                }
            }
            this.b.lazySet(null);
            aVar.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k1(j<T> jVar, x<? super T> xVar) {
        Throwable th = this.p;
        if (th == null) {
            return false;
        }
        this.b.lazySet(null);
        ((a) jVar).clear();
        xVar.onError(th);
        return true;
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        if (!this.o && !this.n) {
            this.o = true;
            i1();
            j1();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.o || this.n) {
            io.reactivex.plugins.a.g(th);
        } else {
            this.p = th;
            this.o = true;
            i1();
            j1();
        }
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!this.o && !this.n) {
            this.a.offer(t);
            j1();
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (this.o || this.n) {
            bVar.dispose();
        }
    }
}
