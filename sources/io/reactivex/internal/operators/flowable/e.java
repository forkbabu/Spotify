package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.subscribers.b;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.j;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class e<T, K> extends a<T, T> {
    final l<? super T, K> f;
    final Callable<? extends Collection<? super K>> n;

    static final class a<T, K> extends b<T, T> {
        final Collection<? super K> o;
        final l<? super T, K> p;

        a(upf<? super T> upf, l<? super T, K> lVar, Collection<? super K> collection) {
            super(upf);
            this.p = lVar;
            this.o = collection;
        }

        @Override // io.reactivex.internal.subscribers.b, io.reactivex.internal.fuseable.j
        public void clear() {
            this.o.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            return b(i);
        }

        @Override // io.reactivex.internal.subscribers.b, defpackage.upf
        public void onComplete() {
            if (!this.f) {
                this.f = true;
                this.o.clear();
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.internal.subscribers.b, defpackage.upf
        public void onError(Throwable th) {
            if (this.f) {
                io.reactivex.plugins.a.g(th);
                return;
            }
            this.f = true;
            this.o.clear();
            this.a.onError(th);
        }

        @Override // defpackage.upf
        public void onNext(T t) {
            if (!this.f) {
                if (this.n == 0) {
                    try {
                        K apply = this.p.apply(t);
                        io.reactivex.internal.functions.a.c(apply, "The keySelector returned a null key");
                        if (this.o.add(apply)) {
                            this.a.onNext(t);
                        } else {
                            this.b.n(1);
                        }
                    } catch (Throwable th) {
                        a(th);
                    }
                } else {
                    this.a.onNext(null);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.j
        public T poll() {
            T poll;
            while (true) {
                poll = this.c.poll();
                if (poll == null) {
                    break;
                }
                Collection<? super K> collection = this.o;
                K apply = this.p.apply(poll);
                io.reactivex.internal.functions.a.c(apply, "The keySelector returned a null key");
                if (collection.add(apply)) {
                    break;
                } else if (this.n == 2) {
                    this.b.n(1);
                }
            }
            return poll;
        }
    }

    public e(g<T> gVar, l<? super T, K> lVar, Callable<? extends Collection<? super K>> callable) {
        super(gVar);
        this.f = lVar;
        this.n = callable;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super T> upf) {
        try {
            Object call = this.n.call();
            io.reactivex.internal.functions.a.c(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.c.subscribe((j) new a(upf, this.f, (Collection) call));
        } catch (Throwable th) {
            yif.V(th);
            upf.onSubscribe(EmptySubscription.INSTANCE);
            upf.onError(th);
        }
    }
}
