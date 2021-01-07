package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: iob  reason: default package */
public final class iob implements fjf<hob> {
    private final wlf<g<PlayerState>> a;

    public iob(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hob(this.a);
    }
}
