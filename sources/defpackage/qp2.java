package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: qp2  reason: default package */
public final class qp2 implements cqd {
    private final wlf<vp2> a;
    private final rp2 b;

    public qp2(wlf<vp2> wlf, rp2 rp2) {
        this.a = wlf;
        this.b = rp2;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.b.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<vp2> wlf = this.a;
        wlf.getClass();
        return new pp2(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "car_feedback_mode";
    }
}
