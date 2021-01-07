package defpackage;

import com.google.common.base.Supplier;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: gp4  reason: default package */
public final class gp4 implements fjf<fp4> {
    private final wlf<hp4> a;
    private final wlf<dp4> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<qo4> d;
    private final wlf<oba> e;
    private final wlf<Supplier<Integer>> f;
    private final wlf<zp4> g;
    private final wlf<nq4> h;
    private final wlf<mba> i;
    private final wlf<cfd> j;
    private final wlf<y> k;
    private final wlf<e> l;

    public gp4(wlf<hp4> wlf, wlf<dp4> wlf2, wlf<g<PlayerState>> wlf3, wlf<qo4> wlf4, wlf<oba> wlf5, wlf<Supplier<Integer>> wlf6, wlf<zp4> wlf7, wlf<nq4> wlf8, wlf<mba> wlf9, wlf<cfd> wlf10, wlf<y> wlf11, wlf<e> wlf12) {
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

    public static gp4 a(wlf<hp4> wlf, wlf<dp4> wlf2, wlf<g<PlayerState>> wlf3, wlf<qo4> wlf4, wlf<oba> wlf5, wlf<Supplier<Integer>> wlf6, wlf<zp4> wlf7, wlf<nq4> wlf8, wlf<mba> wlf9, wlf<cfd> wlf10, wlf<y> wlf11, wlf<e> wlf12) {
        return new gp4(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fp4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
