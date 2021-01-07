package defpackage;

import com.spotify.nowplaying.ui.components.overlay.j;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: k3c  reason: default package */
public final class k3c implements fjf<g<j>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<vl2> b;

    public k3c(wlf<g<ContextTrack>> wlf, wlf<vl2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().O(new g3c(this.b.get())).O(d3c.a).s();
    }
}
