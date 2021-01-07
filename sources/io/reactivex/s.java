package io.reactivex;

import com.coremedia.iso.boxes.FreeSpaceBox;
import io.reactivex.disposables.b;
import io.reactivex.functions.a;
import io.reactivex.functions.c;
import io.reactivex.functions.d;
import io.reactivex.functions.g;
import io.reactivex.functions.h;
import io.reactivex.functions.i;
import io.reactivex.functions.k;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.operators.observable.a0;
import io.reactivex.internal.operators.observable.b0;
import io.reactivex.internal.operators.observable.c0;
import io.reactivex.internal.operators.observable.e;
import io.reactivex.internal.operators.observable.f;
import io.reactivex.internal.operators.observable.f0;
import io.reactivex.internal.operators.observable.g0;
import io.reactivex.internal.operators.observable.j;
import io.reactivex.internal.operators.observable.j0;
import io.reactivex.internal.operators.observable.k0;
import io.reactivex.internal.operators.observable.m;
import io.reactivex.internal.operators.observable.m0;
import io.reactivex.internal.operators.observable.n0;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.internal.operators.observable.p;
import io.reactivex.internal.operators.observable.p0;
import io.reactivex.internal.operators.observable.q;
import io.reactivex.internal.operators.observable.q0;
import io.reactivex.internal.operators.observable.r;
import io.reactivex.internal.operators.observable.r0;
import io.reactivex.internal.operators.observable.s0;
import io.reactivex.internal.operators.observable.t;
import io.reactivex.internal.operators.observable.u;
import io.reactivex.internal.operators.observable.v0;
import io.reactivex.internal.operators.observable.w;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class s<T> implements v<T> {
    public static <T> s<T> B(Callable<? extends v<? extends T>> callable) {
        return new e(callable);
    }

    private s<T> K(g<? super T> gVar, g<? super Throwable> gVar2, a aVar, a aVar2) {
        if (gVar == null) {
            throw new NullPointerException("onNext is null");
        } else if (gVar2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar != null) {
            return new j(this, gVar, gVar2, aVar, aVar2);
        } else {
            throw new NullPointerException("onComplete is null");
        }
    }

    public static <T> s<T> M0(v<? extends v<? extends T>> vVar) {
        int i = g.a;
        if (vVar != null) {
            io.reactivex.internal.functions.a.d(i, "bufferSize");
            return new ObservableSwitchMap(vVar, Functions.g(), i, false);
        }
        throw new NullPointerException("sources is null");
    }

    public static <T> s<T> P(Throwable th) {
        if (th != null) {
            return new p(Functions.i(th));
        }
        throw new NullPointerException("exception is null");
    }

    private s<T> V0(long j, TimeUnit timeUnit, v<? extends T> vVar, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("timeUnit is null");
        } else if (yVar != null) {
            return new ObservableTimeoutTimed(this, j, timeUnit, yVar, vVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static s<Long> W0(long j, TimeUnit timeUnit) {
        return X0(j, timeUnit, io.reactivex.schedulers.a.a());
    }

    public static s<Long> X0(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new ObservableTimer(Math.max(j, 0L), timeUnit, yVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static <T> s<T> b0(T... tArr) {
        if (tArr == null) {
            throw new NullPointerException("items is null");
        } else if (tArr.length == 0) {
            return (s<T>) o.a;
        } else {
            if (tArr.length == 1) {
                return i0(tArr[0]);
            }
            return new io.reactivex.internal.operators.observable.s(tArr);
        }
    }

    public static <T> s<T> b1(v<T> vVar) {
        if (vVar == null) {
            throw new NullPointerException("source is null");
        } else if (vVar instanceof s) {
            return (s) vVar;
        } else {
            return new w(vVar);
        }
    }

    public static <T> s<T> c(v<? extends T>... vVarArr) {
        int length = vVarArr.length;
        if (length == 0) {
            return (s<T>) o.a;
        }
        if (length == 1) {
            return b1(vVarArr[0]);
        }
        return new ObservableAmb(vVarArr, null);
    }

    public static <T> s<T> c0(Callable<? extends T> callable) {
        return new t(callable);
    }

    public static <T1, T2, T3, R> s<R> c1(v<? extends T1> vVar, v<? extends T2> vVar2, v<? extends T3> vVar3, h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        return e1(Functions.n(hVar), false, g.a, vVar, vVar2, vVar3);
    }

    public static <T> s<T> d0(Iterable<? extends T> iterable) {
        if (iterable != null) {
            return new u(iterable);
        }
        throw new NullPointerException("source is null");
    }

    public static <T1, T2, R> s<R> d1(v<? extends T1> vVar, v<? extends T2> vVar2, c<? super T1, ? super T2, ? extends R> cVar) {
        if (vVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (vVar2 != null) {
            return e1(Functions.m(cVar), false, g.a, vVar, vVar2);
        } else {
            throw new NullPointerException("source2 is null");
        }
    }

    public static s<Long> e0(long j, long j2, TimeUnit timeUnit) {
        return f0(j, j2, timeUnit, io.reactivex.schedulers.a.a());
    }

    public static <T, R> s<R> e1(l<? super Object[], ? extends R> lVar, boolean z, int i, v<? extends T>... vVarArr) {
        if (vVarArr.length == 0) {
            return (s<R>) o.a;
        }
        io.reactivex.internal.functions.a.d(i, "bufferSize");
        return new ObservableZip(vVarArr, null, lVar, i, z);
    }

    public static s<Long> f0(long j, long j2, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new ObservableInterval(Math.max(0L, j), Math.max(0L, j2), timeUnit, yVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public static int g() {
        return g.a;
    }

    public static s<Long> g0(long j, TimeUnit timeUnit) {
        return f0(j, j, timeUnit, io.reactivex.schedulers.a.a());
    }

    public static s<Long> h0(long j, TimeUnit timeUnit, y yVar) {
        return f0(j, j, timeUnit, yVar);
    }

    public static <T> s<T> i0(T t) {
        if (t != null) {
            return new b0(t);
        }
        throw new NullPointerException("item is null");
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> s<R> j(v<? extends T1> vVar, v<? extends T2> vVar2, v<? extends T3> vVar3, v<? extends T4> vVar4, v<? extends T5> vVar5, v<? extends T6> vVar6, v<? extends T7> vVar7, v<? extends T8> vVar8, k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> kVar) {
        return o(Functions.q(kVar), g.a, vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8);
    }

    public static <T1, T2, T3, T4, T5, R> s<R> k(v<? extends T1> vVar, v<? extends T2> vVar2, v<? extends T3> vVar3, v<? extends T4> vVar4, v<? extends T5> vVar5, io.reactivex.functions.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        if (vVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (vVar2 == null) {
            throw new NullPointerException("source2 is null");
        } else if (vVar3 == null) {
            throw new NullPointerException("source3 is null");
        } else if (vVar4 == null) {
            throw new NullPointerException("source4 is null");
        } else if (vVar5 != null) {
            return o(Functions.p(jVar), g.a, vVar, vVar2, vVar3, vVar4, vVar5);
        } else {
            throw new NullPointerException("source5 is null");
        }
    }

    public static <T> s<T> k0(v<? extends T> vVar, v<? extends T> vVar2) {
        if (vVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (vVar2 != null) {
            return b0(vVar, vVar2).W(Functions.g(), false, 2);
        } else {
            throw new NullPointerException("source2 is null");
        }
    }

    public static <T1, T2, T3, T4, R> s<R> l(v<? extends T1> vVar, v<? extends T2> vVar2, v<? extends T3> vVar3, v<? extends T4> vVar4, i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        if (vVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (vVar2 == null) {
            throw new NullPointerException("source2 is null");
        } else if (vVar3 == null) {
            throw new NullPointerException("source3 is null");
        } else if (vVar4 != null) {
            return o(Functions.o(iVar), g.a, vVar, vVar2, vVar3, vVar4);
        } else {
            throw new NullPointerException("source4 is null");
        }
    }

    public static <T> s<T> l0(v<? extends T> vVar, v<? extends T> vVar2, v<? extends T> vVar3) {
        return b0(vVar, vVar2, vVar3).W(Functions.g(), false, 3);
    }

    public static <T1, T2, T3, R> s<R> m(v<? extends T1> vVar, v<? extends T2> vVar2, v<? extends T3> vVar3, h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        if (vVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (vVar2 == null) {
            throw new NullPointerException("source2 is null");
        } else if (vVar3 != null) {
            return o(Functions.n(hVar), g.a, vVar, vVar2, vVar3);
        } else {
            throw new NullPointerException("source3 is null");
        }
    }

    public static <T> s<T> m0(v<? extends T> vVar, v<? extends T> vVar2, v<? extends T> vVar3, v<? extends T> vVar4) {
        if (vVar != null) {
            return b0(vVar, vVar2, vVar3, vVar4).W(Functions.g(), false, 4);
        }
        throw new NullPointerException("source1 is null");
    }

    public static <T1, T2, R> s<R> n(v<? extends T1> vVar, v<? extends T2> vVar2, c<? super T1, ? super T2, ? extends R> cVar) {
        if (vVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (vVar2 != null) {
            return o(Functions.m(cVar), g.a, vVar, vVar2);
        } else {
            throw new NullPointerException("source2 is null");
        }
    }

    public static <T, R> s<R> o(l<? super Object[], ? extends R> lVar, int i, v<? extends T>... vVarArr) {
        if (vVarArr.length == 0) {
            return (s<R>) o.a;
        }
        io.reactivex.internal.functions.a.d(i, "bufferSize");
        return new ObservableCombineLatest(vVarArr, null, lVar, i << 1, false);
    }

    public static <T, R> s<R> p(Iterable<? extends v<? extends T>> iterable, l<? super Object[], ? extends R> lVar) {
        int i = g.a;
        if (iterable != null) {
            io.reactivex.internal.functions.a.d(i, "bufferSize");
            return new ObservableCombineLatest(null, iterable, lVar, i << 1, false);
        }
        throw new NullPointerException("sources is null");
    }

    public static <T> s<T> r(v<? extends v<? extends T>> vVar) {
        int i = g.a;
        io.reactivex.internal.functions.a.d(i, "prefetch");
        return new ObservableConcatMap(vVar, Functions.g(), i, ErrorMode.IMMEDIATE);
    }

    public static <T> s<T> s(v<? extends T> vVar, v<? extends T> vVar2) {
        if (vVar2 != null) {
            return u(vVar, vVar2);
        }
        throw new NullPointerException("source2 is null");
    }

    public static <T> s<T> t(Iterable<? extends v<? extends T>> iterable) {
        s d0 = d0(iterable);
        l g = Functions.g();
        int i = g.a;
        io.reactivex.internal.functions.a.d(i, "prefetch");
        if (!(d0 instanceof io.reactivex.internal.fuseable.h)) {
            return new ObservableConcatMap(d0, g, i, ErrorMode.BOUNDARY);
        }
        Object call = ((io.reactivex.internal.fuseable.h) d0).call();
        return call == null ? (s<T>) o.a : a0.b(call, g);
    }

    public static <T> s<T> u(v<? extends T>... vVarArr) {
        if (vVarArr.length == 0) {
            return (s<T>) o.a;
        }
        if (vVarArr.length == 1) {
            return b1(vVarArr[0]);
        }
        return new ObservableConcatMap(b0(vVarArr), Functions.g(), g.a, ErrorMode.BOUNDARY);
    }

    /* JADX DEBUG: Type inference failed for r5v5. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<java.lang.Integer> */
    public static s<Integer> u0(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(je.p0("count >= 0 required but it was ", i2));
        } else if (i2 == 0) {
            return o.a;
        } else {
            if (i2 == 1) {
                return i0(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return new ObservableRange(i, i2);
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    public static <T> s<T> v(v<? extends T>... vVarArr) {
        int i = g.a;
        s b0 = b0(vVarArr);
        l g = Functions.g();
        io.reactivex.internal.functions.a.d(i, "maxConcurrency");
        io.reactivex.internal.functions.a.d(i, "prefetch");
        return new ObservableConcatMapEager(b0, g, ErrorMode.BOUNDARY, i, i);
    }

    public static <T> s<T> y(u<T> uVar) {
        return new ObservableCreate(uVar);
    }

    public final s<T> A(T t) {
        if (t != null) {
            return new q0(this, i0(t));
        }
        throw new NullPointerException("defaultItem is null");
    }

    public final z<T> A0(T t) {
        return new m0(this, t);
    }

    public final z<T> B0() {
        return new m0(this, null);
    }

    public final s<T> C(long j, TimeUnit timeUnit, y yVar) {
        return D(j, timeUnit, yVar, false);
    }

    public final s<T> C0(long j) {
        return j <= 0 ? this : new n0(this, j);
    }

    public final s<T> D(long j, TimeUnit timeUnit, y yVar, boolean z) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new f(this, j, timeUnit, yVar, z);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final s<T> D0(n<? super T> nVar) {
        return new p0(this, nVar);
    }

    public final s<T> E() {
        return G(Functions.g());
    }

    public final s<T> E0(v<? extends T> vVar) {
        if (vVar != null) {
            return u(vVar, this);
        }
        throw new NullPointerException("other is null");
    }

    public final s<T> F(d<? super T, ? super T> dVar) {
        if (dVar != null) {
            return new io.reactivex.internal.operators.observable.i(this, Functions.g(), dVar);
        }
        throw new NullPointerException("comparer is null");
    }

    public final s<T> F0(Iterable<? extends T> iterable) {
        return u(d0(iterable), this);
    }

    public final <K> s<T> G(l<? super T, K> lVar) {
        return new io.reactivex.internal.operators.observable.i(this, lVar, io.reactivex.internal.functions.a.b());
    }

    public final s<T> G0(T t) {
        if (t != null) {
            return u(i0(t), this);
        }
        throw new NullPointerException("item is null");
    }

    public final s<T> H(a aVar) {
        if (aVar != null) {
            return K(Functions.f(), Functions.f(), Functions.c, aVar);
        }
        throw new NullPointerException("onFinally is null");
    }

    /* access modifiers changed from: protected */
    public abstract void H0(x<? super T> xVar);

    public final s<T> I(a aVar) {
        if (aVar != null) {
            return new ObservableDoFinally(this, aVar);
        }
        throw new NullPointerException("onFinally is null");
    }

    public final s<T> I0(y yVar) {
        if (yVar != null) {
            return new ObservableSubscribeOn(this, yVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final s<T> J(a aVar) {
        return K(Functions.f(), Functions.f(), aVar, Functions.c);
    }

    public final <R> s<R> J0(l<? super T, ? extends v<? extends R>> lVar) {
        int i = g.a;
        if (lVar != null) {
            io.reactivex.internal.functions.a.d(i, "bufferSize");
            if (!(this instanceof io.reactivex.internal.fuseable.h)) {
                return new ObservableSwitchMap(this, lVar, i, false);
            }
            Object call = ((io.reactivex.internal.fuseable.h) this).call();
            return call == null ? (s<R>) o.a : a0.b(call, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final a K0(l<? super T, ? extends e> lVar) {
        return new ObservableSwitchMapCompletable(this, lVar, false);
    }

    public final s<T> L(g<? super Throwable> gVar) {
        g<? super T> f = Functions.f();
        a aVar = Functions.c;
        return K(f, gVar, aVar, aVar);
    }

    public final <R> s<R> L0(l<? super T, ? extends d0<? extends R>> lVar) {
        return new ObservableSwitchMapSingle(this, lVar, false);
    }

    public final s<T> M(g<? super b> gVar, a aVar) {
        if (gVar == null) {
            throw new NullPointerException("onSubscribe is null");
        } else if (aVar != null) {
            return new io.reactivex.internal.operators.observable.k(this, gVar, aVar);
        } else {
            throw new NullPointerException("onDispose is null");
        }
    }

    public final s<T> N(g<? super T> gVar) {
        g<? super Throwable> f = Functions.f();
        a aVar = Functions.c;
        return K(gVar, f, aVar, aVar);
    }

    public final s<T> N0(long j) {
        if (j >= 0) {
            return new r0(this, j);
        }
        throw new IllegalArgumentException(je.t0("count >= 0 required but it was ", j));
    }

    public final s<T> O(a aVar) {
        return K(Functions.f(), Functions.a(aVar), aVar, Functions.c);
    }

    public final <U> s<T> O0(v<U> vVar) {
        if (vVar != null) {
            return new ObservableTakeUntil(this, vVar);
        }
        throw new NullPointerException("other is null");
    }

    public final s<T> P0(n<? super T> nVar) {
        return new s0(this, nVar);
    }

    public final s<T> Q(n<? super T> nVar) {
        if (nVar != null) {
            return new q(this, nVar);
        }
        throw new NullPointerException("predicate is null");
    }

    public final s<T> Q0(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new ObservableSampleTimed(this, j, timeUnit, yVar, false);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final z<T> R(T t) {
        if (t != null) {
            return new io.reactivex.internal.operators.observable.n(this, 0, t);
        }
        throw new NullPointerException("defaultItem is null");
    }

    public final s<T> R0(long j, TimeUnit timeUnit) {
        return V0(j, timeUnit, null, io.reactivex.schedulers.a.a());
    }

    public final l<T> S() {
        return new m(this, 0);
    }

    public final s<T> S0(long j, TimeUnit timeUnit, v<? extends T> vVar) {
        return V0(j, timeUnit, vVar, io.reactivex.schedulers.a.a());
    }

    public final z<T> T() {
        return new io.reactivex.internal.operators.observable.n(this, 0, null);
    }

    public final s<T> T0(long j, TimeUnit timeUnit, y yVar) {
        return V0(j, timeUnit, null, yVar);
    }

    public final <R> s<R> U(l<? super T, ? extends v<? extends R>> lVar, int i) {
        return X(lVar, false, i, g.a);
    }

    public final s<T> U0(long j, TimeUnit timeUnit, y yVar, v<? extends T> vVar) {
        return V0(j, timeUnit, vVar, yVar);
    }

    public final <U, R> s<R> V(l<? super T, ? extends v<? extends U>> lVar, c<? super T, ? super U, ? extends R> cVar) {
        int i = g.a;
        return X(a0.a(lVar, cVar), false, i, i);
    }

    public final <R> s<R> W(l<? super T, ? extends v<? extends R>> lVar, boolean z, int i) {
        return X(lVar, z, i, g.a);
    }

    public final <R> s<R> X(l<? super T, ? extends v<? extends R>> lVar, boolean z, int i, int i2) {
        if (lVar != null) {
            io.reactivex.internal.functions.a.d(i, "maxConcurrency");
            io.reactivex.internal.functions.a.d(i2, "bufferSize");
            if (!(this instanceof io.reactivex.internal.fuseable.h)) {
                return new ObservableFlatMap(this, lVar, z, i, i2);
            }
            Object call = ((io.reactivex.internal.fuseable.h) this).call();
            return call == null ? (s<R>) o.a : a0.b(call, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final a Y(l<? super T, ? extends e> lVar) {
        return new ObservableFlatMapCompletableCompletable(this, lVar, false);
    }

    public final g<T> Y0(BackpressureStrategy backpressureStrategy) {
        io.reactivex.internal.operators.flowable.o oVar = new io.reactivex.internal.operators.flowable.o(this);
        int ordinal = backpressureStrategy.ordinal();
        if (ordinal == 0) {
            return oVar;
        }
        if (ordinal == 1) {
            return new FlowableOnBackpressureError(oVar);
        }
        if (ordinal == 3) {
            return new FlowableOnBackpressureDrop(oVar);
        }
        if (ordinal != 4) {
            return oVar.R();
        }
        return new FlowableOnBackpressureLatest(oVar);
    }

    public final <U> s<U> Z(l<? super T, ? extends Iterable<? extends U>> lVar) {
        return new r(this, lVar);
    }

    public final z<List<T>> Z0() {
        io.reactivex.internal.functions.a.d(16, "capacityHint");
        return new v0(this, 16);
    }

    public final <R> s<R> a0(l<? super T, ? extends d0<? extends R>> lVar) {
        return new ObservableFlatMapSingle(this, lVar, false);
    }

    public final <U, R> s<R> a1(v<? extends U> vVar, c<? super T, ? super U, ? extends R> cVar) {
        if (vVar != null) {
            return new ObservableWithLatestFrom(this, cVar, vVar);
        }
        throw new NullPointerException("other is null");
    }

    public final T d() {
        io.reactivex.internal.observers.c cVar = new io.reactivex.internal.observers.c();
        subscribe(cVar);
        T t = (T) cVar.a();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    public final s<List<T>> e(int i, int i2) {
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        io.reactivex.internal.functions.a.d(i, "count");
        io.reactivex.internal.functions.a.d(i2, FreeSpaceBox.TYPE);
        return new ObservableBuffer(this, i, i2, arrayListSupplier);
    }

    public final <U, R> s<R> f1(v<? extends U> vVar, c<? super T, ? super U, ? extends R> cVar) {
        if (vVar != null) {
            return d1(this, vVar, cVar);
        }
        throw new NullPointerException("other is null");
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: io.reactivex.s<R>, io.reactivex.s<U> */
    public final <U> s<U> h(Class<U> cls) {
        return (s<R>) j0(Functions.c(cls));
    }

    public final <U> z<U> i(Callable<? extends U> callable, io.reactivex.functions.b<? super U, ? super T> bVar) {
        return new io.reactivex.internal.operators.observable.d(this, callable, bVar);
    }

    public final <R> s<R> j0(l<? super T, ? extends R> lVar) {
        if (lVar != null) {
            return new c0(this, lVar);
        }
        throw new NullPointerException("mapper is null");
    }

    public final s<T> n0(v<? extends T> vVar) {
        if (vVar != null) {
            return k0(this, vVar);
        }
        throw new NullPointerException("other is null");
    }

    public final s<T> o0(y yVar) {
        int i = g.a;
        if (yVar != null) {
            io.reactivex.internal.functions.a.d(i, "bufferSize");
            return new ObservableObserveOn(this, yVar, false, i);
        }
        throw new NullPointerException("scheduler is null");
    }

    public final s<T> p0(v<? extends T> vVar) {
        if (vVar != null) {
            return q0(Functions.j(vVar));
        }
        throw new NullPointerException("next is null");
    }

    public final <R> s<R> q(w<? super T, ? extends R> wVar) {
        if (wVar != null) {
            return b1(wVar.apply(this));
        }
        throw new NullPointerException("composer is null");
    }

    public final s<T> q0(l<? super Throwable, ? extends v<? extends T>> lVar) {
        return new f0(this, lVar, false);
    }

    public final s<T> r0(l<? super Throwable, ? extends T> lVar) {
        return new g0(this, lVar);
    }

    public final s<T> s0(T t) {
        if (t != null) {
            return r0(Functions.j(t));
        }
        throw new NullPointerException("item is null");
    }

    public final b subscribe() {
        return subscribe(Functions.f(), Functions.e, Functions.c, Functions.f());
    }

    public final <R> s<R> t0(l<? super s<T>, ? extends v<R>> lVar) {
        return new ObservablePublishSelector(this, lVar);
    }

    public final io.reactivex.observables.a<T> v0(int i) {
        io.reactivex.internal.functions.a.d(i, "bufferSize");
        return ObservableReplay.i1(this, i);
    }

    public final <R> s<R> w(l<? super T, ? extends v<? extends R>> lVar) {
        io.reactivex.internal.functions.a.d(2, "prefetch");
        if (!(this instanceof io.reactivex.internal.fuseable.h)) {
            return new ObservableConcatMap(this, lVar, 2, ErrorMode.IMMEDIATE);
        }
        Object call = ((io.reactivex.internal.fuseable.h) this).call();
        return call == null ? (s<R>) o.a : a0.b(call, lVar);
    }

    public final s<T> w0(l<? super s<Throwable>, ? extends v<?>> lVar) {
        if (lVar != null) {
            return new ObservableRetryWhen(this, lVar);
        }
        throw new NullPointerException("handler is null");
    }

    public final s<T> x(v<? extends T> vVar) {
        if (vVar != null) {
            return s(this, vVar);
        }
        throw new NullPointerException("other is null");
    }

    public final s<T> x0(c<T, T, T> cVar) {
        return new j0(this, cVar);
    }

    public final <R> s<R> y0(R r, c<R, ? super T, R> cVar) {
        if (r != null) {
            Callable i = Functions.i(r);
            if (cVar != null) {
                return new k0(this, i, cVar);
            }
            throw new NullPointerException("accumulator is null");
        }
        throw new NullPointerException("initialValue is null");
    }

    public final s<T> z(long j, TimeUnit timeUnit, y yVar) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            return new ObservableDebounceTimed(this, j, timeUnit, yVar);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    public final s<T> z0() {
        return ObservablePublish.i1(this).h1();
    }

    public final b subscribe(g<? super T> gVar) {
        return subscribe(gVar, Functions.e, Functions.c, Functions.f());
    }

    public final b subscribe(g<? super T> gVar, g<? super Throwable> gVar2) {
        return subscribe(gVar, gVar2, Functions.c, Functions.f());
    }

    public final b subscribe(g<? super T> gVar, g<? super Throwable> gVar2, a aVar) {
        return subscribe(gVar, gVar2, aVar, Functions.f());
    }

    public final b subscribe(g<? super T> gVar, g<? super Throwable> gVar2, a aVar, g<? super b> gVar3) {
        if (gVar == null) {
            throw new NullPointerException("onNext is null");
        } else if (gVar2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar == null) {
            throw new NullPointerException("onComplete is null");
        } else if (gVar3 != null) {
            LambdaObserver lambdaObserver = new LambdaObserver(gVar, gVar2, aVar, gVar3);
            subscribe(lambdaObserver);
            return lambdaObserver;
        } else {
            throw new NullPointerException("onSubscribe is null");
        }
    }

    @Override // io.reactivex.v
    public final void subscribe(x<? super T> xVar) {
        if (xVar != null) {
            try {
                x<? super T> j = io.reactivex.plugins.a.j(this, xVar);
                io.reactivex.internal.functions.a.c(j, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                H0(j);
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
            throw new NullPointerException("observer is null");
        }
    }
}
