package com.spotify.music.connection;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.a0;
import com.spotify.mobile.android.util.connectivity.v;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.t;

public class o extends n {
    private final s<Boolean> a = s.y(new b(this)).E().z0();
    private final v b;

    o(v vVar) {
        this.b = vVar;
    }

    @Override // com.spotify.music.connection.n
    public s<Boolean> b() {
        return this.a.G0(Boolean.valueOf(this.b.c() != ConnectionType.CONNECTION_TYPE_NONE));
    }

    public /* synthetic */ void c(t tVar) {
        c cVar = new c(tVar);
        this.b.e(cVar);
        tVar.a(c.b(new d(this, cVar)));
    }

    public /* synthetic */ void d(a0 a0Var) {
        this.b.g(a0Var);
    }
}
