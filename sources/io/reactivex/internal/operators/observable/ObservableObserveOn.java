package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.e;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.schedulers.i;
import io.reactivex.plugins.a;
import io.reactivex.v;
import io.reactivex.x;
import io.reactivex.y;

public final class ObservableObserveOn<T> extends a<T, T> {
    final y b;
    final boolean c;
    final int f;

    static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements x<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final x<? super T> downstream;
        Throwable error;
        boolean outputFused;
        j<T> queue;
        int sourceMode;
        b upstream;
        final y.c worker;

        ObserveOnObserver(x<? super T> xVar, y.c cVar, boolean z, int i) {
            this.downstream = xVar;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, x<? super T> xVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (this.delayError) {
                    if (!z2) {
                        return false;
                    }
                    this.disposed = true;
                    if (th != null) {
                        xVar.onError(th);
                    } else {
                        xVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    xVar.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.disposed = true;
                    xVar.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.disposed;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                b();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
                return;
            }
            this.error = th;
            this.done = true;
            b();
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                b();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof e) {
                    e eVar = (e) bVar;
                    int g = eVar.g(7);
                    if (g == 1) {
                        this.sourceMode = g;
                        this.queue = eVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        b();
                        return;
                    } else if (g == 2) {
                        this.sourceMode = g;
                        this.queue = eVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new io.reactivex.internal.queue.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            return this.queue.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                int i = 1;
                while (!this.disposed) {
                    boolean z = this.done;
                    Throwable th = this.error;
                    if (this.delayError || !z || th == null) {
                        this.downstream.onNext(null);
                        if (z) {
                            this.disposed = true;
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                this.downstream.onError(th2);
                            } else {
                                this.downstream.onComplete();
                            }
                            this.worker.dispose();
                            return;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.disposed = true;
                        this.downstream.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                }
                return;
            }
            j<T> jVar = this.queue;
            x<? super T> xVar = this.downstream;
            int i2 = 1;
            while (!a(this.done, jVar.isEmpty(), xVar)) {
                while (true) {
                    boolean z2 = this.done;
                    try {
                        T poll = jVar.poll();
                        boolean z3 = poll == null;
                        if (!a(z2, z3, xVar)) {
                            if (z3) {
                                i2 = addAndGet(-i2);
                                if (i2 == 0) {
                                    return;
                                }
                            } else {
                                xVar.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        yif.V(th3);
                        this.disposed = true;
                        this.upstream.dispose();
                        jVar.clear();
                        xVar.onError(th3);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }
    }

    public ObservableObserveOn(v<T> vVar, y yVar, boolean z, int i) {
        super(vVar);
        this.b = yVar;
        this.c = z;
        this.f = i;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        y yVar = this.b;
        if (yVar instanceof i) {
            this.a.subscribe(xVar);
            return;
        }
        this.a.subscribe(new ObserveOnObserver(xVar, yVar.a(), this.c, this.f));
    }
}
