package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.f8;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: pfa  reason: default package */
public final class pfa implements fjf<ofa> {
    private final wlf<d> a;
    private final wlf<vd3> b;
    private final wlf<y> c;
    private final wlf<f8> d;
    private final wlf<g<PlayerState>> e;

    public pfa(wlf<d> wlf, wlf<vd3> wlf2, wlf<y> wlf3, wlf<f8> wlf4, wlf<g<PlayerState>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ofa(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
