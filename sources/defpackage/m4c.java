package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: m4c  reason: default package */
public final class m4c implements fjf<l4c> {
    private final wlf<g<PlayerState>> a;

    public m4c(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l4c(this.a);
    }
}
