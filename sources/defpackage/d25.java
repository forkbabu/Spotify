package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.FollowFeedImpression;
import com.spotify.messages.FollowFeedInteraction;
import com.spotify.messages.FollowFeedSession;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.c1;
import defpackage.a35;
import defpackage.t25;
import defpackage.u25;
import java.util.UUID;
import kotlin.jvm.internal.h;

/* renamed from: d25  reason: default package */
public final class d25 implements c25 {
    private static final String d;
    private final c1 a = new c1(ViewUris.e.toString());
    private final ere b;
    private final gl0<u> c;

    static {
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "UUID.randomUUID().toString()");
        d = uuid;
    }

    public d25(ere ere, gl0<u> gl0) {
        h.e(ere, "eventLogger");
        h.e(gl0, "eventPublisher");
        this.b = ere;
        this.c = gl0;
    }

    private final void d(f25 f25) {
        gl0<u> gl0 = this.c;
        FollowFeedImpression.b o = FollowFeedImpression.o();
        o.p(d);
        o.q(f25.d());
        o.o(f25.c());
        String b2 = f25.b();
        if (b2 == null) {
            b2 = "";
        }
        o.m(b2);
        o.n(f25.a());
        gl0.c(o.build());
    }

    private final void e(g25 g25) {
        gl0<u> gl0 = this.c;
        FollowFeedInteraction.b n = FollowFeedInteraction.n();
        n.o(d);
        n.p(g25.c());
        n.n(g25.b());
        String a2 = g25.a();
        if (a2 == null) {
            a2 = "";
        }
        n.m(a2);
        gl0.c(n.build());
    }

    private final void f(i25 i25) {
        gl0<u> gl0 = this.c;
        FollowFeedSession.b m = FollowFeedSession.m();
        m.m(d);
        m.n(i25.a());
        m.o(i25.b());
        gl0.c(m.build());
    }

    @Override // defpackage.c25
    public void a(a35 a35) {
        h.e(a35, "event");
        if (h.a(a35, a35.c.a)) {
            f(h25.n());
        } else if (h.a(a35, a35.b.a)) {
            f(h25.i());
        } else if (h.a(a35, a35.a.a)) {
            f(h25.h());
        } else if (h.a(a35, a35.d.a)) {
            f(h25.o());
        }
    }

    @Override // defpackage.c25
    public void b(u25 u25) {
        h.e(u25, "event");
        if (h.a(u25, u25.b.a)) {
            e(h25.d());
            this.b.a(this.a.d().b().b().a());
        } else if (u25 instanceof u25.h) {
            u25.h hVar = (u25.h) u25;
            e(h25.a(hVar.a()));
            this.b.a(this.a.e(Integer.valueOf(hVar.b()), hVar.c()).b().b(hVar.a()).a(hVar.a()));
        } else if (u25 instanceof u25.g) {
            e(new g25("context-menu", "additional-artists-label", null));
            u25.g gVar = (u25.g) u25;
            this.b.a(this.a.e(Integer.valueOf(gVar.a()), gVar.b()).b().c().a());
        } else if (u25 instanceof u25.l) {
            u25.l lVar = (u25.l) u25;
            e(h25.e(lVar.b()));
            this.b.a(this.a.e(Integer.valueOf(lVar.a()), lVar.b()).d().b().c().a(lVar.b()));
        } else if (u25 instanceof u25.j) {
            u25.j jVar = (u25.j) u25;
            String b2 = jVar.b();
            h.e(b2, "entityUri");
            e(new g25("context-menu", "entity-context-menu-button", b2));
            this.b.a(this.a.e(Integer.valueOf(jVar.a()), jVar.b()).d().b().b().a());
        } else if (u25 instanceof u25.k) {
            e(new g25("album-expand", "entity-expand-button", null));
            u25.k kVar = (u25.k) u25;
            this.b.a(this.a.e(Integer.valueOf(kVar.a()), kVar.b()).d().c().a());
        } else if (u25 instanceof u25.i) {
            e(new g25("album-collapse", "entity-expand-button", null));
            u25.i iVar = (u25.i) u25;
            this.b.a(this.a.e(Integer.valueOf(iVar.a()), iVar.b()).d().c().a());
        } else if (u25 instanceof u25.n) {
            u25.n nVar = (u25.n) u25;
            String b3 = nVar.b();
            h.e(b3, "entityUri");
            e(new g25("play", "play-button", b3));
            this.b.a(this.a.e(Integer.valueOf(nVar.a()), nVar.b()).d().b().d().b(nVar.c()));
        } else if (u25 instanceof u25.m) {
            u25.m mVar = (u25.m) u25;
            String b4 = mVar.b();
            h.e(b4, "entityUri");
            e(new g25("play", "play-button", b4));
            this.b.a(this.a.e(Integer.valueOf(mVar.a()), mVar.b()).d().b().d().a(mVar.c()));
        } else if (u25 instanceof u25.o) {
            u25.o oVar = (u25.o) u25;
            String b5 = oVar.b();
            h.e(b5, "entityUri");
            e(new g25("play", "play-button", b5));
            this.b.a(this.a.e(Integer.valueOf(oVar.a()), oVar.b()).d().b().d().c(oVar.c()));
        } else if (u25 instanceof u25.q) {
            u25.q qVar = (u25.q) u25;
            String d2 = qVar.d();
            h.e(d2, "entityUri");
            e(new g25("play", "track-row", d2));
            this.b.a(this.a.e(Integer.valueOf(qVar.a()), qVar.b()).d().d(Integer.valueOf(qVar.c()), qVar.d()).c(qVar.d()));
        } else if (u25 instanceof u25.r) {
            u25.r rVar = (u25.r) u25;
            String d3 = rVar.d();
            h.e(d3, "trackUri");
            e(new g25("context-menu", "track-row-context-menu-button", d3));
            this.b.a(this.a.e(Integer.valueOf(rVar.a()), rVar.b()).d().d(Integer.valueOf(rVar.c()), rVar.d()).d());
        } else if (u25 instanceof u25.p) {
            u25.p pVar = (u25.p) u25;
            String d4 = pVar.d();
            h.e(d4, "trackUri");
            e(new g25("context-menu", "track-row-context-menu-button", d4));
            this.b.a(this.a.e(Integer.valueOf(pVar.a()), pVar.b()).d().d(Integer.valueOf(pVar.c()), pVar.d()).b().a());
        } else if (u25 instanceof u25.d) {
            u25.d dVar = (u25.d) u25;
            e(h25.b(dVar.b()));
            this.b.a(this.a.c(Integer.valueOf(dVar.c())).b().b(Integer.valueOf(dVar.a()), dVar.b()).b().a(dVar.b()));
        } else if (u25 instanceof u25.f) {
            u25.f fVar = (u25.f) u25;
            String b6 = fVar.b();
            h.e(b6, "artistUri");
            e(new g25("artist-recommendation-follow", "artist-recommendation-follow-button", b6));
            this.b.a(this.a.c(Integer.valueOf(fVar.c())).b().b(Integer.valueOf(fVar.a()), fVar.b()).d().a(fVar.b()));
        } else if (u25 instanceof u25.e) {
            u25.e eVar = (u25.e) u25;
            String b7 = eVar.b();
            h.e(b7, "artistUri");
            e(new g25("artist-recommendation-dismiss", "artist-recommendation-dismiss-button", b7));
            this.b.a(this.a.c(Integer.valueOf(eVar.c())).b().b(Integer.valueOf(eVar.a()), eVar.b()).c().a(eVar.b()));
        } else if (u25 instanceof u25.a) {
            u25.a aVar = (u25.a) u25;
            e(h25.e(aVar.a()));
            this.b.a(this.a.b(Integer.valueOf(aVar.b()), aVar.a()).b().a(aVar.a()));
        }
    }

    @Override // defpackage.c25
    public void c(t25 t25) {
        h.e(t25, "event");
        if (t25 instanceof t25.e) {
            t25.e eVar = (t25.e) t25;
            d(h25.k(eVar.a(), eVar.b()));
            this.b.a(this.a.e(Integer.valueOf(eVar.a()), eVar.b()).c());
        } else if (t25 instanceof t25.d) {
            this.b.a(this.a.c(Integer.valueOf(((t25.d) t25).a())).c());
        } else if (t25 instanceof t25.c) {
            t25.c cVar = (t25.c) t25;
            d(h25.j(cVar.a(), cVar.b()));
            this.b.a(this.a.c(Integer.valueOf(cVar.c())).b().b(Integer.valueOf(cVar.a()), cVar.b()).e());
        } else if (t25 instanceof t25.a) {
            t25.a aVar = (t25.a) t25;
            d(h25.c(aVar.b(), aVar.a()));
            this.b.a(this.a.b(Integer.valueOf(aVar.b()), aVar.a()).c());
        }
    }
}
