package com.spotify.mobius.android;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.s;
import com.spotify.mobius.t;
import java.util.concurrent.atomic.AtomicBoolean;

public class g<M, E, F, V> extends e0 {
    private final u<M> c = new u<>();
    private final MutableLiveQueue<V> d;
    private final MobiusLoop<M, E, F> e;
    private final M f;
    private final AtomicBoolean g = new AtomicBoolean(true);

    protected g(ea2<da2<V>, MobiusLoop.h<M, E, F>> ea2, M m, t<M, F> tVar, ia2 ia2, int i) {
        this.d = new MutableLiveQueue<>(ia2, i);
        s<M, F> a = tVar.a(m);
        MobiusLoop<M, E, F> a2 = ea2.apply(new b(this)).a(a.d(), a.a());
        this.e = a2;
        this.f = a.d();
        a2.j(new a(this));
    }

    public static <M, E, F, V> g<M, E, F, V> g(ea2<da2<V>, MobiusLoop.h<M, E, F>> ea2, M m, t<M, F> tVar) {
        return new g<>(ea2, m, tVar, u92.b(), 100);
    }

    public static void k(g gVar, Object obj) {
        gVar.c.l(obj);
    }

    public static void l(g gVar, Object obj) {
        gVar.d.f(obj);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public final void e() {
        this.g.set(false);
        this.e.dispose();
    }

    public final void h(E e2) {
        if (this.g.get()) {
            this.e.h(e2);
        }
    }

    public final LiveData<M> i() {
        return this.c;
    }

    public final f<V> j() {
        return this.d;
    }
}
