package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCombineLatest<T, R> extends s<R> {
    final v<? extends T>[] a;
    final Iterable<? extends v<? extends T>> b;
    final l<? super Object[], ? extends R> c;
    final int f;
    final boolean n;

    /* access modifiers changed from: package-private */
    public static final class CombinerObserver<T, R> extends AtomicReference<b> implements x<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final LatestCoordinator<T, R> parent;

        CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.parent = latestCoordinator;
            this.index = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            if (r4 == r2.length) goto L_0x001d;
         */
        @Override // io.reactivex.x, io.reactivex.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
                r5 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r5.parent
                int r1 = r5.index
                monitor-enter(r0)
                java.lang.Object[] r2 = r0.latest     // Catch:{ all -> 0x0029 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                goto L_0x0028
            L_0x000b:
                r1 = r2[r1]     // Catch:{ all -> 0x0029 }
                r3 = 1
                if (r1 != 0) goto L_0x0012
                r1 = 1
                goto L_0x0013
            L_0x0012:
                r1 = 0
            L_0x0013:
                if (r1 != 0) goto L_0x001d
                int r4 = r0.complete     // Catch:{ all -> 0x0029 }
                int r4 = r4 + r3
                r0.complete = r4     // Catch:{ all -> 0x0029 }
                int r2 = r2.length     // Catch:{ all -> 0x0029 }
                if (r4 != r2) goto L_0x001f
            L_0x001d:
                r0.done = r3     // Catch:{ all -> 0x0029 }
            L_0x001f:
                monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                if (r1 == 0) goto L_0x0025
                r0.a()
            L_0x0025:
                r0.c()
            L_0x0028:
                return
            L_0x0029:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver.onComplete():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            if (r3 == r5.length) goto L_0x0029;
         */
        @Override // io.reactivex.x, io.reactivex.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onError(java.lang.Throwable r5) {
            /*
                r4 = this;
                io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator<T, R> r0 = r4.parent
                int r1 = r4.index
                io.reactivex.internal.util.AtomicThrowable r2 = r0.errors
                boolean r2 = io.reactivex.internal.util.ExceptionHelper.a(r2, r5)
                if (r2 == 0) goto L_0x003a
                boolean r5 = r0.delayError
                r2 = 1
                if (r5 == 0) goto L_0x0031
                monitor-enter(r0)
                java.lang.Object[] r5 = r0.latest     // Catch:{ all -> 0x002e }
                if (r5 != 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x002e }
                goto L_0x003d
            L_0x0018:
                r1 = r5[r1]     // Catch:{ all -> 0x002e }
                if (r1 != 0) goto L_0x001e
                r1 = 1
                goto L_0x001f
            L_0x001e:
                r1 = 0
            L_0x001f:
                if (r1 != 0) goto L_0x0029
                int r3 = r0.complete     // Catch:{ all -> 0x002e }
                int r3 = r3 + r2
                r0.complete = r3     // Catch:{ all -> 0x002e }
                int r5 = r5.length     // Catch:{ all -> 0x002e }
                if (r3 != r5) goto L_0x002b
            L_0x0029:
                r0.done = r2     // Catch:{ all -> 0x002e }
            L_0x002b:
                monitor-exit(r0)     // Catch:{ all -> 0x002e }
                r2 = r1
                goto L_0x0031
            L_0x002e:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002e }
                throw r5
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r0.a()
            L_0x0036:
                r0.c()
                goto L_0x003d
            L_0x003a:
                io.reactivex.plugins.a.g(r5)
            L_0x003d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver.onError(java.lang.Throwable):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: io.reactivex.internal.queue.a<java.lang.Object[]> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.x
        public void onNext(T t) {
            boolean z;
            LatestCoordinator<T, R> latestCoordinator = this.parent;
            int i = this.index;
            synchronized (latestCoordinator) {
                Object[] objArr = latestCoordinator.latest;
                if (objArr != null) {
                    Object obj = objArr[i];
                    int i2 = latestCoordinator.active;
                    if (obj == null) {
                        i2++;
                        latestCoordinator.active = i2;
                    }
                    objArr[i] = t;
                    if (i2 == objArr.length) {
                        latestCoordinator.queue.offer(objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    return;
                }
            }
            if (z) {
                latestCoordinator.c();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }
    }

    static final class LatestCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final l<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final x<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        Object[] latest;
        final CombinerObserver<T, R>[] observers;
        final a<Object[]> queue;

        LatestCoordinator(x<? super R> xVar, l<? super Object[], ? extends R> lVar, int i, int i2, boolean z) {
            this.downstream = xVar;
            this.combiner = lVar;
            this.delayError = z;
            this.latest = new Object[i];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i];
            for (int i3 = 0; i3 < i; i3++) {
                combinerObserverArr[i3] = new CombinerObserver<>(this, i3);
            }
            this.observers = combinerObserverArr;
            this.queue = new a<>(i2);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                DisposableHelper.g(combinerObserver);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(a<?> aVar) {
            synchronized (this) {
                this.latest = null;
            }
            aVar.clear();
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (getAndIncrement() == 0) {
                a<Object[]> aVar = this.queue;
                x<? super R> xVar = this.downstream;
                boolean z = this.delayError;
                int i = 1;
                while (!this.cancelled) {
                    if (z || this.errors.get() == null) {
                        boolean z2 = this.done;
                        Object[] poll = aVar.poll();
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            b(aVar);
                            Throwable b = ExceptionHelper.b(this.errors);
                            if (b == null) {
                                xVar.onComplete();
                                return;
                            } else {
                                xVar.onError(b);
                                return;
                            }
                        } else if (z3) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                Object obj = (Object) this.combiner.apply(poll);
                                io.reactivex.internal.functions.a.c(obj, "The combiner returned a null value");
                                xVar.onNext(obj);
                            } catch (Throwable th) {
                                yif.V(th);
                                ExceptionHelper.a(this.errors, th);
                                a();
                                b(aVar);
                                xVar.onError(ExceptionHelper.b(this.errors));
                                return;
                            }
                        }
                    } else {
                        a();
                        b(aVar);
                        xVar.onError(ExceptionHelper.b(this.errors));
                        return;
                    }
                }
                b(aVar);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                a();
                if (getAndIncrement() == 0) {
                    b(this.queue);
                }
            }
        }

        public void subscribe(v<? extends T>[] vVarArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
                vVarArr[i].subscribe(combinerObserverArr[i]);
            }
        }
    }

    public ObservableCombineLatest(v<? extends T>[] vVarArr, Iterable<? extends v<? extends T>> iterable, l<? super Object[], ? extends R> lVar, int i, boolean z) {
        this.a = vVarArr;
        this.b = iterable;
        this.c = lVar;
        this.f = i;
        this.n = z;
    }

    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        int i;
        v<? extends T>[] vVarArr = this.a;
        if (vVarArr == null) {
            vVarArr = new v[8];
            i = 0;
            for (v<? extends T> vVar : this.b) {
                if (i == vVarArr.length) {
                    v<? extends T>[] vVarArr2 = new v[((i >> 2) + i)];
                    System.arraycopy(vVarArr, 0, vVarArr2, 0, i);
                    vVarArr = vVarArr2;
                }
                vVarArr[i] = vVar;
                i++;
            }
        } else {
            i = vVarArr.length;
        }
        if (i == 0) {
            xVar.onSubscribe(EmptyDisposable.INSTANCE);
            xVar.onComplete();
            return;
        }
        new LatestCoordinator(xVar, this.c, i, this.f, this.n).subscribe(vVarArr);
    }
}
