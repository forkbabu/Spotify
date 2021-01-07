package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: ko6  reason: default package */
public final class ko6 implements fjf<jo6> {
    private final wlf<String> a;
    private final wlf<d> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<cqe> d;

    public ko6(wlf<String> wlf, wlf<d> wlf2, wlf<g<PlayerState>> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jo6(this.a, this.b, this.c, this.d);
    }
}
