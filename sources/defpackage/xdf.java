package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.music.follow.m;
import com.spotify.music.json.g;
import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.v;
import com.spotify.superbird.earcon.a;
import com.spotify.voice.api.n;
import io.reactivex.x;

/* renamed from: xdf  reason: default package */
public final class xdf implements fjf<wdf> {
    private final wlf<n> a;
    private final wlf<g> b;
    private final wlf<d> c;
    private final wlf<x<k9f>> d;
    private final wlf<a> e;
    private final wlf<f> f;
    private final wlf<com.spotify.player.options.d> g;
    private final wlf<p> h;
    private final wlf<i9f> i;
    private final wlf<xld> j;
    private final wlf<m> k;
    private final wlf<v> l;
    private final wlf<com.spotify.playlist.endpoints.p> m;
    private final wlf<zr0> n;
    private final wlf<j> o;
    private final wlf<t92> p;
    private final wlf<cqe> q;
    private final wlf<com.spotify.music.follow.resolver.f> r;
    private final wlf<ppe> s;
    private final wlf<Boolean> t;

    public xdf(wlf<n> wlf, wlf<g> wlf2, wlf<d> wlf3, wlf<x<k9f>> wlf4, wlf<a> wlf5, wlf<f> wlf6, wlf<com.spotify.player.options.d> wlf7, wlf<p> wlf8, wlf<i9f> wlf9, wlf<xld> wlf10, wlf<m> wlf11, wlf<v> wlf12, wlf<com.spotify.playlist.endpoints.p> wlf13, wlf<zr0> wlf14, wlf<j> wlf15, wlf<t92> wlf16, wlf<cqe> wlf17, wlf<com.spotify.music.follow.resolver.f> wlf18, wlf<ppe> wlf19, wlf<Boolean> wlf20) {
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
        this.q = wlf17;
        this.r = wlf18;
        this.s = wlf19;
        this.t = wlf20;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wdf(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get(), this.s.get(), this.t.get().booleanValue());
    }
}
