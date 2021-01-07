package defpackage;

import com.spotify.music.appprotocol.superbird.earcon.EarconEndpoints;
import com.spotify.music.appprotocol.superbird.presets.PresetsEndpoints;

/* renamed from: hf2  reason: default package */
public final class hf2 implements fjf<gf2> {
    private final wlf<vh2> a;
    private final wlf<PresetsEndpoints> b;
    private final wlf<hg2> c;
    private final wlf<lf2> d;
    private final wlf<uf2> e;
    private final wlf<zg2> f;
    private final wlf<kh2> g;
    private final wlf<EarconEndpoints> h;
    private final wlf<if2> i;
    private final wlf<mh2> j;
    private final wlf<ch2> k;
    private final wlf<rg2> l;

    public hf2(wlf<vh2> wlf, wlf<PresetsEndpoints> wlf2, wlf<hg2> wlf3, wlf<lf2> wlf4, wlf<uf2> wlf5, wlf<zg2> wlf6, wlf<kh2> wlf7, wlf<EarconEndpoints> wlf8, wlf<if2> wlf9, wlf<mh2> wlf10, wlf<ch2> wlf11, wlf<rg2> wlf12) {
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
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gf2(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
