package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableAmb<T> extends s<T> {
    final v<? extends T>[] a;
    final Iterable<? extends v<? extends T>> b = null;

    /* access modifiers changed from: package-private */
    public static final class AmbInnerObserver<T> extends AtomicReference<b> implements x<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final x<? super T> downstream;
        final int index;
        final a<T> parent;
        boolean won;

        AmbInnerObserver(a<T> aVar, int i, x<? super T> xVar) {
            this.parent = aVar;
            this.index = i;
            this.downstream = xVar;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.a(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.a(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.a.g(th);
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.a(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                ((b) get()).dispose();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this, bVar);
        }
    }

    static final class a<T> implements b {
        final x<? super T> a;
        final AmbInnerObserver<T>[] b;
        final AtomicInteger c = new AtomicInteger();

        a(x<? super T> xVar, int i) {
            this.a = xVar;
            this.b = new AmbInnerObserver[i];
        }

        public boolean a(int i) {
            int i2 = this.c.get();
            int i3 = 0;
            if (i2 == 0) {
                if (!this.c.compareAndSet(0, i)) {
                    return false;
                }
                AmbInnerObserver<T>[] ambInnerObserverArr = this.b;
                int length = ambInnerObserverArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        DisposableHelper.g(ambInnerObserverArr[i3]);
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 == i) {
                return true;
            } else {
                return false;
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.c.get() == -1;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.c.get() != -1) {
                this.c.lazySet(-1);
                for (AmbInnerObserver<T> ambInnerObserver : this.b) {
                    DisposableHelper.g(ambInnerObserver);
                }
            }
        }

        public void subscribe(v<? extends T>[] vVarArr) {
            AmbInnerObserver<T>[] ambInnerObserverArr = this.b;
            int length = ambInnerObserverArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerObserverArr[i] = new AmbInnerObserver<>(this, i2, this.a);
                i = i2;
            }
            this.c.lazySet(0);
            this.a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.c.get() == 0; i3++) {
                vVarArr[i3].subscribe(ambInnerObserverArr[i3]);
            }
        }
    }

    public ObservableAmb(v<? extends T>[] vVarArr, Iterable<? extends v<? extends T>> iterable) {
        this.a = vVarArr;
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        int i;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        v<? extends T>[] vVarArr = this.a;
        if (vVarArr == null) {
            vVarArr = new v[8];
            try {
                i = 0;
                for (v<? extends T> vVar : this.b) {
                    if (vVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                        xVar.onSubscribe(emptyDisposable);
                        xVar.onError(nullPointerException);
                        return;
                    }
                    if (i == vVarArr.length) {
                        v<? extends T>[] vVarArr2 = new v[((i >> 2) + i)];
                        System.arraycopy(vVarArr, 0, vVarArr2, 0, i);
                        vVarArr = vVarArr2;
                    }
                    int i2 = i + 1;
                    vVarArr[i] = vVar;
                    i = i2;
                }
            } catch (Throwable th) {
                yif.V(th);
                xVar.onSubscribe(emptyDisposable);
                xVar.onError(th);
                return;
            }
        } else {
            i = vVarArr.length;
        }
        if (i == 0) {
            xVar.onSubscribe(emptyDisposable);
            xVar.onComplete();
        } else if (i == 1) {
            vVarArr[0].subscribe(xVar);
        } else {
            new a(xVar, i).subscribe(vVarArr);
        }
    }
}
