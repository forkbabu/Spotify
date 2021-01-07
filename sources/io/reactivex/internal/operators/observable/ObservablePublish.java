package io.reactivex.internal.operators.observable;

import io.reactivex.functions.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublish<T> extends io.reactivex.observables.a<T> implements Object<T> {
    final v<T> a;
    final AtomicReference<a<T>> b;
    final v<T> c;

    /* access modifiers changed from: package-private */
    public static final class InnerDisposable<T> extends AtomicReference<Object> implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -1100270633763673112L;
        final x<? super T> child;

        InnerDisposable(x<? super T> xVar) {
            this.child = xVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() == this;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((a) andSet).a(this);
            }
        }
    }

    static final class a<T> implements x<T>, io.reactivex.disposables.b {
        static final InnerDisposable[] n = new InnerDisposable[0];
        static final InnerDisposable[] o = new InnerDisposable[0];
        final AtomicReference<a<T>> a;
        final AtomicReference<InnerDisposable<T>[]> b = new AtomicReference<>(n);
        final AtomicBoolean c;
        final AtomicReference<io.reactivex.disposables.b> f = new AtomicReference<>();

        a(AtomicReference<a<T>> atomicReference) {
            this.a = atomicReference;
            this.c = new AtomicBoolean();
        }

        /* access modifiers changed from: package-private */
        public void a(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable<T>[] innerDisposableArr2;
            do {
                innerDisposableArr = this.b.get();
                int length = innerDisposableArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerDisposableArr[i].equals(innerDisposable)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerDisposableArr2 = n;
                        } else {
                            InnerDisposable<T>[] innerDisposableArr3 = new InnerDisposable[(length - 1)];
                            System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                            System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                            innerDisposableArr2 = innerDisposableArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.b.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.b.get() == o;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.b;
            InnerDisposable<T>[] innerDisposableArr = o;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                this.a.compareAndSet(this, null);
                DisposableHelper.g(this.f);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.a.compareAndSet(this, null);
            for (InnerDisposable<T> innerDisposable : this.b.getAndSet(o)) {
                innerDisposable.child.onComplete();
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            this.a.compareAndSet(this, null);
            InnerDisposable<T>[] andSet = this.b.getAndSet(o);
            if (andSet.length != 0) {
                for (InnerDisposable<T> innerDisposable : andSet) {
                    innerDisposable.child.onError(th);
                }
                return;
            }
            io.reactivex.plugins.a.g(th);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            for (InnerDisposable<T> innerDisposable : this.b.get()) {
                innerDisposable.child.onNext(t);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.l(this.f, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements v<T> {
        private final AtomicReference<a<T>> a;

        b(AtomicReference<a<T>> atomicReference) {
            this.a = atomicReference;
        }

        @Override // io.reactivex.v
        public void subscribe(x<? super T> xVar) {
            a<T> aVar;
            boolean z;
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(xVar);
            xVar.onSubscribe(innerDisposable);
            while (true) {
                aVar = this.a.get();
                if (aVar == null || aVar.d()) {
                    a<T> aVar2 = new a<>(this.a);
                    if (!this.a.compareAndSet(aVar, aVar2)) {
                        continue;
                    } else {
                        aVar = aVar2;
                    }
                }
                while (true) {
                    InnerDisposable<T>[] innerDisposableArr = aVar.b.get();
                    z = false;
                    if (innerDisposableArr != a.o) {
                        int length = innerDisposableArr.length;
                        InnerDisposable<T>[] innerDisposableArr2 = new InnerDisposable[(length + 1)];
                        System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                        innerDisposableArr2[length] = innerDisposable;
                        if (aVar.b.compareAndSet(innerDisposableArr, innerDisposableArr2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (!innerDisposable.compareAndSet(null, aVar)) {
                aVar.a(innerDisposable);
            }
        }
    }

    private ObservablePublish(v<T> vVar, v<T> vVar2, AtomicReference<a<T>> atomicReference) {
        this.c = vVar;
        this.a = vVar2;
        this.b = atomicReference;
    }

    public static <T> io.reactivex.observables.a<T> i1(v<T> vVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new ObservablePublish(new b(atomicReference), vVar, atomicReference);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super T> xVar) {
        this.c.subscribe(xVar);
    }

    public v<T> a() {
        return this.a;
    }

    @Override // io.reactivex.observables.a
    public void g1(g<? super io.reactivex.disposables.b> gVar) {
        a<T> aVar;
        while (true) {
            aVar = this.b.get();
            if (aVar != null && !aVar.d()) {
                break;
            }
            a<T> aVar2 = new a<>(this.b);
            if (this.b.compareAndSet(aVar, aVar2)) {
                aVar = aVar2;
                break;
            }
        }
        boolean z = true;
        if (aVar.c.get() || !aVar.c.compareAndSet(false, true)) {
            z = false;
        }
        try {
            ((ObservableRefCount.RefConnection) gVar).accept(aVar);
            if (z) {
                this.a.subscribe(aVar);
            }
        } catch (Throwable th) {
            yif.V(th);
            throw ExceptionHelper.e(th);
        }
    }
}
