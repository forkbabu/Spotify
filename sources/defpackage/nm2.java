package defpackage;

import com.google.protobuf.u;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: nm2  reason: default package */
public final class nm2 implements fjf<mm2> {
    private final wlf<g<PlayerState>> a;
    private final wlf<gl0<u>> b;

    public nm2(wlf<g<PlayerState>> wlf, wlf<gl0<u>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mm2(this.a.get(), this.b.get());
    }
}
