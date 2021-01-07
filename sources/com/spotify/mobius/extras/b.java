package com.spotify.mobius.extras;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;

public class b<M, E, F> implements MobiusLoop.i<M, E, F> {
    private static final xpf b = ypf.d(b.class);
    private final String a;

    private b(String str) {
        this.a = str;
    }

    public static <M, E, F> MobiusLoop.i<M, E, F> g(String str) {
        return new b(str);
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void a(M m, E e, e0<M, F> e0Var) {
        if (e0Var.c()) {
            b.b("Mobius ({}) - Model updated: {}", this.a, e0Var.e());
        }
        for (F f : e0Var.b()) {
            b.b("Mobius ({}) - Effect dispatched: {}", this.a, f);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void b(M m, E e, Throwable th) {
        b.error("FATAL ERROR: exception updating model '{}' with event '{}'", m, e, th);
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void c(M m, s<M, F> sVar) {
        b.b("Mobius ({}) - Loop initialized, starting from model: {}", this.a, sVar.d());
        for (F f : sVar.a()) {
            b.b("Mobius ({}) - Effect dispatched: {}", this.a, f);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void d(M m, Throwable th) {
        b.q("FATAL ERROR: exception during initialization from model {}", m, th);
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void e(M m, E e) {
        b.b("Mobius ({}) - Event received: {}", this.a, e);
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void f(M m) {
        b.r("Mobius ({}) - Initializing loop", this.a);
    }
}
