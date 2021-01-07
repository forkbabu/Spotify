package com.spotify.music.features.search.mobius;

import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.libs.search.view.l;

public class x0 implements g<w0, zya> {
    private final wg8 a;
    private final b61 b;
    private final z c;
    private final b0 f;
    private l.b n;
    private w0 o;

    class a implements h<w0> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            w0 w0Var = (w0) obj;
            x0.this.o = w0Var;
            x0.this.b.k(w0Var.a());
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            x0.this.a.q().q(x0.this.n);
            x0.this.n = null;
            x0.this.c.d(null);
        }
    }

    public x0(z zVar, b0 b0Var, wg8 wg8, b61 b61) {
        this.a = wg8;
        this.b = b61;
        this.c = zVar;
        this.f = b0Var;
    }

    @Override // com.spotify.mobius.g
    public h<w0> t(da2<zya> da2) {
        this.n = new m(da2);
        this.a.q().g(this.n);
        this.c.d(new y0(this, da2));
        return new a();
    }
}
