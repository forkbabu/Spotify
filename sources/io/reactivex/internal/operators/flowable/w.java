package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;

public final class w {

    /* access modifiers changed from: package-private */
    public static final class a<T, R> extends g<R> {
        final T c;
        final l<? super T, ? extends tpf<? extends R>> f;

        a(T t, l<? super T, ? extends tpf<? extends R>> lVar) {
            this.c = t;
            this.f = lVar;
        }

        @Override // io.reactivex.g
        public void d0(upf<? super R> upf) {
            EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
            try {
                Object apply = this.f.apply(this.c);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null Publisher");
                tpf tpf = (tpf) apply;
                if (tpf instanceof Callable) {
                    try {
                        Object call = ((Callable) tpf).call();
                        if (call == null) {
                            upf.onSubscribe(emptySubscription);
                            upf.onComplete();
                            return;
                        }
                        upf.onSubscribe(new ScalarSubscription(upf, call));
                    } catch (Throwable th) {
                        yif.V(th);
                        upf.onSubscribe(emptySubscription);
                        upf.onError(th);
                    }
                } else {
                    tpf.subscribe(upf);
                }
            } catch (Throwable th2) {
                upf.onSubscribe(emptySubscription);
                upf.onError(th2);
            }
        }
    }

    public static <T, U> g<U> a(T t, l<? super T, ? extends tpf<? extends U>> lVar) {
        return new a(t, lVar);
    }

    public static <T, R> boolean b(tpf<T> tpf, upf<? super R> upf, l<? super T, ? extends tpf<? extends R>> lVar) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        if (!(tpf instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) tpf).call();
            if (obj == 0) {
                upf.onSubscribe(emptySubscription);
                upf.onComplete();
                return true;
            }
            try {
                Object apply = lVar.apply(obj);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null Publisher");
                tpf tpf2 = (tpf) apply;
                if (tpf2 instanceof Callable) {
                    try {
                        Object call = ((Callable) tpf2).call();
                        if (call == null) {
                            upf.onSubscribe(emptySubscription);
                            upf.onComplete();
                            return true;
                        }
                        upf.onSubscribe(new ScalarSubscription(upf, call));
                    } catch (Throwable th) {
                        yif.V(th);
                        upf.onSubscribe(emptySubscription);
                        upf.onError(th);
                        return true;
                    }
                } else {
                    tpf2.subscribe(upf);
                }
                return true;
            } catch (Throwable th2) {
                yif.V(th2);
                upf.onSubscribe(emptySubscription);
                upf.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            yif.V(th3);
            upf.onSubscribe(emptySubscription);
            upf.onError(th3);
            return true;
        }
    }
}
