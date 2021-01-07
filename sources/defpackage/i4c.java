package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: i4c  reason: default package */
public final class i4c implements cqd {
    private final j4c a;
    private final wlf<p4c> b;

    public i4c(j4c j4c, wlf<p4c> wlf) {
        this.a = j4c;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<p4c> wlf = this.b;
        wlf.getClass();
        return new h4c(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "video_show_mode";
    }
}
