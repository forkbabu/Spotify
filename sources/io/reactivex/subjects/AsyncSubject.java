package io.reactivex.subjects;

import io.reactivex.disposables.b;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.a;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class AsyncSubject<T> extends c<T> {
    static final AsyncDisposable[] f = new AsyncDisposable[0];
    static final AsyncDisposable[] n = new AsyncDisposable[0];
    final AtomicReference<AsyncDisposable<T>[]> a = new AtomicReference<>(f);
    Throwable b;
    T c;

    /* access modifiers changed from: package-private */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        AsyncDisposable(x<? super T> xVar, AsyncSubject<T> asyncSubject) {
            super(xVar);
            this.parent = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            if (getAndSet(4) != 4) {
                this.parent.j1(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void onComplete() {
            if (!d()) {
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public void onError(Throwable th) {
            if (d()) {
                a.g(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    AsyncSubject() {
    }

    public static <T> AsyncSubject<T> h1() {
        return new AsyncSubject<>();
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        boolean z;
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(xVar, this);
        xVar.onSubscribe(asyncDisposable);
        while (true) {
            AsyncDisposable<T>[] asyncDisposableArr = this.a.get();
            z = false;
            if (asyncDisposableArr != n) {
                int length = asyncDisposableArr.length;
                AsyncDisposable<T>[] asyncDisposableArr2 = new AsyncDisposable[(length + 1)];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
                asyncDisposableArr2[length] = asyncDisposable;
                if (this.a.compareAndSet(asyncDisposableArr, asyncDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.b;
            if (th != null) {
                xVar.onError(th);
                return;
            }
            T t = this.c;
            if (t != null) {
                asyncDisposable.b(t);
            } else {
                asyncDisposable.onComplete();
            }
        } else if (asyncDisposable.d()) {
            j1(asyncDisposable);
        }
    }

    public boolean i1() {
        return this.a.get() == n && this.b == null;
    }

    /* access modifiers changed from: package-private */
    public void j1(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable<T>[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.a.get();
            int length = asyncDisposableArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (asyncDisposableArr[i] == asyncDisposable) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        asyncDisposableArr2 = f;
                    } else {
                        AsyncDisposable<T>[] asyncDisposableArr3 = new AsyncDisposable[(length - 1)];
                        System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i);
                        System.arraycopy(asyncDisposableArr, i + 1, asyncDisposableArr3, i, (length - i) - 1);
                        asyncDisposableArr2 = asyncDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.a.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = n;
        if (asyncDisposableArr != asyncDisposableArr2) {
            T t = this.c;
            AsyncDisposable<T>[] andSet = this.a.getAndSet(asyncDisposableArr2);
            int i = 0;
            if (t == null) {
                int length = andSet.length;
                while (i < length) {
                    andSet[i].onComplete();
                    i++;
                }
                return;
            }
            int length2 = andSet.length;
            while (i < length2) {
                andSet[i].b(t);
                i++;
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (th != null) {
            AsyncDisposable<T>[] asyncDisposableArr = this.a.get();
            AsyncDisposable<T>[] asyncDisposableArr2 = n;
            if (asyncDisposableArr == asyncDisposableArr2) {
                a.g(th);
                return;
            }
            this.c = null;
            this.b = th;
            for (AsyncDisposable<T> asyncDisposable : this.a.getAndSet(asyncDisposableArr2)) {
                asyncDisposable.onError(th);
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.a.get() != n) {
            this.c = t;
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (this.a.get() == n) {
            bVar.dispose();
        }
    }
}
