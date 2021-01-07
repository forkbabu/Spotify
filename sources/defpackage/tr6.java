package defpackage;

import com.spotify.music.features.playlistentity.o;
import com.spotify.playlist.formatlisttype.a;

/* renamed from: tr6  reason: default package */
public final class tr6 implements fjf<sr6> {
    private final wlf<ur6> a;
    private final wlf<txc> b;
    private final wlf<yn0> c;
    private final wlf<o> d;
    private final wlf<qr6> e;
    private final wlf<ap6> f;
    private final wlf<x46> g;
    private final wlf<a> h;

    public tr6(wlf<ur6> wlf, wlf<txc> wlf2, wlf<yn0> wlf3, wlf<o> wlf4, wlf<qr6> wlf5, wlf<ap6> wlf6, wlf<x46> wlf7, wlf<a> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        ur6 ur6 = this.a.get();
        return new sr6(ur6, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
