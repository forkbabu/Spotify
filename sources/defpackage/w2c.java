package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: w2c  reason: default package */
public final class w2c implements cqd {
    private final wlf<b3c> a;

    public w2c(wlf<b3c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return false;
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<b3c> wlf = this.a;
        wlf.getClass();
        return new v2c(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "responsive_shuffle_mode";
    }
}
