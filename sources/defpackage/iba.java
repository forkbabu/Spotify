package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: iba  reason: default package */
public final class iba implements fjf<hba> {
    private final wlf<ConnectManager> a;
    private final wlf<y> b;
    private final wlf<g<PlayerState>> c;

    public iba(wlf<ConnectManager> wlf, wlf<y> wlf2, wlf<g<PlayerState>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hba(this.a.get(), this.b.get(), this.c.get());
    }
}
