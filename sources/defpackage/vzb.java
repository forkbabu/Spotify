package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: vzb  reason: default package */
public final class vzb implements cqd {
    private final wzb a;
    private final wlf<c0c> b;

    public vzb(wzb wzb, wlf<c0c> wlf) {
        this.a = wzb;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<c0c> wlf = this.b;
        wlf.getClass();
        return new uzb(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "podcast_mode";
    }
}
