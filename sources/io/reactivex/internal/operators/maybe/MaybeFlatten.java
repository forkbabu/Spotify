package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.n;
import io.reactivex.p;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatten<T, R> extends a<T, R> {
    final l<? super T, ? extends p<? extends R>> b;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<b> implements n<T>, b {
        private static final long serialVersionUID = 4375739915521278546L;
        final n<? super R> downstream;
        final l<? super T, ? extends p<? extends R>> mapper;
        b upstream;

        final class a implements n<R> {
            a() {
            }

            @Override // io.reactivex.n
            public void onComplete() {
                FlatMapMaybeObserver.this.downstream.onComplete();
            }

            @Override // io.reactivex.n
            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.downstream.onError(th);
            }

            @Override // io.reactivex.n
            public void onSubscribe(b bVar) {
                DisposableHelper.l(FlatMapMaybeObserver.this, bVar);
            }

            @Override // io.reactivex.n
            public void onSuccess(R r) {
                FlatMapMaybeObserver.this.downstream.onSuccess(r);
            }
        }

        FlatMapMaybeObserver(n<? super R> nVar, l<? super T, ? extends p<? extends R>> lVar) {
            this.downstream = nVar;
            this.mapper = lVar;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return DisposableHelper.h((b) get());
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.g(this);
            this.upstream.dispose();
        }

        @Override // io.reactivex.n
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.n
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.n
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.n
        public void onSuccess(T t) {
            try {
                Object apply = this.mapper.apply(t);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null MaybeSource");
                p pVar = (p) apply;
                if (!d()) {
                    pVar.subscribe(new a());
                }
            } catch (Exception e) {
                yif.V(e);
                this.downstream.onError(e);
            }
        }
    }

    public MaybeFlatten(p<T> pVar, l<? super T, ? extends p<? extends R>> lVar) {
        super(pVar);
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.l
    public void p(n<? super R> nVar) {
        this.a.subscribe(new FlatMapMaybeObserver(nVar, this.b));
    }
}
