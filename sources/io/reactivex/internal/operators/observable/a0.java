package io.reactivex.internal.operators.observable;

import io.reactivex.functions.c;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.Callable;

public final class a0 {

    static final class a<U, R, T> implements l<U, R> {
        private final c<? super T, ? super U, ? extends R> a;
        private final T b;

        a(c<? super T, ? super U, ? extends R> cVar, T t) {
            this.a = cVar;
            this.b = t;
        }

        @Override // io.reactivex.functions.l
        public R apply(U u) {
            return (R) this.a.a(this.b, u);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R, U> implements l<T, v<R>> {
        private final c<? super T, ? super U, ? extends R> a;
        private final l<? super T, ? extends v<? extends U>> b;

        b(c<? super T, ? super U, ? extends R> cVar, l<? super T, ? extends v<? extends U>> lVar) {
            this.a = cVar;
            this.b = lVar;
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            Object apply = this.b.apply(obj);
            io.reactivex.internal.functions.a.c(apply, "The mapper returned a null ObservableSource");
            return new c0((v) apply, new a(this.a, obj));
        }
    }

    public static <T, U, R> l<T, v<R>> a(l<? super T, ? extends v<? extends U>> lVar, c<? super T, ? super U, ? extends R> cVar) {
        return new b(cVar, lVar);
    }

    public static <T, U> s<U> b(T t, l<? super T, ? extends v<? extends U>> lVar) {
        return new i0(t, lVar);
    }

    public static <T, R> boolean c(v<T> vVar, x<? super R> xVar, l<? super T, ? extends v<? extends R>> lVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (!(vVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) vVar).call();
            if (obj == 0) {
                xVar.onSubscribe(emptyDisposable);
                xVar.onComplete();
                return true;
            }
            try {
                Object apply = lVar.apply(obj);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null ObservableSource");
                v vVar2 = (v) apply;
                if (vVar2 instanceof Callable) {
                    try {
                        Object call = ((Callable) vVar2).call();
                        if (call == null) {
                            xVar.onSubscribe(emptyDisposable);
                            xVar.onComplete();
                            return true;
                        }
                        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(xVar, call);
                        xVar.onSubscribe(observableScalarXMap$ScalarDisposable);
                        observableScalarXMap$ScalarDisposable.run();
                    } catch (Throwable th) {
                        yif.V(th);
                        xVar.onSubscribe(emptyDisposable);
                        xVar.onError(th);
                        return true;
                    }
                } else {
                    vVar2.subscribe(xVar);
                }
                return true;
            } catch (Throwable th2) {
                yif.V(th2);
                xVar.onSubscribe(emptyDisposable);
                xVar.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            yif.V(th3);
            xVar.onSubscribe(emptyDisposable);
            xVar.onError(th3);
            return true;
        }
    }
}
