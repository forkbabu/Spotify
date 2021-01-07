package com.spotify.voice.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.audiorecord.api.e;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.g;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.lb;
import com.spotify.voice.api.m;
import com.spotify.voice.api.model.l;
import io.netty.channel.d;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.r;
import io.reactivex.s;
import io.reactivex.z;

/* access modifiers changed from: package-private */
public final class k {
    private final mte a;
    private final l b;
    private final e c;
    private final g d;
    private final z<Boolean> e;
    private final y f;
    private final sg0<ng0, Boolean> g;
    private final WebgateTokenProvider h;
    private wlf<sse> i = ljf.a(yse.a());
    private wlf<e> j;
    private wlf<g> k;
    private wlf<ObjectMapper> l;
    private wlf<io.reactivex.g<PlayerState>> m;
    private wlf<l> n;
    private wlf<WebgateTokenProvider> o;
    private wlf<z<com.spotify.voice.api.model.k>> p;
    private wlf<String> q;
    private wlf<pre> r;
    private wlf<l> s;
    private wlf<io.reactivex.g<d>> t;
    private wlf<mte> u;
    private wlf<cqe> v;
    private wlf<kte> w;

    k(e eVar, l lVar, mte mte, WebgateTokenProvider webgateTokenProvider, cqe cqe, pre pre, g gVar, io.reactivex.g gVar2, s sVar, y yVar, sg0 sg0, z zVar, SpSharedPreferences spSharedPreferences, lb lbVar, a aVar) {
        this.a = mte;
        this.b = lVar;
        this.c = eVar;
        this.d = gVar;
        this.e = zVar;
        this.f = yVar;
        this.g = sg0;
        this.h = webgateTokenProvider;
        this.j = gjf.a(eVar);
        fjf a2 = gjf.a(gVar);
        this.k = a2;
        this.l = new rse(a2);
        this.m = gjf.a(gVar2);
        this.n = gjf.a(lVar);
        fjf a3 = gjf.a(webgateTokenProvider);
        this.o = a3;
        this.p = new wse(this.m, this.n, a3);
        this.q = ljf.a(tse.a());
        this.r = gjf.a(pre);
        this.s = ljf.a(m.a.a);
        this.t = ljf.a(new use(this.j, this.l, xse.a(), vse.a(), this.p, this.n, this.i, this.q, this.r, this.s));
        this.u = gjf.a(mte);
        fjf a4 = gjf.a(cqe);
        this.v = a4;
        this.w = ljf.a(new lte(this.u, a4, this.i));
    }

    public o a() {
        sse sse = this.i.get();
        mte mte = this.a;
        l lVar = this.b;
        io.reactivex.g<d> gVar = this.t.get();
        e eVar = this.c;
        com.spotify.music.json.e b2 = this.d.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ObjectMapper build = b2.build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        gre a2 = hre.a(build);
        sre a3 = tre.a();
        sse sse2 = this.i.get();
        kte kte = this.w.get();
        io.reactivex.g<R> r0 = gVar.F(a3).i0(dse.a).O(a2).U(new gse(gVar, eVar)).V(1).r0();
        io.reactivex.g P = io.reactivex.g.P(new r(gVar.F(new hse(eVar, lVar, sse2, mte, r0)).A(new vre())).M().O(Functions.c(com.spotify.voice.api.model.m.class)), r0);
        jse jse = new jse(sse2);
        io.reactivex.functions.g<? super vpf> f2 = Functions.f();
        io.reactivex.functions.m mVar = Functions.f;
        return new o(sse, P.z(f2, mVar, jse).z(new nse(eVar), mVar, Functions.c).A(kte).v(new cse(eVar)), this.a, this.b, this.e, this.f, this.g, this.h);
    }
}
