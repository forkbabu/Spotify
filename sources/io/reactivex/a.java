package io.reactivex;

import io.reactivex.functions.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableDelay;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.c;
import io.reactivex.internal.operators.completable.d;
import io.reactivex.internal.operators.completable.e;
import io.reactivex.internal.operators.completable.j;
import io.reactivex.internal.operators.completable.l;
import io.reactivex.internal.operators.completable.m;
import io.reactivex.internal.operators.completable.n;
import io.reactivex.internal.operators.completable.o;
import io.reactivex.internal.operators.completable.p;
import io.reactivex.internal.operators.completable.q;
import io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable;
import io.reactivex.internal.operators.maybe.h;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.mixed.CompletableAndThenPublisher;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class a implements e {
    private a K(long j, TimeUnit timeUnit, y yVar, e eVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new n(this, j, timeUnit, yVar, eVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static a L(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new CompletableTimer(j, timeUnit, yVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static a Q(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("source is null");
        } else if (eVar instanceof a) {
            return (a) eVar;
        } else {
            return new j(eVar);
        }
    }

    public static a k(e... eVarArr) {
        if (eVarArr.length == 0) {
            return b.a;
        }
        if (eVarArr.length == 1) {
            return Q(eVarArr[0]);
        }
        return new CompletableConcatArray(eVarArr);
    }

    public static a m(d dVar) {
        return new CompletableCreate(dVar);
    }

    public static a n(Callable<? extends e> callable) {
        return new io.reactivex.internal.operators.completable.a(callable);
    }

    private a r(g<? super io.reactivex.disposables.b> gVar, g<? super Throwable> gVar2, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2, io.reactivex.functions.a aVar3, io.reactivex.functions.a aVar4) {
        if (gVar == null) {
            throw new NullPointerException("onSubscribe is null");
        } else if (gVar2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar != null) {
            return new m(this, gVar, gVar2, aVar, aVar2, aVar3, aVar4);
        } else {
            throw new NullPointerException("onComplete is null");
        }
    }

    public static a t(Throwable th) {
        if (th != null) {
            return new c(th);
        }
        throw new NullPointerException("error is null");
    }

    public static a u(io.reactivex.functions.a aVar) {
        if (aVar != null) {
            return new d(aVar);
        }
        throw new NullPointerException("run is null");
    }

    public static a v(Callable<?> callable) {
        return new e(callable);
    }

    public static <T> a w(p<T> pVar) {
        return new h(pVar);
    }

    public static a x(Runnable runnable) {
        if (runnable != null) {
            return new io.reactivex.internal.operators.completable.h(runnable);
        }
        throw new NullPointerException("run is null");
    }

    public static a y(Iterable<? extends e> iterable) {
        if (iterable != null) {
            return new CompletableMergeIterable(iterable);
        }
        throw new NullPointerException("sources is null");
    }

    public static a z(e... eVarArr) {
        if (eVarArr.length == 0) {
            return b.a;
        }
        if (eVarArr.length == 1) {
            return Q(eVarArr[0]);
        }
        return new CompletableMergeArray(eVarArr);
    }

    public final a A(y yVar) {
        if (yVar != null) {
            return new CompletableObserveOn(this, yVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final a B() {
        return C(Functions.b());
    }

    public final a C(io.reactivex.functions.n<? super Throwable> nVar) {
        return new l(this, nVar);
    }

    public final a D(io.reactivex.functions.l<? super Throwable, ? extends e> lVar) {
        return new CompletableResumeNext(this, lVar);
    }

    public final a E(e eVar) {
        return k(eVar, this);
    }

    /* access modifiers changed from: protected */
    public abstract void F(c cVar);

    public final a G(y yVar) {
        if (yVar != null) {
            return new CompletableSubscribeOn(this, yVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final a H(long j, TimeUnit timeUnit) {
        return K(j, timeUnit, io.reactivex.schedulers.a.a(), null);
    }

    public final a I(long j, TimeUnit timeUnit, e eVar) {
        return K(j, timeUnit, io.reactivex.schedulers.a.a(), eVar);
    }

    public final a J(long j, TimeUnit timeUnit, y yVar) {
        return K(j, timeUnit, yVar, null);
    }

    public final <T> g<T> M() {
        if (this instanceof io.reactivex.internal.fuseable.b) {
            return ((io.reactivex.internal.fuseable.b) this).c();
        }
        return new o(this);
    }

    public final <T> s<T> N() {
        if (this instanceof io.reactivex.internal.fuseable.d) {
            return ((io.reactivex.internal.fuseable.d) this).a();
        }
        return new p(this);
    }

    public final <T> z<T> O(Callable<? extends T> callable) {
        return new q(this, callable, null);
    }

    public final <T> z<T> P(T t) {
        if (t != null) {
            return new q(this, null, t);
        }
        throw new NullPointerException("completionValue is null");
    }

    public final a d(e eVar) {
        if (eVar != null) {
            return new CompletableAndThenCompletable(this, eVar);
        }
        throw new NullPointerException("next is null");
    }

    public final <T> g<T> e(tpf<T> tpf) {
        if (tpf != null) {
            return new CompletableAndThenPublisher(this, tpf);
        }
        throw new NullPointerException("next is null");
    }

    public final <T> l<T> f(p<T> pVar) {
        if (pVar != null) {
            return new MaybeDelayWithCompletable(pVar, this);
        }
        throw new NullPointerException("next is null");
    }

    public final <T> s<T> g(v<T> vVar) {
        if (vVar != null) {
            return new CompletableAndThenObservable(this, vVar);
        }
        throw new NullPointerException("next is null");
    }

    public final <T> z<T> h(d0<T> d0Var) {
        if (d0Var != null) {
            return new SingleDelayWithCompletable(d0Var, this);
        }
        throw new NullPointerException("next is null");
    }

    public final void i() {
        io.reactivex.internal.observers.d dVar = new io.reactivex.internal.observers.d();
        subscribe(dVar);
        dVar.b();
    }

    public final boolean j(long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            io.reactivex.internal.observers.d dVar = new io.reactivex.internal.observers.d();
            subscribe(dVar);
            return dVar.a(j, timeUnit);
        }
        throw new NullPointerException("unit is null");
    }

    public final a l(e eVar) {
        return new CompletableAndThenCompletable(this, eVar);
    }

    public final a o(long j, TimeUnit timeUnit) {
        y a = io.reactivex.schedulers.a.a();
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (a != null) {
            return new CompletableDelay(this, j, timeUnit, a, false);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final a p(io.reactivex.functions.a aVar) {
        g<? super io.reactivex.disposables.b> f = Functions.f();
        g<? super Throwable> f2 = Functions.f();
        io.reactivex.functions.a aVar2 = Functions.c;
        return r(f, f2, aVar, aVar2, aVar2, aVar2);
    }

    public final a q(g<? super Throwable> gVar) {
        g<? super io.reactivex.disposables.b> f = Functions.f();
        io.reactivex.functions.a aVar = Functions.c;
        return r(f, gVar, aVar, aVar, aVar, aVar);
    }

    public final a s(g<? super io.reactivex.disposables.b> gVar) {
        g<? super Throwable> f = Functions.f();
        io.reactivex.functions.a aVar = Functions.c;
        return r(gVar, f, aVar, aVar, aVar, aVar);
    }

    public final io.reactivex.disposables.b subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    @Override // io.reactivex.e
    public final void subscribe(c cVar) {
        if (cVar != null) {
            try {
                c h = io.reactivex.plugins.a.h(this, cVar);
                io.reactivex.internal.functions.a.c(h, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                F(h);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }

    public final io.reactivex.disposables.b subscribe(io.reactivex.functions.a aVar, g<? super Throwable> gVar) {
        if (gVar == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar != null) {
            CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(gVar, aVar);
            subscribe(callbackCompletableObserver);
            return callbackCompletableObserver;
        } else {
            throw new NullPointerException("onComplete is null");
        }
    }

    public final io.reactivex.disposables.b subscribe(io.reactivex.functions.a aVar) {
        if (aVar != null) {
            CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(aVar);
            subscribe(callbackCompletableObserver);
            return callbackCompletableObserver;
        }
        throw new NullPointerException("onComplete is null");
    }
}
