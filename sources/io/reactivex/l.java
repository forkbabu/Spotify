package io.reactivex;

import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.functions.g;
import io.reactivex.functions.n;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.d;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe;
import io.reactivex.internal.operators.maybe.MaybeTimer;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.maybe.e;
import io.reactivex.internal.operators.maybe.k;
import io.reactivex.internal.operators.maybe.p;
import io.reactivex.internal.operators.maybe.q;
import io.reactivex.internal.operators.maybe.r;
import io.reactivex.internal.operators.mixed.MaybeFlatMapObservable;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class l<T> implements p<T> {
    public static <T> l<T> d(o<T> oVar) {
        return new MaybeCreate(oVar);
    }

    public static <T> l<T> j(Callable<? extends T> callable) {
        if (callable != null) {
            return new e(callable);
        }
        throw new NullPointerException("callable is null");
    }

    public static <T> l<T> k(T t) {
        if (t != null) {
            return new k(t);
        }
        throw new NullPointerException("item is null");
    }

    public final <R> l<R> b(q<? super T, ? extends R> qVar) {
        if (qVar != null) {
            p<? extends R> a = qVar.a(this);
            if (a instanceof l) {
                return (l) a;
            }
            if (a != null) {
                return new r(a);
            }
            throw new NullPointerException("onSubscribe is null");
        }
        throw new NullPointerException("transformer is null");
    }

    public final l<T> e(T t) {
        if (t != null) {
            return new MaybeSwitchIfEmpty(this, k(t));
        }
        throw new NullPointerException("defaultItem is null");
    }

    public final l<T> f(g<? super T> gVar) {
        g f = Functions.f();
        g f2 = Functions.f();
        a aVar = Functions.c;
        return new p(this, f, gVar, f2, aVar, aVar, aVar);
    }

    public final <R> l<R> g(io.reactivex.functions.l<? super T, ? extends p<? extends R>> lVar) {
        return new MaybeFlatten(this, lVar);
    }

    public final a h(io.reactivex.functions.l<? super T, ? extends e> lVar) {
        return new MaybeFlatMapCompletable(this, lVar);
    }

    public final <R> s<R> i(io.reactivex.functions.l<? super T, ? extends v<? extends R>> lVar) {
        return new MaybeFlatMapObservable(this, lVar);
    }

    public final <R> l<R> l(io.reactivex.functions.l<? super T, ? extends R> lVar) {
        if (lVar != null) {
            return new io.reactivex.internal.operators.maybe.l(this, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final l<T> m() {
        return n(Functions.b());
    }

    public final l<T> n(n<? super Throwable> nVar) {
        return new io.reactivex.internal.operators.maybe.n(this, nVar);
    }

    public final l<T> o(io.reactivex.functions.l<? super Throwable, ? extends p<? extends T>> lVar) {
        return new MaybeOnErrorNext(this, lVar, true);
    }

    /* access modifiers changed from: protected */
    public abstract void p(n<? super T> nVar);

    public final l<T> q(y yVar) {
        if (yVar != null) {
            return new MaybeSubscribeOn(this, yVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final z<T> r(d0<? extends T> d0Var) {
        return new MaybeSwitchIfEmptySingle(this, d0Var);
    }

    public final l<T> s(long j, TimeUnit timeUnit) {
        return t(j, timeUnit, io.reactivex.schedulers.a.a());
    }

    public final b subscribe() {
        return subscribe(Functions.f(), Functions.e, Functions.c);
    }

    public final l<T> t(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new MaybeTimeoutMaybe(this, new MaybeTimer(Math.max(0L, j), timeUnit, yVar), null);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final g<T> u() {
        if (this instanceof io.reactivex.internal.fuseable.b) {
            return ((io.reactivex.internal.fuseable.b) this).c();
        }
        return new MaybeToFlowable(this);
    }

    public final s<T> v() {
        if (this instanceof d) {
            return ((d) this).a();
        }
        return new MaybeToObservable(this);
    }

    public final z<T> w() {
        return new q(this, null);
    }

    public final b subscribe(g<? super T> gVar) {
        return subscribe(gVar, Functions.e, Functions.c);
    }

    public final b subscribe(g<? super T> gVar, g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, Functions.c);
    }

    public final b subscribe(g<? super T> gVar, g<? super Throwable> gVar2, a aVar) {
        if (gVar == null) {
            throw new NullPointerException("onSuccess is null");
        } else if (gVar2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar != null) {
            MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver(gVar, gVar2, aVar);
            subscribe(maybeCallbackObserver);
            return maybeCallbackObserver;
        } else {
            throw new NullPointerException("onComplete is null");
        }
    }

    @Override // io.reactivex.p
    public final void subscribe(n<? super T> nVar) {
        if (nVar != null) {
            n<? super T> i = io.reactivex.plugins.a.i(this, nVar);
            io.reactivex.internal.functions.a.c(i, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            try {
                p(i);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                yif.V(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }
}
