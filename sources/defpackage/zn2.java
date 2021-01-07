package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: zn2  reason: default package */
public final class zn2 implements cqd {
    private final wlf<eo2> a;
    private final ao2 b;

    public zn2(wlf<eo2> wlf, ao2 ao2) {
        this.a = wlf;
        this.b = ao2;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.b.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<eo2> wlf = this.a;
        wlf.getClass();
        return new yn2(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "car_ads_mode";
    }
}
