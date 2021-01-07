package defpackage;

import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.g;

/* renamed from: pmb  reason: default package */
public final class pmb implements fjf<omb> {
    private final wlf<xrb> a;
    private final wlf<g<j>> b;

    public pmb(wlf<xrb> wlf, wlf<g<j>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new omb(this.a, this.b);
    }
}
