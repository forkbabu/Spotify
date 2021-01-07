package defpackage;

import com.spotify.player.model.PlayOrigin;

/* renamed from: mxd  reason: default package */
public final class mxd implements fjf<lxd> {
    private final wlf<PlayOrigin> a;

    public mxd(wlf<PlayOrigin> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lxd(this.a.get());
    }
}
