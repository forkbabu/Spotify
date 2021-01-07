package defpackage;

import com.spotify.music.features.quicksilver.v2.mobius.h;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: f18  reason: default package */
public final class f18 implements fjf<s<h>> {
    private final wlf<g<PlayerState>> a;

    public f18(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        return je.Z(gVar, gVar).j0(dz7.a).E().G0(h.a(false)).v0(1).h1();
    }
}
