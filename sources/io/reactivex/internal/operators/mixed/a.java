package io.reactivex.internal.operators.mixed;

import io.reactivex.c;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

final class a {
    static <T> boolean a(Object obj, l<? super T, ? extends e> lVar, c cVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (!(obj instanceof Callable)) {
            return false;
        }
        e eVar = null;
        try {
            Object obj2 = (Object) ((Callable) obj).call();
            if (obj2 != 0) {
                Object apply = lVar.apply(obj2);
                io.reactivex.internal.functions.a.c(apply, "The mapper returned a null CompletableSource");
                eVar = (e) apply;
            }
            if (eVar == null) {
                cVar.onSubscribe(emptyDisposable);
                cVar.onComplete();
            } else {
                eVar.subscribe(cVar);
            }
            return true;
        } catch (Throwable th) {
            yif.V(th);
            cVar.onSubscribe(emptyDisposable);
            cVar.onError(th);
            return true;
        }
    }
}
