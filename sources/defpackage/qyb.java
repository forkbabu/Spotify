package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: qyb  reason: default package */
public final class qyb implements cqd {
    private final wlf<vyb> a;
    private final ryb b;

    public qyb(wlf<vyb> wlf, ryb ryb) {
        this.a = wlf;
        this.b = ryb;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.b.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<vyb> wlf = this.a;
        wlf.getClass();
        return new kyb(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "music_video_toggle_mode";
    }
}
