package defpackage;

import com.spotify.music.features.playlistentity.homemix.t;
import defpackage.cs6;
import kotlin.jvm.internal.h;

/* renamed from: ds6  reason: default package */
public final class ds6 implements fjf<yo6> {
    private final wlf<an6> a;
    private final wlf<ct6> b;
    private final wlf<y26> c;
    private final wlf<lj4> d;
    private final wlf<t36> e;
    private final wlf<t> f;
    private final wlf<cz6> g;
    private final wlf<i26> h;
    private final wlf<fk6> i;
    private final wlf<rk6> j;
    private final wlf<xp6> k;

    public ds6(wlf<an6> wlf, wlf<ct6> wlf2, wlf<y26> wlf3, wlf<lj4> wlf4, wlf<t36> wlf5, wlf<t> wlf6, wlf<cz6> wlf7, wlf<i26> wlf8, wlf<fk6> wlf9, wlf<rk6> wlf10, wlf<xp6> wlf11) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        an6 an6 = this.a.get();
        ct6 ct6 = this.b.get();
        y26 y26 = this.c.get();
        lj4 lj4 = this.d.get();
        t36 t36 = this.e.get();
        t tVar = this.f.get();
        cz6 cz6 = this.g.get();
        i26 i26 = this.h.get();
        fk6 fk6 = this.i.get();
        rk6 rk6 = this.j.get();
        xp6 xp6 = this.k.get();
        cs6.a aVar = cs6.a;
        h.e(an6, "p2sMode");
        h.e(ct6, "storyMode");
        h.e(y26, "blendMode");
        h.e(lj4, "chartsMode");
        h.e(t36, "carMixMode");
        h.e(tVar, "homeMixMode");
        h.e(cz6, "vanillaMode");
        h.e(i26, "editorialMode");
        h.e(fk6, "offlineMixMode");
        h.e(rk6, "offlineUserMixMode");
        h.e(xp6, "premiumMiniDownloadedMode");
        return new bs6(ct6, an6, y26, lj4, t36, tVar, i26, fk6, rk6, xp6, cz6);
    }
}
