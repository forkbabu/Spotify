package io.reactivex.internal.operators.observable;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.a;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublishAlt<T> extends a<T> implements Object<T> {
    final v<T> a;
    final AtomicReference<PublishConnection<T>> b = new AtomicReference<>();

    /* access modifiers changed from: package-private */
    public static final class InnerDisposable<T> extends AtomicReference<PublishConnection<T>> implements b {
        private static final long serialVersionUID = 7463222674719692880L;
        final x<? super T> downstream;

        InnerDisposable(x<? super T> xVar, PublishConnection<T> publishConnection) {
            this.downstream = xVar;
            lazySet(publishConnection);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            PublishConnection publishConnection = (PublishConnection) getAndSet(null);
            if (publishConnection != null) {
                publishConnection.a(this);
            }
        }
    }

    static final class PublishConnection<T> extends AtomicReference<InnerDisposable<T>[]> implements x<T>, b {
        static final InnerDisposable[] a = new InnerDisposable[0];
        static final InnerDisposable[] b = new InnerDisposable[0];
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<PublishConnection<T>> current;
        Throwable error;
        final AtomicReference<b> upstream;

        PublishConnection(AtomicReference<PublishConnection<T>> atomicReference) {
            this.current = atomicReference;
            this.upstream = new AtomicReference<>();
            lazySet(a);
        }

        public void a(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = (InnerDisposable[]) get();
                int length = innerDisposableArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerDisposableArr[i] == innerDisposable) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        innerDisposableArr2 = a;
                        if (length != 1) {
                            innerDisposableArr2 = new InnerDisposable[(length - 1)];
                            System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, i);
                            System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == b;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            getAndSet(b);
            this.current.compareAndSet(this, null);
            DisposableHelper.g(this.upstream);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) getAndSet(b)) {
                innerDisposable.downstream.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.error = th;
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) getAndSet(b)) {
                innerDisposable.downstream.onError(th);
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            for (InnerDisposable innerDisposable : (InnerDisposable[]) get()) {
                innerDisposable.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            DisposableHelper.l(this.upstream, bVar);
        }
    }

    public ObservablePublishAlt(v<T> vVar) {
        this.a = vVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        PublishConnection<T> publishConnection;
        boolean z;
        while (true) {
            publishConnection = this.b.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.b);
            if (this.b.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        InnerDisposable<T> innerDisposable = new InnerDisposable<>(xVar, publishConnection);
        xVar.onSubscribe(innerDisposable);
        while (true) {
            InnerDisposable[] innerDisposableArr = (InnerDisposable[]) publishConnection.get();
            z = false;
            if (innerDisposableArr != PublishConnection.b) {
                int length = innerDisposableArr.length;
                InnerDisposable[] innerDisposableArr2 = new InnerDisposable[(length + 1)];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
                if (publishConnection.compareAndSet(innerDisposableArr, innerDisposableArr2)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = publishConnection.error;
            if (th != null) {
                xVar.onError(th);
            } else {
                xVar.onComplete();
            }
        } else if (innerDisposable.d()) {
            publishConnection.a(innerDisposable);
        }
    }

    public void f(b bVar) {
        this.b.compareAndSet((PublishConnection) bVar, null);
    }

    @Override // io.reactivex.observables.a
    public void g1(g<? super b> gVar) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.b.get();
            if (publishConnection != null && !publishConnection.d()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.b);
            if (this.b.compareAndSet(publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        boolean z = true;
        if (publishConnection.connect.get() || !publishConnection.connect.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ((ObservableRefCount.RefConnection) gVar).accept(publishConnection);
            if (z) {
                this.a.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            yif.V(th);
            throw ExceptionHelper.e(th);
        }
    }
}
