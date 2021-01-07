package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.single.m;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleZipArray<T, R> extends z<R> {
    final d0<? extends T>[] a;
    final l<? super Object[], ? extends R> b;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = -5556924161382950569L;
        final b0<? super R> downstream;
        final ZipSingleObserver<T>[] observers;
        final Object[] values;
        final l<? super Object[], ? extends R> zipper;

        ZipCoordinator(b0<? super R> b0Var, int i, l<? super Object[], ? extends R> lVar) {
            super(i);
            this.downstream = b0Var;
            this.zipper = lVar;
            ZipSingleObserver<T>[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver<>(this, i2);
            }
            this.observers = zipSingleObserverArr;
            this.values = new Object[i];
        }

        /* access modifiers changed from: package-private */
        public void a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                ZipSingleObserver<T>[] zipSingleObserverArr = this.observers;
                int length = zipSingleObserverArr.length;
                for (int i2 = 0; i2 < i; i2++) {
                    DisposableHelper.g(zipSingleObserverArr[i2]);
                }
                while (true) {
                    i++;
                    if (i < length) {
                        DisposableHelper.g(zipSingleObserverArr[i]);
                    } else {
                        this.downstream.onError(th);
                        return;
                    }
                }
            } else {
                io.reactivex.plugins.a.g(th);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() <= 0;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> zipSingleObserver : this.observers) {
                    DisposableHelper.g(zipSingleObserver);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ZipSingleObserver<T> extends AtomicReference<b> implements b0<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.index = i;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.parent.a(th, this.index);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }

        /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: ? super java.lang.Object[] */
        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            ZipCoordinator<T, ?> zipCoordinator = this.parent;
            zipCoordinator.values[this.index] = t;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object apply = zipCoordinator.zipper.apply(zipCoordinator.values);
                    io.reactivex.internal.functions.a.c(apply, "The zipper returned a null value");
                    zipCoordinator.downstream.onSuccess(apply);
                } catch (Throwable th) {
                    yif.V(th);
                    zipCoordinator.downstream.onError(th);
                }
            }
        }
    }

    final class a implements l<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.functions.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public R apply(T r4) {
            /*
                r3 = this;
                io.reactivex.internal.operators.single.SingleZipArray r0 = io.reactivex.internal.operators.single.SingleZipArray.this
                io.reactivex.functions.l<? super java.lang.Object[], ? extends R> r0 = r0.b
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.Object r4 = r0.apply(r1)
                java.lang.String r0 = "The zipper returned a null value"
                io.reactivex.internal.functions.a.c(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.single.SingleZipArray.a.apply(java.lang.Object):java.lang.Object");
        }
    }

    public SingleZipArray(d0<? extends T>[] d0VarArr, l<? super Object[], ? extends R> lVar) {
        this.a = d0VarArr;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super R> b0Var) {
        d0<? extends T>[] d0VarArr = this.a;
        int length = d0VarArr.length;
        if (length == 1) {
            d0VarArr[0].subscribe(new m.a(b0Var, new a()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(b0Var, length, this.b);
        b0Var.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.d(); i++) {
            d0<? extends T> d0Var = d0VarArr[i];
            if (d0Var == null) {
                zipCoordinator.a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                d0Var.subscribe(zipCoordinator.observers[i]);
            }
        }
    }
}
