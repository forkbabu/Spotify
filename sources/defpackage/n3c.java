package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: n3c  reason: default package */
public final class n3c implements cqd {
    private final wlf<s3c> a;

    public n3c(wlf<s3c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return false;
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<s3c> wlf = this.a;
        wlf.getClass();
        return new l3c(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "responsive_shuffle_free_tier_mode";
    }
}
