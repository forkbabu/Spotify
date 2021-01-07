package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.content.Context;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.z1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.image.c;
import com.spotify.mobile.android.spotlets.appprotocol.service.i0;
import com.spotify.mobile.android.spotlets.appprotocol.u3;
import com.spotify.mobile.android.util.t;
import com.spotify.music.libs.bluetooth.CategorizerResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.g7;
import io.reactivex.g;
import io.reactivex.y;

public class j0 {
    private final wlf<Context> a;
    private final wlf<ls1> b;
    private final wlf<c> c;
    private final wlf<qq1> d;
    private final wlf<y> e;
    private final wlf<y> f;
    private final wlf<k0> g;
    private final wlf<kd0> h;
    private final wlf<cqe> i;
    private final wlf<t> j;
    private final wlf<w> k;
    private final wlf<g<SessionState>> l;
    private final wlf<g<PlayerState>> m;
    private final wlf<com.spotify.music.json.g> n;
    private final wlf<gf2> o;
    private final wlf<g7> p;
    private final wlf<pea> q;
    private final wlf<z1> r;

    public j0(wlf<Context> wlf, wlf<ls1> wlf2, wlf<c> wlf3, wlf<qq1> wlf4, wlf<y> wlf5, wlf<y> wlf6, wlf<k0> wlf7, wlf<kd0> wlf8, wlf<cqe> wlf9, wlf<t> wlf10, wlf<w> wlf11, wlf<g<SessionState>> wlf12, wlf<g<PlayerState>> wlf13, wlf<com.spotify.music.json.g> wlf14, wlf<gf2> wlf15, wlf<g7> wlf16, wlf<pea> wlf17, wlf<z1> wlf18) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
        a(wlf11, 11);
        this.k = wlf11;
        a(wlf12, 12);
        this.l = wlf12;
        a(wlf13, 13);
        this.m = wlf13;
        a(wlf14, 14);
        this.n = wlf14;
        a(wlf15, 15);
        this.o = wlf15;
        a(wlf16, 16);
        this.p = wlf16;
        a(wlf17, 17);
        this.q = wlf17;
        a(wlf18, 18);
        this.r = wlf18;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public i0 b(u3 u3Var, String str, i0.a aVar, CategorizerResponse categorizerResponse) {
        Context context = this.a.get();
        a(context, 1);
        ls1 ls1 = this.b.get();
        a(ls1, 2);
        wlf<c> wlf = this.c;
        qq1 qq1 = this.d.get();
        a(qq1, 4);
        y yVar = this.e.get();
        a(yVar, 5);
        y yVar2 = this.f.get();
        a(yVar2, 6);
        k0 k0Var = this.g.get();
        a(k0Var, 7);
        kd0 kd0 = this.h.get();
        a(kd0, 8);
        a(u3Var, 9);
        cqe cqe = this.i.get();
        a(cqe, 10);
        a(str, 11);
        a(aVar, 12);
        t tVar = this.j.get();
        a(tVar, 14);
        t tVar2 = tVar;
        w wVar = this.k.get();
        a(wVar, 15);
        w wVar2 = wVar;
        g<SessionState> gVar = this.l.get();
        a(gVar, 16);
        g<SessionState> gVar2 = gVar;
        g<PlayerState> gVar3 = this.m.get();
        a(gVar3, 17);
        g<PlayerState> gVar4 = gVar3;
        com.spotify.music.json.g gVar5 = this.n.get();
        a(gVar5, 18);
        com.spotify.music.json.g gVar6 = gVar5;
        gf2 gf2 = this.o.get();
        a(gf2, 19);
        gf2 gf22 = gf2;
        g7 g7Var = this.p.get();
        a(g7Var, 20);
        g7 g7Var2 = g7Var;
        pea pea = this.q.get();
        a(pea, 21);
        pea pea2 = pea;
        z1 z1Var = this.r.get();
        a(z1Var, 22);
        return new i0(context, ls1, wlf, qq1, yVar, yVar2, k0Var, kd0, u3Var, cqe, str, aVar, categorizerResponse, tVar2, wVar2, gVar2, gVar4, gVar6, gf22, g7Var2, pea2, z1Var);
    }
}
