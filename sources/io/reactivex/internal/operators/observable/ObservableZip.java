package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableZip<T, R> extends s<R> {
    final v<? extends T>[] a;
    final Iterable<? extends v<? extends T>> b = null;
    final l<? super Object[], ? extends R> c;
    final int f;
    final boolean n;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = 2983708048395377667L;
        volatile boolean cancelled;
        final boolean delayError;
        final x<? super R> downstream;
        final a<T, R>[] observers;
        final T[] row;
        final l<? super Object[], ? extends R> zipper;

        ZipCoordinator(x<? super R> xVar, l<? super Object[], ? extends R> lVar, int i, boolean z) {
            this.downstream = xVar;
            this.zipper = lVar;
            this.observers = new a[i];
            this.row = (T[]) new Object[i];
            this.delayError = z;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            for (a<T, R> aVar : this.observers) {
                aVar.b.clear();
            }
            for (a<T, R> aVar2 : this.observers) {
                DisposableHelper.g(aVar2.n);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
                r16 = this;
                r1 = r16
                int r0 = r16.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                io.reactivex.internal.operators.observable.ObservableZip$a<T, R>[] r0 = r1.observers
                io.reactivex.x<? super R> r2 = r1.downstream
                T[] r3 = r1.row
                boolean r4 = r1.delayError
                r5 = 1
                r6 = 1
            L_0x0013:
                int r7 = r0.length
                r9 = 0
                r10 = 0
                r11 = 0
            L_0x0017:
                if (r9 >= r7) goto L_0x0088
                r12 = r0[r9]
                r13 = r3[r11]
                if (r13 != 0) goto L_0x0070
                boolean r13 = r12.c
                io.reactivex.internal.queue.a<T> r14 = r12.b
                java.lang.Object r14 = r14.poll()
                if (r14 != 0) goto L_0x002b
                r15 = 1
                goto L_0x002c
            L_0x002b:
                r15 = 0
            L_0x002c:
                boolean r8 = r1.cancelled
                if (r8 == 0) goto L_0x0035
                r16.a()
            L_0x0033:
                r8 = 1
                goto L_0x0065
            L_0x0035:
                if (r13 == 0) goto L_0x0064
                if (r4 == 0) goto L_0x004c
                if (r15 == 0) goto L_0x0064
                java.lang.Throwable r8 = r12.f
                r1.cancelled = r5
                r16.a()
                if (r8 == 0) goto L_0x0048
                r2.onError(r8)
                goto L_0x0033
            L_0x0048:
                r2.onComplete()
                goto L_0x0033
            L_0x004c:
                java.lang.Throwable r8 = r12.f
                if (r8 == 0) goto L_0x0059
                r1.cancelled = r5
                r16.a()
                r2.onError(r8)
                goto L_0x0033
            L_0x0059:
                if (r15 == 0) goto L_0x0064
                r1.cancelled = r5
                r16.a()
                r2.onComplete()
                goto L_0x0033
            L_0x0064:
                r8 = 0
            L_0x0065:
                if (r8 == 0) goto L_0x0068
                return
            L_0x0068:
                if (r15 != 0) goto L_0x006d
                r3[r11] = r14
                goto L_0x0083
            L_0x006d:
                int r10 = r10 + 1
                goto L_0x0083
            L_0x0070:
                boolean r8 = r12.c
                if (r8 == 0) goto L_0x0083
                if (r4 != 0) goto L_0x0083
                java.lang.Throwable r8 = r12.f
                if (r8 == 0) goto L_0x0083
                r1.cancelled = r5
                r16.a()
                r2.onError(r8)
                return
            L_0x0083:
                int r11 = r11 + 1
                int r9 = r9 + 1
                goto L_0x0017
            L_0x0088:
                if (r10 == 0) goto L_0x0092
                int r6 = -r6
                int r6 = r1.addAndGet(r6)
                if (r6 != 0) goto L_0x0013
                return
            L_0x0092:
                io.reactivex.functions.l<? super java.lang.Object[], ? extends R> r7 = r1.zipper     // Catch:{ all -> 0x00aa }
                java.lang.Object r8 = r3.clone()     // Catch:{ all -> 0x00aa }
                java.lang.Object r7 = r7.apply(r8)     // Catch:{ all -> 0x00aa }
                java.lang.String r8 = "The zipper returned a null value"
                io.reactivex.internal.functions.a.c(r7, r8)     // Catch:{ all -> 0x00aa }
                r2.onNext(r7)
                r7 = 0
                java.util.Arrays.fill(r3, r7)
                goto L_0x0013
            L_0x00aa:
                r0 = move-exception
                defpackage.yif.V(r0)
                r16.a()
                r2.onError(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator.b():void");
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                for (a<T, R> aVar : this.observers) {
                    DisposableHelper.g(aVar.n);
                }
                if (getAndIncrement() == 0) {
                    for (a<T, R> aVar2 : this.observers) {
                        aVar2.b.clear();
                    }
                }
            }
        }

        public void subscribe(v<? extends T>[] vVarArr, int i) {
            a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVarArr[i2] = new a<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                vVarArr[i3].subscribe(aVarArr[i3]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements x<T> {
        final ZipCoordinator<T, R> a;
        final io.reactivex.internal.queue.a<T> b;
        volatile boolean c;
        Throwable f;
        final AtomicReference<b> n = new AtomicReference<>();

        a(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.a = zipCoordinator;
            this.b = new io.reactivex.internal.queue.a<>(i);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.c = true;
            this.a.b();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.f = th;
            this.c = true;
            this.a.b();
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.b.offer(t);
            this.a.b();
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.n, bVar);
        }
    }

    public ObservableZip(v<? extends T>[] vVarArr, Iterable<? extends v<? extends T>> iterable, l<? super Object[], ? extends R> lVar, int i, boolean z) {
        this.a = vVarArr;
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
        new ZipCoordinator(xVar, this.c, i, this.n).subscribe(vVarArr, this.f);
    }
}
