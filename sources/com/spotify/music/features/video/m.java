package com.spotify.music.features.video;

import android.content.Context;
import com.google.protobuf.u;
import com.spotify.http.w;
import com.spotify.mobile.android.util.connectivity.v;
import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.music.json.g;
import com.squareup.picasso.Picasso;

public final class m implements fjf<u62> {
    private final wlf<Context> a;
    private final wlf<gl0<u>> b;
    private final wlf<cqe> c;
    private final wlf<Picasso> d;
    private final wlf<q72> e;
    private final wlf<w> f;
    private final wlf<g> g;
    private final wlf<y62> h;
    private final wlf<v> i;
    private final wlf<y> j;

    public m(wlf<Context> wlf, wlf<gl0<u>> wlf2, wlf<cqe> wlf3, wlf<Picasso> wlf4, wlf<q72> wlf5, wlf<w> wlf6, wlf<g> wlf7, wlf<y62> wlf8, wlf<v> wlf9, wlf<y> wlf10) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        g gVar = this.g.get();
        y62 y62 = this.h.get();
        v vVar = this.i.get();
        y yVar = this.j.get();
        return w62.j().a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get().a(), gVar, y62, vVar, yVar);
    }
}
