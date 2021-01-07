package com.spotify.mobius.rx2;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.g;
import com.spotify.mobius.g0;
import com.spotify.mobius.h;
import com.spotify.mobius.q;
import com.spotify.mobius.z;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Set;

public final class i {

    /* access modifiers changed from: package-private */
    public class a implements g<I, O> {
        final /* synthetic */ w a;

        /* renamed from: com.spotify.mobius.rx2.i$a$a  reason: collision with other inner class name */
        class C0204a implements io.reactivex.functions.g<O> {
            final /* synthetic */ da2 a;

            C0204a(a aVar, da2 da2) {
                this.a = da2;
            }

            @Override // io.reactivex.functions.g
            public void accept(O o) {
                this.a.accept(o);
            }
        }

        class b implements io.reactivex.functions.g<Throwable> {
            b(a aVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.g
            public void accept(Throwable th) {
                io.reactivex.plugins.a.g(th);
            }
        }

        class c implements io.reactivex.functions.a {
            c(a aVar) {
            }

            @Override // io.reactivex.functions.a
            public void run() {
            }
        }

        class d implements h<I> {
            final /* synthetic */ PublishSubject a;
            final /* synthetic */ io.reactivex.disposables.b b;

            d(a aVar, PublishSubject publishSubject, io.reactivex.disposables.b bVar) {
                this.a = publishSubject;
                this.b = bVar;
            }

            @Override // com.spotify.mobius.h, defpackage.da2
            public void accept(I i) {
                this.a.onNext(i);
            }

            @Override // com.spotify.mobius.h, defpackage.w92
            public void dispose() {
                this.b.dispose();
            }
        }

        a(w wVar) {
            this.a = wVar;
        }

        @Override // com.spotify.mobius.g
        public h<I> t(da2<O> da2) {
            PublishSubject h1 = PublishSubject.h1();
            return new d(this, h1, h1.q(this.a).subscribe(new C0204a(this, da2), new b(this), new c(this)));
        }
    }

    @SafeVarargs
    public static <E> q<E> a(v<E>... vVarArr) {
        return new j(s.b0(vVarArr).U(Functions.g(), vVarArr.length));
    }

    public static <I, O> g<I, O> b(w<I, O> wVar) {
        return new b(new a(wVar));
    }

    public static <M, E, F> MobiusLoop.f<M, E, F> c(g0<M, E, F> g0Var, w<F, E> wVar) {
        wVar.getClass();
        return z.c(g0Var, new b(new a(wVar)));
    }

    public static <M, E, F> w<E, M> d(MobiusLoop.h<M, E, F> hVar, M m) {
        return new n(hVar, m, null);
    }

    public static <M, E, F> w<E, M> e(MobiusLoop.h<M, E, F> hVar, M m, Set<F> set) {
        return new n(hVar, m, set);
    }

    public static <F, E> m<F, E> f() {
        return new m<>(null);
    }

    public static <E> s<E> g(q<E> qVar) {
        return s.y(new k(qVar));
    }
}
