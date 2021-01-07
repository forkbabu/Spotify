package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: zu5  reason: default package */
public final class zu5 implements fjf<yu5> {
    private final wlf<g<PlayerState>> a;
    private final wlf<fv5> b;

    public zu5(wlf<g<PlayerState>> wlf, wlf<fv5> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yu5(this.a.get(), this.b.get());
    }
}
