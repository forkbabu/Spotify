package com.spotify.music;

import android.content.Intent;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.intentrouter.l;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.navigation.h;
import com.spotify.music.navigation.j;
import com.spotify.music.navigation.w;
import com.spotify.page.hosting.a;
import defpackage.alb;

public class n0 {
    private final rgb a;
    private final pgb b;
    private final m c;
    private final h d;
    private final a e;
    private final qg0<Intent> f;
    private final ykb g;

    n0(rgb rgb, pgb pgb, m mVar, h hVar, a aVar, ykb ykb, qg0<Intent> qg0) {
        this.a = rgb;
        this.b = pgb;
        this.c = mVar;
        this.d = hVar;
        this.e = aVar;
        this.f = qg0;
        this.g = ykb;
    }

    public l<hlb> a(j jVar, w wVar) {
        alb.b bVar = new alb.b(io.reactivex.android.schedulers.a.b());
        com.spotify.music.navigation.l lVar = new com.spotify.music.navigation.l(this.d, jVar, this.c, wVar);
        qg0<Intent> qg0 = this.f;
        zkb zkb = new zkb(bVar, lVar, qg0);
        rgb rgb = this.a;
        pgb pgb = this.b;
        xkb xkb = new xkb(bVar, zkb, qg0, this.g, this.e);
        rgb.getClass();
        xkb.h(LinkType.DEBUG, "open the debug menu", new jgb(rgb));
        pgb.b(xkb);
        com.spotify.intentrouter.j<hlb> a2 = xkb.a();
        dlb dlb = new dlb();
        clb clb = new clb();
        l<hlb> a3 = l.a(a2);
        a3.c(clb);
        a3.d(dlb);
        return a3;
    }
}
