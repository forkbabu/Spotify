package com.jakewharton.rxrelay2;

import io.reactivex.disposables.b;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishRelay<T> extends c<T> {
    private static final PublishDisposable[] b = new PublishDisposable[0];
    private final AtomicReference<PublishDisposable<T>[]> a = new AtomicReference<>(b);

    /* access modifiers changed from: package-private */
    public static final class PublishDisposable<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 3562861878281475070L;
        final x<? super T> actual;
        final PublishRelay<T> parent;

        PublishDisposable(x<? super T> xVar, PublishRelay<T> publishRelay) {
            this.actual = xVar;
            this.parent = publishRelay;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.h1(this);
            }
        }
    }

    private PublishRelay() {
    }

    public static <T> PublishRelay<T> g1() {
        return new PublishRelay<>();
    }

    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable<T>[] publishDisposableArr2;
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(xVar, this);
        xVar.onSubscribe(publishDisposable);
        do {
            publishDisposableArr = this.a.get();
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[(length + 1)];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!this.a.compareAndSet(publishDisposableArr, publishDisposableArr2));
        if (publishDisposable.get()) {
            h1(publishDisposable);
        }
    }

    @Override // com.jakewharton.rxrelay2.c, io.reactivex.functions.g
    public void accept(T t) {
        if (t != null) {
            PublishDisposable<T>[] publishDisposableArr = this.a.get();
            for (PublishDisposable<T> publishDisposable : publishDisposableArr) {
                if (!publishDisposable.get()) {
                    publishDisposable.actual.onNext(t);
                }
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* access modifiers changed from: package-private */
    public void h1(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable<T>[] publishDisposableArr2;
        PublishDisposable<T>[] publishDisposableArr3 = b;
        do {
            publishDisposableArr = this.a.get();
            if (publishDisposableArr != publishDisposableArr3) {
                int length = publishDisposableArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (publishDisposableArr[i] == publishDisposable) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishDisposableArr2 = publishDisposableArr3;
                    } else {
                        publishDisposableArr2 = new PublishDisposable[(length - 1)];
                        System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, i);
                        System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }
}
