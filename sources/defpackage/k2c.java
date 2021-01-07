package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: k2c  reason: default package */
public class k2c implements cqd {
    private final l2c a;
    private final wlf<r2c> b;

    public k2c(l2c l2c, wlf<r2c> wlf) {
        this.a = l2c;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<r2c> wlf = this.b;
        wlf.getClass();
        return new j2c(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "podcast_ads_mode";
    }
}
