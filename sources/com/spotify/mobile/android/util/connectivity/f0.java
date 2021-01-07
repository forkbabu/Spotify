package com.spotify.mobile.android.util.connectivity;

import io.reactivex.s;
import io.reactivex.t;

public final class f0 extends e0 {
    private final v a;

    f0(v vVar) {
        this.a = vVar;
    }

    @Override // com.spotify.mobile.android.util.connectivity.e0
    public s<Boolean> a() {
        return b().j0(i.a).E();
    }

    @Override // com.spotify.mobile.android.util.connectivity.e0
    public s<ConnectionType> b() {
        return s.y(new k(this)).E();
    }

    @Override // com.spotify.mobile.android.util.connectivity.e0
    public ConnectionType c() {
        return this.a.c();
    }

    @Override // com.spotify.mobile.android.util.connectivity.e0
    public boolean d() {
        return this.a.c() != ConnectionType.CONNECTION_TYPE_NONE;
    }

    public /* synthetic */ void e(t tVar) {
        j jVar = new j(tVar);
        tVar.e(new h(this, jVar));
        tVar.onNext(this.a.c());
        this.a.e(jVar);
    }

    public /* synthetic */ void f(a0 a0Var) {
        this.a.g(a0Var);
    }
}
