package io.reactivex;

import io.reactivex.disposables.b;
import io.reactivex.functions.c;
import io.reactivex.functions.h;
import io.reactivex.functions.i;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowablePublishMulticast;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableUsing;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.flowable.d;
import io.reactivex.internal.operators.flowable.f;
import io.reactivex.internal.operators.flowable.j;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.internal.operators.flowable.l;
import io.reactivex.internal.operators.flowable.m;
import io.reactivex.internal.operators.flowable.n;
import io.reactivex.internal.operators.flowable.p;
import io.reactivex.internal.operators.flowable.s;
import io.reactivex.internal.operators.flowable.t;
import io.reactivex.internal.operators.flowable.w;
import io.reactivex.internal.operators.flowable.x;
import io.reactivex.internal.operators.flowable.z;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class g<T> implements tpf<T> {
    static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());
    public static final /* synthetic */ int b = 0;

    public static <T> g<T> B(Throwable th) {
        if (th != null) {
            return new l(Functions.i(th));
        }
        throw new NullPointerException("throwable is null");
    }

    public static <T> g<T> K(Callable<? extends T> callable) {
        return new n(callable);
    }

    public static <T> g<T> L(tpf<? extends T> tpf) {
        if (tpf instanceof g) {
            return (g) tpf;
        }
        if (tpf != null) {
            return new p(tpf);
        }
        throw new NullPointerException("source is null");
    }

    public static g<Long> M(long j, long j2, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new FlowableInterval(Math.max(0L, j), Math.max(0L, j2), timeUnit, yVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static <T> g<T> N(T t) {
        if (t != null) {
            return new s(t);
        }
        throw new NullPointerException("item is null");
    }

    public static <T> g<T> P(tpf<? extends T> tpf, tpf<? extends T> tpf2) {
        if (tpf == null) {
            throw new NullPointerException("source1 is null");
        } else if (tpf2 != null) {
            return new FlowableFromArray(new tpf[]{tpf, tpf2}).G(Functions.g(), false, 2, a);
        } else {
            throw new NullPointerException("source2 is null");
        }
    }

    public static int g() {
        return a;
    }

    public static <T, R> g<R> h(io.reactivex.functions.l<? super Object[], ? extends R> lVar, tpf<? extends T>... tpfArr) {
        int i = a;
        if (tpfArr.length == 0) {
            return (g<R>) k.c;
        }
        a.d(i, "bufferSize");
        return new FlowableCombineLatest(tpfArr, lVar, i, false);
    }

    public static <T1, T2, R> g<R> i(tpf<? extends T1> tpf, tpf<? extends T2> tpf2, c<? super T1, ? super T2, ? extends R> cVar) {
        if (tpf == null) {
            throw new NullPointerException("source1 is null");
        } else if (tpf2 != null) {
            return h(Functions.m(cVar), tpf, tpf2);
        } else {
            throw new NullPointerException("source2 is null");
        }
    }

    public static <T1, T2, T3, R> g<R> j(tpf<? extends T1> tpf, tpf<? extends T2> tpf2, tpf<? extends T3> tpf3, h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        if (tpf == null) {
            throw new NullPointerException("source1 is null");
        } else if (tpf2 == null) {
            throw new NullPointerException("source2 is null");
        } else if (tpf3 != null) {
            return h(Functions.n(hVar), tpf, tpf2, tpf3);
        } else {
            throw new NullPointerException("source3 is null");
        }
    }

    public static <T1, T2, T3, T4, R> g<R> k(tpf<? extends T1> tpf, tpf<? extends T2> tpf2, tpf<? extends T3> tpf3, tpf<? extends T4> tpf4, i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        if (tpf == null) {
            throw new NullPointerException("source1 is null");
        } else if (tpf2 == null) {
            throw new NullPointerException("source2 is null");
        } else if (tpf3 == null) {
            throw new NullPointerException("source3 is null");
        } else if (tpf4 != null) {
            return h(Functions.o(iVar), tpf, tpf2, tpf3, tpf4);
        } else {
            throw new NullPointerException("source4 is null");
        }
    }

    private g<T> l0(long j, TimeUnit timeUnit, tpf<? extends T> tpf, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("timeUnit is null");
        } else if (yVar != null) {
            return new FlowableTimeoutTimed(this, j, timeUnit, yVar, null);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static <T> g<T> m(tpf<? extends T> tpf, tpf<? extends T> tpf2) {
        if (tpf != null) {
            return n(tpf, tpf2);
        }
        throw new NullPointerException("source1 is null");
    }

    public static g<Long> m0(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new FlowableTimer(Math.max(0L, j), timeUnit, yVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static <T> g<T> n(tpf<? extends T>... tpfArr) {
        if (tpfArr.length == 0) {
            return (g<T>) k.c;
        }
        if (tpfArr.length == 1) {
            return L(tpfArr[0]);
        }
        return new FlowableConcatArray(tpfArr, false);
    }

    public static <T, D> g<T> n0(Callable<? extends D> callable, io.reactivex.functions.l<? super D, ? extends tpf<? extends T>> lVar, io.reactivex.functions.g<? super D> gVar) {
        return new FlowableUsing(callable, lVar, gVar, true);
    }

    public static <T> g<T> p(i<T> iVar, BackpressureStrategy backpressureStrategy) {
        if (iVar != null) {
            return new FlowableCreate(iVar, backpressureStrategy);
        }
        throw new NullPointerException("source is null");
    }

    private g<T> x(io.reactivex.functions.g<? super T> gVar, io.reactivex.functions.g<? super Throwable> gVar2, io.reactivex.functions.a aVar, io.reactivex.functions.a aVar2) {
        if (gVar == null) {
            throw new NullPointerException("onNext is null");
        } else if (gVar2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar != null) {
            return new io.reactivex.internal.operators.flowable.g(this, gVar, gVar2, aVar, aVar2);
        } else {
            throw new NullPointerException("onComplete is null");
        }
    }

    public final g<T> A(io.reactivex.functions.g<? super T> gVar) {
        io.reactivex.functions.g<? super Throwable> f = Functions.f();
        io.reactivex.functions.a aVar = Functions.c;
        return x(gVar, f, aVar, aVar);
    }

    public final g<T> C(io.reactivex.functions.n<? super T> nVar) {
        if (nVar != null) {
            return new m(this, nVar);
        }
        throw new NullPointerException("predicate is null");
    }

    public final z<T> D(T t) {
        if (t != null) {
            return new j(this, 0, t);
        }
        throw new NullPointerException("defaultItem is null");
    }

    public final z<T> E() {
        return new j(this, 0, null);
    }

    public final <R> g<R> F(io.reactivex.functions.l<? super T, ? extends tpf<? extends R>> lVar) {
        int i = a;
        return G(lVar, false, i, i);
    }

    public final <R> g<R> G(io.reactivex.functions.l<? super T, ? extends tpf<? extends R>> lVar, boolean z, int i, int i2) {
        if (lVar != null) {
            a.d(i, "maxConcurrency");
            a.d(i2, "bufferSize");
            if (!(this instanceof io.reactivex.internal.fuseable.h)) {
                return new FlowableFlatMap(this, lVar, z, i, i2);
            }
            Object call = ((io.reactivex.internal.fuseable.h) this).call();
            return call == null ? (g<R>) k.c : w.a(call, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final a H(io.reactivex.functions.l<? super T, ? extends e> lVar) {
        a.d(Integer.MAX_VALUE, "maxConcurrency");
        return new FlowableFlatMapCompletableCompletable(this, lVar, false, Integer.MAX_VALUE);
    }

    public final <U> g<U> I(io.reactivex.functions.l<? super T, ? extends Iterable<? extends U>> lVar) {
        int i = a;
        a.d(i, "bufferSize");
        return new FlowableFlattenIterable(this, lVar, i);
    }

    public final <R> g<R> J(io.reactivex.functions.l<? super T, ? extends d0<? extends R>> lVar) {
        if (lVar != null) {
            a.d(Integer.MAX_VALUE, "maxConcurrency");
            return new FlowableFlatMapSingle(this, lVar, false, Integer.MAX_VALUE);
        }
        throw new NullPointerException("mapper is null");
    }

    public final <R> g<R> O(io.reactivex.functions.l<? super T, ? extends R> lVar) {
        if (lVar != null) {
            return new t(this, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final g<T> Q(y yVar) {
        int i = a;
        if (yVar != null) {
            a.d(i, "bufferSize");
            return new FlowableObserveOn(this, yVar, false, i);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final g<T> R() {
        int i = a;
        a.d(i, "capacity");
        return new FlowableOnBackpressureBuffer(this, i, true, false, Functions.c);
    }

    public final g<T> S(io.reactivex.functions.l<? super Throwable, ? extends tpf<? extends T>> lVar) {
        return new FlowableOnErrorNext(this, lVar, false);
    }

    public final g<T> T(io.reactivex.functions.l<? super Throwable, ? extends T> lVar) {
        return new FlowableOnErrorReturn(this, lVar);
    }

    public final <R> g<R> U(io.reactivex.functions.l<? super g<T>, ? extends tpf<R>> lVar) {
        int i = a;
        a.d(i, "prefetch");
        return new FlowablePublishMulticast(this, lVar, i, false);
    }

    public final io.reactivex.flowables.a<T> V(int i) {
        a.d(i, "bufferSize");
        return FlowableReplay.s0(this, i);
    }

    public final g<T> W(long j, io.reactivex.functions.n<? super Throwable> nVar) {
        if (j >= 0) {
            return new FlowableRetryPredicate(this, j, nVar);
        }
        throw new IllegalArgumentException(je.t0("times >= 0 required but it was ", j));
    }

    public final g<T> X(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new FlowableSampleTimed(this, j, timeUnit, yVar, false);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final <R> g<R> Y(R r, c<R, ? super T, R> cVar) {
        if (r != null) {
            Callable i = Functions.i(r);
            if (cVar != null) {
                return new FlowableScanSeed(this, i, cVar);
            }
            throw new NullPointerException("accumulator is null");
        }
        throw new NullPointerException("initialValue is null");
    }

    public final g<T> Z() {
        int i = a;
        a.d(i, "bufferSize");
        return FlowablePublish.s0(this, i).r0();
    }

    public final z<T> a0() {
        return new x(this, null);
    }

    public final g<T> b0(T t) {
        if (t != null) {
            return n(N(t), this);
        }
        throw new NullPointerException("value is null");
    }

    public final g<T> c0(tpf<? extends T> tpf) {
        if (tpf != null) {
            return n(tpf, this);
        }
        throw new NullPointerException("other is null");
    }

    /* access modifiers changed from: protected */
    public abstract void d0(upf<? super T> upf);

    public final g<T> e0(y yVar) {
        if (yVar != null) {
            return new FlowableSubscribeOn(this, yVar, !(this instanceof FlowableCreate));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final <R> g<R> f0(io.reactivex.functions.l<? super T, ? extends tpf<? extends R>> lVar) {
        int i = a;
        a.d(i, "bufferSize");
        if (!(this instanceof io.reactivex.internal.fuseable.h)) {
            return new FlowableSwitchMap(this, lVar, i, false);
        }
        Object call = ((io.reactivex.internal.fuseable.h) this).call();
        return call == null ? (g<R>) k.c : w.a(call, lVar);
    }

    public final <R> g<R> g0(io.reactivex.functions.l<? super T, ? extends d0<? extends R>> lVar) {
        if (lVar != null) {
            return new FlowableSwitchMapSingle(this, lVar, false);
        }
        throw new NullPointerException("mapper is null");
    }

    public final g<T> h0(long j) {
        if (j >= 0) {
            return new FlowableTake(this, j);
        }
        throw new IllegalArgumentException(je.t0("count >= 0 required but it was ", j));
    }

    public final g<T> i0(io.reactivex.functions.n<? super T> nVar) {
        return new z(this, nVar);
    }

    public final g<T> j0(long j, TimeUnit timeUnit) {
        return l0(j, timeUnit, null, io.reactivex.schedulers.a.a());
    }

    public final g<T> k0(long j, TimeUnit timeUnit, y yVar) {
        return l0(j, timeUnit, null, yVar);
    }

    public final <R> g<R> l(k<? super T, ? extends R> kVar) {
        if (kVar != null) {
            return L(kVar.a(this));
        }
        throw new NullPointerException("composer is null");
    }

    public final <R> g<R> o(io.reactivex.functions.l<? super T, ? extends tpf<? extends R>> lVar) {
        int i = a;
        a.d(i, "maxConcurrency");
        a.d(i, "prefetch");
        return new FlowableConcatMapEager(this, lVar, i, i, ErrorMode.IMMEDIATE);
    }

    public final <U, R> g<R> o0(tpf<? extends U> tpf, c<? super T, ? super U, ? extends R> cVar) {
        if (tpf != null) {
            return new FlowableWithLatestFrom(this, cVar, tpf);
        }
        throw new NullPointerException("other is null");
    }

    public final <U, R> g<R> p0(tpf<? extends U> tpf, c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.functions.l m = Functions.m(cVar);
        int i = a;
        tpf[] tpfArr = {this, tpf};
        a.d(i, "bufferSize");
        return new FlowableZip(tpfArr, null, m, i, false);
    }

    public final g<T> q(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new FlowableDebounceTimed(this, j, timeUnit, yVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final g<T> r(long j, TimeUnit timeUnit, y yVar, boolean z) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new d(this, Math.max(0L, j), timeUnit, yVar, z);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final g<T> s() {
        return u(Functions.g());
    }

    public final b subscribe() {
        return subscribe(Functions.f(), Functions.e, Functions.c, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    public final g<T> t(io.reactivex.functions.d<? super T, ? super T> dVar) {
        return new f(this, Functions.g(), dVar);
    }

    public final <K> g<T> u(io.reactivex.functions.l<? super T, K> lVar) {
        if (lVar != null) {
            return new f(this, lVar, a.b());
        }
        throw new NullPointerException("keySelector is null");
    }

    public final g<T> v(io.reactivex.functions.a aVar) {
        return new FlowableDoFinally(this, aVar);
    }

    public final g<T> w(io.reactivex.functions.a aVar) {
        return x(Functions.f(), Functions.f(), aVar, Functions.c);
    }

    public final g<T> y(io.reactivex.functions.g<? super Throwable> gVar) {
        io.reactivex.functions.g<? super T> f = Functions.f();
        io.reactivex.functions.a aVar = Functions.c;
        return x(f, gVar, aVar, aVar);
    }

    public final g<T> z(io.reactivex.functions.g<? super vpf> gVar, io.reactivex.functions.m mVar, io.reactivex.functions.a aVar) {
        if (gVar == null) {
            throw new NullPointerException("onSubscribe is null");
        } else if (aVar != null) {
            return new io.reactivex.internal.operators.flowable.h(this, gVar, mVar, aVar);
        } else {
            throw new NullPointerException("onCancel is null");
        }
    }

    public final b subscribe(io.reactivex.functions.g<? super T> gVar) {
        return subscribe(gVar, Functions.e, Functions.c, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    public final b subscribe(io.reactivex.functions.g<? super T> gVar, io.reactivex.functions.g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, Functions.c, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    public final b subscribe(io.reactivex.functions.g<? super T> gVar, io.reactivex.functions.g<? super Throwable> gVar2, io.reactivex.functions.a aVar) {
        return subscribe(gVar, gVar2, aVar, FlowableInternalHelper$RequestMax.INSTANCE);
    }

    public final b subscribe(io.reactivex.functions.g<? super T> gVar, io.reactivex.functions.g<? super Throwable> gVar2, io.reactivex.functions.a aVar, io.reactivex.functions.g<? super vpf> gVar3) {
        if (gVar == null) {
            throw new NullPointerException("onNext is null");
        } else if (gVar2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar == null) {
            throw new NullPointerException("onComplete is null");
        } else if (gVar3 != null) {
            LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(gVar, gVar2, aVar, gVar3);
            subscribe((j) lambdaSubscriber);
            return lambdaSubscriber;
        } else {
            throw new NullPointerException("onSubscribe is null");
        }
    }

    @Override // defpackage.tpf
    public final void subscribe(upf<? super T> upf) {
        if (upf instanceof j) {
            subscribe((j) ((j) upf));
        } else if (upf != null) {
            subscribe((j) new StrictSubscriber(upf));
        } else {
            throw new NullPointerException("s is null");
        }
    }

    public final void subscribe(j<? super T> jVar) {
        if (jVar != null) {
            try {
                upf<? super T> l = io.reactivex.plugins.a.l(this, jVar);
                a.c(l, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                d0(l);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                yif.V(th);
                io.reactivex.plugins.a.g(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("s is null");
        }
    }
}
