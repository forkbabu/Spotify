package defpackage;

import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.sociallistening.facepile.d;
import com.spotify.music.spotlets.offline.util.c;
import io.reactivex.y;

/* renamed from: o5d  reason: default package */
public final class o5d implements fjf<n5d> {
    private final wlf<f4d> a;
    private final wlf<u7d> b;
    private final wlf<x9d> c;
    private final wlf<d> d;
    private final wlf<y> e;
    private final wlf<c> f;
    private final wlf<com.spotify.player.controls.d> g;
    private final wlf<q7d> h;
    private final wlf<cfd> i;
    private final wlf<e> j;
    private final wlf<g4d> k;
    private final wlf<fad> l;

    public o5d(wlf<f4d> wlf, wlf<u7d> wlf2, wlf<x9d> wlf3, wlf<d> wlf4, wlf<y> wlf5, wlf<c> wlf6, wlf<com.spotify.player.controls.d> wlf7, wlf<q7d> wlf8, wlf<cfd> wlf9, wlf<e> wlf10, wlf<g4d> wlf11, wlf<fad> wlf12) {
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

    public static o5d a(wlf<f4d> wlf, wlf<u7d> wlf2, wlf<x9d> wlf3, wlf<d> wlf4, wlf<y> wlf5, wlf<c> wlf6, wlf<com.spotify.player.controls.d> wlf7, wlf<q7d> wlf8, wlf<cfd> wlf9, wlf<e> wlf10, wlf<g4d> wlf11, wlf<fad> wlf12) {
        return new o5d(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n5d(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
