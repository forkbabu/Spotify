package io.reactivex.internal.operators.single;

import io.reactivex.b0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.s;
import io.reactivex.x;
import java.util.Iterator;

public final class SingleFlatMapIterableObservable<T, R> extends s<R> {
    final d0<T> a;
    final l<? super T, ? extends Iterable<? extends R>> b;

    static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements b0<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        volatile boolean cancelled;
        final x<? super R> downstream;
        volatile Iterator<? extends R> it;
        final l<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        b upstream;

        FlatMapIterableObserver(x<? super R> xVar, l<? super T, ? extends Iterable<? extends R>> lVar) {
            this.downstream = xVar;
            this.mapper = lVar;
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.it = null;
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return this.cancelled;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.it == null;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            if (DisposableHelper.n(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.b0
        public void onSuccess(T t) {
            x<? super R> xVar = this.downstream;
            try {
                Iterator<T> it2 = ((Iterable) this.mapper.apply(t)).iterator();
                if (!it2.hasNext()) {
                    xVar.onComplete();
                } else if (this.outputFused) {
                    this.it = it2;
                    xVar.onNext(null);
                    xVar.onComplete();
                } else {
                    while (!this.cancelled) {
                        try {
                            xVar.onNext(it2.next());
                            if (!this.cancelled) {
                                try {
                                    if (!it2.hasNext()) {
                                        xVar.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    yif.V(th);
                                    xVar.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            yif.V(th2);
                            xVar.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                yif.V(th3);
                this.downstream.onError(th3);
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public R poll() {
            Iterator<? extends R> it2 = this.it;
            if (it2 == null) {
                return null;
            }
            R r = (R) it2.next();
            a.c(r, "The iterator returned a null value");
            if (!it2.hasNext()) {
                this.it = null;
            }
            return r;
        }
    }

    public SingleFlatMapIterableObservable(d0<T> d0Var, l<? super T, ? extends Iterable<? extends R>> lVar) {
        this.a = d0Var;
        this.b = lVar;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        this.a.subscribe(new FlatMapIterableObserver(xVar, this.b));
    }
}
