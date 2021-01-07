package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: qsb  reason: default package */
public final class qsb implements cqd {
    private final wlf<vsb> a;

    public qsb(wlf<vsb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return true;
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<vsb> wlf = this.a;
        wlf.getClass();
        return new psb(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "default_mode";
    }
}
