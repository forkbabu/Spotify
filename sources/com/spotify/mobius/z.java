package com.spotify.mobius;

import com.spotify.mobius.MobiusLoop;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class z {
    private static final MobiusLoop.i<?, ?, ?> a = new a();
    public static final /* synthetic */ int b = 0;

    class a implements MobiusLoop.i<Object, Object, Object> {
        a() {
        }

        @Override // com.spotify.mobius.MobiusLoop.i
        public void a(Object obj, Object obj2, e0<Object, Object> e0Var) {
        }

        @Override // com.spotify.mobius.MobiusLoop.i
        public void b(Object obj, Object obj2, Throwable th) {
            PrintStream printStream = System.err;
            printStream.println("error updating model: '" + obj + "' with event: '" + obj2 + "' - " + th);
            th.printStackTrace(System.err);
        }

        @Override // com.spotify.mobius.MobiusLoop.i
        public void c(Object obj, s<Object, Object> sVar) {
        }

        @Override // com.spotify.mobius.MobiusLoop.i
        public void d(Object obj, Throwable th) {
            PrintStream printStream = System.err;
            printStream.println("error initialising from model: '" + obj + "' - " + th);
            th.printStackTrace(System.err);
        }

        @Override // com.spotify.mobius.MobiusLoop.i
        public void e(Object obj, Object obj2) {
        }

        @Override // com.spotify.mobius.MobiusLoop.i
        public void f(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements fa2<ia2> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.fa2
        public ia2 get() {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(d.h);
            newSingleThreadExecutor.getClass();
            return new ga2(newSingleThreadExecutor);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements fa2<ia2> {
        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.fa2
        public ia2 get() {
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(d.h);
            newCachedThreadPool.getClass();
            return new ga2(newCachedThreadPool);
        }
    }

    /* access modifiers changed from: private */
    public static final class d<M, E, F> implements MobiusLoop.f<M, E, F> {
        private static final a h = new a(null);
        private final g0<M, E, F> a;
        private final g<F, E> b;
        private final t<M, F> c;
        private final g<M, E> d;
        private final fa2<ia2> e;
        private final fa2<ia2> f;
        private final MobiusLoop.i<M, E, F> g;

        /* access modifiers changed from: private */
        public static class a implements ThreadFactory {
            private static final AtomicLong a = new AtomicLong(0);

            a(y yVar) {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
                runnable.getClass();
                Thread newThread = defaultThreadFactory.newThread(runnable);
                newThread.setName(String.format(Locale.ENGLISH, "mobius-thread-%d", Long.valueOf(a.incrementAndGet())));
                return newThread;
            }
        }

        /* synthetic */ d(g0 g0Var, g gVar, t tVar, g gVar2, MobiusLoop.i iVar, fa2 fa2, fa2 fa22, y yVar) {
            this(g0Var, gVar, null, gVar2, iVar, fa2, fa22);
        }

        private MobiusLoop<M, E, F> j(M m, Set<F> set) {
            v vVar = new v(this.a, this.g);
            g<F, E> gVar = this.b;
            g<M, E> gVar2 = this.d;
            ia2 ia2 = this.e.get();
            ia2.getClass();
            ia2 ia22 = this.f.get();
            ia22.getClass();
            return MobiusLoop.g(vVar, m, set, gVar, gVar2, ia2, ia22);
        }

        @Override // com.spotify.mobius.MobiusLoop.h
        public MobiusLoop<M, E, F> a(M m, Set<F> set) {
            if (this.c == null) {
                return j(m, set);
            }
            throw new IllegalArgumentException("cannot pass in start effects when a loop has init defined");
        }

        @Override // com.spotify.mobius.MobiusLoop.f
        public MobiusLoop.f<M, E, F> b(fa2<ia2> fa2) {
            return new d(this.a, this.b, this.c, this.d, this.g, this.e, fa2);
        }

        @Override // com.spotify.mobius.MobiusLoop.f
        public MobiusLoop.f<M, E, F> c(q<E> qVar, q<E>... qVarArr) {
            return new d(this.a, this.b, this.c, r.a(w.b(qVar, qVarArr)), this.g, this.e, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.f
        public MobiusLoop.f<M, E, F> d(fa2<ia2> fa2) {
            return new d(this.a, this.b, this.c, this.d, this.g, fa2, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.f
        public MobiusLoop.f<M, E, F> e(t<M, F> tVar) {
            return new d(this.a, this.b, tVar, this.d, this.g, this.e, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.f
        public MobiusLoop.f<M, E, F> f(MobiusLoop.i<M, E, F> iVar) {
            return new d(this.a, this.b, this.c, this.d, iVar, this.e, this.f);
        }

        @Override // com.spotify.mobius.MobiusLoop.h
        public MobiusLoop<M, E, F> g(M m) {
            Set<F> emptySet = Collections.emptySet();
            t<M, F> tVar = this.c;
            if (tVar != null) {
                u uVar = new u(tVar, this.g);
                m.getClass();
                s<M, F> a2 = uVar.a(m);
                M d2 = a2.d();
                emptySet = a2.a();
                m = d2;
            }
            return j(m, emptySet);
        }

        @Override // com.spotify.mobius.MobiusLoop.f
        public MobiusLoop.f<M, E, F> h(q<E> qVar) {
            return new d(this.a, this.b, this.c, r.a(qVar), this.g, this.e, this.f);
        }

        private d(g0<M, E, F> g0Var, g<F, E> gVar, t<M, F> tVar, g<M, E> gVar2, MobiusLoop.i<M, E, F> iVar, fa2<ia2> fa2, fa2<ia2> fa22) {
            g0Var.getClass();
            this.a = g0Var;
            gVar.getClass();
            this.b = gVar;
            this.c = tVar;
            gVar2.getClass();
            this.d = gVar2;
            fa2.getClass();
            this.e = fa2;
            fa22.getClass();
            this.f = fa22;
            iVar.getClass();
            this.g = iVar;
        }
    }

    public static <M, E, F> MobiusLoop.g<M, E> a(MobiusLoop.h<M, E, F> hVar, M m, t<M, F> tVar, ia2 ia2) {
        return new b0(hVar, m, tVar, ia2);
    }

    public static <M, E, F> MobiusLoop.g<M, E> b(MobiusLoop.h<M, E, F> hVar, M m, ia2 ia2) {
        return new b0(hVar, m, null, ia2);
    }

    public static <M, E, F> MobiusLoop.f<M, E, F> c(g0<M, E, F> g0Var, g<F, E> gVar) {
        return new d(g0Var, gVar, null, b.a, a, new b(), new c(), null);
    }
}
