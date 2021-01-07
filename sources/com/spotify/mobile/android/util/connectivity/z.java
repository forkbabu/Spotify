package com.spotify.mobile.android.util.connectivity;

import io.reactivex.android.schedulers.a;
import io.reactivex.s;
import io.reactivex.t;

public class z extends y {
    private final v a;

    z(v vVar) {
        this.a = vVar;
    }

    @Override // com.spotify.mobile.android.util.connectivity.y
    public ConnectionType a() {
        return this.a.c();
    }

    @Override // com.spotify.mobile.android.util.connectivity.y
    public s<ConnectionType> b() {
        return s.y(new d(this)).I0(a.b());
    }

    public /* synthetic */ void c(t tVar) {
        b bVar = new b(tVar);
        this.a.e(bVar);
        tVar.e(new c(this, bVar));
        tVar.onNext(this.a.c());
    }

    public /* synthetic */ void d(a0 a0Var) {
        this.a.g(a0Var);
    }
}
