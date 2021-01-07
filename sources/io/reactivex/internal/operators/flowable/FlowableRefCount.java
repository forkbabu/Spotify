package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.b;
import io.reactivex.flowables.a;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.disposables.c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.j;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableRefCount<T> extends g<T> {
    final a<T> c;
    final int f = 1;
    final long n = 0;
    final TimeUnit o;
    final y p;
    RefConnection q;

    /* access modifiers changed from: package-private */
    public static final class RefConnection extends AtomicReference<b> implements Runnable, io.reactivex.functions.g<b> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final FlowableRefCount<?> parent;
        long subscriberCount;
        b timer;

        RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(b bVar) {
            b bVar2 = bVar;
            DisposableHelper.i(this, bVar2);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((c) this.parent.c).f(bVar2);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.s0(this);
        }
    }

    static final class RefCountSubscriber<T> extends AtomicBoolean implements j<T>, vpf {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final upf<? super T> downstream;
        final FlowableRefCount<T> parent;
        vpf upstream;

        RefCountSubscriber(upf<? super T> upf, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = upf;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }

        @Override // defpackage.vpf
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount<T> flowableRefCount = this.parent;
                RefConnection refConnection = this.connection;
                synchronized (flowableRefCount) {
                    RefConnection refConnection2 = flowableRefCount.q;
                    if (refConnection2 != null) {
                        if (refConnection2 == refConnection) {
                            long j = refConnection.subscriberCount - 1;
                            refConnection.subscriberCount = j;
                            if (j == 0) {
                                if (refConnection.connected) {
                                    if (flowableRefCount.n == 0) {
                                        flowableRefCount.s0(refConnection);
                                        return;
                                    }
                                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                    refConnection.timer = sequentialDisposable;
                                    DisposableHelper.i(sequentialDisposable, flowableRefCount.p.c(refConnection, flowableRefCount.n, flowableRefCount.o));
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // defpackage.vpf
        public void n(long j) {
            this.upstream.n(j);
        }

        @Override // defpackage.upf
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.r0(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // defpackage.upf
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.r0(this.connection);
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.j, defpackage.upf
        public void onSubscribe(vpf vpf) {
            if (SubscriptionHelper.m(this.upstream, vpf)) {
                this.upstream = vpf;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public FlowableRefCount(a<T> aVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.c = aVar;
        this.o = timeUnit;
        this.p = null;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        RefConnection refConnection;
        boolean z;
        b bVar;
        synchronized (this) {
            refConnection = this.q;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.q = refConnection;
            }
            long j = refConnection.subscriberCount;
            if (j == 0 && (bVar = refConnection.timer) != null) {
                bVar.dispose();
            }
            long j2 = j + 1;
            refConnection.subscriberCount = j2;
            z = true;
            if (refConnection.connected || j2 != ((long) this.f)) {
                z = false;
            } else {
                refConnection.connected = true;
            }
        }
        this.c.subscribe((j) new RefCountSubscriber(upf, this, refConnection));
        if (z) {
            this.c.q0(refConnection);
        }
    }

    /* access modifiers changed from: package-private */
    public void q0(RefConnection refConnection) {
        a<T> aVar = this.c;
        if (aVar instanceof b) {
            ((b) aVar).dispose();
        } else if (aVar instanceof c) {
            ((c) aVar).f((b) refConnection.get());
        }
    }

    /* access modifiers changed from: package-private */
    public void r0(RefConnection refConnection) {
        synchronized (this) {
            if (this.c instanceof v) {
                RefConnection refConnection2 = this.q;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    this.q = null;
                    b bVar = refConnection.timer;
                    if (bVar != null) {
                        bVar.dispose();
                        refConnection.timer = null;
                    }
                }
                long j = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j;
                if (j == 0) {
                    q0(refConnection);
                }
            } else {
                RefConnection refConnection3 = this.q;
                if (refConnection3 != null && refConnection3 == refConnection) {
                    b bVar2 = refConnection.timer;
                    if (bVar2 != null) {
                        bVar2.dispose();
                        refConnection.timer = null;
                    }
                    long j2 = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j2;
                    if (j2 == 0) {
                        this.q = null;
                        q0(refConnection);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s0(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.q) {
                this.q = null;
                b bVar = (b) refConnection.get();
                DisposableHelper.g(refConnection);
                a<T> aVar = this.c;
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
