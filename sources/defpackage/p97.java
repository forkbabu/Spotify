package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: p97  reason: default package */
public final class p97 implements fjf<o97> {
    private final wlf<g<PlayerState>> a;
    private final wlf<g<Long>> b;

    public p97(wlf<g<PlayerState>> wlf, wlf<g<Long>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o97(this.a.get(), this.b.get());
    }
}
