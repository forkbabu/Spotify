package com.spotify.mobius;

import com.spotify.mobius.p;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MobiusLoop<M, E, F> implements Object<M, E, F> {
    private final o<E> a;
    private final o<F> b;
    private final x<E> c;
    private final x<F> d;
    private final p<M, E, F> e;
    private final h<F> f;
    private final f0<M> g;
    private final List<da2<M>> h = new CopyOnWriteArrayList();
    private volatile M i;
    private volatile RunState j = RunState.RUNNING;

    /* access modifiers changed from: private */
    public enum RunState {
        RUNNING,
        DISPOSING,
        DISPOSED
    }

    class a implements da2<E> {
        a() {
        }

        @Override // defpackage.da2
        public void accept(E e) {
            MobiusLoop.this.e.b(e);
        }
    }

    class b implements da2<F> {
        b() {
        }

        @Override // defpackage.da2
        public void accept(F f) {
            try {
                MobiusLoop.this.f.accept(f);
            } catch (Throwable th) {
                throw new ConnectionException(f, th);
            }
        }
    }

    class c implements da2<M> {
        c() {
        }

        @Override // defpackage.da2
        public void accept(M m) {
            MobiusLoop.this.i = m;
            MobiusLoop.this.g.accept(m);
            for (E e : MobiusLoop.this.h) {
                e.accept(m);
            }
        }
    }

    class d implements da2<E> {
        d() {
        }

        @Override // defpackage.da2
        public void accept(E e) {
            MobiusLoop.this.h(e);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements w92 {
        final /* synthetic */ da2 a;

        e(da2 da2) {
            this.a = da2;
        }

        @Override // defpackage.w92
        public void dispose() {
            MobiusLoop.this.h.remove(this.a);
        }
    }

    public interface f<M, E, F> extends h<M, E, F> {
        f<M, E, F> b(fa2<ia2> fa2);

        f<M, E, F> c(q<E> qVar, q<E>... qVarArr);

        f<M, E, F> d(fa2<ia2> fa2);

        @Deprecated
        f<M, E, F> e(t<M, F> tVar);

        f<M, E, F> f(i<M, E, F> iVar);

        f<M, E, F> h(q<E> qVar);
    }

    public interface g<M, E> {
        void a(M m);

        M b();

        void c(g<M, E> gVar);

        void d();

        boolean isRunning();

        void start();

        void stop();
    }

    public interface h<M, E, F> {
        MobiusLoop<M, E, F> a(M m, Set<F> set);

        MobiusLoop<M, E, F> g(M m);
    }

    public interface i<M, E, F> {
        void a(M m, E e, e0<M, F> e0Var);

        void b(M m, E e, Throwable th);

        void c(M m, s<M, F> sVar);

        void d(M m, Throwable th);

        void e(M m, E e);

        void f(M m);
    }

    private MobiusLoop(p.a<M, E, F> aVar, M m, Iterable<F> iterable, g<F, E> gVar, g<M, E> gVar2, ia2 ia2, ia2 ia22) {
        o<E> c2 = o.c(new a());
        this.a = c2;
        o<F> c3 = o.c(new b());
        this.b = c3;
        this.g = new f0<>();
        c cVar = new c();
        this.c = new x<>(ia2, c2);
        x<F> xVar = new x<>(ia22, c3);
        this.d = xVar;
        this.e = aVar.a(xVar, cVar);
        d dVar = new d();
        this.f = gVar.t(dVar);
        this.i = m;
        cVar.accept(m);
        for (F f2 : iterable) {
            this.d.accept(f2);
        }
        this.g.b(gVar2.t(dVar));
    }

    static <M, E, F> MobiusLoop<M, E, F> g(g0<M, E, F> g0Var, M m, Iterable<F> iterable, g<F, E> gVar, g<M, E> gVar2, ia2 ia2, ia2 ia22) {
        m.getClass();
        p.a aVar = new p.a(d0.a(g0Var, m));
        iterable.getClass();
        gVar.getClass();
        gVar2.getClass();
        return new MobiusLoop<>(aVar, m, iterable, gVar, gVar2, ia2, ia22);
    }

    public synchronized void dispose() {
        RunState runState = this.j;
        RunState runState2 = RunState.DISPOSED;
        if (runState != runState2) {
            this.j = RunState.DISPOSING;
            this.h.clear();
            this.a.dispose();
            this.b.dispose();
            this.g.dispose();
            this.f.dispose();
            this.c.dispose();
            this.d.dispose();
            this.j = runState2;
        }
    }

    public void h(E e2) {
        if (this.j == RunState.DISPOSED) {
            throw new IllegalStateException(String.format("This loop has already been disposed. You cannot dispatch events after disposal - event received: %s=%s, currentModel: %s", e2.getClass().getName(), e2, this.i));
        } else if (this.j != RunState.DISPOSING) {
            try {
                x<E> xVar = this.c;
                e2.getClass();
                xVar.accept(e2);
            } catch (RuntimeException e3) {
                throw new IllegalStateException("Exception processing event: " + ((Object) e2), e3);
            }
        }
    }

    public M i() {
        return this.i;
    }

    public w92 j(da2<M> da2) {
        if (this.j == RunState.DISPOSED) {
            throw new IllegalStateException("This loop has already been disposed. You cannot observe a disposed loop");
        } else if (this.j == RunState.DISPOSING) {
            return d.a;
        } else {
            M m = this.i;
            if (m != null) {
                da2.accept(m);
            }
            List<da2<M>> list = this.h;
            da2.getClass();
            list.add(da2);
            return new e(da2);
        }
    }
}
