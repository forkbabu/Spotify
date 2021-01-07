package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.e;
import io.reactivex.internal.fuseable.i;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.a;
import io.reactivex.v;
import io.reactivex.x;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableFlatMap<T, U> extends a<T, U> {
    final l<? super T, ? extends v<? extends U>> b;
    final boolean c;
    final int f;
    final int n;

    /* access modifiers changed from: package-private */
    public static final class InnerObserver<T, U> extends AtomicReference<b> implements x<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final MergeObserver<T, U> parent;
        volatile j<U> queue;

        InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.id = j;
            this.parent = mergeObserver;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.done = true;
            this.parent.c();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (ExceptionHelper.a(this.parent.errors, th)) {
                MergeObserver<T, U> mergeObserver = this.parent;
                if (!mergeObserver.delayErrors) {
                    mergeObserver.b();
                }
                this.done = true;
                this.parent.c();
                return;
            }
            a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(U u) {
            if (this.fusionMode == 0) {
                MergeObserver<T, U> mergeObserver = this.parent;
                if (mergeObserver.get() != 0 || !mergeObserver.compareAndSet(0, 1)) {
                    j jVar = this.queue;
                    if (jVar == null) {
                        jVar = new io.reactivex.internal.queue.a(mergeObserver.bufferSize);
                        this.queue = jVar;
                    }
                    jVar.offer(u);
                    if (mergeObserver.getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    mergeObserver.downstream.onNext(u);
                    if (mergeObserver.decrementAndGet() == 0) {
                        return;
                    }
                }
                mergeObserver.e();
                return;
            }
            this.parent.c();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar) && (bVar instanceof e)) {
                e eVar = (e) bVar;
                int g = eVar.g(7);
                if (g == 1) {
                    this.fusionMode = g;
                    this.queue = eVar;
                    this.done = true;
                    this.parent.c();
                } else if (g == 2) {
                    this.fusionMode = g;
                    this.queue = eVar;
                }
            }
        }
    }

    static final class MergeObserver<T, U> extends AtomicInteger implements b, x<T> {
        static final InnerObserver<?, ?>[] a = new InnerObserver[0];
        static final InnerObserver<?, ?>[] b = new InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final x<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final l<? super T, ? extends v<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile i<U> queue;
        Queue<v<? extends U>> sources;
        long uniqueId;
        b upstream;
        int wip;

        MergeObserver(x<? super U> xVar, l<? super T, ? extends v<? extends U>> lVar, boolean z, int i, int i2) {
            this.downstream = xVar;
            this.mapper = lVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(a);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = (Throwable) this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            b();
            Throwable b2 = ExceptionHelper.b(this.errors);
            if (b2 != ExceptionHelper.a) {
                this.downstream.onError(b2);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = b;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                DisposableHelper.g(innerObserver);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            Throwable b2;
            if (!this.cancelled) {
                this.cancelled = true;
                if (b() && (b2 = ExceptionHelper.b(this.errors)) != null && b2 != ExceptionHelper.a) {
                    a.g(b2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            int i;
            x<? super U> xVar = this.downstream;
            int i2 = 1;
            while (!a()) {
                i<U> iVar = this.queue;
                if (iVar != null) {
                    while (!a()) {
                        U poll = iVar.poll();
                        if (poll != null) {
                            xVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.done;
                i<U> iVar2 = this.queue;
                InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                int i3 = 0;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.sources.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((iVar2 == null || iVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.lastId;
                        int i4 = this.lastIndex;
                        if (length <= i4 || innerObserverArr[i4].id != j) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            for (int i5 = 0; i5 < length && innerObserverArr[i4].id != j; i5++) {
                                i4++;
                                if (i4 == length) {
                                    i4 = 0;
                                }
                            }
                            this.lastIndex = i4;
                            this.lastId = innerObserverArr[i4].id;
                        }
                        int i6 = 0;
                        for (int i7 = 0; i7 < length; i7++) {
                            if (!a()) {
                                InnerObserver<T, U> innerObserver = innerObserverArr[i4];
                                j<U> jVar = innerObserver.queue;
                                if (jVar != null) {
                                    while (true) {
                                        try {
                                            U poll2 = jVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            xVar.onNext(poll2);
                                            if (a()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            yif.V(th);
                                            DisposableHelper.g(innerObserver);
                                            ExceptionHelper.a(this.errors, th);
                                            if (!a()) {
                                                f(innerObserver);
                                                i6++;
                                                i4++;
                                                if (i4 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = innerObserver.done;
                                j<U> jVar2 = innerObserver.queue;
                                if (z2 && (jVar2 == null || jVar2.isEmpty())) {
                                    f(innerObserver);
                                    if (!a()) {
                                        i6++;
                                    } else {
                                        return;
                                    }
                                }
                                i4++;
                                if (i4 != length) {
                                }
                                i4 = 0;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i4;
                        this.lastId = innerObserverArr[i4].id;
                        i3 = i6;
                    }
                    if (i3 == 0) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        while (true) {
                            int i8 = i3 - 1;
                            if (i3 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                v<? extends U> poll3 = this.sources.poll();
                                if (poll3 == null) {
                                    this.wip--;
                                } else {
                                    g(poll3);
                                }
                            }
                            i3 = i8;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable b2 = ExceptionHelper.b(this.errors);
                    if (b2 == ExceptionHelper.a) {
                        return;
                    }
                    if (b2 == null) {
                        xVar.onComplete();
                        return;
                    } else {
                        xVar.onError(b2);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerObserverArr[i] == innerObserver) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerObserverArr2 = a;
                        } else {
                            InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[(length - 1)];
                            System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                            System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                            innerObserverArr2 = innerObserverArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(innerObserverArr, innerObserverArr2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v8, types: [io.reactivex.internal.fuseable.j] */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (decrementAndGet() == 0) goto L_0x006c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(io.reactivex.v<? extends U> r8) {
            /*
                r7 = this;
            L_0x0000:
                boolean r0 = r8 instanceof java.util.concurrent.Callable
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x008e
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0060 }
                if (r8 != 0) goto L_0x0012
                goto L_0x006c
            L_0x0012:
                int r3 = r7.get()
                if (r3 != 0) goto L_0x002a
                boolean r3 = r7.compareAndSet(r1, r2)
                if (r3 == 0) goto L_0x002a
                io.reactivex.x<? super U> r3 = r7.downstream
                r3.onNext(r8)
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L_0x005c
                goto L_0x006c
            L_0x002a:
                io.reactivex.internal.fuseable.i<U> r3 = r7.queue
                if (r3 != 0) goto L_0x0043
                int r3 = r7.maxConcurrency
                if (r3 != r0) goto L_0x003a
                io.reactivex.internal.queue.a r3 = new io.reactivex.internal.queue.a
                int r4 = r7.bufferSize
                r3.<init>(r4)
                goto L_0x0041
            L_0x003a:
                io.reactivex.internal.queue.SpscArrayQueue r3 = new io.reactivex.internal.queue.SpscArrayQueue
                int r4 = r7.maxConcurrency
                r3.<init>(r4)
            L_0x0041:
                r7.queue = r3
            L_0x0043:
                boolean r8 = r3.offer(r8)
                if (r8 != 0) goto L_0x0054
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r3 = "Scalar queue full?!"
                r8.<init>(r3)
                r7.onError(r8)
                goto L_0x006c
            L_0x0054:
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L_0x005c
                r8 = 0
                goto L_0x006d
            L_0x005c:
                r7.e()
                goto L_0x006c
            L_0x0060:
                r8 = move-exception
                defpackage.yif.V(r8)
                io.reactivex.internal.util.AtomicThrowable r3 = r7.errors
                io.reactivex.internal.util.ExceptionHelper.a(r3, r8)
                r7.c()
            L_0x006c:
                r8 = 1
            L_0x006d:
                if (r8 == 0) goto L_0x00c2
                int r8 = r7.maxConcurrency
                if (r8 == r0) goto L_0x00c2
                monitor-enter(r7)
                java.util.Queue<io.reactivex.v<? extends U>> r8 = r7.sources     // Catch:{ all -> 0x008b }
                java.lang.Object r8 = r8.poll()     // Catch:{ all -> 0x008b }
                io.reactivex.v r8 = (io.reactivex.v) r8     // Catch:{ all -> 0x008b }
                if (r8 != 0) goto L_0x0084
                int r0 = r7.wip     // Catch:{ all -> 0x008b }
                int r0 = r0 - r2
                r7.wip = r0     // Catch:{ all -> 0x008b }
                r1 = 1
            L_0x0084:
                monitor-exit(r7)     // Catch:{ all -> 0x008b }
                if (r1 == 0) goto L_0x0000
                r7.c()
                goto L_0x00c2
            L_0x008b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            L_0x008e:
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver
                long r3 = r7.uniqueId
                r5 = 1
                long r5 = r5 + r3
                r7.uniqueId = r5
                r0.<init>(r7, r3)
            L_0x009a:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r3 = r7.observers
                java.lang.Object r3 = r3.get()
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r3 = (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[]) r3
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[] r4 = io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.b
                if (r3 != r4) goto L_0x00aa
                io.reactivex.internal.disposables.DisposableHelper.g(r0)
                goto L_0x00bd
            L_0x00aa:
                int r4 = r3.length
                int r5 = r4 + 1
                io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver[] r5 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[r5]
                java.lang.System.arraycopy(r3, r1, r5, r1, r4)
                r5[r4] = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver<?, ?>[]> r4 = r7.observers
                boolean r3 = r4.compareAndSet(r3, r5)
                if (r3 == 0) goto L_0x009a
                r1 = 1
            L_0x00bd:
                if (r1 == 0) goto L_0x00c2
                r8.subscribe(r0)
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.g(io.reactivex.v):void");
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                c();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.done) {
                a.g(th);
            } else if (ExceptionHelper.a(this.errors, th)) {
                this.done = true;
                c();
            } else {
                a.g(th);
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (!this.done) {
                try {
                    Object apply = this.mapper.apply(t);
                    io.reactivex.internal.functions.a.c(apply, "The mapper returned a null ObservableSource");
                    v<? extends U> vVar = (v) apply;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            int i = this.wip;
                            if (i == this.maxConcurrency) {
                                this.sources.offer(vVar);
                                return;
                            }
                            this.wip = i + 1;
                        }
                    }
                    g(vVar);
                } catch (Throwable th) {
                    yif.V(th);
                    this.upstream.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(v<T> vVar, l<? super T, ? extends v<? extends U>> lVar, boolean z, int i, int i2) {
        super(vVar);
        this.b = lVar;
        this.c = z;
        this.f = i;
        this.n = i2;
    }

    @Override // io.reactivex.s
    public void H0(x<? super U> xVar) {
        if (!a0.c(this.a, xVar, this.b)) {
            this.a.subscribe(new MergeObserver(xVar, this.b, this.c, this.f, this.n));
        }
    }
}
