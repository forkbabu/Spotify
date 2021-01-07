package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.music.podcast.entity.adapter.description.f;
import com.spotify.music.podcast.entity.adapter.description.h;
import com.spotify.playlist.models.Show;
import defpackage.zhc;

public class u implements h.a, woa {
    private final j a;
    private final ajf<a> b;
    private final f.a c = new f.a();
    private final zhc.a d = new zhc.a();
    private final boolean e;
    private final c f;

    public interface a {
        void k(Class<? extends f.a> cls);
    }

    public u(j jVar, ajf<a> ajf, boolean z, c cVar) {
        this.a = jVar;
        this.b = ajf;
        this.e = z;
        this.f = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.spotify.music.features.podcast.entity.presentation.u$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.music.podcast.entity.adapter.description.h.a
    public void a() {
        this.c.m(true);
        this.b.get().k(this.c.getClass());
        this.a.b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.spotify.music.features.podcast.entity.presentation.u$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.music.podcast.entity.adapter.description.h.a
    public void b() {
        this.c.m(false);
        this.b.get().k(this.c.getClass());
        this.a.a();
    }

    @Override // defpackage.woa
    public void c(String str) {
        this.a.c(str);
    }

    public void d(qyd qyd, esc esc) {
        Show d2 = qyd.d();
        this.d.j(d2.getUri());
        this.d.i(d2.h());
        this.d.h(d2.k());
        this.d.g(this.e && d2.k());
        myd e2 = qyd.e();
        if (e2 == null || e2.b().isEmpty()) {
            this.c.l(false);
            this.c.k(d2.d());
        } else {
            this.c.l(true);
            this.c.k(e2.b());
        }
        this.c.n(d2.i());
        this.c.j(this.f.a());
        esc.b(this.d);
        esc.b(this.c);
    }
}
