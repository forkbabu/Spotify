package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: zwb  reason: default package */
public final class zwb implements cqd {
    private final axb a;
    private final wlf<gxb> b;

    public zwb(axb axb, wlf<gxb> wlf) {
        this.a = axb;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<gxb> wlf = this.b;
        wlf.getClass();
        return new ywb(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "free_tier_mode";
    }
}
