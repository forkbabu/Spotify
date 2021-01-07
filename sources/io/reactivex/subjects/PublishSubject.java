package io.reactivex.subjects;

import io.reactivex.disposables.b;
import io.reactivex.plugins.a;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishSubject<T> extends c<T> {
    static final PublishDisposable[] c = new PublishDisposable[0];
    static final PublishDisposable[] f = new PublishDisposable[0];
    final AtomicReference<PublishDisposable<T>[]> a = new AtomicReference<>(f);
    Throwable b;

    /* access modifiers changed from: package-private */
    public static final class PublishDisposable<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 3562861878281475070L;
        final x<? super T> downstream;
        final PublishSubject<T> parent;

        PublishDisposable(x<? super T> xVar, PublishSubject<T> publishSubject) {
            this.downstream = xVar;
            this.parent = publishSubject;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.i1(this);
            }
        }
    }

    PublishSubject() {
    }

    public static <T> PublishSubject<T> h1() {
        return new PublishSubject<>();
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        boolean z;
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(xVar, this);
        xVar.onSubscribe(publishDisposable);
        while (true) {
            PublishDisposable<T>[] publishDisposableArr = this.a.get();
            z = false;
            if (publishDisposableArr != c) {
                int length = publishDisposableArr.length;
                PublishDisposable<T>[] publishDisposableArr2 = new PublishDisposable[(length + 1)];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
                publishDisposableArr2[length] = publishDisposable;
                if (this.a.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
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
            } else {
                xVar.onComplete();
            }
        } else if (publishDisposable.get()) {
            i1(publishDisposable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i1(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable<T>[] publishDisposableArr2;
        PublishDisposable<T>[] publishDisposableArr3 = f;
        do {
            publishDisposableArr = this.a.get();
            if (publishDisposableArr != c && publishDisposableArr != publishDisposableArr3) {
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

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.a.get();
        PublishDisposable<T>[] publishDisposableArr2 = c;
        if (publishDisposableArr != publishDisposableArr2) {
            PublishDisposable<T>[] andSet = this.a.getAndSet(publishDisposableArr2);
            for (PublishDisposable<T> publishDisposable : andSet) {
                if (!publishDisposable.get()) {
                    publishDisposable.downstream.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        if (th != null) {
            PublishDisposable<T>[] publishDisposableArr = this.a.get();
            PublishDisposable<T>[] publishDisposableArr2 = c;
            if (publishDisposableArr == publishDisposableArr2) {
                a.g(th);
                return;
            }
            this.b = th;
            PublishDisposable<T>[] andSet = this.a.getAndSet(publishDisposableArr2);
            for (PublishDisposable<T> publishDisposable : andSet) {
                if (publishDisposable.get()) {
                    a.g(th);
                } else {
                    publishDisposable.downstream.onError(th);
                }
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // io.reactivex.x
    public void onNext(T t) {
        if (t != null) {
            PublishDisposable<T>[] publishDisposableArr = this.a.get();
            for (PublishDisposable<T> publishDisposable : publishDisposableArr) {
                if (!publishDisposable.get()) {
                    publishDisposable.downstream.onNext(t);
                }
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
        if (this.a.get() == c) {
            bVar.dispose();
        }
    }
}
