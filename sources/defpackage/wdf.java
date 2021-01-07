package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.libs.connect.j;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.e0;
import com.spotify.mobius.rx2.i;
import com.spotify.music.follow.m;
import com.spotify.music.json.g;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.v;
import com.spotify.superbird.earcon.a;
import com.spotify.voice.api.n;
import com.spotify.voice.external.experience.domain.model.b;
import defpackage.kef;
import io.reactivex.x;

/* renamed from: wdf  reason: default package */
public class wdf {
    private final n a;
    private final ObjectMapper b;
    private final d c;
    private final x<k9f> d;
    private final a e;
    private final f f;
    private final com.spotify.player.options.d g;
    private final p h;
    private final i9f i;
    private final xld j;
    private final m k;
    private final v l;
    private final com.spotify.playlist.endpoints.p m;
    private final zr0 n;
    private final j o;
    private final t92 p;
    private final cqe q;
    private final com.spotify.music.follow.resolver.f r;
    private final ppe s;
    private final boolean t;

    public wdf(n nVar, g gVar, d dVar, x<k9f> xVar, a aVar, f fVar, com.spotify.player.options.d dVar2, p pVar, i9f i9f, xld xld, m mVar, v vVar, com.spotify.playlist.endpoints.p pVar2, zr0 zr0, j jVar, t92 t92, cqe cqe, com.spotify.music.follow.resolver.f fVar2, ppe ppe, boolean z) {
        this.a = nVar;
        this.b = gVar.a();
        this.c = dVar;
        this.d = xVar;
        this.e = aVar;
        this.f = fVar;
        this.g = dVar2;
        this.h = pVar;
        this.i = i9f;
        this.j = xld;
        this.k = mVar;
        this.l = vVar;
        this.m = pVar2;
        this.n = zr0;
        this.o = jVar;
        this.p = t92;
        this.q = cqe;
        this.r = fVar2;
        this.s = ppe;
        this.t = z;
    }

    public static e0 b(wdf wdf, b bVar, lef lef) {
        return (e0) lef.c(new gef(bVar), new cef(bVar), new def(bVar), new hef(bVar), new jef(wdf.b, bVar), new fef(bVar), new ief(bVar), new eef(bVar));
    }

    public MobiusLoop.g<b, lef> a(b bVar, String str, wcf wcf, PlayerState playerState) {
        scf scf = new scf(this);
        n nVar = this.a;
        a aVar = this.e;
        f fVar = this.f;
        d dVar = this.c;
        com.spotify.player.options.d dVar2 = this.g;
        i9f i9f = this.i;
        xld xld = this.j;
        x<k9f> xVar = this.d;
        p pVar = this.h;
        m mVar = this.k;
        v vVar = this.l;
        com.spotify.playlist.endpoints.p pVar2 = this.m;
        zr0 zr0 = this.n;
        j jVar = this.o;
        t92 t92 = this.p;
        cqe cqe = this.q;
        com.spotify.music.follow.resolver.f fVar2 = this.r;
        ppe ppe = this.s;
        com.spotify.mobius.rx2.m f2 = i.f();
        f2.h(kef.u.class, new kbf(nVar));
        f2.h(kef.a.class, new naf(dVar, t92, wcf));
        f2.h(kef.h.class, new ecf(aVar));
        f2.h(kef.g.class, new oaf(jVar, zr0, fVar));
        f2.h(kef.s.class, new mcf(dVar2));
        f2.h(kef.t.class, new nbf(fVar));
        f2.h(kef.k.class, new paf(dVar2));
        f2.h(kef.l.class, new y9f(dVar2));
        f2.h(kef.e.class, new bbf(dVar));
        f2.h(kef.j.class, new saf(playerState, dVar));
        f2.h(kef.v.class, new bcf(dVar));
        f2.h(kef.m.class, new ubf(jVar, zr0, dVar));
        f2.h(kef.z.class, new raf(pVar));
        f2.h(kef.y.class, new gaf(pVar));
        f2.h(kef.r.class, new lbf(pVar));
        f2.h(kef.w.class, new eaf(i9f));
        f2.h(kef.i.class, new caf(xld));
        f2.h(kef.c.class, new vbf(mVar, fVar2));
        f2.h(kef.n.class, new iaf(i9f));
        f2.h(kef.o.class, new tbf(pVar2, vVar));
        f2.h(kef.d.class, new qaf(i9f));
        f2.h(kef.b.class, new dbf(t92));
        f2.h(kef.x.class, new ibf(t92));
        f2.h(kef.q.class, new hcf(playerState, cqe, dVar));
        f2.h(kef.p.class, new ocf(ppe));
        f2.d(kef.f.class, new jbf(xVar, str));
        return z42.b(i.c(scf, f2.i()).e(new rcf(playerState)).f(com.spotify.mobius.extras.b.g("ExternalVoice")), bVar.u(this.t));
    }
}
