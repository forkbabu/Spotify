package com.spotify.voice.experiments.experience;

import androidx.activity.c;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.preview.v;
import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import com.spotify.voice.api.n;
import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;
import com.spotify.voice.experiments.experience.view.e1;
import defpackage.p2f;
import io.reactivex.android.schedulers.a;
import io.reactivex.g;
import io.reactivex.s;
import java.util.Set;

public class l {
    private final n a;
    private final ObjectMapper b;
    private final cte c;
    private final f d;
    private final d e;
    private final q7f f;
    private final a8f g;
    private final com.spotify.player.options.d h;
    private final p i;
    private final kqe j;
    private final w7f k;
    private final g<ugf> l;
    private final v m;
    private final p7f n;
    private final String o;
    private final Set<String> p;
    private final com.spotify.voice.api.l q;
    private final ExperimentsViewFactory.Experiment r;

    public l(n nVar, com.spotify.music.json.g gVar, cte cte, f fVar, d dVar, q7f q7f, a8f a8f, com.spotify.player.options.d dVar2, p pVar, kqe kqe, w7f w7f, g<ugf> gVar2, v vVar, p7f p7f, String str, Set<String> set, com.spotify.voice.api.l lVar, ExperimentsViewFactory.Experiment experiment) {
        this.a = nVar;
        this.b = gVar.a();
        this.c = cte;
        this.d = fVar;
        this.e = dVar;
        this.f = q7f;
        this.g = a8f;
        this.h = dVar2;
        this.i = pVar;
        this.j = kqe;
        this.k = w7f;
        this.l = gVar2;
        this.m = vVar;
        this.n = p7f;
        this.o = str;
        this.p = set;
        this.q = lVar;
        this.r = experiment;
    }

    public MobiusLoop.g<w2f, q2f> a(c cVar, e1 e1Var, w2f w2f, q<q2f> qVar) {
        n nVar = this.a;
        ObjectMapper objectMapper = this.b;
        cte cte = this.c;
        f fVar = this.d;
        d dVar = this.e;
        q7f q7f = this.f;
        q a2 = i.a(s.y(new m7f(cVar)));
        a8f a8f = this.g;
        com.spotify.player.options.d dVar2 = this.h;
        p pVar = this.i;
        kqe kqe = this.j;
        w7f w7f = this.k;
        q a3 = i.a(new io.reactivex.internal.operators.observable.v(this.l.O(l7f.a)));
        v vVar = this.m;
        p7f p7f = this.n;
        String str = this.o;
        com.spotify.voice.api.l lVar = this.q;
        Set<String> set = this.p;
        ExperimentsViewFactory.Experiment experiment = this.r;
        e eVar = e.a;
        m f2 = i.f();
        f2.h(p2f.d.class, new u5f(lVar));
        f2.h(p2f.t.class, new j4f(lVar, p7f, str, experiment, set));
        f2.h(p2f.a0.class, new m6f(nVar, objectMapper, e1Var, lVar));
        f2.h(p2f.z.class, d5f.a);
        f2.h(p2f.m.class, new g4f(cte));
        f2.h(p2f.j.class, new z5f(fVar, dVar, a8f));
        f2.h(p2f.k.class, new m3f(q7f, fVar, dVar, a8f));
        f2.h(p2f.b.class, new d4f(q7f));
        f2.h(p2f.h.class, new w4f(dVar, a8f, q7f));
        f2.h(p2f.q.class, new l6f(dVar, a8f, q7f));
        f2.h(p2f.b0.class, new g6f(dVar));
        f2.h(p2f.c0.class, new k5f(dVar, q7f));
        f2.h(p2f.x.class, new o3f(dVar2, q7f));
        f2.h(p2f.y.class, new z6f(fVar, a8f, q7f));
        f2.h(p2f.r.class, new p3f(dVar2, q7f));
        f2.h(p2f.s.class, new d6f(dVar2, q7f));
        f2.h(p2f.v.class, new d7f(dVar, a8f, q7f));
        f2.h(p2f.g0.class, new y6f(q7f, pVar));
        f2.h(p2f.f0.class, new t3f(q7f, pVar));
        f2.h(p2f.p.class, new a7f(kqe));
        f2.d(p2f.e.class, new u4f(w7f));
        f2.h(p2f.f.class, new i4f(q7f));
        f2.h(p2f.u.class, f6f.a);
        f2.h(p2f.l.class, new c6f(q7f, fVar, dVar, a8f));
        f2.h(p2f.n.class, new b4f(cte));
        f2.h(p2f.o.class, new k6f(vVar));
        f2.h(p2f.i.class, g5f.a);
        f2.e(p2f.d0.class, new c5f(vVar), a.b());
        f2.d(p2f.e0.class, new x4f(kqe));
        f2.h(p2f.a.class, new o5f(lVar, p7f, str, set));
        f2.h(p2f.c.class, new k3f(lVar, p7f, str, experiment, set));
        f2.h(p2f.w.class, new x3f(lVar, p7f, str, experiment, set));
        f2.h(p2f.g.class, new f7f(q7f));
        return z42.c(i.c(eVar, f2.i()).c(a2, qVar, a3).f(b.g("Voice-Exp")), w2f, d.a);
    }
}
