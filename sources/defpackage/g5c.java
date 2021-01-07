package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: g5c  reason: default package */
public final class g5c implements cqd {
    private final h5c a;
    private final wlf<n5c> b;

    public g5c(h5c h5c, wlf<n5c> wlf) {
        this.a = h5c;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<n5c> wlf = this.b;
        wlf.getClass();
        return new y4c(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "video_ads_mode";
    }
}
