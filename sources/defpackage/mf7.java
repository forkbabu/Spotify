package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: mf7  reason: default package */
public final class mf7 implements fjf<lf7> {
    private final wlf<g<PlayerState>> a;

    public mf7(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lf7(this.a.get());
    }
}
