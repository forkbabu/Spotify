package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: hwb  reason: default package */
public final class hwb implements cqd {
    private final iwb a;
    private final wlf<owb> b;

    public hwb(iwb iwb, wlf<owb> wlf) {
        this.a = iwb;
        this.b = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<owb> wlf = this.b;
        wlf.getClass();
        return new gwb(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "feedback_mode";
    }
}
