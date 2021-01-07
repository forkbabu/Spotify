package io.reactivex;

import io.reactivex.functions.c;
import io.reactivex.functions.g;
import io.reactivex.functions.h;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.b;
import io.reactivex.internal.fuseable.d;
import io.reactivex.internal.observers.BiConsumerSingleObserver;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.maybe.f;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMapIterableObservable;
import io.reactivex.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.operators.single.a;
import io.reactivex.internal.operators.single.e;
import io.reactivex.internal.operators.single.i;
import io.reactivex.internal.operators.single.j;
import io.reactivex.internal.operators.single.k;
import io.reactivex.internal.operators.single.m;
import io.reactivex.internal.operators.single.o;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class z<T> implements d0<T> {
    private z<T> M(long j, TimeUnit timeUnit, y yVar, d0<? extends T> d0Var) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new SingleTimeout(this, j, timeUnit, yVar, d0Var);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static <T1, T2, T3, R> z<R> Q(d0<? extends T1> d0Var, d0<? extends T2> d0Var2, d0<? extends T3> d0Var3, h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        if (d0Var3 != null) {
            return S(Functions.n(hVar), d0Var, d0Var2, d0Var3);
        }
        throw new NullPointerException("source3 is null");
    }

    public static <T1, T2, R> z<R> R(d0<? extends T1> d0Var, d0<? extends T2> d0Var2, c<? super T1, ? super T2, ? extends R> cVar) {
        if (d0Var == null) {
            throw new NullPointerException("source1 is null");
        } else if (d0Var2 != null) {
            return S(Functions.m(cVar), d0Var, d0Var2);
        } else {
            throw new NullPointerException("source2 is null");
        }
    }

    public static <T, R> z<R> S(l<? super Object[], ? extends R> lVar, d0<? extends T>... d0VarArr) {
        if (d0VarArr.length == 0) {
            return q(new NoSuchElementException());
        }
        return new SingleZipArray(d0VarArr, lVar);
    }

    public static <T> z<T> g(c0<T> c0Var) {
        return new SingleCreate(c0Var);
    }

    public static <T> z<T> h(Callable<? extends d0<? extends T>> callable) {
        return new a(callable);
    }

    public static <T> z<T> q(Throwable th) {
        if (th != null) {
            return new i(Functions.i(th));
        }
        throw new NullPointerException("exception is null");
    }

    public static <T> z<T> y(Callable<? extends T> callable) {
        return new j(callable);
    }

    public static <T> z<T> z(T t) {
        if (t != null) {
            return new io.reactivex.internal.operators.single.l(t);
        }
        throw new NullPointerException("item is null");
    }

    public final <R> z<R> A(l<? super T, ? extends R> lVar) {
        if (lVar != null) {
            return new m(this, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final z<T> B(y yVar) {
        if (yVar != null) {
            return new SingleObserveOn(this, yVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final z<T> C(z<? extends T> zVar) {
        return D(Functions.j(zVar));
    }

    public final z<T> D(l<? super Throwable, ? extends d0<? extends T>> lVar) {
        return new SingleResumeNext(this, lVar);
    }

    public final z<T> E(l<Throwable, ? extends T> lVar) {
        if (lVar != null) {
            return new o(this, lVar, null);
        }
        throw new NullPointerException("resumeFunction is null");
    }

    public final z<T> F(T t) {
        if (t != null) {
            return new o(this, null, t);
        }
        throw new NullPointerException("value is null");
    }

    /* access modifiers changed from: protected */
    public abstract void G(b0<? super T> b0Var);

    public final z<T> H(y yVar) {
        if (yVar != null) {
            return new SingleSubscribeOn(this, yVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final z<T> I(long j, TimeUnit timeUnit) {
        return M(j, timeUnit, io.reactivex.schedulers.a.a(), null);
    }

    public final z<T> J(long j, TimeUnit timeUnit, y yVar) {
        return M(j, timeUnit, yVar, null);
    }

    public final z<T> K(long j, TimeUnit timeUnit, y yVar, d0<? extends T> d0Var) {
        return M(j, timeUnit, yVar, d0Var);
    }

    public final z<T> L(long j, TimeUnit timeUnit, d0<? extends T> d0Var) {
        return M(j, timeUnit, io.reactivex.schedulers.a.a(), d0Var);
    }

    public final g<T> N() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        return new SingleToFlowable(this);
    }

    public final l<T> O() {
        if (this instanceof io.reactivex.internal.fuseable.c) {
            return ((io.reactivex.internal.fuseable.c) this).b();
        }
        return new f(this);
    }

    public final s<T> P() {
        if (this instanceof d) {
            return ((d) this).a();
        }
        return new SingleToObservable(this);
    }

    public final T d() {
        io.reactivex.internal.observers.d dVar = new io.reactivex.internal.observers.d();
        subscribe(dVar);
        return (T) dVar.b();
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: io.reactivex.z<R>, io.reactivex.z<U> */
    public final <U> z<U> e(Class<? extends U> cls) {
        return (z<R>) A(Functions.c(cls));
    }

    public final <R> z<R> f(e0<? super T, ? extends R> e0Var) {
        if (e0Var != null) {
            d0<? extends R> a = e0Var.a(this);
            if (a == null) {
                throw new NullPointerException("source is null");
            } else if (a instanceof z) {
                return (z) a;
            } else {
                return new k(a);
            }
        } else {
            throw new NullPointerException("transformer is null");
        }
    }

    public final z<T> i(long j, TimeUnit timeUnit, y yVar, boolean z) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new io.reactivex.internal.operators.single.b(this, j, timeUnit, yVar, z);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final z<T> j(g<? super T> gVar) {
        return new io.reactivex.internal.operators.single.c(this, gVar);
    }

    public final z<T> k(io.reactivex.functions.a aVar) {
        return new io.reactivex.internal.operators.single.d(this, aVar);
    }

    public final z<T> l(io.reactivex.functions.a aVar) {
        return new SingleDoFinally(this, aVar);
    }

    public final z<T> m(g<? super Throwable> gVar) {
        if (gVar != null) {
            return new e(this, gVar);
        }
        throw new NullPointerException("onError is null");
    }

    public final z<T> n(io.reactivex.functions.b<? super T, ? super Throwable> bVar) {
        return new io.reactivex.internal.operators.single.f(this, bVar);
    }

    public final z<T> o(g<? super io.reactivex.disposables.b> gVar) {
        if (gVar != null) {
            return new io.reactivex.internal.operators.single.g(this, gVar);
        }
        throw new NullPointerException("onSubscribe is null");
    }

    public final z<T> p(g<? super T> gVar) {
        if (gVar != null) {
            return new io.reactivex.internal.operators.single.h(this, gVar);
        }
        throw new NullPointerException("onSuccess is null");
    }

    public final l<T> r(n<? super T> nVar) {
        return new io.reactivex.internal.operators.maybe.d(this, nVar);
    }

    public final <R> z<R> s(l<? super T, ? extends d0<? extends R>> lVar) {
        if (lVar != null) {
            return new SingleFlatMap(this, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final io.reactivex.disposables.b subscribe() {
        return subscribe(Functions.f(), Functions.e);
    }

    public final a t(l<? super T, ? extends e> lVar) {
        return new SingleFlatMapCompletable(this, lVar);
    }

    public final <R> l<R> u(l<? super T, ? extends p<? extends R>> lVar) {
        return new SingleFlatMapMaybe(this, lVar);
    }

    public final <R> s<R> v(l<? super T, ? extends v<? extends R>> lVar) {
        return new SingleFlatMapObservable(this, lVar);
    }

    public final <R> g<R> w(l<? super T, ? extends tpf<? extends R>> lVar) {
        return new SingleFlatMapPublisher(this, lVar);
    }

    public final <U> s<U> x(l<? super T, ? extends Iterable<? extends U>> lVar) {
        return new SingleFlatMapIterableObservable(this, lVar);
    }

    public final io.reactivex.disposables.b subscribe(io.reactivex.functions.b<? super T, ? super Throwable> bVar) {
        if (bVar != null) {
            BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(bVar);
            subscribe(biConsumerSingleObserver);
            return biConsumerSingleObserver;
        }
        throw new NullPointerException("onCallback is null");
    }

    public final io.reactivex.disposables.b subscribe(g<? super T> gVar) {
        return subscribe(gVar, Functions.e);
    }

    public final io.reactivex.disposables.b subscribe(g<? super T> gVar, g<? super Throwable> gVar2) {
        if (gVar == null) {
            throw new NullPointerException("onSuccess is null");
        } else if (gVar2 != null) {
            ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(gVar, gVar2);
            subscribe(consumerSingleObserver);
            return consumerSingleObserver;
        } else {
            throw new NullPointerException("onError is null");
        }
    }

    @Override // io.reactivex.d0
    public final void subscribe(b0<? super T> b0Var) {
        if (b0Var != null) {
            b0<? super T> k = io.reactivex.plugins.a.k(this, b0Var);
            io.reactivex.internal.functions.a.c(k, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            try {
                G(k);
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
