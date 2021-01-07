package io.reactivex.internal.operators.mixed;

import io.reactivex.a;
import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.s;
import io.reactivex.x;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSwitchMapCompletable<T> extends a {
    final s<T> a;
    final l<? super T, ? extends e> b;
    final boolean c;

    static final class SwitchMapCompletableObserver<T> implements x<T>, b {
        static final SwitchMapInnerObserver q = new SwitchMapInnerObserver(null);
        final c a;
        final l<? super T, ? extends e> b;
        final boolean c;
        final AtomicThrowable f = new AtomicThrowable();
        final AtomicReference<SwitchMapInnerObserver> n = new AtomicReference<>();
        volatile boolean o;
        b p;

        /* access modifiers changed from: package-private */
        public static final class SwitchMapInnerObserver extends AtomicReference<b> implements c {
            private static final long serialVersionUID = -8003404460084760287L;
            final SwitchMapCompletableObserver<?> parent;

            SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            @Override // io.reactivex.c
            public void onComplete() {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.parent;
                if (switchMapCompletableObserver.n.compareAndSet(this, null) && switchMapCompletableObserver.o) {
                    Throwable b = ExceptionHelper.b(switchMapCompletableObserver.f);
                    if (b == null) {
                        switchMapCompletableObserver.a.onComplete();
                    } else {
                        switchMapCompletableObserver.a.onError(b);
                    }
                }
            }

            @Override // io.reactivex.c
            public void onError(Throwable th) {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.parent;
                if (!switchMapCompletableObserver.n.compareAndSet(this, null) || !ExceptionHelper.a(switchMapCompletableObserver.f, th)) {
                    io.reactivex.plugins.a.g(th);
                } else if (!switchMapCompletableObserver.c) {
                    switchMapCompletableObserver.dispose();
                    Throwable b = ExceptionHelper.b(switchMapCompletableObserver.f);
                    if (b != ExceptionHelper.a) {
                        switchMapCompletableObserver.a.onError(b);
                    }
                } else if (switchMapCompletableObserver.o) {
                    switchMapCompletableObserver.a.onError(ExceptionHelper.b(switchMapCompletableObserver.f));
                }
            }

            @Override // io.reactivex.c
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this, bVar);
            }
        }

        SwitchMapCompletableObserver(c cVar, l<? super T, ? extends e> lVar, boolean z) {
            this.a = cVar;
            this.b = lVar;
            this.c = z;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.n.get() == q;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.p.dispose();
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.n;
            SwitchMapInnerObserver switchMapInnerObserver = q;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet != null && andSet != switchMapInnerObserver) {
                DisposableHelper.g(andSet);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            this.o = true;
            if (this.n.get() == null) {
                Throwable b2 = ExceptionHelper.b(this.f);
                if (b2 == null) {
                    this.a.onComplete();
                } else {
                    this.a.onError(b2);
                }
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            if (!ExceptionHelper.a(this.f, th)) {
                io.reactivex.plugins.a.g(th);
            } else if (this.c) {
                onComplete();
            } else {
                AtomicReference<SwitchMapInnerObserver> atomicReference = this.n;
                SwitchMapInnerObserver switchMapInnerObserver = q;
                SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
                if (!(andSet == null || andSet == switchMapInnerObserver)) {
                    DisposableHelper.g(andSet);
                }
                Throwable b2 = ExceptionHelper.b(this.f);
                if (b2 != ExceptionHelper.a) {
                    this.a.onError(b2);
                }
            }
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                Object apply = this.b.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null CompletableSource");
                e eVar = (e) apply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.n.get();
                    if (switchMapInnerObserver == q) {
                        return;
                    }
                } while (!this.n.compareAndSet(switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    DisposableHelper.g(switchMapInnerObserver);
                }
                eVar.subscribe(switchMapInnerObserver2);
            } catch (Throwable th) {
                yif.V(th);
                this.p.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.p, bVar)) {
                this.p = bVar;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(s<T> sVar, l<? super T, ? extends e> lVar, boolean z) {
        this.a = sVar;
        this.b = lVar;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.a
    public void F(c cVar) {
        if (!a.a(this.a, this.b, cVar)) {
            this.a.subscribe(new SwitchMapCompletableObserver(cVar, this.b, this.c));
        }
    }
}
