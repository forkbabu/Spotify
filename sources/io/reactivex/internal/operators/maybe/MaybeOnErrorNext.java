package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeOnErrorNext<T> extends a<T, T> {
    final l<? super Throwable, ? extends p<? extends T>> b;
    final boolean c;

    static final class OnErrorNextMaybeObserver<T> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = 2026620218879969836L;
        final boolean allowFatal;
        final n<? super T> downstream;
        final l<? super Throwable, ? extends p<? extends T>> resumeFunction;

        static final class a<T> implements n<T> {
            final n<? super T> a;
            final AtomicReference<b> b;

            a(n<? super T> nVar, AtomicReference<b> atomicReference) {
                this.a = nVar;
                this.b = atomicReference;
            }

            @Override // io.reactivex.n
            public void onComplete() {
                this.a.onComplete();
            }

            @Override // io.reactivex.n
            public void onError(Throwable th) {
                this.a.onError(th);
            }

            @Override // io.reactivex.n
            public void onSubscribe(b bVar) {
                DisposableHelper.l(this.b, bVar);
            }

            @Override // io.reactivex.n
            public void onSuccess(T t) {
                this.a.onSuccess(t);
            }
        }

        OnErrorNextMaybeObserver(n<? super T> nVar, l<? super Throwable, ? extends p<? extends T>> lVar, boolean z) {
            this.downstream = nVar;
            this.resumeFunction = lVar;
            this.allowFatal = z;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            if (this.allowFatal || (th instanceof Exception)) {
                try {
                    Object apply = this.resumeFunction.apply(th);
                    io.reactivex.internal.functions.a.c(apply, "The resumeFunction returned a null MaybeSource");
                    p pVar = (p) apply;
                    DisposableHelper.i(this, null);
                    pVar.subscribe(new a(this.downstream, this));
                } catch (Throwable th2) {
                    yif.V(th2);
                    this.downstream.onError(new CompositeException(th, th2));
                }
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.l(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public MaybeOnErrorNext(p<T> pVar, l<? super Throwable, ? extends p<? extends T>> lVar, boolean z) {
        super(pVar);
        this.b = lVar;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super T> nVar) {
        this.a.subscribe(new OnErrorNextMaybeObserver(nVar, this.b, this.c));
    }
}
