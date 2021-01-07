package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: yld  reason: default package */
public final class yld implements fjf<xld> {
    private final wlf<vld> a;
    private final wlf<y> b;
    private final wlf<zld> c;
    private final wlf<g<PlayerState>> d;
    private final wlf<d> e;
    private final wlf<t92> f;
    private final wlf<cqe> g;

    public yld(wlf<vld> wlf, wlf<y> wlf2, wlf<zld> wlf3, wlf<g<PlayerState>> wlf4, wlf<d> wlf5, wlf<t92> wlf6, wlf<cqe> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xld(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
