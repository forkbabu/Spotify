package io.reactivex.internal.operators.observable;

import io.reactivex.functions.l;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.a;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.x;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class i0<T, R> extends s<R> {
    final T a;
    final l<? super T, ? extends v<? extends R>> b;

    i0(T t, l<? super T, ? extends v<? extends R>> lVar) {
        this.a = t;
        this.b = lVar;
    }

    @Override // io.reactivex.s
    public void H0(x<? super R> xVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        try {
            Object apply = this.b.apply(this.a);
            a.c(apply, "The mapper returned a null ObservableSource");
            v vVar = (v) apply;
            if (vVar instanceof Callable) {
                try {
                    Object call = ((Callable) vVar).call();
                    if (call == null) {
                        xVar.onSubscribe(emptyDisposable);
                        xVar.onComplete();
                        return;
                    }
                    ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(xVar, call);
                    xVar.onSubscribe(observableScalarXMap$ScalarDisposable);
                    observableScalarXMap$ScalarDisposable.run();
                } catch (Throwable th) {
                    yif.V(th);
                    xVar.onSubscribe(emptyDisposable);
                    xVar.onError(th);
                }
            } else {
                vVar.subscribe(xVar);
            }
        } catch (Throwable th2) {
            xVar.onSubscribe(emptyDisposable);
            xVar.onError(th2);
        }
    }
}
