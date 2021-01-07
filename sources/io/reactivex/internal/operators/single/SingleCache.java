package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleCache<T> extends z<T> implements b0<T> {
    static final CacheDisposable[] o = new CacheDisposable[0];
    static final CacheDisposable[] p = new CacheDisposable[0];
    final d0<? extends T> a;
    final AtomicInteger b = new AtomicInteger();
    final AtomicReference<CacheDisposable<T>[]> c = new AtomicReference<>(o);
    T f;
    Throwable n;

    /* access modifiers changed from: package-private */
    public static final class CacheDisposable<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 7514387411091976596L;
        final b0<? super T> downstream;
        final SingleCache<T> parent;

        CacheDisposable(b0<? super T> b0Var, SingleCache<T> singleCache) {
            this.downstream = b0Var;
            this.parent = singleCache;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.T(this);
            }
        }
    }

    public SingleCache(d0<? extends T> d0Var) {
        this.a = d0Var;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.z
    public void G(b0<? super T> b0Var) {
        boolean z;
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(b0Var, this);
        b0Var.onSubscribe(cacheDisposable);
        while (true) {
            CacheDisposable<T>[] cacheDisposableArr = this.c.get();
            z = false;
            if (cacheDisposableArr != p) {
                int length = cacheDisposableArr.length;
                CacheDisposable<T>[] cacheDisposableArr2 = new CacheDisposable[(length + 1)];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
                cacheDisposableArr2[length] = cacheDisposable;
                if (this.c.compareAndSet(cacheDisposableArr, cacheDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            if (cacheDisposable.get()) {
                T(cacheDisposable);
            }
            if (this.b.getAndIncrement() == 0) {
                this.a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th = this.n;
        if (th != null) {
            b0Var.onError(th);
        } else {
            b0Var.onSuccess(this.f);
        }
    }

    /* access modifiers changed from: package-private */
    public void T(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable<T>[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.c.get();
            int length = cacheDisposableArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (cacheDisposableArr[i] == cacheDisposable) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        cacheDisposableArr2 = o;
                    } else {
                        CacheDisposable<T>[] cacheDisposableArr3 = new CacheDisposable[(length - 1)];
                        System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                        System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                        cacheDisposableArr2 = cacheDisposableArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.c.compareAndSet(cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.b0
    public void onError(Throwable th) {
        this.n = th;
        CacheDisposable<T>[] andSet = this.c.getAndSet(p);
        for (CacheDisposable<T> cacheDisposable : andSet) {
            if (!cacheDisposable.get()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.b0
    public void onSubscribe(b bVar) {
    }

    @Override // io.reactivex.b0
    public void onSuccess(T t) {
        this.f = t;
        CacheDisposable<T>[] andSet = this.c.getAndSet(p);
        for (CacheDisposable<T> cacheDisposable : andSet) {
            if (!cacheDisposable.get()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }
}
