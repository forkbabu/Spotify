package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import defpackage.xhb;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: aib  reason: default package */
public final class aib implements fjf<thb> {
    private final wlf<g<PlayerState>> a;
    private final wlf<d> b;
    private final wlf<f> c;
    private final wlf<nsb> d;
    private final wlf<q> e;

    public aib(wlf<g<PlayerState>> wlf, wlf<d> wlf2, wlf<f> wlf3, wlf<nsb> wlf4, wlf<q> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        d dVar = this.b.get();
        f fVar = this.c.get();
        nsb nsb = this.d.get();
        q qVar = this.e.get();
        xhb.a aVar = xhb.a;
        h.e(gVar, "playerStateFlowable");
        h.e(dVar, "playerControls");
        h.e(fVar, "player");
        h.e(nsb, "nowPlayingViewNavigator");
        h.e(qVar, "disposables");
        return new whb(gVar, dVar, fVar, nsb, qVar);
    }
}
