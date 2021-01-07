package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.cqd;

/* renamed from: bp2  reason: default package */
public final class bp2 implements cqd {
    private final wlf<hp2> a;
    private final cp2 b;

    public bp2(wlf<hp2> wlf, cp2 cp2) {
        this.a = wlf;
        this.b = cp2;
    }

    @Override // defpackage.cqd
    public boolean a(PlayerState playerState) {
        return this.b.a(playerState);
    }

    @Override // defpackage.cqd
    public cmf<cqd.a> b() {
        wlf<hp2> wlf = this.a;
        wlf.getClass();
        return new ap2(wlf);
    }

    @Override // defpackage.cqd
    public String name() {
        return "car_default_mode";
    }
}
