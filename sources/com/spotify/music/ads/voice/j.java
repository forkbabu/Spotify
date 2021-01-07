package com.spotify.music.ads.voice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.u;
import com.spotify.cosmos.playback.PlaybackClient;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.m;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.api.i;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import com.spotify.voice.api.n;
import io.reactivex.g;
import io.reactivex.schedulers.a;
import io.reactivex.y;

public final class j implements fjf<MobiusLoop.h<v, s, r>> {
    private final wlf<f> a;
    private final wlf<lxd> b;
    private final wlf<d> c;
    private final wlf<g<PlayerState>> d;
    private final wlf<PlaybackClient> e;
    private final wlf<cqe> f;
    private final wlf<kv3> g;
    private final wlf<n> h;
    private final wlf<SlotApi> i;
    private final wlf<gl0<u>> j;
    private final wlf<md2> k;
    private final wlf<i> l;
    private final wlf<com.spotify.music.json.g> m;
    private final wlf<sd2> n;
    private final wlf<us3> o;
    private final wlf<io.reactivex.s<Boolean>> p;

    public j(wlf<f> wlf, wlf<lxd> wlf2, wlf<d> wlf3, wlf<g<PlayerState>> wlf4, wlf<PlaybackClient> wlf5, wlf<cqe> wlf6, wlf<kv3> wlf7, wlf<n> wlf8, wlf<SlotApi> wlf9, wlf<gl0<u>> wlf10, wlf<md2> wlf11, wlf<i> wlf12, wlf<com.spotify.music.json.g> wlf13, wlf<sd2> wlf14, wlf<us3> wlf15, wlf<io.reactivex.s<Boolean>> wlf16) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
    }

    @Override // defpackage.wlf
    public Object get() {
        f fVar = this.a.get();
        lxd lxd = this.b.get();
        d dVar = this.c.get();
        g<PlayerState> gVar = this.d.get();
        cqe cqe = this.f.get();
        kv3 kv3 = this.g.get();
        gl0<u> gl0 = this.j.get();
        io.reactivex.s<Boolean> sVar = this.p.get();
        a aVar = a.a;
        y a2 = a.a();
        ObjectMapper a3 = this.m.get().a();
        m f2 = com.spotify.mobius.rx2.i.f();
        f2.h(r.n.class, new hc2(a2));
        f2.h(r.c.class, new oc2(this.e.get()));
        f2.h(r.b.class, new bd2(this.l.get()));
        f2.h(r.m.class, new cc2(this.h.get(), gVar, a3, cqe));
        f2.h(r.a.class, new vc2(this.i.get()));
        f2.h(r.f.class, new yb2(this.k.get()));
        f2.d(r.h.class, new fd2(cqe, kv3, gl0));
        f2.d(r.g.class, new ed2(cqe, kv3, gl0));
        f2.h(r.i.class, new hd2(gVar, cqe, kv3, gl0));
        f2.h(r.k.class, new yc2(this.n.get()));
        f2.h(r.d.class, new mc2(sVar, this.o.get()));
        f2.d(r.j.class, new cd2(cqe, kv3, gl0));
        f2.h(r.e.class, new uc2(fVar, lxd, dVar));
        f2.h(r.l.class, new ac2(dVar));
        MobiusLoop.f f3 = com.spotify.mobius.rx2.i.c(aVar, f2.i()).e(e.a).h(com.spotify.mobius.rx2.i.a(je.Z(gVar, gVar).Q(wd2.a).j0(new vd2(cqe)).G(ud2.a))).f(b.g("[VoiceAd]"));
        yif.g(f3, "Cannot return null from a non-@Nullable @Provides method");
        return f3;
    }
}
