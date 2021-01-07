package defpackage;

import com.spotify.mobius.rx2.m;
import com.spotify.music.features.fullscreen.story.h;
import com.spotify.music.features.fullscreen.story.k;
import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger;
import com.spotify.music.features.fullscreen.story.p;
import com.spotify.music.features.fullscreen.story.q;
import com.spotify.music.libs.fullscreen.story.domain.g;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: fc5  reason: default package */
public final class fc5 {
    private final ic5 a;
    private final jc5 b;
    private final ec5 c;
    private final kc5 d;
    private final dc5 e;
    private final bc5 f;
    private final fd5 g;
    private final ed5 h;
    private final y i;
    private final y j;
    private final p k;
    private final h l;
    private final k m;
    private final FullscreenStoryLogger n;
    private final t o;

    public fc5(fd5 fd5, ic5 ic5, jc5 jc5, ec5 ec5, bc5 bc5, kc5 kc5, dc5 dc5, ed5 ed5, y yVar, y yVar2, p pVar, h hVar, k kVar, FullscreenStoryLogger fullscreenStoryLogger, t tVar) {
        this.g = fd5;
        this.a = ic5;
        this.b = jc5;
        this.c = ec5;
        this.d = kc5;
        this.e = dc5;
        this.f = bc5;
        this.h = ed5;
        this.i = yVar;
        this.j = yVar2;
        this.k = pVar;
        this.l = hVar;
        this.m = kVar;
        this.n = fullscreenStoryLogger;
        this.o = tVar;
    }

    public /* synthetic */ i a(g.j jVar) {
        this.h.b(jVar.a(), jVar.c());
        return new i.p(jVar.b());
    }

    public /* synthetic */ void b(g.o oVar) {
        this.f.a(oVar.a());
    }

    public /* synthetic */ void c(g.q qVar) {
        this.h.a(qVar.a());
    }

    public /* synthetic */ void d(g.d dVar) {
        ((q) this.k).b(dVar.a(), dVar.b());
    }

    public /* synthetic */ void e(g.l lVar) {
        ((q) this.k).c(lVar.a());
    }

    public /* synthetic */ void f(g.k kVar) {
        this.m.a(kVar.a());
    }

    public /* synthetic */ void g(g.f fVar) {
        this.n.a(fVar.a());
    }

    public /* synthetic */ void h(g.n nVar) {
        ((q) this.k).d(nVar.a());
    }

    public /* synthetic */ void i(g.m mVar) {
        ((com.spotify.music.features.fullscreen.story.i) this.l).b(mVar.a());
    }

    public /* synthetic */ void j(g.i iVar) {
        this.o.e(n.a(iVar.a()).a());
    }

    public w<g, i> k() {
        m f2 = com.spotify.mobius.rx2.i.f();
        ic5 ic5 = this.a;
        ic5.getClass();
        f2.h(g.e.class, new pb5(ic5));
        jc5 jc5 = this.b;
        jc5.getClass();
        f2.h(g.h.class, new ub5(jc5));
        kc5 kc5 = this.d;
        kc5.getClass();
        f2.h(g.p.class, new yb5(kc5));
        dc5 dc5 = this.e;
        dc5.getClass();
        f2.h(g.b.class, new wa5(dc5));
        ec5 ec5 = this.c;
        ec5.getClass();
        f2.h(g.c.class, new cb5(ec5));
        f2.g(g.j.class, new lb5(this), this.i);
        fd5 fd5 = this.g;
        fd5.getClass();
        f2.c(g.a.class, new ac5(fd5), this.i);
        fd5 fd52 = this.g;
        fd52.getClass();
        f2.c(g.C0290g.class, new ac5(fd52), this.i);
        f2.e(g.o.class, new fb5(this), this.i);
        f2.e(g.q.class, new ib5(this), this.i);
        f2.e(g.d.class, new hb5(this), this.i);
        f2.e(g.l.class, new kb5(this), this.i);
        f2.e(g.k.class, new nb5(this), this.j);
        f2.e(g.f.class, new jb5(this), this.j);
        f2.e(g.n.class, new mb5(this), this.i);
        f2.e(g.m.class, new gb5(this), this.i);
        f2.e(g.i.class, new eb5(this), this.i);
        return f2.i();
    }
}
