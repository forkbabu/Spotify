package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: fq2  reason: default package */
public final class fq2 implements cqd {
    private final wlf<kq2> a;
    private final gq2 b;

    public fq2(wlf<kq2> wlf, gq2 gq2) {
        this.a = wlf;
        this.b = gq2;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.b.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<kq2> wlf = this.a;
        wlf.getClass();
        return new cq2(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "car_podcast_mode";
    }
}
