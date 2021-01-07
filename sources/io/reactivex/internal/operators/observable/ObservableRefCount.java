package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.disposables.c;
import io.reactivex.observables.a;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableRefCount<T> extends s<T> {
    final a<T> a;
    final int b = 1;
    final long c = 0;
    final TimeUnit f;
    final y n;
    RefConnection o;

    /* access modifiers changed from: package-private */
    public static final class RefConnection extends AtomicReference<b> implements Runnable, g<b> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final ObservableRefCount<?> parent;
        long subscriberCount;
        b timer;

        RefConnection(ObservableRefCount<?> observableRefCount) {
            this.parent = observableRefCount;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(b bVar) {
            b bVar2 = bVar;
            DisposableHelper.i(this, bVar2);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((c) this.parent.a).f(bVar2);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.i1(this);
        }
    }

    static final class RefCountObserver<T> extends AtomicBoolean implements x<T>, b {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final x<? super T> downstream;
        final ObservableRefCount<T> parent;
        b upstream;

        RefCountObserver(x<? super T> xVar, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = xVar;
            this.parent = observableRefCount;
            this.connection = refConnection;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.upstream.d();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount<T> observableRefCount = this.parent;
                RefConnection refConnection = this.connection;
                synchronized (observableRefCount) {
                    RefConnection refConnection2 = observableRefCount.o;
                    if (refConnection2 != null) {
                        if (refConnection2 == refConnection) {
                            long j = refConnection.subscriberCount - 1;
                            refConnection.subscriberCount = j;
                            if (j == 0) {
                                if (refConnection.connected) {
                                    if (observableRefCount.c == 0) {
                                        observableRefCount.i1(refConnection);
                                        return;
                                    }
                                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                    refConnection.timer = sequentialDisposable;
                                    DisposableHelper.i(sequentialDisposable, observableRefCount.n.c(refConnection, observableRefCount.c, observableRefCount.f));
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.h1(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.h1(this.connection);
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableRefCount(a<T> aVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = aVar;
        this.f = timeUnit;
        this.n = null;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        RefConnection refConnection;
        boolean z;
        b bVar;
        synchronized (this) {
            refConnection = this.o;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.o = refConnection;
            }
            long j = refConnection.subscriberCount;
            if (j == 0 && (bVar = refConnection.timer) != null) {
                bVar.dispose();
            }
            long j2 = j + 1;
            refConnection.subscriberCount = j2;
            z = true;
            if (refConnection.connected || j2 != ((long) this.b)) {
                z = false;
            } else {
                refConnection.connected = true;
            }
        }
        this.a.subscribe(new RefCountObserver(xVar, this, refConnection));
        if (z) {
            this.a.g1(refConnection);
        }
    }

    /* access modifiers changed from: package-private */
    public void g1(RefConnection refConnection) {
        a<T> aVar = this.a;
        if (aVar instanceof b) {
            ((b) aVar).dispose();
        } else if (aVar instanceof c) {
            ((c) aVar).f((b) refConnection.get());
        }
    }

    /* access modifiers changed from: package-private */
    public void h1(RefConnection refConnection) {
        synchronized (this) {
            if (this.a instanceof h0) {
                RefConnection refConnection2 = this.o;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    this.o = null;
                    b bVar = refConnection.timer;
                    if (bVar != null) {
                        bVar.dispose();
                        refConnection.timer = null;
                    }
                }
                long j = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j;
                if (j == 0) {
                    g1(refConnection);
                }
            } else {
                RefConnection refConnection3 = this.o;
                if (refConnection3 != null && refConnection3 == refConnection) {
                    b bVar2 = refConnection.timer;
                    if (bVar2 != null) {
                        bVar2.dispose();
                        refConnection.timer = null;
                    }
                    long j2 = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j2;
                    if (j2 == 0) {
                        this.o = null;
                        g1(refConnection);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i1(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.o) {
                this.o = null;
                b bVar = (b) refConnection.get();
                DisposableHelper.g(refConnection);
                a<T> aVar = this.a;
                if (aVar instanceof b) {
                    ((b) aVar).dispose();
                } else if (aVar instanceof c) {
                    if (bVar == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((c) aVar).f(bVar);
                    }
                }
            }
        }
    }
}
