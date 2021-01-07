package com.spotify.music.nowplaying.common.view.header;

import com.google.common.base.MoreObjects;
import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.common.view.header.e;
import com.spotify.music.nowplaying.core.navcontext.f;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class c implements e.a {
    private final g<f> a;
    private final t b;
    private final erd c;
    private final asb d;
    private final p e = new p();
    private f f;
    private e g;

    public c(g<f> gVar, t tVar, erd erd, asb asb) {
        this.a = gVar;
        this.c = erd;
        this.b = tVar;
        this.d = asb;
    }

    public static void a(c cVar, f fVar) {
        cVar.f = fVar;
        cVar.g.d(cVar.d.e(fVar));
        String d2 = cVar.d.d(fVar);
        if (MoreObjects.isNullOrEmpty(d2)) {
            cVar.g.y();
        } else {
            cVar.g.z(d2);
        }
    }

    public void b() {
        f fVar = this.f;
        if (fVar != null && fVar.e()) {
            String a2 = this.f.a();
            this.c.s(a2);
            this.b.d(a2);
        }
    }

    public void c(e eVar) {
        eVar.getClass();
        this.g = eVar;
        eVar.setListener(this);
        this.e.b(this.a.subscribe(new a(this)));
    }

    public void d() {
        this.g.setListener(null);
        this.e.a();
    }
}
