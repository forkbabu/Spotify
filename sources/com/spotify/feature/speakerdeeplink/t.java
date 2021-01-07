package com.spotify.feature.speakerdeeplink;

import com.spotify.libs.connect.j;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.l0;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

class t implements s {
    private final g<PlayerState> a;
    private final j b;
    private final zr0 c;
    private final km0 d;
    private final q e;
    private final y f;
    private final q g = new q();

    t(g<PlayerState> gVar, j jVar, zr0 zr0, km0 km0, q qVar, y yVar) {
        this.a = gVar;
        this.b = jVar;
        this.c = zr0;
        this.d = km0;
        this.e = qVar;
        this.f = yVar;
    }

    public static void b(t tVar, GaiaDevice gaiaDevice) {
        tVar.e.a(false);
        tVar.c.c(gaiaDevice.getCosmosIdentifier());
        String physicalIdentifier = gaiaDevice.getPhysicalIdentifier();
        q qVar = tVar.g;
        l f2 = new l0(tVar.b.p(t.class.getSimpleName()).Q(new i(physicalIdentifier)).N(m.a).T0(10, TimeUnit.SECONDS, tVar.f).N0(1)).f(n.a);
        km0 km0 = tVar.d;
        km0.getClass();
        qVar.a(f2.subscribe(new c(km0)));
    }

    @Override // com.spotify.feature.speakerdeeplink.s
    public void a(String str) {
        q qVar = this.g;
        g<PlayerState> gVar = this.a;
        gVar.getClass();
        qVar.a(new l0(s.n(new v(gVar), this.b.m(t.class.getSimpleName()).Q(j.a).W(new e(str), false, Integer.MAX_VALUE), g.a).N0(1).N(d.a).Q(b.a).j0(a.a)).f(l.a).subscribe(new f(this)));
    }

    @Override // com.spotify.feature.speakerdeeplink.s
    public void stop() {
        this.e.a(true);
        this.g.c();
    }
}
