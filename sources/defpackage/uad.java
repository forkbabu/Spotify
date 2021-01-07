package defpackage;

import com.spotify.remoteconfig.ya;

/* renamed from: uad  reason: default package */
public final class uad implements fjf<tad> {
    private final wlf<ya> a;

    public uad(wlf<ya> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tad(this.a.get());
    }
}
