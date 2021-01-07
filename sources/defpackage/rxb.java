package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: rxb  reason: default package */
public final class rxb implements cqd {
    private final sxb a;
    private final wlf<yxb> b;

    public rxb(sxb sxb, wlf<yxb> wlf) {
        this.a = sxb;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<yxb> wlf = this.b;
        wlf.getClass();
        return new qxb(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "free_tier_feedback_mode";
    }
}
